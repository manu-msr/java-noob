import java.util.ArrayList;
import java.util.Random;

/**
 * Clase que implementa el algoritmo de
 * Hailstone.
 * @author Manuel Soto Romero
 */
public class Hailstone {

	/**
	 * Algoritmo de Hailstore, regresa un número
	 * dependienodo si es par o impar.
	 * @param numero - Número a comparar.
	 */
	public int hailstone(int numero) {
		if (numero % 2 == 0)
			return numero / 2;
		return (3 * numero) + 1;
	}

	/**
	 * Prueba el algoritmo de Hailstore mientras
	 * no sea 1 y los va guardando en una lista.
	 * @param numero - Número a probar.
	 */
	public ArrayList<Integer> armaSucesion(int numero) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(numero);
		while (numero > 1) {
		  	numero = hailstone(numero);
			lista.add(numero); 
		}
		return lista;
	}

	/**
	 * Prueba el programa
	 */
	public static void main(String[] args) {
		Hailstone prueba = new Hailstone();
		Random random = new Random();
		int r = random.nextInt(10);
		ArrayList<Integer> lista = new ArrayList<Integer>();
		System.out.println("Probando la sucesión con: " + r);
		lista = prueba.armaSucesion(r);

		// mostrar los números
		System.out.println(lista);
	}
}