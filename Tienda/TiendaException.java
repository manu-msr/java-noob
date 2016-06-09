package Proyecto;

/**
 * Método para genera excepciones dentro
 * de la aplicación y esta hera de la clase Exception
 * @author Manuel Soto Romero Ciencias UNAM
 * @version 1.00 Noviembre 2012
 */

public class TiendaException extends Exception{
  
  /**
   * Constructor a partir de un parámetro
   * @param e
   */
  
  public TiendaException(String e){
    super(e);
  }
}