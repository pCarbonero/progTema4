package ejerciciosstringpart1;

public class Ejercicio18 {

	public static void main(String[] args) {
		// String
		String titulo = "Heavy Metal";
		String parrafo = "El deathCore mola el deathMetal es de parguelas";
		// llamamos a el metodo e igualamos la cadena que devuelve a la cadena codHtml
		String codHtml = convertToHtml(titulo, parrafo);
		System.out.println(codHtml);
		

	}
	
	/**
	 * Método que convierte las cadenas en una cadena con las etiquetas
	 * @param titulo
	 * @param parrafo
	 * @return
	 */
	static String convertToHtml(String titulo, String parrafo) {
		// creamos una cadena para el codigo final
		String codigo = "";
		// añadimos a ese String los textos deseados
		codigo = "<h1>" + titulo + "</h1>" + "\n" + "<p>" + parrafo + "</p>";
		// devolvemos la cadena resultante
		return codigo;
	}

}
