/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciapersistencia.daos;

import com.mycompany.agenciapersistencia.controlador.utils.EstadoTramite;
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

/**
 *
 * @author carlo
 */
public class LicenciaDAO {

    private PersonaDAO personaDAO;

    public LicenciaDAO() {
        this.personaDAO = new PersonaDAO();
    }
    
    
    
    // metodo que comprueba si una persona tiene una licencia activa
    public boolean consultarLicencia(PersonaDTO persona) {
        
       
        Persona personaABuscar = personaDAO.buscarPersonaPorRFC(persona.getRfc());
        
        List<Tramite> tramites = personaABuscar.getTramites();

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
    
    public LicenciaDTO registrarLicencia(PersonaDTO persona, int vigencia, float costo) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ConexionPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        try {

            Persona personaSolicitante = personaDAO.buscarPersonaPorRFC(persona.getRfc());

            Calendar fechaHoy = Calendar.getInstance();

            Calendar fechaVigencia = Calendar.getInstance();
            fechaVigencia.setTimeInMillis(fechaHoy.getTimeInMillis());
            fechaVigencia.add(Calendar.YEAR, vigencia);

            Licencia licencia = new Licencia(fechaVigencia, costo, EstadoTramite.ACTIVA, fechaHoy, personaSolicitante);
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
            entityManagerFactory.close();
        }
    }
   

}
