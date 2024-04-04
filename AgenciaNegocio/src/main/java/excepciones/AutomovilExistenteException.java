/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 * Exception thrown when attempting to add a duplicate automobile.
 * 
 * @author Carlos Sanchez
 */
public class AutomovilExistenteException extends Exception {
    
    /**
     * Constructs a new AutomovilExistenteException with the specified detail message.
     * @param mensaje the detail message.
     */
    public AutomovilExistenteException(String mensaje) {
        super(mensaje);
    }
}
