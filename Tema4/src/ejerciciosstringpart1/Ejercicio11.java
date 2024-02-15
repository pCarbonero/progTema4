package ejerciciosstringpart1;

public class Ejercicio11 {

	public static void main(String[] args) {
		/**
		 * Creamos los conjuntos de caracteres en lso arrays
		 */
        char conjunto1[] = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};
        char conjunto2[] = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};

        // Creamos un string que contiene la palabara que queremos codificar
        String palabra = "matqvko";

        //  Creamos un string que contendrá la palabara codificada
        String codificado ="";
		char nuevoCaracter = ' ';
		
		// bucle que llama a la función codifica y va formando la nueva cadena
		for (int i = 0; i < palabra.length(); i++) {
			// igualamos nuevoCaracter al caracter del índice en el que nos encontramos
			nuevoCaracter = palabra.charAt(i);
			// aladimos a la cadena el caracter que devuelve la función
			codificado += codifica(conjunto1, conjunto2, nuevoCaracter);
		}
	
        // imprimimos el resultado
		System.out.println(codificado);
		

	}

	static char codifica(char conjunto1[],char conjunto2[], char c) {
		// caracter que será el caracter que recibe la función pero en minus
		char caracterMinus = Character.toLowerCase(c);
		// bucle que comprueba si el caracter está en el conjunto 1 y lo transforma al equivalente en el conjuto 2
		for (int i = 0; i < conjunto1.length; i++) {
			if (caracterMinus == conjunto1[i]) {
				c = conjunto2[i];
			}						
		}
		
		// devolvemos el caracter final
		return c;
	}

}
