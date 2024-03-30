/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos.consultas;

import conexion.IConexionDAO;
import daos.persona.PersonaDAO;
import entidadesJPA.Licencia;
import entidadesJPA.Persona;
import entidadesJPA.Placa;
import entidadesJPA.Tramite;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.TemporalType;
import javax.persistence.TypedQuery;

/**
 *
 * @author carlo
 */
public class ConsultasDAO implements IConsultasDAO {

    private final IConexionDAO conexion;

    public ConsultasDAO(IConexionDAO conexion) {
        this.conexion = conexion;
    }

    @Override
    public List<Persona> buscarPersonaPorRFC(String rfc) {

        EntityManager entityManager = conexion.crearConexion();
        entityManager.getTransaction().begin();
        try {
            String jpql = "SELECT p FROM Persona p WHERE p.rfc = :rfc";
            TypedQuery<Persona> query = entityManager.createQuery(jpql, Persona.class);
            query.setParameter("rfc", rfc);
            return query.getResultList();
        } catch (Exception e) {
            throw e;
        } finally {
            entityManager.close();
        }
    }

    @Override
    public List<Persona> buscarPersonaPorNombreSimilar(String nombre) {
        EntityManager entityManager = conexion.crearConexion();
        entityManager.getTransaction().begin();
        try {
            String jpql = "SELECT p FROM Persona p WHERE p.nombre LIKE :nombre";
            TypedQuery<Persona> query = entityManager.createQuery(jpql, Persona.class);
            query.setParameter("nombre", "%" + nombre + "%");
            return query.getResultList();
        } finally {
            entityManager.close();
        }
    }

    @Override
    public List<Persona> buscarPersonaPorFechaNacimiento(Date fechaNacimiento) {
        EntityManager entityManager = conexion.crearConexion();
        entityManager.getTransaction().begin();
        try {
            String jpql = "SELECT p FROM Persona p WHERE p.fechaNacimiento = :fechaNacimiento";
            TypedQuery<Persona> query = entityManager.createQuery(jpql, Persona.class);
            query.setParameter("fechaNacimiento", fechaNacimiento);
            return query.getResultList();
        } finally {
            entityManager.close();
        }
    }

    @Override
    public List<Licencia> obtenerLicenciasPorRFC(String rfc) {
        EntityManager entityManager = conexion.crearConexion();
        entityManager.getTransaction().begin();
        try {
            String jpql = "SELECT l FROM Licencia l WHERE l.persona.rfc = :rfc";
            TypedQuery<Licencia> query = entityManager.createQuery(jpql, Licencia.class);
            query.setParameter("rfc", rfc);
            return query.getResultList();
        } finally {
            entityManager.close();
        }

    }

    @Override
    public List<Placa> obtenerPlacasPorRFC(String rfc) {
        EntityManager entityManager = conexion.crearConexion();
        entityManager.getTransaction().begin();

        try {
            String jpql = "SELECT p FROM Placa p WHERE p.persona.rfc = :rfc";
            TypedQuery<Placa> query = entityManager.createQuery(jpql, Placa.class);
            query.setParameter("rfc", rfc);
            return query.getResultList();
        } finally {
            entityManager.close();
        }

    }

    @Override
    public List<Tramite> obtenerTramitesPorRFC(String rfc) {
        EntityManager entityManager = conexion.crearConexion();
        entityManager.getTransaction().begin();
        try {
            String jpql = "SELECT t FROM Tramite t WHERE t.persona.rfc = :rfc";
            TypedQuery<Tramite> query = entityManager.createQuery(jpql, Tramite.class);
            query.setParameter("rfc", rfc);
            return query.getResultList();
        } finally {
            entityManager.close();
        }

    }

    @Override
    public List<Object[]> obtenerReporteTramites() {
        EntityManager entityManager = conexion.crearConexion();
        entityManager.getTransaction().begin();

        try {
            String jpql = "SELECT t.fecha, t.tipoTramite, p.nombre, t.costo FROM Tramite t JOIN t.persona p";
            TypedQuery<Object[]> query = entityManager.createQuery(jpql, Object[].class);
            return query.getResultList();
        } finally {
            entityManager.close();
        }

    }
    
    @Override
   public List<Placa> obtenerPlacasPorFechaYNombre(Date fechaInicio, Date fechaFin, String nombre) {
        EntityManager entityManager = conexion.crearConexion();
        entityManager.getTransaction().begin();

        try {
            String jpql = "SELECT p FROM Placa p WHERE p.fechaExpedicion BETWEEN :fechaInicio AND :fechaFin AND p.persona.nombre LIKE :nombre";
            TypedQuery<Placa> query = entityManager.createQuery(jpql, Placa.class);
            query.setParameter("fechaInicio", fechaInicio, TemporalType.DATE);
            query.setParameter("fechaFin", fechaFin, TemporalType.DATE);
            query.setParameter("nombre", "%" + nombre + "%");
            return query.getResultList();
        } finally {
            entityManager.close();
        }
    }
   
    @Override
   public List<Licencia> obtenerLicenciasPorFechaYNombre(Date fechaInicio, Date fechaFin, String nombre) {
        EntityManager entityManager = conexion.crearConexion();
        entityManager.getTransaction().begin();

        try {
            String jpql = "SELECT l FROM Licencia l WHERE l.fechaExpedicion BETWEEN :fechaInicio AND :fechaFin AND l.persona.nombre LIKE :nombre";
            TypedQuery<Licencia> query = entityManager.createQuery(jpql, Licencia.class);
            query.setParameter("fechaInicio", fechaInicio, TemporalType.DATE);
            query.setParameter("fechaFin", fechaFin, TemporalType.DATE);
            query.setParameter("nombre", "%" + nombre + "%");
            return query.getResultList();
        } finally {
            entityManager.close();
        }
    }
}
