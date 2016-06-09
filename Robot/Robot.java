package robot;

/**
 * Clase para manejar los saludos de un robot.
 * @autor Manuel Soto Romero Ciencias UNAM
 * @version 1.00 Febrero 2013
 */
public class Robot {
  
  /**
   * Variable de clase <code>name</code> que guardar� el
   * nombre del robot.
   */
  private String name;
  
  /**
   * Variable de clase <code>greeting</code> que guardar� lo que
   * dir� el robot al saluda.
   */
  private String greeting;
  
  /**
   * Constructor a partir de un par�metro.
   * @param nom -- Nombre del robot.
   */
  public Robot(String nom) {
    name = nom;
    greeting = "Konnichiwa";
  }
  
  /**
   * Constructor a partir de dos par�metros.
   * @param nom -- Nombre del robot.
   * @param sal -- Saludo.
   */
  public Robot(String nom, String sal) {
    name = nom;
    greeting = sal;
  }
  
  /**
   * M�todo que regresa una cadena.
   * @return String -- greeting.
   */
  public String greet() {
    return greeting;
  }
  
  /**
   * M�todo a partir de un par�metro que regresa
   * una cadena.
   * @param cad -- Cadena que recibe como par�metro.
   * @return String -- resultado de la concatenaci�n.
   */
  public String greetPerson(String cad) {
    return greeting + " " + cad;
  }
  
  /**
   * M�todo que regresa la concatenaci�n de las variables de clase
   * @return String -- Concatenaci�n de las variables.
   */
  public String fullGreeting() {
    return greeting + ", my name is, " + name
      +"\n\t Nice to meet you";
  }
}