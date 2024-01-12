package ejerciciosclasearrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// variable para el número que le pedimos al usuario
		int num;
		// Creamos el escaner
		Scanner sc = new Scanner(System.in);
		// creamos la primera tabla
		int tabla1[] = new int[10];
		// creamos la segunda tabla
		int tabla2[] = new int[10];
		
		// creeamos un bucle para rellenar la primera tabla
		for (int i = 0; i < tabla1.length; i++) {
			// Pedimos los números para la primera tabla
			System.out.println("Dime un número para la priera tabla ");
			num = sc.nextInt();
			tabla1[i] = num;
		}
		
		// creeamos un bucle para rellenar la segunda tabla
		for (int i = 0; i < tabla2.length; i++) {
			// Pedimos los números para la primera tabla
			System.out.println("Dime un número para la segunda tabla ");
			num = sc.nextInt();
			tabla2[i] = num;
		}
		
		// comprobamos si lso dos arrays son iguales
		if (Arrays.equals(tabla1, tabla2)) {
			System.out.println("SON IGUALES :) ");
		}
		else
			System.out.println("SON DIFeReNTES J ");
		
		
	}

}
