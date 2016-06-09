import utiles.Utils;

/**
 * Clase que implementa la clase Fracciones.
 * @author Elisa Viso.
 * @author Manuel Soto Romero.
 * @version 1.02 Marzo 2013
 * @see ServFracciones.
 */
public class Fraccion implements ServFracciones {
  
  /**
   * Atributos de la clase
   */
  private int numerador;
  private int denominador;
  
  /**
   * Constructor por omisión
   */
  public Fraccion() {
    numerador = 0;
    denominador = 1;
  }
  
  /**
   * Contructor a partir de dos parámetros.
   * @param numerador -- Numerador de la fracción.
   * @param denominador -- Demoninador de la fracción.
   */
  public Fraccion(int numerador, int denominador) {
    this.numerador = numerador;
    this.denominador = denominador;
  }
  
  /**
   * Método de acceso para obtener el valor del numerador.
   * @return numerador.
   */
  public int getNumerador() {
    return numerador;
  }
  
  /**
   * Método de acceso para obtener el valor del denominador.
   * @return denominador.
   */
  public int getDenominador() {
    return denominador;
  }
  
  /**
   * Método modificador para cambiar el valor del numerador.
   * @param numerador -- Nuevo valor para el numerador.
   */
  public void setNumerador(int numerador) {
    this.numerador = numerador;
  }
  
  /**
   * Método modificador para cambiar el valor del denominador.
   * @param denominador -- Nuevo valor para el denominador.
   */
  public void setDenominador(int denominador) {
    this.denominador = denominador;
  }
  
  /**
   * Le suma una fracción a la fracción this.
   * @param otra -- La fracción a sumar.
   * @return la suma de las fracciones.
   */
  public Fraccion suma(Fraccion otra) {
    int a = (numerador * otra.getDenominador()) + (denominador * otra.getNumerador());
    int b = denominador * otra.getDenominador();
    
    return new Fraccion(a,b);
  }
  
  /**
   * Le resta una fracción a la fracción this.
   * @param otra -- La fracción a sumar.
   * @return la resta de las fracciones.
   */
  public Fraccion resta(Fraccion otra){
    int a = (numerador * otra.getDenominador()) - (denominador * otra.getNumerador());
    int b = denominador * otra.getDenominador();
    
    return new Fraccion(a,b);
  }
  
  /**
   * Multiplica una fraccion por la fraccion this.
   * @param otra -- La fraccion a multiplicar.
   * @return la multiplicación de las fracciones.
   */
  public Fraccion multiplica(Fraccion otra){
    int a = numerador * otra.getNumerador();
    int b = denominador * otra.getDenominador();
    
    return new Fraccion(a,b);
  }
  
  /**
   * Multiplica un entero por la fracción this.
   * @param valor -- El entero a multiplicar.
   * @return el resultado de la multiplicación, que es una fracción.
   */
  public Fraccion multiplicaEscalar(int valor){
    int a = numerador * valor;
    int b = denominador;
    
    return new Fraccion(a,b);
  }
  
  /**
   * Divide la fracción this entre la fracción dada.
   * @param otra -- Ña fraccion entre la cual dividir..
   * @return El resultado de la division de las fracciones.
   */
  public Fraccion divide(Fraccion otra){
    int a = (numerador * otra.getDenominador());
    int b = denominador * otra.getNumerador();
    
    return new Fraccion(a,b);
  }
  
  /**
   * Responde si la fraccion this es propia o no.
   * @return true si la fraccion es propia.
   */
  public boolean esPropia(){
    return numerador < denominador;
  }
  
  /**
   * Lleva a cabo la división del numerador entre el denominador de
   * la fracción this.
   * @return el real que es resultado de la división
   */
  public double daValorReal() {
    return (double)numerador/denominador;
  }
  
  /**
   * Simplifica la fracción this. Método no implementado
   * @return la fracción simplificada.
   */
  public Fraccion simplifica(){
    int dividir = Utils.GCD(numerador, denominador);
    int a = numerador/dividir;
    int b = denominador/dividir;
    return new Fraccion(a,b);
  }
  
  /**
   * Construye una cadena con una representación adecuada de la fracción this.
   * @return la fracción simplificada
   */
  public String muestra(){ 
    return getNumerador() + "/" + getDenominador();
  }
}
