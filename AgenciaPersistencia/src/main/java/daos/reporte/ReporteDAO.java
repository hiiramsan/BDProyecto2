/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos.reporte;

import conexion.IConexionDAO;
import entidadesJPA.Licencia;
import entidadesJPA.Placa;
import entidadesJPA.Tramite;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TemporalType;
import javax.persistence.TypedQuery;

/**
 *
 * @author carlo
 */
public class ReporteDAO implements IReporteDAO {

    private final IConexionDAO conexion;

    public ReporteDAO(IConexionDAO conexion) {
        this.conexion = conexion;
    }

    @Override
    public List<Tramite> obtenerReportePorNombre(String nombre) {
        EntityManager entityManager = conexion.crearConexion();
        entityManager.getTransaction().begin();
        try {
            String jpql = "SELECT t FROM Tramite t WHERE  t.persona.nombre LIKE :nombre";
            TypedQuery<Tramite> query = entityManager.createQuery(jpql, Tramite.class);
            query.setParameter("nombre", "%" + nombre + "%");
            return query.getResultList();
        } finally {
            entityManager.close();
        }
    }

    @Override
    public List<Tramite> obtenerReportePorFechas(Date inicio, Date fin) {
        EntityManager entityManager = conexion.crearConexion();
        entityManager.getTransaction().begin();
        try {
            String jpql = "SELECT t FROM Tramite t WHERE t.fechaExpedicion BETWEEN :inicio AND :fin";
            TypedQuery<Tramite> query = entityManager.createQuery(jpql, Tramite.class);
            query.setParameter("inicio", inicio, TemporalType.DATE);
            query.setParameter("fin", fin, TemporalType.DATE);
            return query.getResultList();
        } finally {
            entityManager.close();
        }
    }

    @Override
    public List<Placa> obtenerTodasLasPlacas() {
        EntityManager entityManager = conexion.crearConexion();
        entityManager.getTransaction().begin();

        try {
            String jpql = "SELECT p FROM Placa p";
            TypedQuery<Placa> query = entityManager.createQuery(jpql, Placa.class);
            return query.getResultList();
        } finally {
            entityManager.close();
        }
    }

    @Override
    public List<Licencia> obtenerTodasLasLicencias() {
        EntityManager entityManager = conexion.crearConexion();
        entityManager.getTransaction().begin();

        try {
            String jpql = "SELECT l FROM Licencia l";
            TypedQuery<Licencia> query = entityManager.createQuery(jpql, Licencia.class);
            return query.getResultList();
        } finally {
            entityManager.close();
        }
    }

    @Override
    public List<Tramite> obtenerTodosLosTramites() {
        EntityManager entityManager = conexion.crearConexion();
        entityManager.getTransaction().begin();

        try {
            String jpql = "SELECT t FROM Tramite t";
            TypedQuery<Tramite> query = entityManager.createQuery(jpql, Tramite.class);
            return query.getResultList();
        } finally {
            entityManager.close();
        }
    }

}
