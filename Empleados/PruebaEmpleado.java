package Empleados;
import java.util.Scanner;

/**
 * Programa para probar la clase empleado
 * y la clase programa de herencia.
 * @author Manuel Soto Romero ciencias UNAM
 * @version 1.01 Noviembre 2012
 */

public class PruebaEmpleado{
  
  //Método main
  public static void main(String[] args){
    
    /*Pruebas de la clase Empleado*/
    
    //Crear un objeto Empleado sin errores
    Empleado emp1 = new Empleado("Manuel Soto Romero", "manumsr93", 19, 5000.00);
    System.out.println(emp1.toString());
    System.out.println();
    
    //Crear un objeto Empleado donde el rango de edad no es válido
    Empleado emp2 = new Empleado("Manuel Soto Romero", "manumsr93", 15, 5000.00);
    
    //Crear un objeto Empleado donde el rando del salario no es válido
    Empleado emp3 = new Empleado("Manuel Soto Romero", "manumsr93", 19, 200.00);
    
    /*Pruebas de la clase Programador*/
    
    //Crear un objeto Programador con nivel intermedio
    Programador prog1 = new Programador("Manuel Soto Romero","manumsr93", 19, 5000.00, 1000, 5);
    System.out.println(prog1.toString());
    System.out.println();
    
    //Crear un objeto Programador con nivel avanzado
    Programador prog2 = new Programador("Manuel Soto Romero","manumsr93",19, 15000.00, 1000, 10);
    System.out.println(prog2.toString());
  }
}
