/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 * La clase PersonaExistenteException representa una excepción que se lanza cuando se intenta agregar una persona que ya existe en algún contexto.
 * Esta excepción indica que la operación no puede ser completada debido a que la persona ya está presente.
 *
 * @author Carlos Sanchez
 */
public class PersonaExistenteException extends Exception {
    
    /**
     * Constructor de PersonaExistenteException.
     * Crea una nueva instancia de PersonaExistenteException con el mensaje especificado.
     * @param mensaje El mensaje que describe la causa de la excepción.
     */
    public PersonaExistenteException(String mensaje) {
        super(mensaje);
    }
}
