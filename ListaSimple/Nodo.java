/**
 * Clase nodo para manejar los elementos de una lista simplemente ligada.
 * @author Manuel Soto Romero
 * @version 1.00 Agosto 2013
 */
public class Nodo<T> {
  
  /**
   * Elemento a guardar en cada nodo.
   */
  public T elemento;
  
  /**
   * Nodo para guardar el elemento siguiente.
   */
  public Nodo<T> siguiente;
  
  /**
   * Constructor a partir de un parámetro. Inicializa el nodo guardando
   * el elemento en él.
   * @param elemento - Elemento a guardar en el nodo.
   */
  public Nodo(T elemento) {
    this.elemento = elemento;
  }
}