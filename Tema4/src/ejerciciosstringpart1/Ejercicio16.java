package ejerciciosstringpart1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		// string para la palabra principalk
		String palabra = "";
		// cadena para el anagrama
		String anagrama = "";
		// string para la respuesta
		String res = "";
		// scanner
		Scanner sc = new Scanner(System.in);
		//
		int contador = 0;

		// preguntamos al primer usuario por la palabra
		System.out.println("ESCRIBE PALABRA");
		palabra = sc.nextLine();

		do {
			anagrama = desordena(palabra);
			// System.out.println(desordena(palabra));
			System.out.println(anagrama);
			// pedimos al jugador 2 por una palabra
			System.out.println("¿Cuál crees que es la palabra original?");
			res = sc.nextLine();

			// 
			for (int i = 0; i < res.length(); i++) {
				if (res.charAt(i) == palabra.charAt(i)) {
					contador++;
				}
			}

			//
			System.out.println("Acertaste " + contador + " letras");
			// llamamos de nuevo a la función
			anagrama = desordena(palabra);
			//
			contador = 0;
		} while (!palabra.equals(res));

		// IMPRIMIMOS MENSAJE DE FINAL
		System.out.println("Es correcto");

		// cerramps el escaner
		sc.close();

	}

	static String desordena(String palabra) {
		// string para el anagrama
		String anagrama = "";
		// Convertir el texto a un array de caracteres
		char[] caracteres = palabra.toCharArray();
		// int para el indice aleatorio
		int indiceAleatorio;
		// objeto de la clase random
		Random rand = new Random();
		// creamos un array con la longitud de la palabra
		char[] aux = new char[caracteres.length];
		// llenamos el array con espacios
		Arrays.fill(aux, ' ');

		// bucle que va a rellenar el array del anagrama
		for (int i = 0; i < caracteres.length; i++) {
			// generamo el indice aleatorio
			indiceAleatorio = rand.nextInt(0, caracteres.length);
			// si el indice del array aux no es un espacio es que esa letra ya se a colocado
			// para que funcione bien el bucle while buscará un nuevo indice qeu no esté
			// ocupado
			while (aux[indiceAleatorio] != ' ') {
				// buscamos de nuevo el numero
				indiceAleatorio = rand.nextInt(0, caracteres.length);
			}
			// asignamos el caracter al espacio
			aux[indiceAleatorio] = caracteres[i];
		}

		// Convertir el array de nuevo a un String
		anagrama = anagrama.valueOf(aux);
		// devolvemos la palabra transformada
		return anagrama;
	}

}
