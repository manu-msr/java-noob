package Proyecto; //Paquete donde se encuentra la clase

/**
 * Clase tienda que manejará los artículos y empleados
 * @author Manuel Soto Romero
 * @version 1.04 Diciembre 2012
 */

import java.util.Scanner;

public class Tienda{
  
  //Atributos de la clase
  ArticuloArchivoSecuencial articuloAgregar; //Agregar articulos
  VendedorArchivoSecuencial vendedorAgregar; //Agregar empleados
  LeerArticuloSecuencial articuloLeer; //Leer artículos
  LeerEmpleadoSecuencial vendedorLeer; //Leer vendedores
  Scanner teclado = new Scanner(System.in); //Leer por teclado
  GuardarVentas ventasGuardar; //Guardar las ventas
  LeerVentas ventasLeer; //Leer las ventas
  
  /**
   * Constructor por omisión
   */
  
  public Tienda(){
    articuloAgregar = new ArticuloArchivoSecuencial("Articulos.ser");
    vendedorAgregar = new VendedorArchivoSecuencial("Empleados.ser");
    articuloLeer = new LeerArticuloSecuencial("Articulos.ser");
    vendedorLeer = new LeerEmpleadoSecuencial("Empleados.ser");
    ventasGuardar = new GuardarVentas("Ventas.txt");
    ventasLeer = new LeerVentas("Ventas.txt");
  }
  
  /**
   * Método para para consultar
   * las existencias de algún artículo
   */
  
  public void consultarExistencias(){
    int opcion = 1; //Opción que controlará el menú
    
    do{
      System.out.println("\nSeleccione un tipo de búsqueda:" +
                         "\n[1]Por Clave"+
                         "\n[2]Por Tipo de Artículo"+
                         "\n[3]Por Nombre"+
                         "\n[4]Salir"+
                         "\nOpción: ");
      String op = teclado.nextLine();
      opcion = Integer.parseInt(op);
      
      switch(opcion){
        case 1:
          System.out.println("Introduzca la clave del producto");
          articuloLeer.abrirArchivo();
          articuloLeer.buscarPorClave(teclado.nextLine());
          articuloLeer.cerrarArchivo();
          break;
          
        case 2:
          System.out.println("Seleccione el tipo del artículo: "+
                             "\n[1]Libro"+
                             "\n[2]Disco");
          String tip = teclado.nextLine();
          int tipo = Integer.parseInt(tip);
          
          switch(tipo){
            case 1:
              articuloLeer.abrirArchivo();
              articuloLeer.buscarPorTipo("Libro");
              articuloLeer.cerrarArchivo();
              break;
              
            case 2:
              articuloLeer.abrirArchivo();
              articuloLeer.buscarPorTipo("Disco");
              articuloLeer.cerrarArchivo();
              break;
              
            default:
              System.out.println("Opción incorrecta");
          }
          break;
          
        case 3:
          System.out.println("Introducza el nombre del producto:");
          articuloLeer.abrirArchivo();
          articuloLeer.buscarPorNombre(teclado.nextLine());
          articuloLeer.cerrarArchivo();
          break;
          
        case 4:
          System.out.println("Saliendo de busquedas...");
          break;
          
        default:
          System.out.println("Opción incorrecta");
          break;
      }
    } while(opcion != 4);
  }
  
  /**
   * Método para dar de alta un nuevo
   * artículo
   */
  
  public void darDeAltaArt(){
    articuloAgregar.agregarArticulos();
  }
  
  /**
   * Método para registrar una nueva venta
   */
  
  public void registrarVenta(){
    ventasGuardar.abrirArchivo();
    ventasGuardar.agregarVentas();
    ventasGuardar.cerrarArchivo();
  }
  
  /**
   * Método para mostrar todas las ventas
   */
  
  public void mostrarVentas(){
    System.out.println("Selecciona una opción:"
                      +"\n[1]Todas las ventas."
                      +"\n[2]Por fecha.");
    String op = teclado.nextLine();
    int opcion = Integer.parseInt(op);
    
    switch(opcion){
      
      //Mostrar todas las ventas
      case 1:
        ventasLeer.abrirArchivo();
        ventasLeer.leerVentas();
        ventasLeer.cerrarArchivo();
        break;
        
      //Mostrar las ventas de una fecha específica
      case 2:
        System.out.println("Fecha a buscar: ");
        String f = teclado.nextLine();
        ventasLeer.abrirArchivo();
        ventasLeer.leerVentasFecha(f);
        ventasLeer.cerrarArchivo();
        break;
        
      default:
        System.out.println("Opción no válida");
    }
  }
  /**
   * Método que muestra los empleados de la tienda
   */
  
  public void mostrarEmpleados(){
    vendedorLeer.abrirArchivo();
    vendedorLeer.leerArchivos();
    vendedorLeer.cerrarArchivo();
  }
  
  /**
   * Método para dar de alta un nuevo empleado
   */
  
  public void darDeAltaEmp(){
    vendedorAgregar.agregarVendedores();
  }
  
  /**
   * Método para salir del sistema
   */
  
  public void salir(){
    System.out.println("Escriba la fecha");
    String fecha = teclado.nextLine();
    ventasLeer.abrirArchivo();
    ventasLeer.leerVentasDia(fecha);
    ventasLeer.cerrarArchivo();
  }
}