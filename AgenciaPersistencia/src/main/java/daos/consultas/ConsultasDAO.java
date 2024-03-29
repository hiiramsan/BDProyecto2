/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos.consultas;

import conexion.IConexionDAO;
import daos.persona.PersonaDAO;
import entidadesJPA.Persona;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
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
}
