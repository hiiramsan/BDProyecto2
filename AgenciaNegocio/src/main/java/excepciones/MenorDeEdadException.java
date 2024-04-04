/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 * La clase MenorDeEdadException representa una excepción que se lanza cuando se detecta que una persona es menor de edad en algún contexto.
 * Esta excepción indica que la operación no puede ser realizada debido a que la persona involucrada es menor de edad.
 *
 * @author Carlos Sanchz
 */
public class MenorDeEdadException extends Exception {
    
    /**
     * Constructor de MenorDeEdadException.
     * Crea una nueva instancia de MenorDeEdadException con el mensaje especificado.
     * @param mensaje El mensaje que describe la causa de la excepción.
     */
    public MenorDeEdadException(String mensaje) {
        super(mensaje);
    }
}
