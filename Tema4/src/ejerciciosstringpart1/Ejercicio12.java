package ejerciciosstringpart1;

public class Ejercicio12 {

	public static void main(String[] args) {
		// creamos string que contendrá la frase
		String frase = "A violin with no hands plays symphonies with no words";
		
		// creamos un array que contyendrá las paalabras separadas de la frase
		String[] palabras = frase.split(" ");
		
		// creamos un array que contrendrá la palabra mas larga
		String palabraLarga = "";
		
		
		// bucle que comprueba cada palabra
		for (int i = 0; i < palabras.length; i++) {
			// si la palabra del indice es mas larga que la pàlabra mas larga esa se convierte en la palabra mas larga
			if (palabras[i].length() > palabraLarga.length()) {
				palabraLarga = palabras[i];
			}
		}
		// imprimimos la longitodde la cadena	
		System.out.println(palabraLarga.length());
		// imprimimos la palabra
		System.out.println(palabraLarga);

	}

}
