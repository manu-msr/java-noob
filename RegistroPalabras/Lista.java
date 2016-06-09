/**
 * Clase para representar una lista.
 * @author Manuel Soto Romero
 * @version 2.00 Junio 2013
 */
public class Lista {
  
  /**
   * Nodo que representa el inicio de la lista.
   */
  protected Nodo inicio;
  
  /**
   * Constructor por omisión. Inicializa el nodo a null.
   */
  public Lista() {
    inicio = null;
  }
  
  /** 
   * Metodo que determina si la Lista esta o no vacia.
   * @return boolean -- true si esta vacia, false en otro caso.
   */
  public boolean estaVacia() {
    return inicio == null;
  }
  
  /**
   * Agrega un elemento a la lista.
   * @param dato -- El valor que tendra el nuevo Nodo.
   */
  public void agregar(Object dato) {
    inicio = new Nodo(dato,inicio);
  }
  
  /**
   * Elimina un elemento, incluyendo todos los que están repetidos.
   * @param dato -- El dato a eliminar.
   */
  public void eliminarRep(Object dato) {
    int rep = cuenta((int)dato); // cuenta el número de veces que se repite
    Nodo pos = inicio, anterior = null;
    for(int i = 0; i < rep; i++) {
      eliminar(dato);
    }
  }
  
  /**
   * Elimina un elemento de la lista.
   * @param dato --  El dato a eliminar.
   */
  public void eliminar(Object dato) {
    Nodo pos = inicio, anterior = null;
    while(pos != null && !pos.elemento.equals(dato)) {
      anterior = pos;
      pos = pos.siguiente;
    }
    if (pos == null) { // no lo encontró
      return;
    }
    if(pos == inicio) { // es el inicio de la lista
      inicio = inicio.siguiente;
    } else {
      anterior.siguiente = pos.siguiente;
    }
  }
  
  /**
   * Muestra los elementos de la lista
   */
  public void muestra() {
    if(!estaVacia()) {
      Nodo temp = inicio;
      while(temp.siguiente != null) {
        System.out.print(temp.elemento + " ");
        temp = temp.siguiente;
      }
      System.out.println(temp.elemento);
    }
  }
  
  /**
   * Da el número de elementos repetidos del número que se le pasa 
   * como parámetro.
   * @param n -- Número a contar
   */
  public int cuenta(int n) {
    int contador = 0; // contador de palabras
    if(!estaVacia()) {
      Nodo temp = inicio;
      while(temp.siguiente != null) {
        if(temp.elemento == n) {
          contador++;
        }
        temp = temp.siguiente;
      }
      if(temp.elemento == n) {
        contador++;
      }
    }
    return contador;
  }
  
  /**
   * Pruebas de la clase.
   */
  public static void main(String[] args) {
    Lista nueva = new Lista();
    int contador1 = 0;
    for(int i = 0; i < 10; i++) {
      contador1 += 2;
      int contador2 = 0;
      while(contador2 < contador1) {
        nueva.agregar(i);
        contador2++;
      }
    }
    nueva.muestra();
    nueva.eliminarRep(9);
    nueva.muestra();
  }
}