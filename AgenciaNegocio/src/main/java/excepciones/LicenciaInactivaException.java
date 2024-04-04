/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 * La clase LicenciaInactivaException representa una excepción que se lanza cuando se intenta utilizar una licencia inactiva en alguna operación.
 * Esta excepción indica que la licencia requerida para llevar a cabo una operación no está activa.
 *
 * @author Carlos sanchez
 */
public class LicenciaInactivaException extends Exception {
    
    /**
     * Constructor de LicenciaInactivaException.
     * Crea una nueva instancia de LicenciaInactivaException con el mensaje especificado.
     * @param mensaje El mensaje que describe la causa de la excepción.
     */
    public LicenciaInactivaException(String mensaje) {
        super(mensaje);
    }
}
