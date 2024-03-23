/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciapersistencia.controlador;

import com.mycompany.agenciapersistencia.daos.PersonaDAO;
import dtos.PersonaDTO;

/**
 *
 * @author carlo
 */
public class ControladorPersistencia {
    
    PersonaDAO personaDAO = new PersonaDAO();
    
    public void registrarPersona(PersonaDTO persona){
        this.personaDAO.registrar(persona);
    }
    
    public boolean consultarPersona(String rfc) {
        Boolean personaExiste = this.personaDAO.consultarPersona(rfc);
        return personaExiste;
    }
}
