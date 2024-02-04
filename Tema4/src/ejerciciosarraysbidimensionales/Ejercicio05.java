package ejerciciosarraysbidimensionales;

import java.util.Random;

public class Ejercicio05 {
	// creamos un objeto de la clase random
	static Random rn = new Random();


	public static void main(String[] args) {
		// creamos la tabla
		int[][] tabla;
		// creamos la variable de la suma parcial de filas
		int sumaFilas = 0;
		int sumaCol = 0;
		int sumaTotal = 0;

		tabla = tablaAleatoria();

		// imrpimimos el resultado
		for (int i = 0; i < tabla.length; i++) {
			sumaFilas = 0;
			sumaCol = 0;
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + "\t");
				sumaFilas += tabla[i][j];	
				sumaTotal += sumaFilas;
			} // fin bucle i
			// imprimimos la suma parcial de las filas
			System.out.println(sumaFilas);
		} // fin bucle j
		
		for (int i = 0; i < tabla.length; i++) {
			sumaCol = 0;
			for (int j = 0; j < tabla[i].length; j++) {
				sumaCol += tabla[j][i];
				sumaTotal += sumaCol;
						
			} // fin bucle i
			// imprimimos la suma parcial de las filas
			System.out.print(sumaCol + "\t");	
		} // fin bucle j
		System.out.print(sumaTotal + "\t");

	}

	static int[][] tablaAleatoria() {
		int[][] tabla = new int[4][4];
		
		// RELLENAMOS LA TABLA
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = rn.nextInt(100, 1000);
			} // fin bucle i
		} // fin bucle j

		return tabla;
	}

}
