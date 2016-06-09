/**
 * Clase para manejar operaciones de suma y multiplicaci�n de matrices.
 * @author Manuel Soto Romero
 * @version Abril 2013
 */
public class Matrices {
  
  /**
   * Matriz privada que ser� el primer t�rmino para realizar la operaci�n
   */
  private int[][] primera;
  
  /**
   * Matriz privada que ser� el segundo t�rmino para realizar la operaci�n
   */
  private int[][] segunda;
  
  /**
   * Matriz privada que ser� el resultado de la operaci�n
   */
  private int[][] tercera;
  
  /**
   * Constructor por omisi�n. Inicializa las matricez en un tama?o de 3x3
   */
  public Matrices() {
    primera = new int[3][3];
    segunda = new int[3][3];
    tercera = new int[3][3];
  }
  
  /**
   * M�todo que agrega a la primer matriz el dato que se le pasa como par�metro a la posici�n que tambi�n se le pasa 
   * como par�metro.
   */
  public void agregarDatoPrimera(int n, int x, int y)  {
    primera[x][y] = n;
  }
  
  /**
   * M�todo que agregar a la segunda matriz el dato que se le pasa como par�metro a la posici�n que tambi�n se le pasa
   * como par�metro.
   */
  public void agregarDatoSegunda(int n, int x, int y) {
    segunda[x][y] = n;
  }
  
  /**
   * M�todo para sumar dos matrices.
   */
  public void sumar() {
    for(int i = 0; i < tercera.length; i++) {
      for(int j = 0; j < tercera.length; j++) {
        tercera[i][j] = (primera[i][j] + segunda[i][j]);
      }
    }
  }
  
  /**
   * M�todo para dividir dos matrices.
   */
  public void restar() {
    for(int i = 0; i < tercera.length; i++) {
      for(int j = 0; j < tercera.length; j++) {
        tercera[i][j] = (primera[i][j] - segunda[i][j]);
      }
    }
  }
  
  /**
   * M�todo para multiplicar dos matrices.
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
   * M�todo para mostrar el resultado de la operaci�n.
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