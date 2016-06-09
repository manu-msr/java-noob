/**
 * Clase para convertir número de base 10 a otra base
 * @author Manuel Soto Romero
 * @version Abril 2013
 */
public class Convertir {
  
  /**
   * Atributos de la clase
   */
  private int numero;
  private int base;
  
  /**
   * Constructor por omisión
   */
  public Convertir() {
    numero = 0;
    base = 1;
  }
  
  /**
   * Constructor a partir de dos parámetros.
   * @param numero -- Número a convertir
   * @param base -- Base a la que se convertirá el número
   */
  public Convertir(int numero, int base) {
    if(base > 0) {
      this.numero = numero;
      this.base = base;
    } else {
      System.out.println("Una base debe ser mayor que cero");
    }
  }
  
  /**
   * Método para transformar el número en base 10 a la base que se le pasó por parámetro
   */
  public String convierte() {
    String cad = "";
    int nuevo = 0;
    if(numero == 0) {
      return "0";
    }
    while(numero > 0) {
      nuevo = numero%base;
      if(base > 10 && base <= 36 && nuevo > 9) {
        switch(nuevo) {
          case 10: cad += "A"; break;
          case 11: cad += "B"; break;
          case 12: cad += "C"; break;
          case 13: cad += "D"; break;
          case 14: cad += "E"; break;
          case 15: cad += "F"; break;
          case 16: cad += "G"; break;
          case 17: cad += "H"; break;
          case 18: cad += "I"; break;
          case 19: cad += "J"; break;
          case 20: cad += "K"; break;
          case 21: cad += "L"; break;
          case 22: cad += "M"; break;
          case 23: cad += "N"; break;
          case 24: cad += "O"; break;
          case 25: cad += "P"; break;
          case 26: cad += "Q"; break;
          case 27: cad += "R"; break;
          case 28: cad += "S"; break;
          case 29: cad += "T"; break;
          case 30: cad += "U"; break;
          case 31: cad += "V"; break;
          case 32: cad += "W"; break;
          case 33: cad += "X"; break;
          case 34: cad += "Y"; break;
          case 35: cad += "Z"; break;
        }
       } else{
          cad += nuevo;
        }
      numero = numero/base;
    }
		//Volteamos la cadena
    String invertida = "";
    int i = cad.length() - 1;
    while(i >= 0) {
      invertida += cad.charAt(i);
      i--;
    }
    return invertida;
  }
  
  /**
   * Método principal main
   * Se mostrarán los números del 1 al 35 en las bases del 2 al 36.
   * Se omitió la base 1 ya que esta proboca que se cicle ya que la división de
   * 1/1 siempre devuelve como residuo 1.
   * @param args -- Argumentos de la línea de comandos
   */
  public static void main(String[] args) {
    Convertir play;
    for(int i = 1; i < 36; i++) {
      System.out.println("NÚMERO " + i + "\n");
      for(int j = 2; j <= 36; j++) {
        play = new Convertir(i,j);
        System.out.println("Base " + j + ": "+ play.convierte());
      }
      System.out.println("****************************");
    }
  }
}