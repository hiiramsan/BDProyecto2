/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import com.mycompany.agenciapersistencia.controlador.ControladorPersistencia;
import dtos.PersonaDTO;

/**
 *
 * @author carlo
 */
public class PersonaBO implements IPersona {
    
    ControladorPersistencia cp = new ControladorPersistencia();
    
    @Override
    public void registrarPersona(PersonaDTO persona) {
        System.out.println("conexion hasta BO correcta");
        cp.registrarPersona(persona);
    }
    
    @Override
    public PersonaDTO obtenerPersona(String rfc) {
        return this.cp.obtenerPersona(rfc);
    }
    
    public boolean consultarPersona(String rfc) {
        Boolean personaExiste = cp.consultarPersona(rfc);
        return personaExiste; 
    }
}
