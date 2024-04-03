/*
 * Esta clase implementa la interfaz IPersonaDAO y proporciona métodos para interactuar con la entidad Persona en la base de datos.
 */

package daos.persona;

import conexion.IConexionDAO;
import dtos.PersonaDTO;
import entidadesJPA.Persona;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 * Clase que implementa la interfaz IPersonaDAO y proporciona métodos para interactuar con la entidad Persona en la base de datos.
 */
public class PersonaDAO implements IPersonaDAO {

    private final IConexionDAO conexion;

    /**
     * Constructor de la clase PersonaDAO.
     * @param conexion Objeto que implementa la interfaz IConexionDAO para gestionar la conexión a la base de datos.
     */
    public PersonaDAO(IConexionDAO conexion) {
        this.conexion = conexion;
    }

    @Override
    public void registrar(PersonaDTO persona) {
        EntityManager entityManager = conexion.crearConexion();

        entityManager.getTransaction().begin();

        Persona personaARegistrar = new Persona(persona.getRfc(), persona.getNombre(), persona.getApellidoPaterno(),
                persona.getApellidoMaterno(), persona.getTelefono(),
                persona.getFechaNacimiento(), persona.isDiscapacidad());

        entityManager.persist(personaARegistrar);

        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public boolean consultarPersona(String rfc) {
        EntityManager entityManager = conexion.crearConexion();
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
        }
    }

    @Override
    public PersonaDTO obtenerPersona(String rfc) {
        EntityManager entityManager = conexion.crearConexion();
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
        }
    }

    @Override
    public Persona buscarPersonaPorRFC(String rfc) {
        EntityManager entityManager = conexion.crearConexion();
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
        }
    }

    @Override
    public boolean esMayorDeEdad(String rfc) {
        Persona persona = buscarPersonaPorRFC(rfc);
        if (persona != null) {
            Calendar fechaNacimientoCalendar = persona.getFechaNacimiento();
            LocalDate fechaNacimiento = LocalDate.of(
                    fechaNacimientoCalendar.get(Calendar.YEAR),
                    fechaNacimientoCalendar.get(Calendar.MONTH) + 1, 
                    fechaNacimientoCalendar.get(Calendar.DAY_OF_MONTH)
            );
            LocalDate fechaActual = LocalDate.now();
            Period periodo = Period.between(fechaNacimiento, fechaActual);
            int edad = periodo.getYears();
            return edad >= 18;
        } else {
            return false;
        }
    }
}
