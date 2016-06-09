package Empleados;

/**
 * Clase para manejar empleados
 * @author Manuel Soto Romero ciencias UNAM
 * @version 1.0 Noviembre 2012
 */

public class Empleado{
  
  //Atributos
  private String nombre;
  private String cedula;
  private int edad;
  private double salario;
  
  
  /**
   * Constructor por omisión
   */
  
  public Empleado(){
    nombre = "";
    cedula = "";
    edad = 18;
    salario = 300.00;
  }
  
  /**
   * Constructor a partir de catro parámetros
   * @param nombre -- Nombre del empleado.
   * @param cedula -- Cédula del empleado.
   * @param edad -- Edad del empleado.
   * @param salario -- Salario del empleado.
   */
  
  public Empleado(String nombre, String cedula, int edad, double salario){
    if(edad>=18 && edad<=45 && salario>=300.00 && salario<=15000.00){
      this.nombre = nombre;
      this.cedula = cedula;
      this.edad = edad;
      this.salario = salario;
    } else{
      System.out.println("Alguno de los datos está fuera del rango");
    }
  }
  
  /**
   * Método para obtener el tipo de empleado
   * @return String -- Tipo de empleado en formato cadena
   */
  
  public String obtenerTipo(){
    String tipo = "";
    if(salario >= 300.00 && salario <= 4999.99) tipo = "Intendencia";
    if(salario >= 5000.00 && salario <= 9999.99) tipo = "Empleado A";
    if(salario >= 10000.00 && salario <= 14999.99) tipo = "Empleado B";
    if(salario == 15000.00) tipo = "Empleado Base";
    return tipo;
  }
  
  /**
   * Método para imprimir los datos del empleado
   * @return String -- Datos del empleado en formato cadena
   */
  
  public String toString(){
    return "\nEmpleado: "+nombre+"\nCédula: "+cedula+"\nEdad: "+edad+"\nSalario: "+salario +"\nEmpleado tipo: "+obtenerTipo();
  }
}