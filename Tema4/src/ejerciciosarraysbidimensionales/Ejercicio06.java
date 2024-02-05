package ejerciciosarraysbidimensionales;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio06 {

	public static void main(String[] args) {
		// creamos al tabla
		int [][] tabla = new int[6][10];
		// creamos un objeto de la clase random 
		Random rn = new Random();
		
		// bucle para rellenar la tabla
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = rn.nextInt(0, 1001);
			}
		}
		
		// llamamos a la funcion e imprimimos el array para mostrar el resultado
		System.out.println(Arrays.toString(maxAndMin(tabla)));

	}// fin main
	
	public static int[] maxAndMin(int[][] tabla) {
		// creamos yabla de una dimension
		int[] maxAndMin = new int[2];
		// variable para el numer maximo y minimo
		int max = Integer.MIN_VALUE;
		int	min = Integer.MAX_VALUE;
		
		// calculamos el max y min
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				if (tabla[i][j] <= min) {
					min = tabla[i][j];
				}// if st
				
				if (tabla[i][j] >= max) {
					max = tabla[i][j];
				}// if st
			}
		}// fin bucle
		
		// igualamos cada indice al valor correspondiente
		maxAndMin[0]= min;
		maxAndMin[1]= max;
		
		return maxAndMin;
		}

}
