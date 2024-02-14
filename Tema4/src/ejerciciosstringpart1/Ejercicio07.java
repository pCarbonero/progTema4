package ejerciciosstringpart1;

public class Ejercicio07 {

	public static void main(String[] args) {
		// variable apra la frase
		String frase = "Where did you learn what it means to reciprocate?";
		// variable para la palabra que vamos a buscar
		String palabra = "did";
		// int para contar cuanats veces sale esa palabra
		int numPalabra = 0;
		// lamamos a la funcion e igualamos la variable numPalabra a el valroque
		// devuelve
		numPalabra = buscaPalabra(frase, palabra);

		// devolvemos el resultado
		System.out.println("La palabra " + palabra + " aparece " + numPalabra + " veces");

	}// main

	static int buscaPalabra(String frase, String palabra) {
		int contador = 0;
		// creamo un array para separar las palabras
		String[] palabrasFrase = frase.split(" ");
		// bucle que va a comparar la palabra que buscamos con cada string del array,
		// que se compone de las palabrasde la frase
		for (int i = 0; i < palabrasFrase.length; i++) {
			// si la palabra coincide sumamos 1 al contador
			if (palabra.equals(palabrasFrase[i])) {
				contador++;
			}
		}
		// devolvemos el numero de palabras encontradas
		return contador;
	}

}// clase
