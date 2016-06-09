package icc.practica3;

/**
 * Programa para simular que un Dado es lanzado.
 * @author Manuel Soto Romero
 * @version 1.00 Junio 2014
 */
public class Dado {

	/**
	 * Lanza un dado.
	 * @return un número del 1 al 6.
	 */
	public int lanza() {
		return (int) (Math.random() * 600.0D) % 6 + 1;
	}
}