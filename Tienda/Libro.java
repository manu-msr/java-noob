package Proyecto; //Paquete donde se encuentra la clase

/**
 * Clase Libro que hereda de la clase artículo
 * @author Manuel Soto Romero Ciencias UNAM
 * @version 1.03 Diciembre 2012
 */

public class Libro extends Articulo{
  
  //Atributos de la clase
  protected String autor;
  protected String titulo;
  protected String tema;
  protected String edito;
  protected int anio;
  protected String pais;
  
  /**
   * Constructor por omisión
   * @throws TiendaException -- De la clase padre
   */
  
  public Libro() throws TiendaException{
    super();
    autor = "";
    titulo = "";
    tema = "";
    edito = "";
    anio = 1000;
    pais = "";
  }
  
  /**
   * Contructor a partir de ocho parámetros,
   * dos de la clase padre y seis de la clase hija
   * @param c -- Clave del Artículo
   * @param ex -- Número de existencia
   * @param pr -- Precio del Artículo
   * @param au - Autor del Libro
   * @param ti - Título del libro
   * @param te -- Tema del libro
   * @param ed -- Editorial del libro
   * @param an -- Año de publicación
   * @param pa -- País de publicación
   * @throws TiendaException -- Revisa que el año sea correcto
   */
  
  public Libro (String c, int ex, double pr, String au, String ti, String te, String ed, int an, String pa) throws TiendaException{
    super(c,ex,pr);
    if( an>1000 ){
      autor = au;
      titulo = ti;
      tema = te;
      edito = ed;
      anio = an;
      pais = pa;
    } else{
      throw new TiendaException("Demasiado antiguo... Prueba con un año mayor a 1000.");
    }
  }
  
  /**
   * Método de acceso
   * Obteniene el Autor
   * @return autor -- Autor del libro
   */
  
  public String obtenerAutor(){
    return autor;
  }
  
  /**
   * Método de acceso
   * Obtener Título
   * @return titulo -- Título del libro
   */
  
  public String obtenerTitulo(){ 
    return titulo;
  }
  
  /**
   * Método de acceso
   * Obtener Tema
   * @return tema -- Tema del libro
   */
  
  public String obtenerTema(){
    return tema;
  }
  
  /**
   * Método de acceso
   * Obtener editorial
   * @return editorial -- Editorial del libro
   */
  
  public String obtenerEditorial(){
    return edito;
  }
  
  /**
   * Método de acceso
   * Obtener Año de publicación
   * @return anio -- Año de publicación
   */
  
  public int obtenerAnio(){
    return anio;
  }
  
  /**
   * Método de acceso
   * Obtener país
   * @return pais -- País de publicación
   */
  
  public String obtenerPais(){
    return pais;
  }
  
  /**
   * Método modificador
   * Establecer el autor
   * @param a -- Autor
   */
  
  public void establecerAutor(String a){
    autor = a;
  }
  
  /**
   * Método modificador
   * Establecer el título
   * @param t -- Título
   */
  
  public void establecerTitulo(String t){
    titulo = t;
  }
  
  /**
   * Método modificador
   * Establecer el tema
   * @param t -- Tema
   */
  
  public void establecerTema(String t){
    tema = t;
  }
  
  /**
   * Método modificador
   * Establecer la editorial
   * @param e -- Editorial
   */
  
  public void establecerEditorial(String e){
    edito = e;
  }
  
  /**
   * Método modificador
   * Establecer el año
   * @param a -- Año
   * @throws TiendaException -- Verifica
   * Que el año sea el correcto
   */
  
  public void establecerAnio(int a) throws TiendaException{
    if( a>1000){
      anio = a;
    } else {
      throw new TiendaException("Demasiado antiguo... Prueba con un año mayor a 1000");
    }
  }
  
  /**
   * Método modificador
   * Establecer el pais
   * @param p -- País
   */
  
  public void establecerPais(String p){
    pais = p;
  }
  
  /**
   * Método toString
   * @return String -- Formato cadena del libro
   */
  
  public String toString(){
    return "\nAutor: "+autor+"\nTítulo: "+titulo+"\nTema: "+tema+"\nEditorial: "+edito+"\nAño: "+anio+"\nPaís: "+pais+super.toString();
  }
}