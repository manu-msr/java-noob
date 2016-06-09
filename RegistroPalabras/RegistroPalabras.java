import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

/**
 * Clase que cuenta el número de palabras con un tamaño específico de un
 * texto.
 * @author Manuel Soto Romero
 * @version Junio 2013
 */

public class RegistroPalabras {
  
  /**
   * Lista para guardar las palabras del archivo.
   */
  private Lista palabras;
  
  /**
   * Matriz que guardará los datos.
   */
  private int[][] tabla;
  
  /**
   * Variable que guarda el tamaño de la palabra de mayor tamaño.
   */
  private int mayor;
  
  /**
   * Constructor por omisión.
   */
  public RegistroPalabras() {
    palabras = new Lista();
    mayor = 0;
  }
  
  /**
   * Método que lee el archivo y guarda las palabras en la lista.
   * @param archivo -- Nombre del archivo a leer
   */
  public void leerArchivo(File lectura) throws IOException {
    BufferedReader entrada = new BufferedReader(new FileReader(lectura));
    String renglon;
    String cadena = ""; // cadena que guardará las palabras
    while ((renglon = entrada.readLine()) != null) {
      for (int i = 0; i < renglon.length(); i++) {
        cadena += renglon.charAt(i); // arma la cadena
        System.out.print(renglon.charAt(i));
        if(renglon.charAt(i) == ' ') {
          agregarLista(cadena); //agrega la cadena a la lista
          cadena = ""; // vacía la cadena para armar otra palabra
        }
      }
      agregarLista(cadena);
      System.out.println("");
    }
  }
  
  /**
   * Agregar los datos de la lista en la tabla.
   */
  public void crearTabla() {
    int contador = 0;
    tabla = new int[2][mayor]; // crea una tabla de 2 x el tamaño mayor
    for(int i = 0; i < mayor; i++) { // llena primera fila
      tabla[0][i] = (i+1);
    }
    for(int i = 0; i < mayor; i++) { // llena segunda fila
      tabla[1][i] = (palabras.cuenta(i+1));
    }
  }
  
  /**
   * Método que recorre la tabla y muestra los datos almacenados en ella
   */
  public void mostrarTabla() {
    for(int i = 0; i < 2; i++) {
      if(i == 0) {
        System.out.print("Tamaño:\t");
      } else {
        System.out.print("Numero:\t");
      }
      for(int j = 0; j < mayor; j++) {
        System.out.printf("%d\t",tabla[i][j]);
      }
      System.out.println();
    }
  }
  
  /**
   * Método privado para agregar la cadena que se le pasa como parámetro.
   * @param cadena -- Cadena que se agregará a la Lista
   */
  private void agregarLista(String cadena) {
    cadena = modificaCadena(cadena); // corrige la cadena
    palabras.agregar(cadena.length()); // agrega el tamaño de la cadena
    if(cadena.length() > mayor) {
      mayor = cadena.length(); // asigna el tamaño a la variable mayor
    }
  }
  
  /**
   * Método que modifica una cadena para evitar que se cuenten espacios en
   * blanco y signos de puntuación.
   * @param cadena -- Cadena a modificar
   * @return String -- Cadena modificada
   */
  private String modificaCadena(String cadena) {
    String nueva = cadena;
    nueva = nueva.replace(".", " ");
    nueva = nueva.replace(",", " ");
    nueva = nueva.replace(";", " ");
    nueva = nueva.replace("(", " ");
    nueva = nueva.replace(")", " ");
    nueva = nueva.trim();
    return nueva;
  }
  
  /**
   * Pruebas de la clase
   */
  public static void main(String[] args) {
    RegistroPalabras dePrueba = new RegistroPalabras();
    File archivo = new File("archivo.txt");
    try {
      System.out.println("Texto original\n");
      dePrueba.leerArchivo(archivo);
      System.out.println();
      dePrueba.crearTabla();
      dePrueba.mostrarTabla();
    } catch(IOException ioe) {
      System.out.println("Error.");
    }
  }
}