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

    @Override
    public void desactivasPlacas(Automovil automovil) {
        EntityManager entityManager = conexion.crearConexion();
        entityManager.getTransaction().begin();

        List<Placa> placas = automovil.getPlacas();

        try {

            for (Placa placa : placas) {
                if (placa.getEstado() == EstadoTramite.ACTIVA) {
                    placa.setEstado(EstadoTramite.VENCIDA);
                    if (placa.getFechaRecepcion() == null) {
                        placa.setFechaRecepcion(Calendar.getInstance());
                        entityManager.merge(placa);
                    }
                    
                }
            }

            entityManager.merge(automovil);

            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }
}
