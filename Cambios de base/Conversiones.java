package conversiones;

/**
 * Clase que contiene métodos de conversión
 * @author Manuel Soto Romero
 * @version Marzo 2013
 */
public class Conversiones {
    
    /**
     * Constructor por omisión
     */
    public Conversiones() {
        
    }
    
    /**
     * Método para pasar de una base a otra. Para ello convertimos primero
     * a base 10 y luego a la base deseada
     * @param a -- Base en que está el número
     * @param b -- Base a la que se quiere convertir
     * @param c -- Número en formato cadena
     * @return String -- Nuevo número en formato cadena
     */
    public String deBaseAaBaseB(int a, int b, String c) {
        //Pasamos el número a base 10
        String nuevo = nADiez(a, c); //Implementa este método
        //Pasamos el nuevo número a la base deseada y lo regresamos
        return diezAN(b, nuevo);
    }
    
    /**
     * Método privado. Ya que no nos interesa que se muestre cómo se pasa a
     * base n.
     * @param a -- base a la que queremos convertir
     * @param b -- número a convertir
     * @return String -- cadena con el número convertido
     */
    private String diezAN(int a, String b) {
        String cad = "";
        int nuevo = 0;
        int numero = Integer.parseInt(b);
        int base = a;
        if(numero == 0) {
            return "0";
        }
        while(numero > 0) {
            nuevo = numero%base;
            if(base > 10 && base <= 36 && nuevo > 9) {
                switch(nuevo) {
                    case 10: cad += "A"; break;
                    case 11: cad += "B"; break;
                    case 12: cad += "C"; break;
                    case 13: cad += "D"; break;
                    case 14: cad += "E"; break;
                    case 15: cad += "F"; break;
                    case 16: cad += "G"; break;
                    case 17: cad += "H"; break;
                    case 18: cad += "I"; break;
                    case 19: cad += "J"; break;
                    case 20: cad += "K"; break;
                    case 21: cad += "L"; break;
                    case 22: cad += "M"; break;
                    case 23: cad += "N"; break;
                    case 24: cad += "O"; break;
                    case 25: cad += "P"; break;
                    case 26: cad += "Q"; break;
                    case 27: cad += "R"; break;
                    case 28: cad += "S"; break;
                    case 29: cad += "T"; break;
                    case 30: cad += "U"; break;
                    case 31: cad += "V"; break;
                    case 32: cad += "W"; break;
                    case 33: cad += "X"; break;
                    case 34: cad += "Y"; break;
                    case 35: cad += "Z"; break;
               }
             } else{
                 cad += nuevo;
             }
                numero = numero/base;
        }
		//Volteamos la cadena
        String invertida = "";
        int i = cad.length() - 1;
        while(i >= 0) {
        invertida += cad.charAt(i);
        i--;
        }
        return invertida;
    }
    
     /**
     * Método privado. Ya que no nos interesa que se muestre cómo se pasa a
     * base 10.
     * @param a -- base a la que queremos convertir
     * @param b -- número a convertir
     * @return String -- cadena con el número convertido
     */
    private String nADiez(int a, String b) {
        //Implementa este método
        return "algo";
    }
}
