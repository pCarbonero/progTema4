package ejerciciosstringpart1;

import java.util.Arrays;
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
		Random rand = new Random();
		//
		char[] caracteres2 = new char[caracteres.length];

		//
		for (int i = 0; i < caracteres.length; i++) {
			indiceAleatorio = rand.nextInt(i + 1);

			if(caracteres[indiceAleatorio] != ' ') {
				caracteres2[i] = caracteres[indiceAleatorio];
				caracteres[indiceAleatorio] = ' ';
				System.out.println(caracteres[indiceAleatorio]);
			}


		}

		anagrama = anagrama.valueOf(caracteres2);
		// Convertir el array de nuevo a un String
		return anagrama;
	}

}
