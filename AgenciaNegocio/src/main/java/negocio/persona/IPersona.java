/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio.persona;

import dtos.PersonaDTO;
import excepciones.PersonaExistenteException;

/**
 * La interfaz IPersona define métodos para realizar operaciones relacionadas con las personas.
 * Implementa esta interfaz para proporcionar funcionalidades para registrar una nueva persona, 
 * obtener información de una persona y consultar la existencia de una persona.
 * 
 * @author Carlos Sanchez
 */
public interface IPersona {
    
    /**
     * Registra una nueva persona en el sistema.
     * 
     * @param persona La información de la persona a registrar.
     * @throws PersonaExistenteException Si la persona ya existe en el sistema.
     */
    public void registrarPersona(PersonaDTO persona) throws PersonaExistenteException;
    
    /**
     * Obtiene la información de una persona dado su RFC.
     * 
     * @param rfc El RFC de la persona.
     * @return La información de la persona.
     */
    public PersonaDTO obtenerPersona(String rfc);
    
    /**
     * Consulta si una persona existe en el sistema.
     * 
     * @param rfc El RFC de la persona.
     * @return true si la persona existe en el sistema, false en caso contrario.
     */
    public boolean consultarPersona(String rfc);
}
