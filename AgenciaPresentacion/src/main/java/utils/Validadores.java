/**
 * Clase que proporciona métodos para validar diferentes tipos de cadenas.
 */
package utils;

public class Validadores {
    
    /**
     * Método para verificar si una cadena es numérica.
     * @param cadena La cadena a verificar.
     * @return true si la cadena es numérica, false en caso contrario.
     */
    public boolean esNumerica(String cadena) {
        return cadena.matches("\\d+"); // Utiliza expresión regular para verificar si la cadena contiene solo dígitos
    }
    
    /**
     * Método para verificar si una cadena está vacía.
     * @param texto La cadena a verificar.
     * @return true si la cadena está vacía o es nula, false en caso contrario.
     */
    public boolean estaVacio(String texto) {
        return texto == null || texto.isEmpty(); // Verifica si la cadena es nula o está vacía
    }
    
    /**
     * Método para validar un número de serie.
     * @param numSerie El número de serie a validar.
     * @return true si el número de serie es numérico y tiene una longitud máxima de 17 caracteres, false en caso contrario.
     */
    public boolean validarNumSerie(String numSerie) {
        return esNumerica(numSerie) && numSerie.length() <= 17; // Verifica si el número de serie es numérico y tiene una longitud máxima de 17 caracteres
    }
    
    /**
     * Método para validar un RFC (Registro Federal de Contribuyentes).
     * @param rfc El RFC a validar.
     * @return true si el RFC cumple con el formato alfanumérico, false en caso contrario.
     */
    public boolean validarRFC(String rfc) {
        String regex = "^[a-zA-Z0-9]*$"; // Expresión regular que valida que el RFC contenga solo letras y números
        return rfc.matches(regex); // Verifica si el RFC cumple con la expresión regular
    }
}
