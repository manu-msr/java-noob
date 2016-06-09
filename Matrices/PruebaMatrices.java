import java.util.Scanner;

/**
 * Programa para probar los métodos de la clase Matrices.
 * Se uso una matriz de ejemplo de esta página: http://www.ditutor.com/matrices/suma_matrices.html
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
    
    System.out.print("Selecciona una operación: "
                      +"\n[1]SUMA"
                      +"\n[2]RESTA"
                      +"\n[3]MULTIPLIACIÓN"
                      +"\nOpción: ");
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
      // multiplicación
      case 3:
        System.out.println("MULTIPLICACIÓN");
        dePrueba.multiplicar();
        dePrueba.mostrarResultado();
        break;
      // en otro caso
      default:
        System.out.println("Opción incorrecta");
    }
  }
}