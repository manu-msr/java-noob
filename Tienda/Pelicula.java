package Proyecto; //Paquete donde se encuentra el proyecto

/**
 * Clase Pelicula.
 * Hereda de Disco que a su vez hereda de Articulo
 * @author Manuel Soto Romero Ciencias UNAM
 * @version 1.04 Diciembre 2012
 */

public class Pelicula extends Disco{
  
  //Atributos
  protected String formato;
  protected String genero;
  protected int anio;
  
  /**
   * Constructor por omisión
   * @throws TiendaException -- De la clase padre
   */
  
  public Pelicula() throws TiendaException{
    super();
    formato = "";
    genero = "";
    anio = 1000;
  }
  
  /**
   * Constructor a partir de siete parámetros
   * Cuatro de la clase padre y tres de la clase hija
   * @param c -- Clave única
   * @param e -- Número de existencia
   * @param p -- Precio
   * @param n -- Nombre
   * @param f -- Formato (DVD, Blu-Ray)
   * @param g -- Genero
   * @param a -- Año de salida
   * @throws TiendaException -- Verifica que el Formato
   * y año de salida se al correcto
   */
  
  public Pelicula(String c, int e, double p, String n, String f, String g, int a) throws TiendaException{
    super(c,e,p,n);
    if((f.equalsIgnoreCase("DVD") || f.equalsIgnoreCase("BLU-RAY")) && a>1000){
      formato = f;
      genero = g;
      anio = a;
    } else {
      throw new TiendaException("El formato debe ser DVD o BLUE-RAY y el año mayor a 1000.");
    }
  }
  
  /**
   * Método de acceso
   * Obtiene el formato
   * @return String -- Formato
   */
  
  public String obtenerFormato(){
    return formato;
  }
  
  /**
   * Método de acceso
   * Obtiene el género
   * @return String -- Género
   */
  
  public String obtenerGenero(){
    return genero;
  }
  
  /**
   * Método de acceso
   * Obtiene el año de salida
   * @return int -- Año de salida
   */
  
  public int obtenerAnio(){
    return anio;
  }
  
  /**
   * Método modificador a partir de un parámetro
   * Establece el Formato
   * @param f -- Formato
   * @throws TiendaException -- Revisa que el formato
   * sea el correcto
   */
  
  public void establecerFormato(String f) throws TiendaException{
    if(f.equalsIgnoreCase("DVD") || f.equalsIgnoreCase("BLU-RAY")) formato = f;
    else throw new TiendaException("El formato debe ser DVD o BLUE-RAY. Intenta de nuevo");
  }
  
  /**
   * Método modificador a partir de un parámetro
   * Establece el género
   * @param g -- Género
   */
  
  public void establecerGenero(String g){
    genero = g;
  }
  
  /**
   * Método modificador a partir de un parámetro
   * Establece el año
   * @param a -- Anio
   * @throws Tienda Exception -- Verifica que el
   * año sea correcto
   */
  
  public void establecerAnio(int a) throws TiendaException{
    if(a>1000) anio = a;
    else new TiendaException("Demasidado antiguo... Prueba con un año mayor que 1000.");
  }
  
  /**
   * Método toString
   * Imprime la Película
   * @return String -- Película
   */
  
  public String toString(){
    return super.toString()+"\nFormato: "+formato+"\nGénero: "+genero+"\nAño de salida: "+anio;
  }
}