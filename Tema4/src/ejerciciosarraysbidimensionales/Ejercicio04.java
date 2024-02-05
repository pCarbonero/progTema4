package ejerciciosarraysbidimensionales;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Creamos la tabla 10x10
		int[][] tabla = new int[10][10];

		// llamamos a la tabla y la igualamos a la tabla del main
		
		tabla.equals(tablasDeMultiplicar(tabla));

		
		// imrpimimos el resultado
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + "\t");
			} // fin bucle i
			System.out.println(" ");
		} // fin bucle j

	}// fin main

	static int[][] tablasDeMultiplicar(int[][] tabla) {
		// int[][] tablaMultiplicar = new int[10][10];

		// bucle para rellenar la tabla
		for (int i = 0; i < tabla.length; i++) {
			// bucle que rellena cada fila con cada multiplidcacion
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = (i+1) * (j+1);
			}
		}

		return tabla;
	}

}// fin class
