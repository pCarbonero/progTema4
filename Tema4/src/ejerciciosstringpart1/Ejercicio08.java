package ejerciciosstringpart1;

public class Ejercicio08 {

	public static void main(String[] args) {
		// creamos un string para la frase
		String frase = "Dabale arroz a la zorra el abad";
		
		// creamos booleana para sabe rsi es 
		boolean esPalindroma = compruebaPalindroma(frase);
		
		// imprimimos el resuktado
		System.out.println(esPalindroma);
	}
	
	static boolean compruebaPalindroma (String frase) {
		boolean esPalindroma = true;
		String newFrase = "";
		
		// bucle para crear la frase sin espacios
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) != ' ') {
				newFrase += frase.charAt(i);
			}
		}
		
		// convertimos la frase a minusculas para que no haya errores
		newFrase = newFrase.toLowerCase();
		
		// bucle para comprobarr el primer caracter de la frase
		for (int i = 0; i < newFrase.length(); i++) {
			// si algun caracter no coincide hacemos la boolean false
			if (newFrase.charAt(i) != newFrase.charAt((newFrase.length()-(i+1)))) {
				esPalindroma = false;
			}
		}// for i
		
		// devolvemos el valor de la boolean
		return esPalindroma;
	}

}
