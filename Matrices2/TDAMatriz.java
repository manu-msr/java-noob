public interface TDAMatriz{
   
 public int getRenglones();
 public int getColumnas();
 public void agrega(int i, int j, Double elemento);
 public Double get(int i, int j);
 public TDAMatriz suma(TDAMatriz otra);
 public TDAMatriz multiplicaEscalar(int e);
 public TDAMatriz traspuesta(); 
 public boolean equals(Object objeto);
}