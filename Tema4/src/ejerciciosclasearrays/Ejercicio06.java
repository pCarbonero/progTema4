package ejerciciosclasearrays;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// creamos la tabla de tamaño 1000
		int tabla[] = new int[1000];
		// creamos el escaner 
		Scanner sc = new Scanner(System.in);
		
		// creamos el bucle para rellenar la tabla
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random()*100);
		}
		
		// pedimos al usuario un número
		System.out.println("Dime un número ");
	}

}
