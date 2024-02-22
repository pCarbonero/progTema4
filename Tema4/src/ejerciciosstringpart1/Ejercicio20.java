package ejerciciosstringpart1;

import java.util.Arrays;

public class Ejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] separacion = separador("Destornillador", 4);
		System.out.println(Arrays.toString(separacion));

	}

	static String[] separador(String palabra, int numLetras) {
		int tam = (int) Math.ceil((double) palabra.length() / numLetras);

		String[] separacion = new String[tam];
		// System.out.println(Arrays.toString(separacion));
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
