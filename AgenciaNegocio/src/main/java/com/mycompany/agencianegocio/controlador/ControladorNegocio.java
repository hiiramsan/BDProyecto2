/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agencianegocio.controlador;

import dtos.PersonaDTO;
import entidadesJPA.Persona;
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
    ILicencias lb = new LicenciaBO();
    
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
    
    public float calcularCostoLicencia(int vigencia, boolean esDiscapacitado) {
        return this.lb.calcularCostoLicencia(vigencia, esDiscapacitado);
    }
    
    public boolean consultarLicencia(PersonaDTO persona) {
        return this.lb.consultarLicencia(persona);
    }
    
    public void registrarLicencia(PersonaDTO persona, int vigencia, float costo) {
        this.lb.registrarLicencia(persona, vigencia, costo);
    }
}
