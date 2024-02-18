package ejerciciosstringpart1;

import java.util.Arrays;

public class Ejercicio13 {

	public static void main(String[] args) {
		// string de las dos palabras
		String palabra1 = "amor";
		String palabra2 = "ramo";
		
		boolean esAnagrama = esAnagrama(palabra1, palabra2);
		
		
		System.out.println(esAnagrama);
		
	}

	/**
	 * 
	 * @param palabra1
	 * @param palabra2
	 * @return
	 */
	static boolean esAnagrama(String palabra1, String palabra2) {
		boolean esAnagrama = false;
		char[] char1;
		char[] char2;
		
		// convertimos las palabras a arrays de caracteres
		char1 = palabra1.toCharArray();
		char2 = palabra2.toCharArray();
		
		// ordenamos los arrays
		Arrays.sort(char1);
		Arrays.sort(char2);
		
		// si son iguales es que es un anagrama
		if (Arrays.equals(char1, char2)) {
			esAnagrama = true;
		}

		return esAnagrama;
	}
}
