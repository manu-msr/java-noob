package Proyecto; //Paquete donde se encuentra  la clase

/**
 * Clase disco que hereda de Artículo
 * @author Manuel Soto Romero Ciencias UNAM
 * @version 1.03 Diciembre 2012
 */

public class Disco extends Articulo{
  
  //Atributos de la clase
  protected String nombre;
  
  /**
   * Constructor por omisión
   * @throws TiendaException -- De la clase padre
   */
  
  public Disco() throws TiendaException{
    super();
    nombre = "";
  }
  
  /**
   * Constructor a partir de cuatro parámetros
   * tres de la clase padre y uno de la clase hija
   * @param c -- Clase
   * @patam e -- Existencias
   * @param n -- Nombre del disco
   * @trhows TiendaException -- De la clase padre
   */
  
  public Disco(String c, int e, double p, String n) throws TiendaException{
    super(c,e,p);
    nombre = n;
  }
  
  /**
   * Método de acceso para obtener el nombre
   * @return nombre
   */
  
  public String obtenerNombre(){ 
    return nombre;
  }
  
  /**
   * Método modificador para establecer el nombre
   * @param n -- Nombre
   */
  
  public void establecerNombre(String n){
    nombre = n;
  }
  
  /**
   * Método toString
   * @return String -- Disco en formato cadena
   */
  
  public String toString(){
    return "\nNombre: "+nombre+super.toString();
  }
}