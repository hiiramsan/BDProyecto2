/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos.persona;

import dtos.PersonaDTO;
import entidadesJPA.Persona;

/**
 *
 * @author carlo
 */
public interface IPersonaDAO {
    public void registrar(PersonaDTO persona);
    
    public boolean consultarPersona(String rfc);
    
    public PersonaDTO obtenerPersona(String rfc);
    
    public Persona buscarPersonaPorRFC(String rfc);
    
    public boolean esMayorDeEdad(String rfc);
}
