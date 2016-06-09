import java.util.Date;

/**
 * Clase para manejar un reloj con apoyo de la clase Date
 * de Java.
 * @author Manuel Soto Romero
 * @version 1.00 Junio 2014
 */
public class Reloj {

	/**
	 * Objeto Date para obtener las fechas.
	 */
	private Date fecha;

	/**
	 * Constructor por omisión.
	 * Inicializa los atributos en un estado válido.
	 */
	public Reloj() {
		this.fecha = new Date();
	}

	/**
	 * Devuelve la hora en Buenos Aires.
	 * @return Cadena con la hora en Buenos Aires.
	 */
	public String horaBuenosAires() {
		return daHora(3);
	}

	/**
	 * Devuelve la hora en Canberra.
	 * @return Cadena con la hora en Caberra.
	 */
	public String horaCanberra() {
		return daHora(16);
	}

	/**
	 * Devuelve la hora en Brazilia.
	 * @return Cadena con la hora en Brazilia.
	 */
	public String horaBrazilia() {
		return daHora(2);
	}

	/**
	 * Devuelve la hora en Otawa.
	 * @return Cadena con la hora en Otawa.
	 */
	public String horaOtawa() {
		return daHora(2);
	}

	/**
	 * Devuelve la hora en Santiado.
	 * @return Cadena con la hora en Santiago.
	 */
	public String horaSantiago() {
		return daHora(2);
	}

	/**
	 * Devuelve la hora en Bogotá.
	 * @return Cadena con la hora en Bogotá.
	 */
	public String horaBogota() {
		return daHora(1);
	}

	/**
	 * Devuelve la hora en La Habana.
	 * @return Cadena con la hora en La Habana.
	 */
	public String horaLaHabana() {
		return daHora(1);
	}

	/**
	 * Devuelve la hora en Madrid.
	 * @return Cadena con la hora en Madrid.
	 */
	public String horaMadrid() {
		return daHora(7);
	}

	/**
	 * Devuelve la hora en París.
	 * @return Cadena con la hora en París.
	 */
	public String horaParis() {
		return daHora(7);
	}

	/**
	 * Devuelve la hora en Tokio.
	 * @return Cadena con la hora en Tokio.
	 */
	public String horaTokio() {
		return daHora(15);
	}

	/**
	 * Devuelve la hora en México D.F.
	 * @return Cadena con la hora en México D.F.
	 */
	public String horaMexicoDF() {
		return daHora(0);
	}

	/**
	 * Devuelve la hora en Nueva York.
	 * @return Cadena con la hora en Nueva York.
	 */
	public String horaNuevaYork() {
		return daHora(1);
	}

	private String daHora(int param) {
		if (param < 0) // validamos el parámetro
			param = 0;
		int i = (fecha.getHours() + param) % 24;
		String str1 = Integer.toString(i); // obtiene la hora
		if (str1.length() == 1) // agrega un 0 para mejorar el formato
			str1 = "0" + str1;
		String str2 = Integer.toString(fecha.getMinutes()); // obtiene los minutos
		if (str2.length() == 1)
			str2 = "0" + str2; // mejora el formato
		return str1 + ":" + str2 + "hrs"; // regresa la hora con formato
	}
}