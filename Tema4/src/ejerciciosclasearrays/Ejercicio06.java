package ejerciciosclasearrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// creamos la tabla de tamaño 1000
		int tabla[] = new int[1000];
		// creamos el escaner 
		Scanner sc = new Scanner(System.in);
		// variable para almacenar el numero que queremos buscar
		int num;
		// contador para la cantidad de veces que se ha generado el número
		int contador = 0;
		
		// creamos el bucle para rellenar la tabla
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random()*100);
		}
		
		// pedimos al usuario un número
		System.out.println("Dime un número ");
		num = sc.nextInt();
		
		// bucle que buscará en cada índice del array si está el número que buscamos
		for (int i = 0; i < tabla.length; i++) {
			// si el valor del indice de la tabla es igual a num aumentamos en 1 el contador 
			if (num == tabla[i]) {
				contador++;
			}
		}// fin bucle
		
		// imprimimos los resultdos
		System.out.println(Arrays.toString(tabla));
		
		System.out.println("Se ha el número " + num + " un total de " + contador + " veces");
		
		// cerramos el escaner
		sc.close();
	}

}
