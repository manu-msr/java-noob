package Proyecto; //Paquete donde se encuentra la clase

/**
 * Clase Juegos
 * Hereda de disco y esta a su vez hereda de Artículo
 * @author Manuel Soto Romero Ciencias UNAM
 * @version 1.02 Diciembre 2012
 */

public class Juego extends Disco{
  
  //Atributos
  protected String tipo;
  protected String consola;
  
  /**
   * Constructor por omisión
   * @throws Tienda Exception -- De la clase padre
   */
  
  public Juego() throws TiendaException{
    super();
    tipo = "";
    consola = "";
  }
  
  /**
   * Constructor a partir de seis parámetros.
   * Tres de la clase padre y tres de la clase hija.
   * @param c -- Clave.
   * @param e -- Número de Existencia.
   * @param p -- Precio.
   * @param n -- Nombre.
   * @param t -- Tipo.
   * @param j -- Consola.
   * @param TiendaException -- Exception de la clase padre.
   */
  
  public Juego(String c, int e, double p, String n, String t, String j) throws TiendaException{
    super(c,e,p,n);
    tipo = t;
    consola = j;
  }
  
  /**
   * Método de acceso
   * Obtiene el tipo de juego
   * @return String -- Tipo de juego
   */
  
  public String obtenerTipo(){
    return tipo;
  }
  
  /**
   * Método de acceso
   * Obtiene la consola
   * @return String -- Consola
   */
  
  public String obtenerConsola(){
    return consola;
  }
  
  /**
   * Método modificador a partir de un parámetro
   * Establece el tipo de juego
   * @param t -- Tipo de juego
   */
  
  public void establecerTipo(String t){
    tipo = t;
  }
  
  /**
   * Método modificador a partir de un parámetro
   * Establece la consola
   * @param c -- Consola
   */
  
  public void establecerConsola(String c){
    consola = c;
  }
  
  /**
   * Método toString
   * Imprime el videojuego
   * @return String -- Juego
   */
  
  public String toString(){
    return super.toString()+"\nTipo: "+tipo+"\nConsola: "+consola;
  }
}