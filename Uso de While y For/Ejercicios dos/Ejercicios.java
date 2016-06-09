/**
 * Clase que comprueba si una cadena es un número
 * @author Manuel S.R.
 * @version Abril 2013
 */
public class Ejercicios {
  
  /**
   * Constructor por omisión
   */
  public Ejercicios() {
  }

  /**
   * Método que indica si una cadena es un número
   * @param c -- Cadena a comparar
   * @return boolean -- true si es cadena, false en otro caso
   */
  public boolean esCadena(String c) {
    int contador = 0;
    for(int i = 0; i < c.length(); i++) {
      if(c.charAt(i) == '.') {
        contador++;
      }
      for(char ch = '0'; ch < ':'; ch++) {
        if(c.charAt(i) == ch) {
          contador++;
        }
      }
    }
    return contador == c.length();
  }
  
  /**
   * Método que determina si un número es primo, debe verificar si
   * está en el rango de 0 a 1000
   * @paran n -- Número a determinar si es primo
   * @return boolean -- true si es primo, false en otro caso
   */
  public boolean esPrimo(int n) {
    if(n >= 0 && n <= 1000) {
      int contador = 0;
      for(int i = 1; i <= n; i++) {
        if(n % i == 0) {
          contador++;
        }
      }
      return contador == 2;
    }
    System.out.println("Número fuera del rango");
    return false;
  }
  
  /**
   * Método principal
   * @param args -- Argumentos de la línea de comandos
   */
  public static void main(String[] args) {
    Ejercicios uno = new Ejercicios();
    System.out.println(uno.esCadena("891011"));
    System.out.println(uno.esCadena("Ola k ase?"));
    System.out.println(uno.esPrimo(1001));
  }
  
}