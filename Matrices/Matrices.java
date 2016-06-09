/**
 * Clase para manejar operaciones de suma y multiplicación de matrices.
 * @author Manuel Soto Romero
 * @version Abril 2013
 */
public class Matrices {
  
  /**
   * Matriz privada que será el primer término para realizar la operación
   */
  private int[][] primera;
  
  /**
   * Matriz privada que será el segundo término para realizar la operación
   */
  private int[][] segunda;
  
  /**
   * Matriz privada que será el resultado de la operación
   */
  private int[][] tercera;
  
  /**
   * Constructor por omisión. Inicializa las matricez en un tama?o de 3x3
   */
  public Matrices() {
    primera = new int[3][3];
    segunda = new int[3][3];
    tercera = new int[3][3];
  }
  
  /**
   * Método que agrega a la primer matriz el dato que se le pasa como parámetro a la posición que también se le pasa 
   * como parámetro.
   */
  public void agregarDatoPrimera(int n, int x, int y)  {
    primera[x][y] = n;
  }
  
  /**
   * Método que agregar a la segunda matriz el dato que se le pasa como parámetro a la posición que también se le pasa
   * como parámetro.
   */
  public void agregarDatoSegunda(int n, int x, int y) {
    segunda[x][y] = n;
  }
  
  /**
   * Método para sumar dos matrices.
   */
  public void sumar() {
    for(int i = 0; i < tercera.length; i++) {
      for(int j = 0; j < tercera.length; j++) {
        tercera[i][j] = (primera[i][j] + segunda[i][j]);
      }
    }
  }
  
  /**
   * Método para dividir dos matrices.
   */
  public void restar() {
    for(int i = 0; i < tercera.length; i++) {
      for(int j = 0; j < tercera.length; j++) {
        tercera[i][j] = (primera[i][j] - segunda[i][j]);
      }
    }
  }
  
  /**
   * Método para multiplicar dos matrices.
   */
  public void multiplicar() {
    for(int i = 0; i < primera.length; i++) {
      for(int j = 0; j < primera[0].length; j++) {
        for(int k = 0; k < primera[0].length; k++) {
          tercera[i][j] += primera[i][k] * segunda[k][j];
        }
      }
    }
  }
  
  /**
   * Método para mostrar el resultado de la operación.
   */
  public void mostrarResultado() {
    for(int i = 0; i < tercera.length; i++) {
      for(int j = 0; j < tercera.length; j++) {
        System.out.print("\t" + tercera[i][j]);
      }
      System.out.println("\n");
    }
  }
}