package Proyecto; //Paquete donde se encuentra la clase

/**
 * Método para manejar las ventas de
 * la tienda.
 * @author Manuel Soto Romero Ciencias UNAM
 * @version 1.00 Diciembre 2012
 */

public class Ventas{
  
  //Atributos de la clase
  private String clave_emp;
  private String clave_art;
  private int cantidad;
  private double total;
  private String fecha;
  
  /**
   * Constructor por omisión
   */
  
  public Ventas(){
    clave_emp = "";
    clave_art = "";
    cantidad = 0;
    total = 0.0;
    fecha = "";
  }
  
  /**
   * Constructor a partir de cuatro parámetros
   * @param e -- Clave de empleado
   * @param a -- Clave de artículo
   * @param t -- Total a pagar
   * @param f -- Fecha de la venta
   */
  
  public Ventas(String e, String a, int c, double t, String f){
    clave_emp = e;
    clave_art = a;
    cantidad = c;
    total = t;
    fecha = f;
  }
  
  /**
   * Método de acceso
   * Obtiene la clave del empleado
   * @return String -- Clave emplado
   */
  
  public String obtenerClaveEmp(){
    return clave_emp;
  }
  
  /**
   * Método de acceso
   * Obtiene la clave del artículo
   * @return String -- Clave producto
   */
  
  public String obtenerClaveArt(){
    return clave_art;
  }
  
  /**
   * Método de acceso
   * Obtiene la cantidad de productos
   * @return int -- Cantidad
   */
  
  public int obtenerCantidad(){
    return cantidad;
  }
  
  /**
   * Método de acceso
   * Obtiene el total a pagar
   * @return double -- Total
   */
  
  public double obtenerTotal(){
    return total;
  }
  
  /**
   * Método de acceso
   * Obtiene la fecha de venta
   * @return String -- Fecha
   */
  
  public String obtenerFecha(){
    return fecha;
  }
  
  /**
   * Método modificador
   * Establece la clave del empleado
   * @param c -- Empleado
   */
  
  public void establecerClaveEmp(String c){
    clave_emp = c;
  }
  
  /**
   * Método modificador
   * Establece la clave del artículo
   * @param c -- Artículo
   */
  
  public void establecerClaveArt(String a){
    clave_art = a;
  }
  
  /**
   * Método modificador
   * Establecer la cantidad de artículos
   * @param n -- Cantidad
   */
  
  public void establecerCantidad(int n) throws TiendaException{
    if(n>0){
      cantidad = n;
    } else{
      throw new TiendaException("Cantidad insuficiente");
    }
  }
  
  /**
   * Método modificador
   * Establece el total a pagar
   * @param t -- Total
   */
  
  public void establecerTotal(double t) throws TiendaException{
    if(t > 0.0){
      total = t;
    } else{
      throw new TiendaException("El precio debe ser mayor que cero.");
    }
  }
  
  /**
   * Método modificador
   * Establecer la fecha de la venta
   * @param f -- Fecha
   */
  
  public void establecerFecha(String f){
    fecha = f;
  }
  
  /**
   * Método que devuelve las ventas en formato
   * cadena
   * @return String -- Cadena de ventas
   */
  
  public String toString(){
    return "\n"+clave_emp+"\n"+clave_art+"\n"+cantidad+"\n"+total+"\n"+fecha;
  }
}