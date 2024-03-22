/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agencianegocio.controlador;

import dtos.PersonaDTO;
import negocio.RegistroPersonaBO;

/**
 *
 * @author carlo
 */
public class ControladorNegocio {
    
    RegistroPersonaBO rp = new RegistroPersonaBO();
    
    public void registrarPersona(PersonaDTO persona) {
        rp.registrarPersona(persona);
    }
}
