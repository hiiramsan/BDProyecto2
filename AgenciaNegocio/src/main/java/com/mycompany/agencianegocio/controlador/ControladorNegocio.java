/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agencianegocio.controlador;

import dtos.PersonaDTO;
import negocio.ILicencias;
import negocio.IPersona;
import negocio.LicenciaBO;
import negocio.PersonaBO;


/**
 *
 * @author carlo
 */
public class ControladorNegocio {
    
    IPersona rp = new PersonaBO();
    //ILicencias lb = new LicenciaBO();
    
    public void registrarPersona(PersonaDTO persona) {
        this.rp.registrarPersona(persona);
    }
    
    public boolean consultarPersona(String rfc) {
        Boolean personaExiste = this.rp.consultarPersona(rfc);
        return personaExiste;
    }
    
    public PersonaDTO obtenerPersona(String rfc) {
        return this.rp.obtenerPersona(rfc);
    }
}
