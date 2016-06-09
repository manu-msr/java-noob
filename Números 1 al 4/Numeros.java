/**
 * Programa que muestra los números del 1 al 4 utilizando
 * distintos métodos de impresión.
 * @author Manuel S.R.
 * @version 1.0
 */
public class Numeros {

  /**
   * Método main que ejecuta el programa.
   * @param args Argumentos de la línea de comandos.
   */
  public static void main(String[] args) {
    
    // Mostramos los números del 1 al 4 con System.out.println
    System.out.println("1 2 3 4");

    // Mostramos los números del 1 al 4 con System.out.print
    System.out.print("1 2 3 4");
    System.out.println(); // Salto de línea

    // Mostramos los números del 1 al 4 con System.out.printf
    System.out.printf("%d %d %d %d", 1, 2, 3, 4);
    System.out.println();
  }
}