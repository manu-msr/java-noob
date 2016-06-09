import java.util.Scanner;

public class Cifrado {

	public static void main(String[] args) {
		
		/* Separar el número en dígitos */
		Scanner teclado = new Scanner(System.in);
		int numero;
     
     	int cuarto;
     	int tercero;
     	int segundo;
     	int primero;
             
        System.out.print("Escribe un numero de 4 digitos: \n" );
        numero = teclado.nextInt();
       	cuarto = ((numero % 10) + 7) % 10;
   
        numero = numero/10;
        tercero = ((numero % 10) + 7) % 10;
       
        numero = numero/10;
        segundo = ((numero % 10) + 7) % 10;
 
        numero = numero/10;
        primero = ((numero % 10) + 7) % 10;
 
        System.out.printf("El nuevo número es: " + tercero + cuarto + primero + segundo + "\n");
	}
}