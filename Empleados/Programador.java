package Empleados;

/**
 * Clase para manejar programadores,
 * heredados de la clase Empleado.
 * @author Manuel Soto Romero ciencias UNAM
 * @version 1.0 Noviembre 2012
 */

public class Programador extends Empleado{
  
  //Atributos
  protected int lineasDeCodigoPorHora;
  protected int lenguajesDomina;
  
  /**
   * Constructor por omisión
   */
  public Programador(){
    lineasDeCodigoPorHora = 0;
    lenguajesDomina = 0;
  }
  
  /**
   * Construtor a partir de seis parámetros
   * @param nombre -- Nombre del programador,
   * hereda de la clase padre.
   * @param cedula -- Cédula del prgoramador,
   * hereda de la clase padre.
   * @param edad -- Edad del programador.
   * hereda de la clase padre.
   * @param salario -- Salario del programador,
   * hereda de la clase padre.
   * @param lineasDeCodigoPorHora -- Líneas de código que 
   * escribe por hora el programador
   * @param lenguajesDomina -- Númerode lenguajes que domina.
   */
  
  public Programador(String nombre, String cedula, int edad, double salario, int lineasDeCodigoPorHora, int lenguajesDomina){
    super(nombre, cedula, edad, salario);
    this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
    this.lenguajesDomina = lenguajesDomina;
  }
  
  /**
   * Método para obtener el tipo de programador
   * @return String -- Tipo en formato cadena
   */
  
  public String obtenerTipo(){
    String tipo = "";
    if(lenguajesDomina > 3) tipo = "intermedio";
    if(lenguajesDomina > 5) tipo = "avanzado";
    return super.obtenerTipo() + " programador nivel "+ tipo;
  }
  
  /**
   * Método que regresa los datos del prgramador
   * en formato cadena.
   * @return String -- Datos del programador.
   */
  
  public String toString(){
    return super.toString() + "\nLineas de código por hora: "+lineasDeCodigoPorHora+"\nLenguajes que domina: "+lenguajesDomina;
  }
}