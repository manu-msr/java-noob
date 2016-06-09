import javax.swing.JOptionPane; // el programa usa JOptionPane

/**
 * Programa que muestra cuadros de diálogo con JOptionPane.
 * Objetivo: Introducir el concepto de GUI.
 * @author Manuel Soto Romero
 * @version 1.00
 */
public class Suma {
  
  /**
   * Método principal de la clase.
   * @param args Argumentos de la línea de comandos.
   */
  public static void main(String[] args) {
    // obtiene la entrada del usuario de los diálogos de JOptionPane
    String primerNumero =
      JOptionPane.showInputDialog("Introduce el primer entero: ");
    String segundoNumero =
      JOptionPane.showInputDialog("Introduce el segundo entero: ");
    
    /* convierte las entradas String en valores int para usarlos en
       un cálculo */
    int numero1 = Integer.parseInt(primerNumero);
    int numero2 = Integer.parseInt(segundoNumero);
    
    int suma = numero1 + numero2; // suma de enteros
    
    // muestra los resultados en un diálogo de mensajes de JOptionPane
    JOptionPane.showMessageDialog(null, "La suma es " + suma,
                            "Suma de enteros", JOptionPane.PLAIN_MESSAGE);
  }
}