package Proyecto; //Paquete donde se encuentra la clase

//Paquetes para usar serialización
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * Se vuelve a definir la clase ObjectOutputStream, con el objetivo de que
 * el programa no escriba un código, cada que escriba un Contacto en el archivo.
 * @author Manuel Soto Romero
 */

public class ObjectOutputStreamPropio  extends ObjectOutputStream {
  
  /** 
   * Constructor que recibe OutputStream 
   */
  
  public ObjectOutputStreamPropio(OutputStream out) throws IOException{
    super(out);
  }
  
  /**
   * Constructor sin parámetros
   */
  
  protected ObjectOutputStreamPropio() throws IOException, SecurityException {
    super();
  }
  
  /**
   * Éste es el método principal que hay que sobreescribir, para que no haga nada, con 
   * ésto logramos que no escriba ningún código al momento de agregar un Contacto al archivo
   */
  
  protected void writeStreamHeader() throws IOException{
  }   
}