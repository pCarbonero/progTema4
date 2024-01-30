package ejerciciosarraysbidimensionales;

public class Ejercicio03 {

	public static void main(String[] args) {
		// creamos la tabla bidimiensional
		int[][] tabla = new int[5][5];

		rellenaTabla(tabla);
		imprimeTabla(tabla);
	}

	public static void rellenaTabla(int[][] tabla) {

		for (int n = 0; n < tabla.length; n++) {
			for (int m = 0; m < tabla[n].length; m++) {
				tabla[n][m] = 10 * n + m;

			} // fin bucle m

		} // fin bucle n
	}// fin void
	
	public static void imprimeTabla(int[][] tabla) {

		for (int n = 0; n < tabla.length; n++) {
			for (int m = 0; m < tabla[n].length; m++) {
				System.out.print(tabla[n][m] + "\t");
			} // fin bucle m
			System.out.println(" ");
		} // fin bucle n
	}// fin imprime
	
	
	

}
