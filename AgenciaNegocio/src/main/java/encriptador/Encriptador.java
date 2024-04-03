/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encriptador;

/**
 *
 * @author carlo
 */
public class Encriptador {

    public static String encriptar(String str) {
        char[] charArray = str.toCharArray();
        String s = "";
        for (char c : charArray) {
            int cAsc = (int) c;
            cAsc=c+12;
            char ce = (char) cAsc;
            s = s.concat(Character.toString(ce));
       
        }
        return s;
    }
   
    public static String desencriptar(String str) {
        char[] charArray = str.toCharArray();
        String s = "";
        for (char c : charArray) {
            int cAsc = (int) c;
            cAsc=c-12;
            char ce = (char) cAsc;
            s = s.concat(Character.toString(ce));
       
        }
          return s;
    }
}
