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
    public List<Tramite> buscarTramites(Date fechaInicio, Date fechaFin, String nombre) {
        EntityManager entityManager = conexion.crearConexion();
        entityManager.getTransaction().begin();
        TypedQuery<Tramite> query;

        try {
            String jpql = "SELECT t FROM Tramite t WHERE 1 = 1";

            if (fechaInicio != null && fechaFin != null) {
                jpql += " AND t.fechaExpedicion BETWEEN :inicio AND :fin";
            }

            if (nombre != null && !nombre.isEmpty()) {
                jpql += " AND t.persona.nombre LIKE :nombre";
            }

            query = entityManager.createQuery(jpql, Tramite.class);

            if (fechaInicio != null && fechaFin != null) {
                query.setParameter("inicio", fechaInicio, TemporalType.DATE);
                query.setParameter("fin", fechaFin, TemporalType.DATE);
            }

            if (nombre != null && !nombre.isEmpty()) {
                query.setParameter("nombre", "%" + nombre + "%");
            }

            return query.getResultList();
        } finally {
            entityManager.close();
        }
    }

    @Override
    public List<Licencia> buscarLicencias(Date fechaInicio, Date fechaFin, String nombre) {
        EntityManager entityManager = conexion.crearConexion();
        entityManager.getTransaction().begin();
        TypedQuery<Licencia> query;

        try {
            String jpql = "SELECT l FROM Licencia l WHERE 1 = 1"; 

            if (fechaInicio != null && fechaFin != null) {
                jpql += " AND l.fechaExpedicion BETWEEN :inicio AND :fin";
            }

            if (nombre != null && !nombre.isEmpty()) {
                jpql += " AND l.persona.nombre LIKE :nombre";
            }

            query = entityManager.createQuery(jpql, Licencia.class);

            if (fechaInicio != null && fechaFin != null) {
                query.setParameter("inicio", fechaInicio, TemporalType.DATE);
                query.setParameter("fin", fechaFin, TemporalType.DATE);
            }

            if (nombre != null && !nombre.isEmpty()) {
                query.setParameter("nombre", "%" + nombre + "%");
            }

            return query.getResultList();
        } finally {
            entityManager.close();
        }
    }

    @Override
    public List<Placa> buscarPlacas(Date fechaInicio, Date fechaFin, String nombre) {
        EntityManager entityManager = conexion.crearConexion();
        entityManager.getTransaction().begin();
        TypedQuery<Placa> query;

        try {
            String jpql = "SELECT p FROM Placa p WHERE 1 = 1"; 

            if (fechaInicio != null && fechaFin != null) {
                jpql += " AND p.fechaExpedicion BETWEEN :inicio AND :fin";
            }

            if (nombre != null && !nombre.isEmpty()) {
                jpql += " AND p.persona.nombre LIKE :nombre";
            }

            query = entityManager.createQuery(jpql, Placa.class);

            if (fechaInicio != null && fechaFin != null) {
                query.setParameter("inicio", fechaInicio, TemporalType.DATE);
                query.setParameter("fin", fechaFin, TemporalType.DATE);
            }

            if (nombre != null && !nombre.isEmpty()) {
                query.setParameter("nombre", "%" + nombre + "%");
            }

            return query.getResultList();
        } finally {
            entityManager.close();
        }
    }

}
