import java.util.Scanner;

/**
 * Programa para probar los m�todos de la clase Matrices.
 * Se uso una matriz de ejemplo de esta p�gina: http://www.ditutor.com/matrices/suma_matrices.html
 * @author Manuel Soto Romero
 * @version Abril 2013
 */
public class PruebaMatrices {
  
  public static void main(String[] args) {
    Matrices dePrueba = new Matrices();
    Scanner teclado = new Scanner(System.in);
    
    //Pedir datos al usuario
    System.out.println("PRIMER MATRIZ");
    for(int i = 0; i < 3; i++) {
      for(int j = 0; j < 3; j++) {
        System.out.println("Dame " + i + ", " + j);
        dePrueba.agregarDatoPrimera(teclado.nextInt(), i, j);
      }
    }
    
    //Pedir datos al usuario
    System.out.println("SEGUNDA MATRIZ");
    for(int i = 0; i < 3; i++) {
      for(int j = 0; j < 3; j++) {
        System.out.println("Dame " + i + ", " + j);
        dePrueba.agregarDatoSegunda(teclado.nextInt(), i, j);
      }
    }
    
    System.out.print("Selecciona una operaci�n: "
                      +"\n[1]SUMA"
                      +"\n[2]RESTA"
                      +"\n[3]MULTIPLIACI�N"
                      +"\nOpci�n: ");
    int opcion = teclado.nextInt();
    switch(opcion) {
      // suma
      case 1:
        System.out.println("SUMA");
        dePrueba.sumar();
        dePrueba.mostrarResultado();
        break;
      // resta
      case 2:
        System.out.println("RESTAR");
        dePrueba.restar();
        dePrueba.mostrarResultado();
        break;
      // multiplicaci�n
      case 3:
        System.out.println("MULTIPLICACI�N");
        dePrueba.multiplicar();
        dePrueba.mostrarResultado();
        break;
      // en otro caso
      default:
        System.out.println("Opci�n incorrecta");
    }
  }
}