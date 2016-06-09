package Proyecto; //Paquete donde se encuentra la clase

import java.io.*; //Paquete .io para manejar serialización

/**
 * Clase para manejar artículos de una tienda
 * @author Manuel Soto Romero Ciencias UNAM
 * @version 1.04 Diciembre 2012 2012
 */

public class Articulo implements Serializable{
  
  //Atributos de la clase
  private String clave;
  private int exist;
  private double precio;
  
  /**
   * Constructor por omisión
   * @throws TiendaException
   */
  
  public Articulo() throws TiendaException{
    clave = "";
    exist = 0;
    precio = 0.0;
  }
  
  /**
   * Contructor a partir de tres parámetros
   * @param c -- Clave única del artículo
   * @param e -- Número de artículos en existencia
   * @param p -- Precio del artículo
   * @throws TiendaException -- Excepción en caso de que 
   * algún parámetro sea incorrecto
   */
  
  public Articulo(String c, int e, double p) throws TiendaException{
    if( e>=0  && p>0){
      clave = c;
      exist = e;
      precio = p;
    } else {
      throw new TiendaException("Número de existencia o precio incorrecto.");
    }
  }
  
  /**
   * Método de acceso
   * Obtiene la clave
   * @return String -- Clave
   */
  
  public String obtenerClave(){
    return clave;
  }
  
  /**
   * Método de acceso
   * Obtiene el número de existencia
   * @return int -- Número de existencia
   */
  
  public int obtenerExistencia(){
    return exist;
  }
  
  /**
   * Método de acceso
   * Obtiene el precio
   * @return double -- Precio
   */
  
  public double obtenerPrecio(){
    return precio;
  }
  
  /**
   * Método modificador a partir de un parámetro
   * Establecer Clave única
   * @param c -- Clave única del artículo
   */
  
  public void establecerClave(String c){
    clave = c;
  }
  
  /**
   * Método modificador a partir de un parámetro
   * Establcer la Existencia
   * @param e -- Numero de existencia proporcionado
   * @throws TiendaException -- Verifica que el número de existencia
   * no sea negativo y sea mayor que cero
   */
  
  public void establecerExistencia(int e) throws TiendaException{
    if( e>0 ){
      exist = e;
    } else{
      throw new TiendaException("Error. El número de artículos debe ser mayor que cero.");
    }
  }
  
  /**
   * Método modificador a partir de un parámetro
   * Establecer el precio
   * @param p -- Precio porporcionado
   * @throws TiendaException -- Verifica que el precio sea mayor que 
   * cero
   */
  
  public void establecerPrecio(double p) throws TiendaException{
    if( p>0 ){
      precio = p;
    } else{
      throw new TiendaException("Error. El precio debe ser mayor que cero.");
    }
  }
  
  /**
   * Método toString
   * Imprime el artículo.
   * @return String -- Artículo en formato cadena
   */
  
  public String toString(){
    return "\nClave: "+clave+"\nArtículos en existencia: "+exist+"\nPrecio: $"+precio;
  }
}