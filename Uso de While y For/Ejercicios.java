package pkgwhile;

import java.util.Scanner;

/**
 * Clase con ejercicios de While
 * @author Manuel Soto Romero
 * @version Abril 2013
 */
public class Ejercicios {

    /**
     * Método que indica si el caractér que se le pasa como parámetro se 
     * encuentra el número de veces en la cadena que se le pasa como parámetro.
     * @param c -- Cadena a revisar
     * @param e -- Número de apariciones que se pasa como parámetro
     * @param ch -- Caracter a comparar.
     * @return boolean -- true si se encuentra el número de veces que se le
     * indica, false en otro caso
     */
    public boolean rev(String c, int e, char ch) {
        int tam = c.length();
        int i = 0;
        int cont = 0;
        while(i < tam){
            char aux = c.charAt(i);
            if(aux == ch){
                cont++;
            }
            i++;
        }
        return cont == e;
    }
    
    /**
     * Método que pide un caracter al usuario mientras no sea igual a los
     * caracteres especiales, al final concatena los caracteres que le pasa el
     * usuario.
     * @return String -- Cadena con los caracteres que se pasaron durante la 
     * ejecución del programa.
     */
    public String revChar() {
        Scanner in = new Scanner(System.in);
        char c = ' ';
        String cadena = "";
        do {
            System.out.println("Dame un caracter: ");
            c = in.next().charAt(0);
            cadena += c;
        } while(c != '!' && c != '@');
        return cadena;
    }
    
    /**
     * Método main
     * @param args -- Argumentos de la línea de comandos 
     */
    public static void main(String[] args) {
        Ejercicios uno = new Ejercicios();
        System.out.println(uno.revChar());
    }
}