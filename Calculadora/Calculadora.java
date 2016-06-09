import java.util.Scanner; // se usar� el Scanner

/**
 * Programa que implementa una calculadora.
 * @author Manuel S.R.
 * @version Junio 2013
 */
public class Calculadora {
  
  /**
   * M�todo principal de la clase.
   * @param args -- Argumentos de la linea de comandos
   */
  public static void main(String[] args) {
    int op = 0; // variable que controlar� el ciclo
    Scanner teclado = new Scanner(System.in); // para pedir datos al usuario
    // variables para realizar el c�lculo
    int n1;
    int n2;
    int resultado;
    do {  // entra al menos una vez
      System.out.print("Selecciona una operaci�n: \n"
                           +"[1]Suma.\n"
                           +"[2]Resta.\n"
                           +"[3]Multiplicaci�n.\n"
                           +"[4]Divisi�n.\n"
                           +"[5]Salir.\n"
                           +"Opci�n: ");
      op = teclado.nextInt(); // pide la opci�n al usuario
      if(op > 0 && op < 5) { // si la opci�n es menor que 5
        System.out.print("\nIntroduce el primer n�mero: ");
        n1 = teclado.nextInt();
        System.out.print("\nIntroduce el segundo n�mero: ");
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
        case 3: // multiplicaci�n
          resultado = n1 * n2;
          System.out.printf("El resultado es: %d\n", resultado);
          break;
        case 4: // Divisi�n
          resultado = n1 / n2;
          System.out.printf("El resultado es: %d\n", resultado);
          break;
        case 5: // suma
          System.out.println("Saliendo...");
          break;
        default:
          System.out.println("Opci�n incorrecta");
		  op = 0;
          break;
      }
    } while(op != 5); // mientras la opci�n sea diferente de 5
  }
}
  