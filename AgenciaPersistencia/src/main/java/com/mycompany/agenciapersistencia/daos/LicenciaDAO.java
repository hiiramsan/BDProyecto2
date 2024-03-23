/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciapersistencia.daos;

import com.mycompany.agenciapersistencia.controlador.utils.EstadoTramite;
import dtos.PersonaDTO;
import entidadesJPA.Licencia;
import entidadesJPA.Persona;
import entidadesJPA.Tramite;
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
   

}
