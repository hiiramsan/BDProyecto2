/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 * Excepción lanzada cuando se intenta realizar una acción relacionada con una licencia que ya está activa.
 * @author carlo
 */
public class LicenciaActivaException extends Exception {
    /**
     * Construye una nueva LicenciaActivaException con el mensaje detallado especificado.
     * @param mensaje el mensaje detallado.
     */
    public LicenciaActivaException(String mensaje) {
        super(mensaje);
    }
    
}
