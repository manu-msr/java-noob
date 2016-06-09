package Proyecto; //Paquete donde se encuentra la clase

//Paquetes para usar serialización
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase para crear un archivo secuencial de Empleados
 * @author Manuel Soto Romero Ciencias UNAM
 * @version 1.00 Diciembre 2012
 */

public class VendedorArchivoSecuencial{
  
  //Atributos de la clase
  private ObjectOutputStream salida;
  private String archivo;
  
  /**
   * Constructor a partir del nombre del archivo
   * @param n -- Nombre del Archivo
   */
  
  public VendedorArchivoSecuencial(String n){
    archivo = n;
  }
  
  /**
   * Método para abrir el archivo
   */
  
  public void abrirArchivo(){
    try{
      salida = new ObjectOutputStream(new FileOutputStream(archivo, true));
    } catch (IOException io){
      System.out.println("Error al abrir el archivo");
    }
  }
  
  /**
   * Método que obtiene los datos del Empleado
   * @throws TiendaException -- En caso de que ingrese o 
   * introduzca un dato incorrecto.
   */
  
  public Vendedor pedirDatos(){
    
    Vendedor vendedor = null; //Vendedor que devolverá el método
    Scanner teclado = new Scanner(System.in);
    
    try{
      boolean agrego = false;
      
      while(agrego == false){
        vendedor = new Vendedor();
        System.out.print("RFC: ");
        vendedor.establecerRFC(teclado.nextLine());
        System.out.print("Nombre completo: ");
        vendedor.establecerNombre(teclado.nextLine());
        System.out.print("Dirección: ");
        vendedor.establecerDireccion(teclado.nextLine());
        System.out.print("Teléfono: ");
        String telefono = teclado.nextLine();
        vendedor.establecerTelefono(Integer.parseInt(telefono));
        System.out.print("Sección: ");
        vendedor.establecerSeccion(teclado.nextLine());
        System.out.print("Sueldo: ");
        String sueldo = teclado.nextLine();
        vendedor.establecerSueldo(Double.parseDouble(sueldo));
        
        //Obtener la clave del vendedor
        String clave = vendedor.obtenerNombre().substring(0,4) + vendedor.obtenerRFC().charAt(0)+
          vendedor.obtenerRFC().charAt(2)+vendedor.obtenerRFC().substring(4,6);
        clave = clave.toLowerCase();
        
        vendedor.establecerClave(clave);
        
        //Muestra los datos ingresados y pregunta si son correctos
        System.out.println("Haz ingresado el siguiente empleado:\n"+vendedor.toString());
        System.out.println("Los dados son correctos? [S/N]: ");
        String resp = teclado.nextLine();
        if(resp.equalsIgnoreCase("S")){
          agrego = true;
        }
      }
    }catch (TiendaException e){
      System.out.println(e.getMessage());
    }catch (NumberFormatException e){
      System.out.println("Dato Incorrecto");
    } catch (InputMismatchException e){
      System.out.println("Dato Incorrecto");
    }
    
    return vendedor;
  }
  
  /**
   * Método para agregar Vendedores al archivo
   */
  
  public void agregarVendedores(){
    Vendedor vendedor = null;
    Scanner teclado = new Scanner(System.in);
    String opcion = "S";
    
    do{
      System.out.println("Deseas agregar un empleado? [S/N]");
      opcion = teclado.nextLine();
      if(!opcion.equalsIgnoreCase("S")&&!opcion.equalsIgnoreCase("N")){
        System.out.println("Opción incorrecta");
      }else
        if(opcion.equalsIgnoreCase("S")){
        vendedor =  pedirDatos();
        try {
          if (new File(archivo).exists()){
            agregarMasArchivos(vendedor);
          }else    {
            abrirArchivo();
            salida.writeObject(vendedor);
            System.out.println("\nEmpleado agregado exitosamente");
            cerrarArchivo();
          }
        }catch (IOException ex){
          System.out.println("No se pudo escribir en el archivo");
        }
      }
    }while(!opcion.equalsIgnoreCase("N")); 
  }
  
  /**
   * Método que agrega un artículo al archivo, sin escribir un código, para ello
   * Éste método, abre el archivo, añade el objeto al final del archivo y finalmente lo cierra.
   */
  
  public void agregarMasArchivos(Object o){
    try {
      ObjectOutputStreamPropio oos = new ObjectOutputStreamPropio(new FileOutputStream(archivo,true));    
      oos.writeUnshared(o);
      oos.close();
    }catch (Exception e){
      System.out.println("Imposible agregar el articulo al archivo");
    } 
  }
  
  /**
   * Método que cierra el archivo y termina la ejecución
   */
  
  public void cerrarArchivo(){
    try{
      salida.close();
    } catch ( IOException ioe ) {
      System.out.println( "Error al cerrar el archivo." );
    }
  } 
}