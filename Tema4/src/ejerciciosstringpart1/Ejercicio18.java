package ejerciciosstringpart1;

public class Ejercicio18 {

	public static void main(String[] args) {
		// String
		String titulo = "Heavy Metal";
		String parrafo = "El deathCore mola el deathMetal es de parguelas";
		String codHtml = convertToHtml(titulo, parrafo);
		System.out.println(codHtml);
		

	}
	
	static String convertToHtml(String titulo, String parrafo) {
		String codigo = "";
		codigo = "<h1>" + titulo + "</h1>" + "\n" + "<p>" + parrafo + "</p>";
		return codigo;
	}

}
