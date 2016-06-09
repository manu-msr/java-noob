package robot;

/**
 * Programa que maneja dos robots.
 * @author Manuel Soto Romero Ciencias UNAM
 * @version 1.00 Febrero 2013.
 */
public class PruebaRobot {
  
  /**
   * Método main
   */
  public static void main(String[] args) {
    Robot uno = new Robot("GLaDOS", "Welcome to Apperture Science");
    Robot dos = new Robot("Wheatly", "Hola amigo!, abre la puerta!");
    
    /**
     * Probar los métodos
     */
    System.out.println(uno.greet());
    System.out.println(uno.greetPerson("Manuel"));
    System.out.println(uno.fullGreeting());
    
    System.out.println(dos.greet());
    System.out.println(dos.greetPerson("Manuel"));
    System.out.println(dos.fullGreeting());    
  }
}