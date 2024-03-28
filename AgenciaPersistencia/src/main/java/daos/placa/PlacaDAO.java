/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos.placa;

import com.mycompany.agenciapersistencia.controlador.utils.EstadoTramite;
import conexion.IConexionDAO;
import dtos.PlacaDTO;
import entidadesJPA.Automovil;
import entidadesJPA.Persona;
import entidadesJPA.Placa;
import java.util.Calendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

/**
 *
 * @author carlo
 */
public class PlacaDAO implements IPlacaDAO {

    private final IConexionDAO conexion;

    public PlacaDAO(IConexionDAO conexion) {
        this.conexion = conexion;
    }

    @Override
    public PlacaDTO registrarPlaca(Automovil automovil, float costo, String claveNumerica, Persona persona) {
        EntityManager entityManager = conexion.crearConexion();
        entityManager.getTransaction().begin();

        try {

            Calendar fechaExpedicion = Calendar.getInstance();

            Placa placa = new Placa(claveNumerica, automovil, costo, EstadoTramite.ACTIVA, fechaExpedicion, persona);
            entityManager.persist(placa);
            entityManager.getTransaction().commit();

            PlacaDTO placaDTO = new PlacaDTO();
            placaDTO.setClaveNumerica(claveNumerica);
            placaDTO.setEstado(placa.getEstado());
            placaDTO.setFechaExpedicion(placa.getFechaExpedicion());
            placaDTO.setAutomovil(placa.getAutomovil());
            placaDTO.setCosto(placa.getCosto());

            return placaDTO;
        } catch (Exception e) {
            entityManager.getTransaction().rollback();

            throw e;
        } finally {
            entityManager.close();
        }
    }

    public Placa obtenerPlacaActiva(Automovil automovil) {
        EntityManager entityManager = conexion.crearConexion();
        try {
            String jpql = "SELECT p FROM Placa p WHERE p.automovil = :automovil AND p.estado = :estado";
            TypedQuery<Placa> query = entityManager.createQuery(jpql, Placa.class);
            query.setParameter("automovil", automovil);
            query.setParameter("estado", EstadoTramite.ACTIVA);
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null; // No se encontró ninguna placa activa asociada al automóvil proporcionado
        } finally {
            entityManager.close();
        }
    }

    public void desactivarPlaca(Automovil automovil) {
        EntityManager entityManager = conexion.crearConexion();
        entityManager.getTransaction().begin();
        try {
            Placa placa = obtenerPlacaActiva(automovil);
            if (placa != null) {
                placa.setEstado(EstadoTramite.VENCIDA);
                placa.setFechaRecepcion(Calendar.getInstance());
                entityManager.merge(placa);
                entityManager.getTransaction().commit();
            } else {
                // Manejar el caso en que no se encuentre ninguna placa activa asociada al automóvil proporcionado
                System.out.println("No se encontró ninguna placa activa asociada al automóvil proporcionado.");
            }
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }

}
