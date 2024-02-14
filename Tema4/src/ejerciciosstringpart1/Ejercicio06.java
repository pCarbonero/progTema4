package ejerciciosstringpart1;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// variable String que se le irán sumando las distintas palabras
		String frase = "";
		// variable para almacenar las palabras
		String palabra = "";
		// creamos un objeto de la clas Scanner
		Scanner sc = new Scanner(System.in);

		// bucle do while que se repite si no se quiere terminar
		while (!palabra.equalsIgnoreCase("fin")) {
			sc.nextLine();
			frase += palabra + " ";
			// preguntamos al usuario por la palabra
			System.out.println("Introduce una palabra");
			palabra = sc.next();
		}

		// imprimimos la frase fina
		System.out.println(frase);
		// cerramos el escaner
		sc.close();
	}

}
