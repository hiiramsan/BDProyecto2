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
public class RegistroPersonaBO implements IRegistroPersona {
    
    ControladorPersistencia cp = new ControladorPersistencia();
    
    public void registrarPersona(PersonaDTO persona) {
        System.out.println("conexion hasta BO correcta");
        cp.registrarPersona(persona);
        
    }
}
