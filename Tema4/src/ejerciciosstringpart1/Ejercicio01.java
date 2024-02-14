package ejerciciosstringpart1;

public class Ejercicio01 {

	public static void main(String[] args) {
		// creamos los strings
		String  frase1 = "Understand I bow to nothing ";
		String frase2 = "Comprehend I'm through with running";	
		// trign para el resultado
		String res = "Son igual de largas ";
		
		// creamos un if else para comprobar si ambas cadenas son igual de largas
		if (frase1.length() != frase2.length()) {
			// si no son igual de larags utilizamos un ternario para comprobar cual es mas larga
			res = (frase1.length() > frase2.length()) ? "La primera es más larga":"La segunda es más larga";
		}
		// imrpimimos el resultado
		System.out.println(res);

	}
}
