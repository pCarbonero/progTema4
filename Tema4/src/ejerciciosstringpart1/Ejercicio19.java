package ejerciciosstringpart1;


public class Ejercicio19 {

	public static void main(String[] args) {
		// String 
		String frase = "Hola qUe taAl esTAs";
		String fraseCamel = toCamel(frase);
		
		System.out.println(fraseCamel);

	}

	/**
	 * Metodo que convierte la frase a camel case
	 * @param frase
	 * @return
	 */
	static String toCamel(String frase) {
		// creamos String para la frase camel
		String fraseCamel = "";
		// array que alacena todas las palabras en minúsculas
		String[] palabras = frase.toLowerCase().split(" ");

		// bucle for que va a añadir todas las palabras del array al String de la fomra deseada
		for (int i = 0; i < palabras.length; i++) {
			// si i no es 0 no estamos en la priemra palabra por lo que añadimos la palabra del indice con la primera letra mayuscula
			if (i != 0) {
				palabras[i] = palabras[i].replace(palabras[i].charAt(0), palabras[i].toUpperCase().charAt(0)); // palabras[i].charAt(0);
			}
			// añadimos la palabra al string
			fraseCamel += palabras[i];
		}
		// devolvemos el string
		return fraseCamel;
	}

}
