package ejerciciosstringpart1;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// string para la palabra principalk
		String palabra = "";
		// cadena para el anagrama
		String anagrama = "";
		// scanner
		Scanner sc = new Scanner(System.in);

		// preguntamos al primer usuario por la palabra
		System.out.println("ESCRIBE PALABRA");
		palabra = sc.nextLine();

		anagrama = desordena(palabra);
		System.out.println(anagrama);
		
		sc.close();

	}

	static String desordena(String palabra) {
		String anagrama = "";
		// Convertir el texto a un array de caracteres
		char[] caracteres = palabra.toCharArray();
		// 
		int indiceAleatorio;
		//
		char temporal;
		//
		char[] otro = new char[caracteres.length];
		// 
		Random rand = new Random();
		
		//
		for (int i = 0; i < caracteres.length; i++) {
			indiceAleatorio = rand.nextInt(i + 1);

			// Intercambiar los caracteres en las posiciones i e indiceAleatorio
			otro[i] = caracteres[indiceAleatorio];

			anagrama += otro[i];
		}
		

		// Convertir el array de nuevo a un String
		return anagrama;
	}

}
