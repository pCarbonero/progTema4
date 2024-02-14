package ejerciciosstringpart1;

public class Ejercicio03 {

	public static void main(String[] args) {
		// CREAmos las frase que vamos a comprobar
		String frase = "Where did you learn what it means to reciprocate?";
		// variable int para el numero de espacios
		int numEspacios = 0;
		
		numEspacios = cuentaEspacios(frase);
		
		// imrpimimos el resutlado
		System.out.println("Hay " + numEspacios + " espacios en la frase");

	}// main

	
	static int cuentaEspacios (String frase) {
		int contador = 0;
		
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == ' ') {
				contador++;
			}
		}
		
		return contador;
	}
}// class
