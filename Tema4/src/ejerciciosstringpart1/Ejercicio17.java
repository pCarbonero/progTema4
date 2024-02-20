package ejerciciosstringpart1;

public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubç
		String sentencia = "if (a==3) /* igual a tres */ a++; /* incrementamos a */";
		String sentenciaNoComents = delComents(sentencia);
		System.out.println(sentenciaNoComents);

	}

	static String delComents(String sentencia) {
		String sentenciaNoComents = sentencia;
		int cont = 0;
		String aux;

		while (sentenciaNoComents.contains("/*")) {
			aux = sentenciaNoComents.substring(sentenciaNoComents.indexOf("/*"), sentenciaNoComents.indexOf("*/")+2);
			sentenciaNoComents = sentenciaNoComents.replace(aux, "");
		}

		return sentenciaNoComents;
	}

}
