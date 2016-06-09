/**
 * Clase para mostrar el uso de listas doblemente ligadas, para ello se 
 * presenta el siguiente programa de muestra.
 * @author Manuel Soto Romero.
 * @version Agosto 2013.
 */
public class PruebaLista {
  
  /**
   * Clase principal de la clase.
   * @param args - Argumentos de la línea de comandos.
   */
  public static void main(String[] args) {
    
    // creamos una lista vacía
    Lista<Integer> list = new Lista<Integer>();
    
    // agregamos algunos elementos
    for(int i = 0; i < 20; i++) {
      list.agregar((i*10) - i);
    }
    
    // mostramos la lista
    System.out.printf("Se ha creado la lista: \n%s\n\n", list.toString());
    
    //está vacía?
    System.out.printf("La lista está vacía?: %s\n\n",list.estaVacia());
    
    // eliminamos elementos de la lista
    System.out.printf("Eliminando %d de la copia... \n", 
                      117);
    list.eliminar(117);
    System.out.printf("%s\n\n", list.toString());
    System.out.printf("Eliminando %d de la copia... \n", 
                      118);
    list.eliminar(118);
    System.out.printf("%s\n\n", list.toString());
    
    // verificamos si contiene algunos elementos
    System.out.printf("¿La lista contiene el número 9? %s\n\n", 
                     list.contiene(9));
    System.out.printf("¿La lista contiene el número -1? %s\n\n", 
                     list.contiene(-1));
    System.out.printf("¿La lista contiene el número 117? %s\n\n", 
                     list.contiene(117));
    
    // imprimimos los elementos con un iterador
    System.out.println("Elementos usando iteradores:\n");
    for(int x : list) {
      System.out.printf("%d ",x);
    }

    // limpiamos la lista
    list.vaciar();
    System.out.printf("\n\nLa lista ha sido limpiada\n%s\n\n", list.toString());
  }
}