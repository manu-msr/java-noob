import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Clase para manejar listas simplemente ligadas que además son genericas.
 * @author Manuel Soto Romero
 * @version 1.00 Agosto 2013
 */
public class Lista<T> implements Iterable<T> {
  
  /**
   * Nodo que guardará el primer elemento de la lista.
   */
  private Nodo<T> cabeza;
  
  /**
   * Variable que guardará el tamaño de la lista.
   */
  private int tamanio;
  
  /**
   * Indica si la lista está vacía.
   * @return boolean - true si está vacía; false en otro caso.
   */
  public boolean estaVacia() {
    return tamanio == 0;
  }
  
  /**
   * Deja la lista vacía.
   */
  public void vaciar() {
    tamanio = 0;
  }
  
  /**
   * Agrega un elemento a la lista.
   * @param elemento - Elemento que se agregará.
   */
  public void agregar(T elemento) {
    Nodo<T> nuevo = new Nodo<T>(elemento);
    if(estaVacia()) { // la lista está vacía
      cabeza = nuevo;
      tamanio++;
      return;
    }
    nuevo.siguiente = cabeza;
    cabeza = nuevo;
    tamanio++;
  }
  
  /**
   * Método que indica si contiene un elemento.
   * @param elemento - Elemento a buscar.
   * @return boolean - true si lo contiene; false en otro caso.
   */
  public boolean contiene(T elemento) {
    Nodo<T> auxiliar = cabeza;
    if(estaVacia()) { // la lista está vacía
      return false;
    }
    while(auxiliar != null && !auxiliar.elemento.equals(elemento)) {
      auxiliar = auxiliar.siguiente;
    }
    if(auxiliar == null) {
      return false;
    }
    return true;
  }
  
  /**
   * Regresa el primer elemento de la lista.
   * @return T - El primer elemento de la lista.
   */
  public T primerElemento() {
    return cabeza.elemento;
  }
  
  /**
   * Elimina un elemento de la lista.
   * @param elemento - Elemento a eliminar.
   */
  public void eliminar(T elemento) {
    if(estaVacia()) {
      return;
    }
    Nodo<T> auxiliar = cabeza;
    Nodo<T> anterior = null;
    while(auxiliar != null && !auxiliar.elemento.equals(elemento)) {
      anterior = auxiliar;
      auxiliar = auxiliar.siguiente;
    }
    if(auxiliar == null) {
      return;
    }
    if(auxiliar == cabeza) {
      cabeza = cabeza.siguiente;
      tamanio--;
      return;
    }
    anterior.siguiente = auxiliar.siguiente;
    tamanio--;
  }
  
  /**
   * Sustituye un elemento por otro.
   * @param orig - Elemento a sustituir.
   * @param nuevo - Nuevo elemento.
   */
  public void sustituir(T orig, T nuevo) {
    if(estaVacia()) {
      return;
    }
    Nodo<T> auxiliar = cabeza;
    while(auxiliar != null && !auxiliar.elemento.equals(orig)) {
      auxiliar = auxiliar.siguiente;
    }
    if(auxiliar == null) {
      return;
    }
    auxiliar.elemento = nuevo;
  }
  
  /**
   * Regresa la lista en formato cadena.
   * @return String - Lista en formato cadena.
   */
  public String toString() {
    if (tamanio == 0) {
      return "[ ]";
    }
    Nodo<T> auxiliar = cabeza;
    String cadena = "[";
    for (int i = 0; i < (tamanio-1); i++) {
      cadena += auxiliar.elemento + ", ";
      auxiliar = auxiliar.siguiente;
    }
    cadena += auxiliar.elemento + "]";
    return cadena;
  }
  
  /**
   * Regresa un iterador para recorrer la lista (fuera de la clase).
   * @return Iterator - Iterador.
   */
  public Iterator<T> iterator() {
    return new MiIterador<T>(this);
  }
  
  /**
   * Clase intera MiIterador que implementa Iterator para poder recorrer los
   * elementos de una lista simplemente ligada.
   */
  private class MiIterador<T> implements Iterator<T> {
    
    /**
     * Lista a recorrer con el iterador.
     */
    Lista<T> lista;
    
    /**
     * Nodo auxiliar para recorrer el iterador.
     */
    Nodo<T> iterador;
    
    /**
     * Constructor del iterador.
     */
    public MiIterador(Lista<T> l) {
      lista = l;
      iterador = l.cabeza;
    }
    
    /**
     * Indica si tiene un siguiente elemento.
     * @return boolean - true si tiene un siguiente elemento; false en otro 
     * caso.
     */
    public boolean hasNext() {
      return iterador != null;
    }
    
    /**
     * Regresa el siguiente elemento de la lista.
     * @return T - Siguiente elemento.
     * @throws NoSuchElementException - En caso de que ya no haya elementos.
     */
    public T next() {
      if(iterador == null) {
        throw new NoSuchElementException("No hay más elementos");
      }
      T regreso = iterador.elemento;
      iterador = iterador.siguiente;
      return regreso;
    }
    
    /**
     * Método no implementado
     */
    public void remove() {
      throw new UnsupportedOperationException();
    }
  }
}