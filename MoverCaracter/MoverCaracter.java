/**
 * Clase para mover caracteres a su siguiente representaci�n en espa�ol.
 * @author Manuel Soto Romero
 * @version Mayo 20133
 */
public class MoverCaracter {
  
  /**
   * M�todo que toma una cadena y "mueve" cada caracter n posiciones a la derecha en el alfabeto, de tal forma
   * que la nueva cadena sea el resultado de mover cada caracter de esta manera.
   * @param palabra -- Palabra a mover
   * @param pos -- N�mero de posiciones a mover
   * @return String -- Cadena final
   */
  public String avanza(String palabra, int pos) {
    String cadena = "";
    int contador = 0;
    while(contador < palabra.length()) {
      char letra = palabra.charAt(contador);
      letra += pos;
      cadena += letra;
      contador++;
    }
    return cadena;
  }
  
  /**
   * M�todo que toma una cadena y "mueve" cada caracter n posiciones a la izquierda en el alfabeto, de tal forma
   * que la nueva cadena sea el resultado de mover cada caracter de esta manera.
   * @param palabra -- Palabra a mover
   * @param pos -- N�mero de posiciones a mover
   * @return String -- Cadena final
   */
  public String deshacer(String palabra, int pos) {
    String cadena = "";
    int contador = 0;
    while(contador < palabra.length()) {
      char letra = palabra.charAt(contador);
      letra -= pos;
      cadena += letra;
      contador++;
    }
    return cadena;
  }
  
  /**
   * M�todo principal de la clase.
   * @param args -- Argumentos de la l�nea de comandos
   */
  public static void main(String[] args) {
    MoverCaracter play = new MoverCaracter(); // crea un objeto de tipo MoverCaracter
    System.out.println(play.avanza("Hola", 2)); // avanza dos posiciones la palabra hola
    System.out.println(play.deshacer("Jqnc", 2)); // regresa dos posiciones la palabra jqnc
  }
}