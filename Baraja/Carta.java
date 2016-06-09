/**
 * Carta.java
 * La clase Carta representa una carta de juego.
 * @author Manuel Soto Romero
 * @version 1.00 Octubre 2014
 */
public class Carta {

   /** 
    * Cara de la carta ("As", "Dos",...).
    */
   private String cara;

   /**
    * Palo de la carta ("Corazones", "Diamantes", ...).
    */
   private String palo;

   /**
    * Constructor a partir de dos parámetros.
    * @param cara Cara de la carta
    * @param palo Palo de la carta
    */
   public Carta(String cara, String palo) {
      this.cara = cara;
      this.palo = palo;
   }

   /**
    * Representación de una carta como cadena.
    * @return String - Carta en formato cadena
    */
   public String toString() {
      return cara + " de " + palo;
   }
}