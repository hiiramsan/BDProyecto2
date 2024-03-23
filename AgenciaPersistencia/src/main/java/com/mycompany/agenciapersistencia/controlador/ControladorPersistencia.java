/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciapersistencia.controlador;

import com.mycompany.agenciapersistencia.daos.LicenciaDAO;
import com.mycompany.agenciapersistencia.daos.PersonaDAO;
import dtos.PersonaDTO;
import entidadesJPA.Persona;

/**
 *
 * @author carlo
 */
public class ControladorPersistencia {
    
    PersonaDAO personaDAO = new PersonaDAO();
    LicenciaDAO licenciaDAO = new LicenciaDAO();
    
    
    public void registrarPersona(PersonaDTO persona){
        this.personaDAO.registrar(persona);
    }
    
    public boolean consultarPersona(String rfc) {
        Boolean personaExiste = this.personaDAO.consultarPersona(rfc);
        return personaExiste;
    }
    
    public PersonaDTO obtenerPersona(String rfc) {
        return this.personaDAO.obtenerPersona(rfc);
    }
    
    public boolean consultarLicencia(PersonaDTO persona) {
        return this.licenciaDAO.consultarLicencia(persona);
    }
    
    public void registrarLicencia(PersonaDTO persona, int vigencia, float costo) {
        this.licenciaDAO.registrarLicencia(persona, vigencia, costo);
    }
}
