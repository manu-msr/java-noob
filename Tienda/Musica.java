package Proyecto; //Paquete donde se encuentra la clase

/**
 * Clase Musica que hereda de Disco
 * @author Manuel Soto Romero Ciencias UNAM
 * @version 1.02 Noviembee 2012
 */

public class Musica extends Disco{
  
  //Atributos de la clase
  protected String interprete;
  protected String genero;
  protected int pistas;
  protected int anio;
  
  /**
   * Constructor por omisión
   * @throws TiendaException -- De la clase padre
   */
  
  public Musica() throws TiendaException{
    super();
    interprete = "";
    genero = "";
    pistas = 1;
    anio = 1000;
  }
  
  /**
   * Constructor a partir de ocho parámetros
   * cuatro de la clase padre y cuatro de la clase hija
   * @param c -- Clave única.
   * @param e -- Número de Existencia
   * @param m -- Precio.
   * @param n -- Nombre
   * @param g -- Género
   * @param i -- Intérprete
   * @param p -- Número de pistas.
   * @param a -- Año de lanzamiento.
   * @throws TiendaException -- Verifica el número de pistas y año.
   */
  
  public Musica(String c, int e, double m, String n,String i, String g, int p, int a) throws TiendaException{
    super(c,e,m,n);
    if(p>0 && a>1000){
      interprete = i;
      genero = g;
      pistas = p;
      anio = a;
    } else {
      throw new TiendaException("Número de pistas o año incorrecto.");
    }
  }
  
  /**
   * Método de acceso
   * Obtiene el Intérprete
   * @return interprete -- Intérprete
   */
  
  public String obtenerInterprete(){
    return interprete;
  }
  
  /**
   * Método de acceso
   * Obtiene el Género Musical
   * @return genero -- Género Musical
   */
  
  public String obtenerGenero(){
    return genero;
  }
  
  /**
   * Método de acceso
   * Obtiene el número de pistas
   * @return pistas -- Número de pistas
   */
  
  public int obtenerPistas(){
    return pistas;
  }
  
  /**
   * Método de acceso
   * Obtiene el año de lanzamiento
   * @return anio -- Año de lanzamiento
   */
  
  public int obtenerAnio(){
    return anio;
  }
  
  /**
   * Método modificador
   * Establece el Intérprete a partir de un parámetro
   * @param i -- Intérprete
   */
  
  public void establecerInterprete(String i){
    interprete = i;
  }
  
  /**
   * Método modificador
   * Establece el Género Música a partir de un parámetro
   * @param g -- Género Musical
   */
  
  public void establecerGenero(String g){
    genero = g;
  }
  
  /**
   * Método modificador
   * Establece el número de pistas a partir de un parámetro
   * @param p -- Número de pistas
   * @throws TiendaException -- Verifica que el número de pistas
   * sea mayor que cero
   */
  
  public void establecerPistas(int p) throws TiendaException{
    if(p>0) pistas = p;
    else throw new TiendaException ("¿Número de pistas: 0?...");
  }
  
  /**
   * Método modificador
   * Establece eñ año de lanzamiento.
   * @param a -- Año de lanzamiento.
   * @throws TiendaException -- Verifica que
   * el año sea correcto.
   */
  
  public void establecerAnio(int a) throws TiendaException{
    if(a>1000) anio = a;
    else throw new TiendaException ("Demasiado antiguo... Prueba con un año mayor a 1000.");
  }
  
  /**
   * Método toString
   * Regresa el formato cadena del disco
   * @return String -- Musica
   */
  
  public String toString(){
    return super.toString()+"\nIntérprete: "+interprete+"\nGénero Musical: "+genero+"\nNúmero pistas: "+pistas+"\nAño lanzamiento: "+anio;
  }
}