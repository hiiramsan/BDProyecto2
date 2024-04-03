/*
 * Esta clase representa un Data Access Object (DAO) para la entidad Automovil.
 * Proporciona métodos para interactuar con la base de datos relacionados con Automovil.
 */

package daos.automovil;

import conexion.IConexionDAO;
import dtos.AutomovilDTO;
import entidadesJPA.Automovil;
import entidadesJPA.Persona;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 * Clase que implementa la interfaz IAutomovilDAO y proporciona operaciones de acceso a datos relacionadas con Automovil.
 * Esta clase se encarga de realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre la tabla Automovil en la base de datos.
 * @author Carlos Sanchez
 */
public class AutomovilDAO implements IAutomovilDAO {

    private final IConexionDAO conexion;

    /**
     * Constructor de la clase AutomovilDAO.
     * @param conexion Objeto que implementa la interfaz IConexionDAO para gestionar la conexión a la base de datos.
     */
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
            String jpql = "SELECT a FROM Automovil a WHERE a.numSerie = :numSerie AND a.persona.rfc = :rfc";
            TypedQuery<Automovil> query = entityManager.createQuery(jpql, Automovil.class);
            query.setParameter("numSerie", numeroSerie);
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
            return null;
        } finally {
            entityManager.close();
        }
    }

    @Override
    public Automovil obtenerAutomovilPorNumeroSerie(String numSerie) {
        EntityManager entityManager = conexion.crearConexion();
        entityManager.getTransaction().begin();
        try {

            String jpql = "SELECT a FROM Automovil a WHERE a.numSerie = :numSerie";
            TypedQuery<Automovil> query = entityManager.createQuery(jpql, Automovil.class);
            query.setParameter("numSerie", numSerie);
            Automovil automovil = query.getSingleResult();

            entityManager.getTransaction().commit();
            return automovil;
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            return null;
        } finally {
            entityManager.close();
        }
    }
    
    @Override
    public AutomovilDTO obtenerAutoPorPlacas(String claveNumerica, String rfc) {
        EntityManager entityManager = conexion.crearConexion();
        entityManager.getTransaction().begin();
        
        try {
            String jpql = "SELECT a FROM Automovil a JOIN a.placas p WHERE p.numeroAlfanumerico = :numeroAlfanumerico AND a.persona.rfc = :rfc";
            TypedQuery<Automovil> query = entityManager.createQuery(jpql, Automovil.class);
            query.setParameter("numeroAlfanumerico", claveNumerica);
            query.setParameter("rfc", rfc);
            List<Automovil> resultados = query.getResultList();
            if (!resultados.isEmpty()) {
                Automovil automovil = resultados.get(0);
                AutomovilDTO autoEncontrado = new AutomovilDTO();
                autoEncontrado.setNumeroSerie(automovil.getNumSerie());
                autoEncontrado.setMarca(automovil.getMarca());
                autoEncontrado.setModelo(automovil.getModelo());
                autoEncontrado.setLinea(automovil.getLinea());
                autoEncontrado.setColor(automovil.getColor());
                return autoEncontrado;
            }
        } catch(Exception e) {
            e.printStackTrace();
        }finally {
            entityManager.close();
        }
        return null; // 
    }
}
