package ejerciciosstringpart1;


public class Ejercicio19 {

	public static void main(String[] args) {
		// String 
		String frase = "Hola qUe taAl esTAs";
		String fraseCamel = toCamel(frase);
		
		System.out.println(fraseCamel);

	}

	static String toCamel(String frase) {
		String fraseCamel = "";
		// array
		String[] palabras = frase.toLowerCase().split(" ");


		for (int i = 0; i < palabras.length; i++) {
			
			if (i != 0) {
				palabras[i] = palabras[i].replace(palabras[i].charAt(0), palabras[i].toUpperCase().charAt(0)); // palabras[i].charAt(0);
			}
			fraseCamel += palabras[i];
		}

		return fraseCamel;
	}

}
