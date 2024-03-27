/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos.automovil;

import conexion.IConexionDAO;
import dtos.AutomovilDTO;
import entidadesJPA.Automovil;
import entidadesJPA.Persona;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author carlo
 */
public class AutomovilDAO implements IAutomovilDAO {

    private final IConexionDAO conexion;

    public AutomovilDAO(IConexionDAO conexion) {
        this.conexion = conexion;
    }

    @Override
    public AutomovilDTO registrarAutomovil(String numeroSerie, String marca, String linea, String color, int modelo, Persona persona) {
        EntityManager entityManager = conexion.crearConexion();
        entityManager.getTransaction().begin();

        try {
            Automovil automovil = new Automovil(numeroSerie, marca, linea, color, modelo, persona);
            entityManager.persist(automovil);

            entityManager.getTransaction().commit();

            AutomovilDTO automovilDTO = new AutomovilDTO(automovil.getNumSerie(), automovil.getMarca(), automovil.getLinea(), automovil.getColor(), automovil.getModelo());
            return automovilDTO;
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            throw e;
        } finally {
            entityManager.close();
        }
    }

    @Override
    public boolean existeAutomovil(String numeroSerie) {
        EntityManager entityManager = conexion.crearConexion();
        entityManager.getTransaction().begin();

        try {
            String jpql = "SELECT COUNT(a) FROM Automovil a WHERE a.numSerie = :numSerie";
            TypedQuery<Long> query = entityManager.createQuery(jpql, Long.class);
            query.setParameter("numSerie", numeroSerie);
            Long count = query.getSingleResult();

            entityManager.getTransaction().commit();

            return count > 0;
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            throw e;
        } finally {
            entityManager.close();
        }
    }

    @Override
    public AutomovilDTO obtenerAutomovil(String numeroSerie, String rfc) {
        EntityManager entityManager = conexion.crearConexion();
        entityManager.getTransaction().begin();

        try {
            String jpql = "SELECT a FROM Automovil a WHERE a.numSerie = :num_serie AND a.persona.rfc = :rfc";
            TypedQuery<Automovil> query = entityManager.createQuery(jpql, Automovil.class);
            query.setParameter("num_serie", numeroSerie);
            query.setParameter("rfc", rfc);
            Automovil automovilBuscado = query.getSingleResult();
            entityManager.getTransaction().commit();
            AutomovilDTO automovilDTO = new AutomovilDTO();

            automovilDTO.setNumeroSerie(automovilBuscado.getNumSerie());
            automovilDTO.setMarca(automovilBuscado.getMarca());
            automovilDTO.setModelo(automovilBuscado.getModelo());
            automovilDTO.setColor(automovilBuscado.getColor());
            automovilDTO.setLinea(automovilBuscado.getLinea());

            return automovilDTO;
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            throw e;
        } finally {
            entityManager.close();
        }
    }

}
