import java.util.Random;

/**
 * PaqueteCartas.java
 * La clase PaqueteCartas representa un paquete de cartas de juego.
 * @author Manuel Soto Romero
 * @version 1.0 Octubre 2014
 */
public class PaqueteCartas {

   /**
    * Arreglo de objetos Carta.
    */
   private Carta[] paquete;

   /**
    * Subíndice de la siguiente Carta a repartir (0 a 51).
    */
   private int cartaActual;

   /**
    * Número constante de cartas.
    */
   private static final int NUMERO_CARTAS = 52;

   /**
    * Generador de números aleatorios.
    */
   private static final Random aleatorios = new Random();

   /**
    * Constructor por omisión.
    */
   public PaqueteCartas() {
      String[] caras = {"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", 
         "Siete", "Ocho", "Nueve", "Diez", "Joto", "Quina", "Rey"};
      String[] palos = {"Corazones", "Diamantes", "Treboles", "Espadas"};

      paquete = new Carta[NUMERO_CARTAS]; // inicializa el arreglo
      
      cartaActual = 0; // para obtener la primera carta (paquete[0])

      /* Llenamos el paquete con objetos Carta */
      for (int i = 0; i < paquete.length; i++) 
         paquete[i] = new Carta(caras[i % 13], palos[i / 13]);
   }

   /**
    * Barajea el paquete de Cartas con algoritmo de una pasada.
    */
   public void barajea() {
      /* Después de barajear, la repartición debe empezar en paquete[0] otra 
         vez. */
      cartaActual = 0;

      /* Para cada Carta, selecciona otra Carta aleatoria (0 a 51) y las
         intercambia */
      for (int i = 0; i  < paquete.length; i++) {
         /* Selecciona un número aleatorio entre 0 y 51 */
         int nueva = aleatorios.nextInt(NUMERO_CARTAS);

         /* Intercambia Carta catual con la carta seleccionada al azar */
         Carta aux = paquete[i];
         paquete[i] = paquete[nueva];
         paquete[nueva] = aux;
      }
   }

   /**
    * Reparte una carta.
    * @return Carta - Carta que toma del paquete.
    */
   public Carta reparteCarta() {
      /* Determina si aún hay cartas */
      if (cartaActual < paquete.length)
         return paquete[cartaActual++];
      else
         return null;
   }

   /**
    * Método main para probar nuestro paquete.
    */
   public static void main(String[] args) {
      PaqueteCartas pc = new PaqueteCartas();
      pc.barajea(); // coloca las Cartas en orden aleatorio

      /* Imprime las 52 Cartas en el orden en que se reparten */
      for (int i = 1; i <= 52; i++) {
         System.out.printf("%-19s", pc.reparteCarta());

         if (i % 4 == 0)
            System.out.println();
      }
   }
}