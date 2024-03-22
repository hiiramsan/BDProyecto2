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
    
    PersonaDAO pd = new PersonaDAO();
    
    public void registrarPersona(PersonaDTO persona){
        pd.registrar(persona);
    }
}
