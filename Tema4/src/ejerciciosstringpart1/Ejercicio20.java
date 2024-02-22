package ejerciciosstringpart1;

import java.util.Arrays;

public class Ejercicio20 {

	public static void main(String[] args) {
		String[] separacion = separador("Destornillador", 4);
		System.out.println(Arrays.toString(separacion));

	}

	/**
	 * Metodo que se encarda de dividir las palabras de la forma deseada
	 * @param palabra
	 * @param numLetras
	 * @return
	 */
	static String[] separador(String palabra, int numLetras) {
		// igualamos la variable a la mitad del numero de letras redondeado hacia arruba
		int tam = (int) Math.ceil((double) palabra.length() / numLetras);
		// IGUALAMOS la longitud del array a tam
		String[] separacion = new String[tam];

		// bucle para dividir las letras
		for (int i = 0; i < separacion.length; i++) {

			if (numLetras * (i + 1) > palabra.length()) {
				separacion[i] = palabra.substring(numLetras * i);
			} else {
				separacion[i] = palabra.substring(numLetras * i, numLetras * (i + 1));
			}
		}

		return separacion;
	}

}
