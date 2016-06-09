package Proyecto; //Paquete donde se encuentra el método

//Paquetes para utilizar serialización
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Clase para leer los Artículos de un archivo
 * @author Manuel Soto Romero
 * @version 1.02 Diciembre 2012
 */

public class LeerArticuloSecuencial{
  
  //Atributos de la clase
  private ObjectInputStream entrada;
  private String nombre;
  
  /**
   * Constructor a partir de un parámetro
   * @param archivo -- Nombre del archivo
   */
  
  public LeerArticuloSecuencial(String archivo){
    nombre = archivo;
  }
  
  /**
   * Método para abrir el archivo
   */
  
  public void abrirArchivo(){
    try{
      entrada = new ObjectInputStream(new FileInputStream(nombre));
    } catch (IOException ioe){
      System.out.println("Error al abrir el archivo.");
    } 
  }
  
  /**
   * Método para leer los artículos
   */
  
  public void leerArticulos(){
    Articulo articulo;
    try {
      while (true){
        articulo = (Articulo) entrada.readObject();
        System.out.println(articulo.toString());
      }
    }catch (EOFException eofe){
      return;
    }catch (ClassNotFoundException cnfe){
      System.out.println("No se pudo crear el objeto.");
    } catch (IOException ioException){
      System.out.println("Error al leer del archivo.");
      System.out.println("La causa " +  ioException.toString() );
    }
  } 
  
  /**
   * Método qué muestra los artículos
   * por medio de la clave del producto
   * @param c -- Clave dada por el usuario
   */
  
  public void buscarPorClave(String c){
    Articulo articulo;
    try {
      while (true){
        Object objeto =  entrada.readObject();
        if(objeto instanceof Articulo){
          articulo = (Articulo)objeto;
          if(articulo.obtenerClave().equalsIgnoreCase(c)){
            System.out.println(articulo.toString());
          }
        }else{
          System.out.println("No es un artículo");
        }
      }
    }catch (EOFException eofe){
      return;
    }catch (ClassNotFoundException cnfe){
      System.out.println("No se pudo crear el objeto.");
    } catch (IOException ioException){
      System.out.println("Error al leer del archivo.");
      System.out.println("La causa " +  ioException.toString());
    } 
  }
  
  /**
   * Método qué muestra los artículos
   * por medio del tipo del articulo
   * @param t -- Nombre o tipo dado por el usuario
   */
  
  public void buscarPorTipo(String t){
    if(t.equalsIgnoreCase("Libro")){
      Libro articulo;
      try {
        while (true){
          Object objeto =  entrada.readObject();
          if(objeto instanceof Libro){
            articulo = (Libro)objeto;
            System.out.println(articulo.toString());
          }
        }
      }catch (EOFException eofe){
        return;
      }catch (ClassNotFoundException cnfe){
        System.out.println("No se pudo crear el objeto.");
      } catch (IOException ioException){
        System.out.println("Error al leer del archivo.");
        System.out.println("La causa " +  ioException.toString());
      } 
    }
    
    if(t.equalsIgnoreCase("Disco")){
      Disco articulo;
      try {
        while (true){
          Object objeto =  entrada.readObject();
          if(objeto instanceof Disco){
            articulo = (Disco)objeto;
            System.out.println(articulo.toString());
          }
        }
      }catch (EOFException eofe){
        return;
      }catch (ClassNotFoundException cnfe){
        System.out.println("No se pudo crear el objeto.");
      } catch (IOException ioException){
        System.out.println("Error al leer del archivo.");
        System.out.println("La causa " +  ioException.toString());
      }  
    }
  }
  
  
  /**
   * Método qué muestra los artículos
   * por medio del nombre del Artículo
   * @param n -- Nombre dado por el usuario
   */
  
  public void buscarPorNombre(String n){
    
    try {
      while (true){
        Object objeto =  entrada.readObject();
        if(objeto instanceof Libro){
          Libro articulo;
          articulo = (Libro)objeto;
          if(articulo.obtenerTitulo().equalsIgnoreCase(n)){
            System.out.println(articulo.toString());
          }
        }
        if(objeto instanceof Disco){
          Disco articulo;
          articulo = (Disco)objeto;
          if(articulo.obtenerNombre().equalsIgnoreCase(n)){
            System.out.println(articulo.toString());
          }
        }
      }
    }catch (EOFException eofe){
      return;
    }catch (ClassNotFoundException cnfe){
      System.out.println("No se pudo crear el objeto.");
    } catch (IOException ioException){
      System.out.println("Error al leer del archivo.");
      System.out.println("La causa " +  ioException.toString());
    } 
  }
  
  /**
   * Método para obtener el precio de un artículo
   * con el fin de obtener el total el una venta
   * @param c -- Clave del artículo
   * @return double -- Precio
   */
  
  public double obtenerPrecio(String c){
    Articulo articulo;
    double precio = 0.0;
    try {
      while (true){
        Object objeto =  entrada.readObject();
        if(objeto instanceof Articulo){
          articulo = (Articulo)objeto;
          if(articulo.obtenerClave().equalsIgnoreCase(c)){
            precio = articulo.obtenerPrecio();
          }
        }else{
          System.out.println("No es un artículo");
        }
      }
    }catch (EOFException eofe){
    }catch (ClassNotFoundException cnfe){
      System.out.println("No se pudo crear el objeto.");
    } catch (IOException ioException){
      System.out.println("Error al leer del archivo.");
      System.out.println("La causa " +  ioException.toString());
    } 
    return precio;
  }
  
  /**
   * Método para obtener el número de existencias de un artículo
   * con el fin de saber si se puede realizar una venta
   * @param c -- Clave del artículo
   * @return int -- Existencias
   */
  
  public int obtenerExistencias(String c){
    Articulo articulo;
    int exist = 0;
    try {
      while (true){
        Object objeto =  entrada.readObject();
        if(objeto instanceof Articulo){
          articulo = (Articulo)objeto;
          if(articulo.obtenerClave().equalsIgnoreCase(c)){
            exist = articulo.obtenerExistencia();
          }
        }else{
          System.out.println("No es un artículo");
        }
      }
    }catch (EOFException eofe){
    }catch (ClassNotFoundException cnfe){
      System.out.println("No se pudo crear el objeto.");
    } catch (IOException ioException){
      System.out.println("Error al leer del archivo.");
      System.out.println("La causa " +  ioException.toString());
    } 
    return exist;
  }
  
  /**
   * Método que muestra un artículo en caso
   * de que no haya existencias en el almacén por
   * medio de la clave
   * @param c -- Clave del artíuclo
   */
  
  public void revisarAlmacen(String c){
    Articulo articulo;
    int exist = 0;
    try {
      while (true){
        Object objeto =  entrada.readObject();
        if(objeto instanceof Articulo){
          articulo = (Articulo)objeto;
          if(articulo.obtenerClave().equalsIgnoreCase(c)){
            if(articulo.obtenerExistencia() == 0){
              System.out.println(articulo.toString());
            }
          }
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
   * Método de acceso
   * @return ObjectInputStream -- Entrada
   */
  
  public ObjectInputStream obtenerEntrada(){
    return entrada;
  }
  
  /**
   * Método para cerrar el archivo
   */
  
  public void cerrarArchivo(){
    try{
      entrada.close();
    } catch (IOException ioException){
      System.out.println("Error al cerrar el archivo.");
    }
  } 
}