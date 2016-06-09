/**
 * Clase para manejar los datos de una Persona
 * @author Manuel S.R.
 * @version Mayo 2013
 */
public class Persona implements Comparable {
  
  /**
   * Atributos de una persona.
   */
  private int idPersona;
  private String nombre;
  private java.util.Date fechaNacimiento;
  
  /**
   * Constructor por omisión.
   */
  public Persona() {
  }
  
  /**
   * Constructor a partir de dos parámetros.
   * Inicializa el id de la Persona y su nombre a partir de los que son padados como parámetro.
   * @param idPersona -- ID de la persona
   * @param nombre -- Nombre de la persona
   */
  public Persona(int idPersona, String nombre) {
    this.idPersona = idPersona;
    this.nombre = nombre;
  }
  
  /**
   * Método de acceso.
   * @return int -- id de la persona
   */
  public int getIdPersona() {
    return idPersona;
  }
  
  /**
   * Método modificador.
   * @param idPersona -- Entero a modificar el id de la persona
   */
  public void setIdPersona(int idPersona) {
    this.idPersona = idPersona;
  }
  
  /**
   * Método de acceso.
   * @return String -- Nombre de la persona
   */
  public String getNombre() {
    return nombre;
  }
  
  /**
   * Método modificador.
   * @param nombre -- Nombre a modificar de la persona
   */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
  /**
   * Método de acceso.
   * @return java.util.Date -- Fecha de nacimiento
   */
  public java.util.Date getFechaNacimiento() {
    return fechaNacimiento;
  }
  
  /**
   * Método modificador.
   * @param java.util.Date -- Fecha de nacimiento a modificar
   */
  public void setFechaNacimiento(java.util.Date fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }
  
  /**
   * Método que muestra los atributos de una persona en formato cadena.
   * @return String -- Cadena de la persona
   */
  public String toString() {
    return String.format("persona{idPersona:%1s,nombre:%2s}", idPersona, nombre);
  }
  
  /**
   * Método para comparar dos personas a partir de su nombre
   * @param o -- Persona a comparar
   * @return int -- Entero para saber si es mayor, igual o menor
   */
  @Override
  public int compareTo(Object o) {
    Persona p1 = (Persona)o;
    return this.nombre.compareTo(p1.nombre);
  }
}