package Proyecto; //Paquete donde se encuentra la clase

/**
 * Clase para guardar las ventas en un 
 * Archivo de Texto
 * @author Manuel Soto Romero
 * @version 1.01 Diciembre 2012
 */
  
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GuardarVentas{
  
  //Atributos y objetos de la clase
  private FileWriter fichero;
  private PrintWriter pw;
  private String archivo;
  
  /**
   * Constructor a partir de un parámetro
   * @param n -- Nombre del Archivo
   */
  
   public GuardarVentas(String n){
       archivo = n;
   }
   
   /**
    * Método para abrir el archivo
    */
   
   public void abrirArchivo(){
     try{
       fichero = new FileWriter(archivo,true);
       pw = new PrintWriter(fichero);
     }catch (IOException e){
       System.out.println("El archivo no se pudo abrir");
       System.out.println("La causa es: "+ e.getMessage());
     }
   } 
   
   /**
    * Método para obtener los datos de la venta
    */
   
   private Ventas pedirDatos(){
     Ventas ventas = new Ventas();
     ArticuloArchivoSecuencial art = new ArticuloArchivoSecuencial("Articulos.ser");
     LeerArticuloSecuencial lec = new LeerArticuloSecuencial("Articulos.ser");
     
     boolean correctos = false; //Para saber si los datos son correctos
     
     while(correctos == false){
       Scanner teclado = new Scanner(System.in);
       try{
         System.out.print("Clave de empleado: ");
         ventas.establecerClaveEmp(teclado.nextLine());
         System.out.print("Clave de Producto: ");
         ventas.establecerClaveArt(teclado.nextLine());
         System.out.println("Número de artículos: ");
         String numero = teclado.nextLine();
         ventas.establecerCantidad(Integer.parseInt(numero));
         System.out.println("Escriba la fecha (dd-mm-aa): ");
         ventas.establecerFecha(teclado.nextLine());
         
         String clave = ventas.obtenerClaveArt();
         //Obtener el total de las ventas
         ventas.obtenerClaveArt();
         lec.abrirArchivo();
         double precio = lec.obtenerPrecio(clave);
         lec.cerrarArchivo();
         double total = precio * ventas.obtenerCantidad();
         ventas.establecerTotal(total);
         
         //Obtener número de existencias del artículo
         lec.abrirArchivo();
         int exis = lec.obtenerExistencias(clave);
         lec.cerrarArchivo();
         
         if(exis == 0){
           System.out.println("No hay artículos suficientes, ingrese otro artículo");
         } else{
           //Sale del ciclo y descuenta los archivos del almacen
           correctos = true;
           String descontar = ventas.obtenerClaveArt();
           for(int i=0; i<ventas.obtenerCantidad(); i++){
             art.modificarArticulo(descontar);
           }
         }
         
         //Muestra la venta
         System.out.println("Su venta es: "+ventas.obtenerClaveEmp()+"/"+ventas.obtenerClaveArt()+"/"+ventas.obtenerCantidad()+"/"
                               +ventas.obtenerTotal()+"/"+ventas.obtenerFecha());
         
       }catch(TiendaException e){
         System.out.println(e.getMessage());
       }catch(NumberFormatException e){
         System.out.println("Venta no agregada");
       }catch(InputMismatchException e){
         System.out.println("Venta no agregada");
       }
     }
     return ventas;
   }
   
   /**
    * Método para agregar las ventas al archivo
    */
   
   public void agregarVentas(){
     Ventas ventas = null;
     Scanner teclado = new Scanner(System.in);
     String opcion = "S";
     do{
       System.out.println("Deseas agregar una venta? [S/N]");
       opcion = teclado.nextLine();
       if(!opcion.equalsIgnoreCase("S")&&!opcion.equalsIgnoreCase("N")){
         System.out.println("Opción incorrecta");
       }else
         if(opcion.equalsIgnoreCase("S")){
         ventas =  pedirDatos(); //Obtiene las ventas del método pedirDatos()
         pw.println(ventas.toString());
         System.out.println("Venta agregada exitosamente");
       }
     }while(!opcion.equalsIgnoreCase("N"));
   }
   
   /**
    * Método para cerrar el archivo
    */
   
   public void cerrarArchivo(){
     try{
       fichero.close();
     }catch(IOException e){
       System.out.println("No se pudo cerrar el archivo");
       System.out.println("La razón es : " + e.getMessage());
     }
   } 
}