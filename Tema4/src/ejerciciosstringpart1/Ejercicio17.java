package ejerciciosstringpart1;

public class Ejercicio17 {

	public static void main(String[] args) {
		
		String sentencia = "if (a==3) /* igual a tres */ a++; /* incrementamos a */";
		String sentenciaNoComents = delComents(sentencia);
		System.out.println(sentenciaNoComents);

	}

	/**
	 * Metodo que se encarga de elemininar los comentariso de la sentencia
	 * @param sentencia
	 * @return devuelve la cadena con las partes eliminadas deseadas
	 */
	static String delComents(String sentencia) {
		/**
		 * igualamos la nueva cadena con la qeu recibe el metodo por parámetros
		 */
		String sentenciaNoComents = sentencia;
		/**
		 * Creamos una cadena que nos ayudará a encontrar las partes que queremos borrar
		 */
		String aux;

		/**
		 * bucle while que mientras que la cadena que modificamso contenga algo que indica que hay comentarios se repetirá
		 */
		while (sentenciaNoComents.contains("/*")) {
			// igualamos aux a el trozo que deseamos borrar
			aux = sentenciaNoComents.substring(sentenciaNoComents.indexOf("/*"), sentenciaNoComents.indexOf("*/")+2);
			// sustituimos ese trozo por nada
			sentenciaNoComents = sentenciaNoComents.replace(aux, "");
		}
		// devolvemos la cadena resultante
		return sentenciaNoComents;
	}

}
