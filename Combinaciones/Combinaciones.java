/**
 * Programa que los subconjuntos de m elementos de un conjunto con n elementos
 * para ello utilizamos combinatoria.
 * @author Manuel Soto Romero
 * @version Octubre 2013
 */
public class Combinaciones {
  
  /**
   * Calcula los subconjuntos de m elementos.
   * @param n - Tamaño del conjunto original.
   * @param m - Tamaño del subconjunto.
   * @return int - Posibles combinaciones
   */
  public int combinaciones(int n, int m) {
    return fact(n) / (fact(m) * fact(n - m));
  }
  
  /**
   * Regresa el factorial de un número.
   * @param n - Número a calcular el factorial.
   * @return int - Factorial del número.
   */
  public int fact(int n) {
    int res = 1; 
    if (n == 0 || n == 1)
      return 1;
    for (int i = 2; i <= n; i++)
      res = res * i;
    return res;
  }
  
  public static void main(String[] args) {
    Combinaciones cmb = new Combinaciones();
    System.out.println(cmb.combinaciones(3,2));
  }
}