package ejerciciosclasearrays;

import java.util.Arrays;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Creamos el array de tamaño 30
		int tabla[] = new int[30];
		// creamos una variable para el número aleatorio
		int randNum;
		
		// bucle para rellenar los valores del array
		for (int i = 0; i < tabla.length; i++) {
			// igualamso el valor del indice a un valor aleatorio entre 0 y 9
			tabla[i] = (int)(Math.random()*10);
		}
		
		// ordenamos el array
		Arrays.sort(tabla);
		// imrpimimos el resultado
		System.out.println(Arrays.toString(tabla));
	}

}
