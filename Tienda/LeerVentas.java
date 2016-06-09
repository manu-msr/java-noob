package Proyecto; //Paquete donde se ecuentra la clase

//Paquetes para utilizar serialización
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Clase que permite leer las ventas de un archivo
 * de texto
 * @author Manuel Soto Romero Ciencias UNAM
 * @version 1.01 Diciembre 2012
 */

public class LeerVentas{
  
  //Atributos de la clase
  private Scanner entrada;
  private File archivo;
  private String nombreArchivo;
  
  /**
   * Constructor a partir de un parámetro
   * @param nombre -- el nombre del archivo a leer
   */ 
  
  public LeerVentas(String nombre){
    nombreArchivo = nombre;
  }
  
  /**
   * Método para abrir el archivo.
   */
  
  public void abrirArchivo(){
    try {
      archivo = new File(nombreArchivo);
      entrada = new Scanner(archivo);
    }catch (FileNotFoundException fnfe){
      System.out.println("Error al abrir el archivo.");
    }
  }
  
  /**
   * Método para leer las ventas
   */
  
  public void leerVentas(){
    System.out.println("Ventas");
    Ventas ventas = new Ventas();
    
    try{
      while (entrada.hasNext()){
        ventas.establecerClaveEmp(entrada.next());
        ventas.establecerClaveArt(entrada.next());
        ventas.establecerCantidad(entrada.nextInt());
        ventas.establecerTotal(entrada.nextDouble());
        ventas.establecerFecha(entrada.next());
        
        System.out.println(ventas.obtenerClaveEmp()+"/"+ventas.obtenerClaveArt()+"/"+ventas.obtenerCantidad()+"/"
                             +ventas.obtenerTotal()+"/"+ventas.obtenerFecha());
      } 
    }catch(TiendaException e){
      System.out.println(e.getMessage());
    }catch (NoSuchElementException ee) {
      System.out.println("El archivo no esta bien formado.");
    }catch (IllegalStateException ise){
      System.out.println("Error al leer del archivo.");
    }
  }
  
  /**
   * Método para mostrar las ventas de una fecha específica
   */
  
  public void leerVentasFecha(String f){
    System.out.println("Ventas del día: "+f);
    Ventas ventas = new Ventas();
    
    try{
      while (entrada.hasNext()){
        ventas.establecerClaveEmp(entrada.next());
        ventas.establecerClaveArt(entrada.next());
        ventas.establecerCantidad(entrada.nextInt());
        ventas.establecerTotal(entrada.nextDouble());
        ventas.establecerFecha(entrada.next());
        
        if(f.equalsIgnoreCase(ventas.obtenerFecha())){
          System.out.println(ventas.obtenerClaveEmp()+"/"+ventas.obtenerClaveArt()+"/"+ventas.obtenerCantidad()+"/"
                               +ventas.obtenerTotal()+"/"+ventas.obtenerFecha());
        }
      } 
    }catch(TiendaException e){
      System.out.println(e.getMessage());
    }catch (NoSuchElementException ee) {
      System.out.println( "El archivo no esta bien formado." );
    }catch (IllegalStateException ise){
      System.out.println( "Error al leer del archivo." );
    }
  }
  
  /**
   * Método para mostrar las ventas totales del día
   */
  
  public void leerVentasDia(String f){
    System.out.println("Ventas del día:");
    Ventas ventas = new Ventas();
    double total = 0.0;
    String [] claves = new String[50];
    
    try{
      while (entrada.hasNext()){
        ventas.establecerClaveEmp(entrada.next());
        ventas.establecerClaveArt(entrada.next());
        ventas.establecerCantidad(entrada.nextInt());
        ventas.establecerTotal(entrada.nextDouble());
        ventas.establecerFecha(entrada.next());
        
        if(f.equalsIgnoreCase(ventas.obtenerFecha())){
          
          //Calcular el monto total de ventas
          total += ventas.obtenerTotal();
          
          //Guardar claves de los artículos en un arreglo
          //para determinar de qué tipo son y mostrarlos.
          
          for(int i=0; i<claves.length; i++){
            if(claves[i] == null){
              claves[i] = ventas.obtenerClaveArt();
              i = 50;
            }
          }
        }
      }
      
      //Mostrar el total de ventas
      System.out.println("Total de ventas del día: "+total);
      
      //Mostrar los libros vendidos
      System.out.println("\nLibros vendidos: ");
      LeerArticuloSecuencial leer = new LeerArticuloSecuencial("Articulos.ser");
      
      for(int i=0; i<claves.length; i++){
        if(claves[i] != null){
          String c = claves[i].substring(0,5);
          if(c.equalsIgnoreCase("libro")){
            leer.abrirArchivo();
            leer.buscarPorClave(claves[i]);
            leer.cerrarArchivo();
          }
        }
      }
      
      //Mostrar los discos vendidos
      System.out.println("\nDiscos vendios: ");
      for(int i=0; i<claves.length; i++){
        if(claves[i] != null){
          String c = claves[i].substring(0,5);
          if(c.equalsIgnoreCase("disco")){
            leer.abrirArchivo();
            leer.buscarPorClave(claves[i]);
            leer.cerrarArchivo();
          }
        }
      }
      
      //Mostrar los artículos agotados
      System.out.println("\nArtículos agotados: ");
      for(int i=0; i<claves.length; i++){
        if(claves[i] != null){
            leer.abrirArchivo();
            leer.revisarAlmacen(claves[i]);
            leer.cerrarArchivo();
        }
      }
    }catch(TiendaException e){
      System.out.println(e.getMessage());
    }catch ( NoSuchElementException ee ) {
      System.out.println("El archivo no esta bien formado.");
    }catch ( IllegalStateException ise ){
      System.out.println("Error al leer del archivo.");
    }
  }
  
  /**
   * Método para cerrar el archivo
   */
  
  public void cerrarArchivo(){
    if (entrada != null)
      entrada.close();
  }
}