/**
 * Clase para implementar el TDAMatriz.
 */
public class Matriz implements TDAMatriz{
   
   /**
    * Renglones de la matriz
    */
   private int renglones;
   
   /**
    * Columnas de la matriz
    */
   private int columnas;
   
   /**
    * Arreglo doble para guardar los elementos
    */
   private Double matriz[][];
   
   /**
    * Constructor por omisión. Inicializa los atributos en un estado válido.
    */
   public Matriz() {
      renglones = 0;
      columnas = 0;
      matriz = new Double[2][2];
   }
   
   /**
    * Constructor a partir de dos parámetros. Inicializa la matriz con las 
    * dimensiones dadas. Es decir, crea una matriz de nxm.
    * @param n Renglones de la matriz.
    * @param m Columnas de la matriz.
    */
   public Matriz(int n, int m) {
      if (n < 0 || m < 0) {
         System.out.println("No hay matrices con dimensiones negativas");
      } else {
         renglones = n;
         columnas = m;
         matriz = new Double[n][m];
      }
   }
   
   /**
    * Método que devuelve el número de renglones de la matriz.
    * @return int - Número de renglones de la matriz.
    */
   public int getRenglones() {
      return renglones;
   }
   
   /**
    * Método que devuelve el número de columnas de la matriz.
    * @return int - Número de columnas de la matriz.
    */
   public int getColumnas() {
      return columnas;
   }
   
   /**
    * Método que agrega un elemento en las posición indicada.
    * @param i Posición i de la matriz.
    * @param j Posición j de la matriz.
    * @param elemento Emento que se agregará.
    */
   public void agrega(int i, int j, Double elemento) {
      if (i < 0 || i > renglones || j < 0 || j > columnas)
         return;
      matriz[i][j] = elemento;
   }
   
   /**
    * Método que obtiene el elemento en la posición indicada.
    * @param i Posición i de la matriz.
    * @param j Posición j de la matriz.
    * @return Double Elemento en la posición i,j.
    */
   public Double get(int i, int j) {
      if (i < 0 || i > renglones || j < 0 || j > columnas)
         return 0.0;
      return matriz[i][j];
   }
   
   /**
    * Método que regresa la suma de la matriz this, con otra que le es pasada como 
    * parámetro.
    * @param otra Matriz con la que sumará this.
    * @return TDAMatriz La matriz con la suma.
    */
   public TDAMatriz suma(TDAMatriz otra) {
      if (getRenglones() != otra.getRenglones() || 
          getColumnas() != otra.getColumnas())
         return null;
      //TDAMatriz suma = new Matriz(renglones, columnas);
      for (int i = 0; i < renglones; i++)
         for (int j = 0; j < columnas; j++)
            agrega(i, j, get(i, j) + otra.get(i, j));
      return this;
   }
   
   /**
    * Método que regresa la multiplicación de this por un escalar.
    * @param e Escalar por el que se multiplicará la matriz.
    * @return TDAMatriz matriz multiplicada por un escalar.
    */
   public TDAMatriz multiplicaEscalar(int e) {
      TDAMatriz multiplicacion = new Matriz(renglones, columnas);
      for (int i = 0; i < renglones; i++)
         for (int j = 0; j < columnas; j++)
            multiplicacion.agrega(i, j, e * get(i, j));
      return multiplicacion;
   }
   
   /**
    * Método que regresa la matriz traspuesta de this.
    * @return TDAMatriz traspuesta de this.
    */
   public TDAMatriz traspuesta() {
      TDAMatriz traspuesta = new Matriz(renglones, columnas);
      for (int i = 0; i < renglones; i++) {
         for (int j = 0; j < columnas; j++) {
            traspuesta.agrega(i, j, get(i, j));
         }
      }
      for (int i = 0; i < renglones; i++) {
         for (int j = 0; j < columnas; j++) {
            traspuesta.agrega(i, j, get(j, i));
         }
      }
      return traspuesta;
   }
   
   /**
    * Método que indica si la matriz this es igual a otra.
    * @param objeto Objeto a comparar.
    * @return boolean true si son iguales, false en otro caso.
    */
   public boolean equals(Object objeto) {
      if (objeto == null)
         return false;
      if (getClass() != objeto.getClass())
         return false;
      TDAMatriz compara = (Matriz)objeto;
      if (renglones != compara.getRenglones() || columnas != compara.getColumnas())
         return false;
      for (int i = 0; i < renglones; i++)
         for (int j = 0; j < columnas; j++)
           if (!get(i, j).equals(compara.get(i,j)))
             return false;
      return true;
   }
   
   /**
    * Método que muestra la cadena de una matriz.
    * @return String Matriz en formato cadena.
    */
   public String toString() {
      String s = "";
      for (int i = 0; i < matriz.length; i++) {
         for(int j = 0; j < matriz.length; j++) {
            if (matriz[i][j] == null)
               s+="[0.0]";
            else
               s += "[" + matriz[i][j] + "]";
         }
         s += "\n";
      }
      return s;
   }
}