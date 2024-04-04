/*
 * Representa una excepción que se lanza cuando se intenta realizar una acción relacionada con un automóvil que no existe.
 * 
 * @author carlo
 */
package excepciones;

/**
 * Excepción lanzada cuando se intenta realizar una acción relacionada con un automóvil que no existe.
 * 
 * @author Carlos Sanchez
 */
public class AutomovilInexistenteException extends Exception {
    
    /**
     * Construye una nueva AutomovilInexistenteException con el mensaje detallado especificado.
     * @param mensaje el mensaje detallado.
     */
    public AutomovilInexistenteException(String mensaje) {
        super(mensaje);
    }
    
}
