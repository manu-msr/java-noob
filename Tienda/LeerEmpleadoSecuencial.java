package Proyecto; //Paquete donde se encuentra la clase

//Paquetes para utilizar serialización
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Clase para leer los Empleados de un archivo
 * @author Manuel Soto Romero
 * @version 1.01 Diciembre 2012
 */

public class LeerEmpleadoSecuencial{
  
  //Atributos de la clase
  private ObjectInputStream entrada;
  private String nombre;
  
  /**
   * Constructor a partir de un parámetro
   * @param archivo -- Nombre del archivo.
   */
  
  public LeerEmpleadoSecuencial(String archivo){
    nombre = archivo;
  }
  
  /**
   * Método para abrir el archivo
   */
  
  public void abrirArchivo(){
    try{
      entrada = new ObjectInputStream(new FileInputStream( nombre ));
    } catch (IOException ioe){
      System.out.println("Error al abrir el archivo.");
    } 
  }
  
  /**
   * Método para leer los archivos
   */
  
  public void leerArchivos(){
    Vendedor vendedor;
    try {
      while (true){
        Object objeto =  entrada.readObject();
        if(objeto instanceof Vendedor){
          vendedor = (Vendedor)objeto;
          System.out.println(vendedor.toString());
        }else{
          System.out.println("No es un artículo");
        }
      }
    }catch (EOFException eofe){
      return;
    }catch (ClassNotFoundException cnfe){
      System.out.println("No se pudo crear el objeto.");
    } catch ( IOException ioException ){
      System.out.println("Error al leer del archivo.");
      System.out.println("La causa " +  ioException.toString());
    } 
  }
  
  /**
   * Método para cerrar el archivo
   */
  
  public void cerrarArchivo(){
    try{
      entrada.close();
    } catch (IOException ioException){
      System.out.println( "Error al cerrar el archivo." );
    }
  } 
}