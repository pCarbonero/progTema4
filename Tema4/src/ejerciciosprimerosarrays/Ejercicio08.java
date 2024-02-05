package ejerciciosprimerosarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// creamos un array de tamaño 100
		int[] tabla = new int[100];
		// creamos el escaner
		Scanner sc = new Scanner(System.in);
		// creamos variable aora almacenar el número que buscamos
		int numBuscado;
		
		// bucle para rellenar la tablña con numeros aleatorios
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int)((1+Math.random()*10));			
		}
		
		System.out.println(Arrays.toString(tabla));
		
		// pedimos al usuario el número
		System.out.println("Dime un número y lo biscamremos en la tabla ");
		numBuscado = sc.nextInt();
		
		// bucle que busca el número e imprime el resultado
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] == numBuscado) {
				System.out.println(numBuscado + " se encuentra en la posición " + i);
			}		
		}

	}	

}
