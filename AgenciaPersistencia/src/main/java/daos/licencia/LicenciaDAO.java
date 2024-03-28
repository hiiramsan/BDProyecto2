/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos.licencia;

import daos.persona.PersonaDAO;
import conexion.IConexionDAO;
import dtos.LicenciaDTO;
import dtos.PersonaDTO;
import entidadesJPA.Licencia;
import entidadesJPA.Persona;
import entidadesJPA.Tramite;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import com.mycompany.agenciapersistencia.controlador.utils.EstadoTramite;
import javax.persistence.TemporalType;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 *
 * @author carlo
 */
public class LicenciaDAO implements ILicenciaDAO {

    private final IConexionDAO conexion;

    public LicenciaDAO(IConexionDAO conexion) {
        this.conexion = conexion;
    }

    // metodo que comprueba si una persona tiene una licencia activa (maybe no funciona despues)
    @Override
    public boolean consultarLicencia(Persona persona) {

        List<Tramite> tramites = persona.getTramites();

        for (Tramite tramite : tramites) {
            if (tramite instanceof Licencia) {
                Licencia licencia = (Licencia) tramite;
                EstadoTramite estado = licencia.determinarEstado();
                if (estado == EstadoTramite.ACTIVA) {
                    return true;
                }
            }

        }
        return false;
    }

    @Override
    public LicenciaDTO registrarLicencia(Persona persona, int vigencia, float costo) {
        EntityManager entityManager = conexion.crearConexion();
        entityManager.getTransaction().begin();

        try {

            Calendar fechaHoy = Calendar.getInstance();

            Calendar fechaVigencia = Calendar.getInstance();
            fechaVigencia.setTimeInMillis(fechaHoy.getTimeInMillis());
            fechaVigencia.add(Calendar.YEAR, vigencia);

            Licencia licencia = new Licencia(fechaVigencia, costo, EstadoTramite.ACTIVA, fechaHoy, persona);
            entityManager.persist(licencia);
            entityManager.getTransaction().commit();

            LicenciaDTO licenciaDTO = new LicenciaDTO();
            licenciaDTO.setFechaExpedicion(licencia.getFechaExpedicion());
            licenciaDTO.setFechaVigencia(licencia.getVigencia());
            licenciaDTO.setCosto(licencia.getCosto());
            licenciaDTO.setEstado(licencia.getEstado());

            return licenciaDTO;

        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            throw e;
        } finally {
            entityManager.close();
        }
    }

    @Override
    public boolean tieneLicenciaActiva(Persona persona) {
        EntityManager entityManager = conexion.crearConexion();
        entityManager.getTransaction().begin();

        try {
            String jpql = "SELECT l FROM Licencia l WHERE l.persona.rfc = :rfc "
                    + "AND l.estado = :estado AND l.vigencia >= :fechaActual";
            TypedQuery<Licencia> query = entityManager.createQuery(jpql, Licencia.class);
            query.setParameter("rfc", persona.getRfc()); 
            query.setParameter("estado", EstadoTramite.ACTIVA);
            query.setParameter("fechaActual", Calendar.getInstance(), TemporalType.DATE);

            Licencia licencia = query.getSingleResult();

            entityManager.getTransaction().commit();
            return licencia != null;
        } catch (Exception e) {
            return false;
        } finally {
            entityManager.close();
        }
    }

}
