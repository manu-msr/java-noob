/**
 * Clase para implementar la representacion de un Nodo como un elemento
 * de una Lista Ligada.
 * @author Manuel Soto Romero
 * @version Junio 2013
 */

public class Nodo {
  protected Object elemento; // elemento a guardar
  protected Nodo siguiente; // nodo que guardará el siguiente elemento
  
  /**
   * Constructor que recibe como parámetro el valor que contendr� el nuevo Nodo.
   * Siguiente se inicializa como null.
   * @param valor -- Elemento que tendrá el nuevo Nodo.
   */
  public Nodo(Object valor) {
    this(valor,null);
  }
  
  /**
   * Constructor que recibe como parámetros el valor del nuevo Nodo y el siguiente
   * Nodo en la Lista que suceder+a al nuevo Nodo.
   * @param valor -- Elemento del nuevo Nodo.
   * @param n -- Siguiente Nodo del nuevo Nodo
   */
  public Nodo(Object valor, Nodo n) {
    elemento = valor;
    siguiente = n;
  }
}