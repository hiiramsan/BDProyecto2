/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encriptador;

/**
 * Clase que proporciona métodos para encriptar y desencriptar cadenas de texto.
 * Utiliza un simple algoritmo de desplazamiento de caracteres ASCII.
 * 
 * @author Carlos Sanchez
 */
public class Encriptador {

    /**
     * Método que encripta una cadena de texto utilizando un algoritmo de desplazamiento.
     * @param str Cadena de texto a encriptar.
     * @return Cadena de texto encriptada.
     */
    public static String encriptar(String str) {
        char[] charArray = str.toCharArray();
        StringBuilder s = new StringBuilder();
        for (char c : charArray) {
            int cAsc = (int) c;
            cAsc += 12; // Desplazamiento de 12 caracteres
            char ce = (char) cAsc;
            s.append(ce);
        }
        return s.toString();
    }
   
    /**
     * Método que desencripta una cadena de texto encriptada utilizando un algoritmo de desplazamiento.
     * @param str Cadena de texto encriptada.
     * @return Cadena de texto desencriptada.
     */
    public static String desencriptar(String str) {
        char[] charArray = str.toCharArray();
        StringBuilder s = new StringBuilder();
        for (char c : charArray) {
            int cAsc = (int) c;
            cAsc -= 12; // Desplazamiento inverso de 12 caracteres
            char ce = (char) cAsc;
            s.append(ce);
        }
        return s.toString();
    }
}
