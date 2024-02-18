package ejerciciosstringpart1;

public class Ejercicio14 {

	public static void main(String[] args) {
		// creamos string que contendrá la frase
		String frase = "A violin with no hands plays symphonies with no words";
		// creamos char para guardar la letra que vamos 
		int contador = 0;
		String letra = "";
		
		 // Eliminamos espacios en blanco y convertimos a minúsculas
		frase = frase.replace(" ", "");
		frase = frase.toLowerCase();
		
		
		for (int i = 0; i < frase.length(); i++) {
			contador = 0;
			letra = "";
			// comprobamos que la letra no sea un espacio
			if (frase.charAt(i) != ' ') {
				// Contamos la frecuencia de la letra actual en la cadena
				for (int j = 0; j < frase.length(); j++) {
					if (frase.charAt(i) == frase.charAt(j)) {
						contador++;
					}
				}
				 // Guardamos la letra actual en una variable
				letra = "" + frase.charAt(i);
				// Mostramos el resultado
				System.out.println(frase.charAt(i) + ":" + contador + " veces");
				// Eliminamos todas las ocurrencias de la letra actual en la cadena
				frase = frase.replace(letra, " ");
			}
		}

	}

}
