package Proyecto; //Paquete donde se encuentra la clase

//Paqueta java.io para utilizar serialización
import java.io.*;

/**
 * Clase Vendedor para manejar empleados
 * de una tienda.
 * @author Manuel Soto Romero Ciencias UNAM
 * @version 1.03 Diciembre 2012
 */

public class Vendedor implements Serializable{
  
  //Atributos de la clase
  private String rfc;
  private String nombre;
  private String direccion;
  private int telefono;
  private String seccion;
  private double sueldo;
  private String clave;
  
  /**
   * Constructor por omision
   */
  
  public Vendedor(){
    rfc = "";
    nombre = "";
    direccion = "";
    telefono = 0;
    seccion = "";
    sueldo = 0.0;
    clave = "";
  }
  
  /**
   * Constructor a partir de cinco parámetros
   * @param r -- RFC
   * @param n -- Nombre
   * @param d -- Dirección
   * @param t -- Teléfono
   * @param c -- Sección
   * @param s -- Sueldo
   */
  
  public Vendedor(String r, String n, String d, int t, String c, double s) throws TiendaException{
    if((c.equalsIgnoreCase("Libros") || c.equalsIgnoreCase("Musica") || c.equalsIgnoreCase("Peliculas") || 
        c.equalsIgnoreCase("VideoJuegos")) && t>10000){
      rfc = r;
      nombre = n;
      direccion = d;
      telefono = t;
      seccion = c;
      sueldo = s;
    } else{
      throw new TiendaException("Algún dato incorrecto");
    }
  }
  
  /**
   * Método de acceso
   * Obtiene el RFC del empleado
   * @return String -- RFC
   */
  
  public String obtenerRFC(){
    return rfc;
  }
  
  /**
   * Método de acceso
   * Obtiene el nombre del empleado
   * @return String -- Nombre
   */
  
  public String obtenerNombre(){
    return nombre;
  }
  
  /**
   * Método de acceso
   * Obtiene la dirección del empleado
   * @return int -- Dirección
   */
  
  public int obtenerTelefono(){
    return telefono;
  }
  
  /**
   * Método de acceso
   * Obtiene la sección del empleado
   * @return String -- Sección
   */
  
  public String obtenerSeccion(){
    return seccion;
  }
  
  /**
   * Método de acceso
   * Obtiene el sueldo del empleado
   * @return double -- Sueldo
   */
  
  public double obtenerSueldo(){
    return sueldo;
  }
  
  /**
   * Método de acceso
   * Obtiene la clave del empleado
   * @return String -- Clave
   */
  
  public String obtenerClave(){
    return clave;
  }
  
  /**
   * Método modificador a partir de un parámetro.
   * Establece el RFC
   * @param r -- RFC
   */
  
  public void establecerRFC(String r){
    rfc = r;
  }
  
  /**
   * Método modificador a partir de un parámetro.
   * Establece el nombre
   * @param n -- Nombre
   */
  
  public void establecerNombre(String n){
    nombre = n;
  }
  
  /**
   * Método modificador a partir de un parámetro
   * Establece la dirección del emleado
   * @param d -- Dirección
   */
  
  public void establecerDireccion(String d){
    direccion = d;
  }
  
  /**
   * Método modificador a partir de un parámetro
   * Establece el teléfono
   * @param t --Teléfono
   */
  
  public void establecerTelefono(int t)throws TiendaException{
    if(t>10000){
    telefono = t;
    } else{
      throw new TiendaException("Número no válido");
    }
  }

  /**
   * Método modificador a partir de un parámetro
   * Establece la sección del empleado
   * @param c -- Sección
   */
  
  public void establecerSeccion(String c) throws TiendaException{
    if(c.equalsIgnoreCase("Libros") || c.equalsIgnoreCase("Musica") || c.equalsIgnoreCase("Peliculas") || 
       c.equalsIgnoreCase("VideoJuegos")){
      seccion = c;
    } else{
      throw new TiendaException("Sección no válida");
    }
  }
  
  /**
   * Método modificador a partir de un parámetro
   * Establece el sueldo del empleado
   * @param s -- Suledo
   */
  
  public void establecerSueldo(double s){
    sueldo = s;
  }
  
  /**
   * Método modificador a partir de un parámetro
   * Establece la clave del empleado
   * @param c -- Clave
   */
  
  public void establecerClave(String c){
    clave = c;
  }
  
  /**
   * Método toString
   * Imprime el vendedor
   * @return String -- Vendedor en formato cadena
   */
  
  public String toString(){
    return "\nRFC: "+rfc.toUpperCase()+"\nNombre: "+nombre.toUpperCase()+"\nDirección:\n"+"\""+direccion+"\""+"\nTeléfono: "
      +telefono+"\nSección: "+seccion+"\nSueldo: $"+sueldo+"\nClave: "+clave;
  }
}