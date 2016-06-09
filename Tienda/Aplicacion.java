package Proyecto; //Paquete del archivo

import java.util.Scanner;

/**
 * PROYECTO FINAL - ICC
 * Programa para que maneja una tienda
 * @author Manuel Soto Romero Ciencias UNAM
 * @version 1.01 Diciembre 2012
 */

public class Aplicacion{
  
  public static void main(String[] args){
    
    /**
     * Clase Tienda, contiene en su constructor
     * los archivos .ser y .txt los cuáles se abren
     * al crear el objeto.
     */
    
    Tienda tienda = new Tienda();
    
    Scanner teclado = new Scanner(System.in);
    
    /**
     * Menú de opciónes para controlar el sistema
     */
    
    int opcion = 1; //Variable que controlará el menú.
    
    do{
      System.out.println("\nSelecciona una Opción: "
                           +"\n[1]Consular existencias de algún artículo."
                           +"\n[2]Dar de alta un nuevo artículo."
                           +"\n[3]Registrar una nueva venta."
                           +"\n[4]Mostrar empleados."
                           +"\n[5]Dar de alta un nuevo empleado."   
                           +"\n[6]Mostrar las ventas."
                           +"\n[7]Salir del sistema.");
      
      String op = teclado.nextLine();
      opcion = Integer.parseInt(op); //Se hace el cambio para evitar posibles errores con las clases
      //y métodos relacionados con la clase Tienda.
      
      switch(opcion){ //Switch para manejar las opciones del menú
        
        //Caso 1: Consular existencias de algún artículo
        case 1:
          tienda.consultarExistencias();
          break;
          
          //Caso 2: Dar de alta un nuevo artículo  
        case 2:
          tienda.darDeAltaArt();
          break;
          
          //Caso 3: Registrar una nueva venta  
        case 3:
          tienda.registrarVenta();
          break;
          
          //Caso 4: Mostrar empleados  
        case 4:
          tienda.mostrarEmpleados();
          break;
          
          //Caso 5: Dar de alta un nuevo empleado  
        case 5:
          tienda.darDeAltaEmp();
          break;
          
          //Caso 6: Mostrar las ventas  
        case 6:
          tienda.mostrarVentas();
          break;
          
          //Salir del sistema
        case 7:
          tienda.salir();
          break;
          
          //En caso de que ponga una opción incorrecta
        default:
          System.out.println("Opción incorrecta");
          break;
      }
    } while (opcion != 7); //Mientras la opción no sea 7
  }
}