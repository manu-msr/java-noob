package japones;

/**
 * Clase para transformar un número decimal a su representación en japones
 * @author Manuel Soto Romero
 * @version 1.00 Abril 2013
 */
public class NumJap {
    
    /**
     * Atributos de la clase
     */
    int numero;
    
    /**
     * Constructor por omisión
     */
    public NumJap() {
        numero = 0;
    }
    
    /**
     * Constructor a partir de un parámetro
     */
    public NumJap(int n) {
        numero = n;
    }
    
    /**
     * Método para tranformar el número a cadena
     * @return String -- Número en su representación en Japones
     */
    public String convertir() {
        if((numero >= 0 && numero <= 10) || numero == 100) {
            switch(numero) {
                case 0: return "rei";
                case 1: return "ichi";
                case 2: return "ni";
                case 3: return "san";
                case 4: return "yon";
                case 5: return "go";
                case 6: return "roku";
                case 7: return "nana";
                case 8: return "haci";
                case 9: return "kyu";
                case 10: return "ju";
                case 100: return "hyaku";
            }
        } else if (numero > 10 && numero < 100){
            String cadena = "";
            char decima = Integer.toString(numero).charAt(0);
            char unidad = Integer.toString(numero).charAt(1);
            switch(decima) {
                case '1': cadena = "ju"; break;
                case '2': cadena = "ni ju"; break;
                case '3': cadena = "san ju"; break;
                case '4': cadena = "yon ju"; break;
                case '5': cadena = "go ju"; break;
                case '6': cadena = "roku ju"; break;
                case '7': cadena = "nana ju"; break;
                case '8': cadena = "haci ju"; break;
                case '9': cadena = "kyu ju"; break;
                default: System.out.println("Error");
            }
            switch(unidad) {
                case '0': cadena += " rei"; break;
                case '1': cadena += " ichi"; break;
                case '2': cadena += " ni"; break;
                case '3': cadena += " san"; break;
                case '4': cadena += " yon"; break;
                case '5': cadena += " go"; break;
                case '6': cadena += " roku"; break;
                case '7': cadena += " nana"; break;
                case '8': cadena += " haci"; break;
                case '9': cadena += " kyu"; break;
                default: System.out.println("Error");
            }   
            return cadena;
        }
        return "Error";
    }
}
