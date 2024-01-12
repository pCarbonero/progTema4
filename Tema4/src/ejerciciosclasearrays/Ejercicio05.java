package ejerciciosclasearrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Creamos una variable para almacenar la puntuacion
		int score;
		// escaner
		Scanner sc = new Scanner(System.in);
		// creamos la tabla para almacenar la puntucacion de todos los jugadores
		int tabla[] = new int[8];
		
		// bucle para registrar las puntucaiones de los jugadores en la tabla
		for (int i = 0; i < tabla.length; i++) {
			// preguntamos por la puntuacion de los jugadores
			System.out.println("Dime la puntuación del jugador ");
			score = sc.nextInt();
			// guardamos el valor en la tabla
			tabla[i] = score;	
		}// fin bucle

		// ordenamos la tabla de menor a mayor
		Arrays.sort(tabla);
		
		// bucle para mostrar las puntuaciones de forma descendiente
		for (int i = tabla.length-1; i >= 0; i--) {
			// mostamos la puntucaion
			System.out.println(tabla[i]);
		}
	}

}
