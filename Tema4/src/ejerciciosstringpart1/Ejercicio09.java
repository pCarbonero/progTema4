package ejerciciosstringpart1;

/**
 * @author pcarbonero
 */
public class Ejercicio09 {

	public static void main(String[] args) {
		// string para la frase original
		String fraseJava1 = "Javalín, javalón		Hola como estas		";
		String fraseJava2 = "Hola como estas	javalén, len, len";
		// cremos string para guardar la frase traducida
		String fraseTraducida = "";
		
		//llamamos la funcion
		fraseTraducida = traductor(fraseJava1);
		
		// imrpimimos el resutado
		System.out.println(fraseTraducida);
	}
	
	/**
	 * Funcion que recive una frase, comprueba si está en el idioma de javalandia y se traduce
	 * @param frase
	 * @return la frase traducida
	 */
	static String traductor(String frase) {
		// string para guardar la frase traducida
		String fraseTraducida = "";
		// creamos constantes que contienen las caracteristicas del idioma de javlandia
		final String PREFIJO = "Javalín, javalón";
		final String SUFIJO = "javalén, len, len"; //|| frase.contains("javalén, len, len")
		
		// comprobamso si la frase tiene el prefijo o sufijo del idioma
		if (frase.startsWith(PREFIJO)) {
			// si lo tiene se sustituye esa parte por espacios
			fraseTraducida = frase.replace(PREFIJO, "");
		}
		else if (frase.endsWith(SUFIJO)) {
			// si lo tiene se sustituye esa parte por espacios
			fraseTraducida = frase.replace(SUFIJO, "");
		}
		
		// La frase con lso espacios utilizamos  trim para dejar la frase normal
		fraseTraducida = fraseTraducida.trim();
		
		// devolvemos la frase
		return fraseTraducida;
	}

}
