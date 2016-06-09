package Proyecto; //Paquete donde se encuentra la clase

//Paquetes para manejar excepciones y herramientas de serialización
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase para crear un Archivo Secuencias de Artículos
 * @author Manuel Soto Romero Ciencias UNAM
 * @version 1.02 Diciembre 2012
 */

public class ArticuloArchivoSecuencial{
  
  //Atributos y Objetos de la Clase
  private ObjectOutputStream salida;
  private String archivo;
  
  /**
   * Constructor a partir del nombre del archivo
   * @param n -- Nombre del Archivo
   */
  
  public ArticuloArchivoSecuencial(String n){
    archivo = n;
  }
  
  /**
   * Método para abrir el archivo
   */
  
  public void abrirArchivo(){
    try{
      salida = new ObjectOutputStream(new FileOutputStream(archivo, true)); //Abre el archivo y no lo sobreeescribe
    } catch (IOException io){
      System.out.println("Error al abrir el archivo");
    }
  }
  
  /**
   * Método que obtiene los datos del Artículo
   * @throws TiendaException -- En caso de que ingrese o 
   * introduzca un dato incorrecto.
   */
  
  public Object pedirDatos(){
    Object objeto = null; //Objeto que devolverá el método
    Scanner teclado = new Scanner(System.in);
    
    int opcion = 0; //Variable que controlará el menú
    
    System.out.println("Para agregar el artículo selecciona una opción: "
                         +"\n[1]Libro:"
                         +"\n[2]Disco:"
                         +"\nOpción:");
    String op = teclado.nextLine();
    
    opcion = Integer.parseInt(op);
    
    switch(opcion){
      //Caso 1: Libro
      case 1:
        try{
        boolean creo = false;
        
        //Pedir los datos al usuario
        //Utiliza en todos los casos el método nextLine()
        //para evitar errores en la ejecución, al finalizar 
        //hace un cambio con el método parse
        
        while(creo == false){
          Libro libro = new Libro();
          System.out.println("\nProporcione los datos del libro: ");
          System.out.print("Número de existencia del producto: ");
          String n = teclado.nextLine();
          libro.establecerExistencia(Integer.parseInt(n));
          System.out.print("Precio: ");
          String p = teclado.nextLine();
          libro.establecerPrecio(Double.parseDouble(p));
          System.out.print("Autor: ");
          libro.establecerAutor(teclado.nextLine());
          System.out.print("Título: ");
          libro.establecerTitulo(teclado.nextLine());
          System.out.print("Tema: ");
          libro.establecerTema(teclado.nextLine());
          System.out.print("Editorial: ");
          libro.establecerEditorial(teclado.nextLine());
          System.out.print("Año de Publicación: ");
          String a = teclado.nextLine();
          libro.establecerAnio(Integer.parseInt(a));
          System.out.print("País de Publicación: ");
          libro.establecerPais(teclado.nextLine());
          
          //Crear la clave del producto
          String nombre= libro.obtenerTitulo().replace(" ", "").replace(",","").replace(":", "");
          String clave = ("libro"+nombre).toLowerCase();
          libro.establecerClave(clave);
          
          //Muestra el libro ingresado y pregunta si los datos son correctos
          System.out.println("Haz ingresado el siguiente libro: \n"+libro.toString());
          System.out.println("Los datos son correctos?: [S/N]: ");
          String resp = teclado.nextLine();
          if(resp.equalsIgnoreCase("S")){
            creo = true;
            objeto = libro;
          }
        }
      } catch (TiendaException e){
        System.out.println(e.getMessage());
      } catch (NumberFormatException e){
        System.out.println("Dato Incorrecto");
      } catch (InputMismatchException e){
        System.out.println("Dato Incorrecto");
      }
      break;
      
      case 2:
        //Caso 2: Disco. Tiene menú para seleccionar el tipo de disco.
        System.out.println("\nSelecciona el tipo de disco:\n"
                             +"\n[1]Música"
                             +"\n[2]Película"
                             +"\n[3]Video Juego");
        String t = teclado.nextLine();
        int tipo = Integer.parseInt(t);
        
        switch(tipo){
          //Caso 1: Música.
          case 1:
            try{
            boolean creo = false;
            
            while(creo == false){
              Musica musica = new Musica();
              System.out.println("\nProporcione los datos del dico: ");
              System.out.print("Número de existencia del producto: ");
              String n = teclado.nextLine();
              musica.establecerExistencia(Integer.parseInt(n));
              System.out.print("Precio: ");
              String p = teclado.nextLine();
              musica.establecerPrecio(Double.parseDouble(p));
              System.out.print("Nombre: ");
              musica.establecerNombre(teclado.nextLine());
              System.out.print("Genero: ");
              musica.establecerGenero(teclado.nextLine());
              System.out.print("Intérprete ");
              musica.establecerInterprete(teclado.nextLine());
              System.out.print("Número de pistas: ");
              String np = teclado.nextLine();
              musica.establecerPistas(Integer.parseInt(np));
              System.out.print("Año de lanzamiento: ");
              String a = teclado.nextLine();
              musica.establecerAnio(Integer.parseInt(a));
              
              //Genera la clave del objeto
              String nombre= musica.obtenerNombre().replace(" ", "").replace(",","").replace(":", "");
              String clave = ("disco"+nombre+musica.obtenerAnio()).toLowerCase();
              musica.establecerClave(clave);
              
              //Muestra el disco ingresado y pregunta si los datos son corectos
              System.out.println("Haz ingresado el siguiente disco:\n"+musica.toString());
              System.out.println("Los datos son correctos?: [S/N]: ");
              String resp = teclado.nextLine();
              if(resp.equalsIgnoreCase("S")){
                creo = true;
                objeto = musica;
              }
            }
          }catch (TiendaException e){
            System.out.println(e.getMessage());
          } catch (NumberFormatException e){
            System.out.println("Dato Incorrecto");
          } catch (InputMismatchException e){
            System.out.println("Dato Incorrecto");
          }
          break;
          
          case 2:
            //Caso 2: Película
            try{
            boolean creo = false;
            
            while(creo == false){
              Pelicula pelicula = new Pelicula();
              System.out.println("\nProporcione los datos del dico: ");
              System.out.print("Número de existencia del producto: ");
              String n = teclado.nextLine();
              pelicula.establecerExistencia(Integer.parseInt(n));
              System.out.print("Precio: ");
              String p = teclado.nextLine();
              pelicula.establecerPrecio(Double.parseDouble(p));
              System.out.print("Nombre: ");
              pelicula.establecerNombre(teclado.nextLine());
              System.out.print("Formato: ");
              pelicula.establecerFormato(teclado.nextLine());
              System.out.print("Género: ");
              pelicula.establecerGenero(teclado.nextLine());
              System.out.print("Año de salida: ");
              String a = teclado.nextLine();
              pelicula.establecerAnio(Integer.parseInt(a));
              
              //Genera la clave del disco
              String nombre= pelicula.obtenerNombre().replace(" ", "").replace(",","").replace(":", "");
              String clave = ("disco"+nombre+pelicula.obtenerAnio()).toLowerCase();
              pelicula.establecerClave(clave);
              
              //Muestra los datos y pregunta si son correctos
              System.out.println("Haz ingresado la siguiente pelicula:\n"+pelicula.toString());
              System.out.println("Los datos son correctos?: [S/N]: ");
              String resp = teclado.nextLine();
              if(resp.equalsIgnoreCase("S")){
                creo = true;
                objeto = pelicula;
              }
            }
          }catch (TiendaException e){
            System.out.println(e.getMessage());
          } catch (NumberFormatException e){
            System.out.println("Dato Incorrecto");
          } catch (InputMismatchException e){
            System.out.println("Dato Incorrecto");
          }
          break;
          
          case 3:
            //Caso 3: VideoJuego
            try{
            boolean creo = false;
            
            while(creo == false){
              Juego juego = new Juego();
              System.out.println("\nProporcione los datos del dico: ");
              System.out.print("Número de existencia del producto: ");
              String n = teclado.nextLine();
              juego.establecerExistencia(Integer.parseInt(n));
              System.out.print("Precio: ");
              String p = teclado.nextLine();
              juego.establecerPrecio(Double.parseDouble(p));
              System.out.print("Nombre: ");
              juego.establecerNombre(teclado.nextLine());
              System.out.print("Tipo: ");
              juego.establecerTipo(teclado.nextLine());
              System.out.print("Consola: ");
              juego.establecerConsola(teclado.nextLine());
              
              //Muestra los datos y pregunta si son correctos
              String nombre= juego.obtenerNombre().replace(" ", "").replace(",","").replace(":", "");
              String clave = ("disco"+nombre+juego.obtenerConsola().replace(" ", "")).toLowerCase();
              juego.establecerClave(clave);
              System.out.println("Haz ingresado el siguiente juego:\n"+juego.toString());
              System.out.println("Los datos son correctos?: [S/N]: ");
              String resp = teclado.nextLine();
              if(resp.equalsIgnoreCase("S")){
                creo = true;
                objeto = juego;
              }
            }
          }catch (TiendaException e){
            System.out.println(e.getMessage());
          } catch (NumberFormatException e){
            System.out.println("Dato Incorrecto");
          } catch (InputMismatchException e){
            System.out.println("Dato Incorrecto");
          }
          break;
          
          default:
            //Si el ususario introduce una opción no valida en el menú
            System.out.println("Opción incorrecta");
            break;
        }
        break;
        
      case 3:
        //Caso 3. Salir del menú.
        opcion = 3;
        break;
        
      default:
        //Si el usuario introduce una opción no válida en el menú.
        System.out.println("Opción incorrecta");
        break;
    }
    return objeto;
  }
  
  /**
   * Método para agregar Artículos al archivo
   */
  
  public void agregarArticulos(){
    Object objeto = null;
    Scanner teclado = new Scanner(System.in);
    String opcion = "S";
    
    do{
      System.out.println("Deseas agregar un articulo? [S/N]");
      opcion = teclado.nextLine();
      if(!opcion.equalsIgnoreCase("S")&&!opcion.equalsIgnoreCase("N")){
        System.out.println("Opción incorrecta");
      }else
        if(opcion.equalsIgnoreCase("S")){
        objeto =  pedirDatos(); //Obtiene el objeto del metodo pedirDatos()
        try {
          if (new File(archivo).exists()){
            agregarMasArchivos(objeto);
          }else    {
            abrirArchivo();
            salida.writeObject(objeto);
            System.out.println("\nArtículo agregado exitosamente");
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
   * Método para agregar artículos a partir de
   * un arreglo, con el fin de modificar las existencias
   * y determinar que artículos faltan en el almacen
   * @param o -- Objeto a guardar
   */
  
  public void agregarArts(Object o){  
    try{
      if (new File(archivo).exists()){
        agregarMasArchivos(o);
      }else{
        abrirArchivo();
        salida.writeObject(o);
        cerrarArchivo();
      }
    }catch (IOException ex){
      System.out.println("No se pudo escribir en el archivo");
    }
  }
  
  /**
   * Método para modificiar el número de existencias de un artículo
   * a partir de la clave de este
   * @param -- Clave del artículo
   */
  
  public void modificarArticulo(String c){
    Articulo articulos[] =  new Articulo[50]; //Arreglo para guardar los artículos a modificar
    int numArt = 0;
    
    //Leer los artículos del archivo hasta el momento
    LeerArticuloSecuencial lector = new LeerArticuloSecuencial("Articulos.ser");
    lector.abrirArchivo();
    boolean encontrado =  false;
    
    Articulo articulo;
    
    try {
      while (true){
        Object objeto = lector.obtenerEntrada().readObject();
        if (objeto instanceof Articulo){
          articulo = (Articulo) objeto;
          if (c.equalsIgnoreCase(articulo.obtenerClave())){
            encontrado =  true;
            articulo.establecerExistencia((articulo.obtenerExistencia()-1));
          }
        }
        articulos[numArt++] =(Articulo)objeto;
      }
    }catch (TiendaException e){
      System.out.println(e.getMessage());
    }catch ( EOFException eofe ){
      lector.cerrarArchivo();
      File file =  new File("Articulos.ser");
      file.delete(); //Eliminamos el archivo anterior
      if (encontrado){
        //Agregar el arreglo con los artículos modificados
        for (int i = 0; i < numArt; i++){
          if(articulos[i]!= null){
            agregarArts(articulos[i]);
          }
        }
      }
      return;
    }catch (ClassNotFoundException cnfe){
      System.out.println("No se pudo crear el objeto.");
    } catch (IOException ioException){
      System.out.println("Error al leer del archivo.");
      System.out.println("La causa " +  ioException.toString());
    }
  }
  
  /**
   * Método que cierra el archivo y termina la ejecución
   */
  
  public void cerrarArchivo(){
    try{
      salida.close();
    } catch (IOException ioe) {
      System.out.println("Error al cerrar el archivo.");
    }
  } 
}