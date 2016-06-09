package robot;

/**
 * Clase para manejar los saludos de un robot.
 * @autor Manuel Soto Romero Ciencias UNAM
 * @version 1.00 Febrero 2013
 */
public class Robot {
  
  /**
   * Variable de clase <code>name</code> que guardará el
   * nombre del robot.
   */
  private String name;
  
  /**
   * Variable de clase <code>greeting</code> que guardará lo que
   * dirá el robot al saluda.
   */
  private String greeting;
  
  /**
   * Constructor a partir de un parámetro.
   * @param nom -- Nombre del robot.
   */
  public Robot(String nom) {
    name = nom;
    greeting = "Konnichiwa";
  }
  
  /**
   * Constructor a partir de dos parámetros.
   * @param nom -- Nombre del robot.
   * @param sal -- Saludo.
   */
  public Robot(String nom, String sal) {
    name = nom;
    greeting = sal;
  }
  
  /**
   * Método que regresa una cadena.
   * @return String -- greeting.
   */
  public String greet() {
    return greeting;
  }
  
  /**
   * Método a partir de un parámetro que regresa
   * una cadena.
   * @param cad -- Cadena que recibe como parámetro.
   * @return String -- resultado de la concatenación.
   */
  public String greetPerson(String cad) {
    return greeting + " " + cad;
  }
  
  /**
   * Método que regresa la concatenación de las variables de clase
   * @return String -- Concatenación de las variables.
   */
  public String fullGreeting() {
    return greeting + ", my name is, " + name
      +"\n\t Nice to meet you";
  }
}