/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio.persona;

import dtos.PersonaDTO;
import excepciones.PersonaExistenteException;

/**
 *
 * @author carlo
 */
public interface IPersona {
    public void registrarPersona(PersonaDTO persona) throws PersonaExistenteException;
    
    public PersonaDTO obtenerPersona(String rfc);
    
    public boolean consultarPersona(String rfc);
}
