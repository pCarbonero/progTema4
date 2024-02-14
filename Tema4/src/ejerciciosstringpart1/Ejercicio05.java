package ejerciciosstringpart1;

public class Ejercicio05 {

	public static void main(String[] args) {
		// creamos la varaible con al cadena original
		String frase = "Do you know what's worth fighting for";
		// cremos el String que va a almacenar la frase invertida
		String invertida;
		
		// igualamos invertida a la cadena que devuelve la funcion
		invertida = invierteFrase(frase);
		
		// imprimimos el resultado
		System.out.println(invertida);
	}
	
	static String invierteFrase(String frase) {
		// creamos una cadena para ir almacenando klos caracteres
		String invertida = "";
		
		// creamo un bucle que va a ir rellenando invertida con los caracteres invertidos
		for (int i = (frase.length()-1) ; i >= 0 ; i--) {		
			invertida += frase.charAt(i);
		}
		// devolvemos la frase invertida
		return invertida;
	}

}
