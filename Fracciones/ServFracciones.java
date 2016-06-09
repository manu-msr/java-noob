/**
 * Presenta los servicios que ofrece una clase que represente a fracciones.
 * @author Elisa Viso.
 * @version 0.1.
 * @date Feb 20,2013.
 */
public interface ServFracciones {
  
  /**
   * Le suma una fracción a la fracción this.
   * @param la fracción a sumar.
   * @return la suma de las fracciones.
   */
  public Fraccion suma(Fraccion otra);
  
  /**
   * Le resta una fracción a la fracción this.
   * @param la fracción a sumar.
   * @return la resta de las fracciones.
   */
  public Fraccion resta(Fraccion otra);
  
  /**
   * Multiplica una fraccion por la fraccion this.
   * @param la fraccion a multiplicar.
   * @return la multiplicación de las fracciones.
   */
  public Fraccion multiplica(Fraccion otra);
  
  /**
   * Multiplica un entero por la fracción this.
   * @param el entero a multiplicar.
   * @return el resultado de la multiplicación, que es una fracción.
   */
  public Fraccion multiplicaEscalar(int valor);
  
  /**
   * Divide la fracción this entre la fracción dada.
   * @param la fraccion entre la cual dividir..
   * @return El resultado de la division de las fracciones.
   */
  public Fraccion divide(Fraccion otra);
  
  /**
   * Responde si la fraccion this es propia o no.
   * @return true si la fraccion es propia.
   */
  public boolean esPropia();
  
  /**
   * Lleva a cabo la división del numerador entre el denominador de
   * la fracción this.
   * @return el real que es resultado de la división
   */
  public double daValorReal();
  
  /**
   * Simplifica la fracción this.
   * @return la fracción simplificada.
   */
  public Fraccion simplifica();
  
  /**
   * Construye una cadena con una representación adecuada de la fracción this.
   * @return la fracción simplificada
   */
  public String muestra();
}
