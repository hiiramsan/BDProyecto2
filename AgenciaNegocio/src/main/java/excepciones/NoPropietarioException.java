/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 * La clase NoPropietarioException representa una excepción que se lanza cuando se intenta realizar una operación que requiere ser propietario de un recurso, pero el usuario actual no es el propietario.
 * Esta excepción indica que el usuario no tiene los privilegios necesarios para llevar a cabo la operación.
 *
 * @author Carlos Sanchez
 */
public class NoPropietarioException extends Exception {
    
    /**
     * Constructor de NoPropietarioException.
     * Crea una nueva instancia de NoPropietarioException con el mensaje especificado.
     * @param mensaje El mensaje que describe la causa de la excepción.
     */
    public NoPropietarioException(String mensaje) {
        super(mensaje);
    }
}
