/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agencianegocio.controlador;

import dtos.PersonaDTO;
import negocio.ILicencias;
import negocio.IRegistroPersona;
import negocio.LicenciaBO;
import negocio.RegistroPersonaBO;

/**
 *
 * @author carlo
 */
public class ControladorNegocio {
    
    IRegistroPersona rp = new RegistroPersonaBO();
    ILicencias lb = new LicenciaBO();
    
    public void registrarPersona(PersonaDTO persona) {
        this.rp.registrarPersona(persona);
    }
    
    public boolean consultarPersona(String rfc) {
        Boolean personaExiste = this.lb.consultarPersona(rfc);
        return personaExiste;
    }
}
