/*
 * Esta clase implementa los métodos de la interfaz IPlacaDAO para interactuar con la entidad Placa en la base de datos.
 */

package daos.placa;

import com.mycompany.agenciapersistencia.controlador.utils.EstadoTramite;
import conexion.IConexionDAO;
import dtos.PlacaDTO;
import entidadesJPA.Automovil;
import entidadesJPA.Persona;
import entidadesJPA.Placa;
import java.util.Calendar;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

/**
 * Esta clase implementa los métodos de la interfaz IPlacaDAO para interactuar con la entidad Placa en la base de datos.
 * @author Carlos Sanchez
 */
public class PlacaDAO implements IPlacaDAO {

    private final IConexionDAO conexion;

    /**
     * Constructor de PlacaDAO
     * @param conexion conexion
     */
    public PlacaDAO(IConexionDAO conexion) {
        this.conexion = conexion;
    }

    /**
     * Registra una nueva placa en la base de datos.
     * @param automovil El automóvil asociado a la placa.
     * @param costo El costo de la placa.
     * @param claveNumerica La clave numérica de la placa.
     * @param persona La persona propietaria del automóvil.
     * @return Objeto PlacaDTO con los datos de la placa registrada.
     */
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

    /**
     * Obtiene la placa activa asociada a un automóvil.
     * @param automovil El automóvil para el cual se busca la placa activa.
     * @return La placa activa asociada al automóvil, o null si no se encuentra ninguna placa activa.
     */
    @Override
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

    /**
     * Desactiva la placa asociada a un automóvil.
     * @param automovil El automóvil del cual se desactivará la placa.
     */
    @Override
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
