/**
 * Programa para probar la clase fraccion.
 * @author Manuel Soto Romero.
 * @version 1.00 Marzo 2013
 */
public class PruebaFracciones {
  
  /**
   * Método main
   */
  public static void main(String[] args) {
    
    /**
     * Crear dos fracciones
     */
    System.out.println("Creando dos fracciones...\n");
    Fraccion uno = new Fraccion(3628800,759374);
    Fraccion dos = new Fraccion(10,5);
    
    /**
     * Mostrar las fracciones
     */
    System.out.println("Las fracciones son: "
                         + "\n" + uno.muestra() + " y " + dos.muestra());
    
    /**
     * Operaciones entre las fracciones
     */
    System.out.println("\nSuma de las dos fracciones: " + uno.suma(dos).muestra());
    System.out.println("Resta de las dos fracciones: "+ uno.resta(dos).muestra());
    System.out.println("Multiplicación de las dos fracciones: "+ uno.multiplica(dos).muestra());
    System.out.println("División de las dos fracciones: "+ uno.divide(dos).muestra());
    
    /**
     * Multiplicar por un escalar
     */
    System.out.println("\nMultiplicamos las fracciones por el entero 2:");
    System.out.println(uno.muestra() + ": "+uno.multiplicaEscalar(2).muestra());
    System.out.println(dos.muestra() +": "+dos.multiplicaEscalar(2).muestra());
    
    /**
     * Saber si las fracciones son propias
     */
    System.out.println("\nLas fracciones son propias?: ");
    System.out.println(uno.muestra() + ": " + uno.esPropia());
    System.out.println(dos.muestra() + ": " + dos.esPropia());
    
    /**
     * Obtener el valor real de las fracciones
     */
    System.out.println("\nValor real de las fracciones: ");
    System.out.println(uno.muestra() + ": " + uno.daValorReal());
    System.out.println(dos.muestra() + ": " + dos.daValorReal());
    
    /**
     * Simplificamos las fracciones
     */
    System.out.println("\nSimplificar las fracciones: ");
    System.out.println(uno.muestra() + ": " + uno.simplifica().muestra());
    System.out.println(dos.muestra() + ": " + dos.simplifica().muestra());
  }
}
