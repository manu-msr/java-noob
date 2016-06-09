import java.util.Scanner; // se usará el Scanner

/**
 * Programa que implementa una calculadora.
 * @author Manuel S.R.
 * @version Junio 2013
 */
public class Calculadora {
  
  /**
   * Método principal de la clase.
   * @param args -- Argumentos de la linea de comandos
   */
  public static void main(String[] args) {
    int op = 0; // variable que controlará el ciclo
    Scanner teclado = new Scanner(System.in); // para pedir datos al usuario
    // variables para realizar el cálculo
    int n1;
    int n2;
    int resultado;
    do {  // entra al menos una vez
      System.out.print("Selecciona una operación: \n"
                           +"[1]Suma.\n"
                           +"[2]Resta.\n"
                           +"[3]Multiplicación.\n"
                           +"[4]División.\n"
                           +"[5]Salir.\n"
                           +"Opción: ");
      op = teclado.nextInt(); // pide la opción al usuario
      if(op > 0 && op < 5) { // si la opción es menor que 5
        System.out.print("\nIntroduce el primer número: ");
        n1 = teclado.nextInt();
        System.out.print("\nIntroduce el segundo número: ");
        n2 = teclado.nextInt();
      } else { // en otro caso
        n1 = 0;
        n2 = 0;
      }
      switch(op) {
        case 1: // suma
          resultado = n1 + n2;
          System.out.printf("El resultado es: %d\n", resultado);
          break;
        case 2: // resta
          resultado = n1 - n2;
          System.out.printf("El resultado es: %d\n", resultado);
          break;
        case 3: // multiplicación
          resultado = n1 * n2;
          System.out.printf("El resultado es: %d\n", resultado);
          break;
        case 4: // División
          resultado = n1 / n2;
          System.out.printf("El resultado es: %d\n", resultado);
          break;
        case 5: // suma
          System.out.println("Saliendo...");
          break;
        default:
          System.out.println("Opción incorrecta");
		  op = 0;
          break;
      }
    } while(op != 5); // mientras la opción sea diferente de 5
  }
}
  