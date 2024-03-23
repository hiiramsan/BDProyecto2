/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio;

import dtos.PersonaDTO;

/**
 *
 * @author carlo
 */
public interface IPersona {
    public void registrarPersona(PersonaDTO persona);
    
    public PersonaDTO obtenerPersona(String rfc);
    
    public boolean consultarPersona(String rfc);
}
