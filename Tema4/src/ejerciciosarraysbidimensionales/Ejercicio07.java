package ejerciciosarraysbidimensionales;

import java.util.Random;

public class Ejercicio07 {

	public static void main(String[] args) {
		// creamos un array que será la tabla principal
		int [][] tabla = new int[4][4];
		// creamos un array para guardar el resutado
		int [][] nuevaTabla = new int[tabla[0].length][tabla.length];
		// creamos un objeto de la clase random
		Random rn = new Random();
		
		// rellenamos la tabla principal con números aleatorios
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = rn.nextInt(0, 100);
			}
		}
		
		// mostramos la tabla por consola
		System.out.println("TABLA PRINCIPAL");
		System.out.println();
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + "\t");
			} // fin bucle i
			System.out.println(" ");
		} // fin bucle j*/
		
		// llamamos a la funcion transportaTabla
		nuevaTabla = transportaTabla(tabla);
		
		// imprimimos la tabla nueva
		System.out.println("NUEVA TABLA");
		System.out.println();
		for (int i = 0; i < nuevaTabla.length; i++) {
			for (int j = 0; j < nuevaTabla[i].length; j++) {
				System.out.print(nuevaTabla[i][j] + "\t");
			} // fin bucle i
			System.out.println(" ");
		} // fin bucle j*/
		
		
	}// fin main
	
	// creamos una funcion que va a transportar la primera tabla a otroa de la forma deseada
	public static int[][] transportaTabla(int[][] tabla) {
		// creamos un nuevo array que será la tabla nueva
		int [][] nuevaTabla = new int[tabla[0].length][tabla.length];
		
		//bucle para rellenar la tabla
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				nuevaTabla[i][j] = tabla[j][i];
			}
		}
		
		// la fucnión devuelve el resultado
		return nuevaTabla;
	}

}
