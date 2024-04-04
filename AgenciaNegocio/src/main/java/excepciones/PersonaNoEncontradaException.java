/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 * La clase PersonaNoEncontradaException representa una excepción que se lanza cuando se intenta acceder a una persona que no se encuentra en algún contexto.
 * Esta excepción indica que la operación no puede ser completada porque la persona buscada no está presente.
 * 
 * @author Carlos Sanchez
 */
public class PersonaNoEncontradaException extends Exception {
    
    /**
     * Constructor de PersonaNoEncontradaException.
     * Crea una nueva instancia de PersonaNoEncontradaException con el mensaje especificado.
     * @param mensaje El mensaje que describe la causa de la excepción.
     */
    public PersonaNoEncontradaException(String mensaje) {
        super(mensaje);
    }
}
