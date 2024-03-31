/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author carlo
 */
public class Validadores {
    public boolean esNumerica(String cadena) {
        return cadena.matches("\\d+");
    }
    
    public boolean estaVacio(String texto) {
        return texto == null || texto.isEmpty();
    }
    
    public boolean validarNumSerie(String numSerie) {
        return esNumerica(numSerie) && numSerie.length() <= 17;
    }
    
    public boolean validarRFC(String rfc) {
        return esNumerica(rfc) && rfc.length() <= 13;
    }
}
