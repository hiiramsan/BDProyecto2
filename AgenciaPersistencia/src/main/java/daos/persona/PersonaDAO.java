/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos.persona;

import conexion.IConexionDAO;
import dtos.PersonaDTO;
import entidadesJPA.Automovil;
import entidadesJPA.Licencia;
import entidadesJPA.Persona;
import entidadesJPA.Placa;
import java.util.Calendar;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author carlo
 */
public class PersonaDAO implements IPersonaDAO {

    private final IConexionDAO conexion;
    private static final Logger LOG = Logger.getLogger(PersonaDAO.class.getName());

    public PersonaDAO(IConexionDAO conexion) {
        this.conexion = conexion;
    }

    @Override
    public void registrar(PersonaDTO persona) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ConexionPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Persona personaARegisrar = new Persona(persona.getRfc(), persona.getNombre(), persona.getApellidoPaterno(),
                persona.getApellidoMaterno(), persona.getTelefono(),
                persona.getFechaNacimiento(), persona.isDiscapacidad());

        /*
        quise correr el proyecto y no me dejaba por una parte de aqui asi que lo cambie, igual segun yo no habia porque cambiarlo
        ya que se debe manejar con un DTO y no los atributos "sueltos". ademas esta parte es la menos importante porque es 'hardcodeado'
        ya que no hay registro de Personas
         */
        entityManager.persist(personaARegisrar);

        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }

    @Override
    public boolean consultarPersona(String rfc) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ConexionPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        try {
            String jpql = "SELECT COUNT(p) FROM Persona p WHERE p.rfc = :rfc";
            TypedQuery<Long> query = entityManager.createQuery(jpql, Long.class);
            query.setParameter("rfc", rfc);
            Long count = query.getSingleResult();

            entityManager.getTransaction().commit();

            return count > 0;
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            throw e;
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }

    @Override
    public PersonaDTO obtenerPersona(String rfc) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ConexionPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        try {
            String jpql = "SELECT p FROM Persona p WHERE p.rfc = :rfc";
            TypedQuery<Persona> query = entityManager.createQuery(jpql, Persona.class);
            query.setParameter("rfc", rfc);
            Persona personaBuscada = query.getSingleResult();
            entityManager.getTransaction().commit();

            PersonaDTO personaDTO = new PersonaDTO();
            personaDTO.setRfc(personaBuscada.getRfc());
            personaDTO.setNombre(personaBuscada.getNombre());
            personaDTO.setApellidoPaterno(personaBuscada.getApellidoPaterno());
            personaDTO.setApellidoMaterno(personaBuscada.getApellidoMaterno());
            personaDTO.setTelefono(personaBuscada.getTelefono());
            personaDTO.setFechaNacimiento(personaBuscada.getFechaNacimiento());
            personaDTO.setDiscapacidad(personaBuscada.isDiscapacidad());

            return personaDTO;
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            throw e;
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }

    @Override
    public Persona buscarPersonaPorRFC(String rfc) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ConexionPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        try {

            String jpql = "SELECT p FROM Persona p WHERE p.rfc = :rfc";
            TypedQuery<Persona> query = entityManager.createQuery(jpql, Persona.class);
            query.setParameter("rfc", rfc);
            return query.getSingleResult();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            throw e;
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}
