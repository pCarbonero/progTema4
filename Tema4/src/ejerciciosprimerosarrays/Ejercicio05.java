package ejerciciosprimerosarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// erbabd
		int max = Integer.MIN_VALUE;
		// minimo
		int min = Integer.MAX_VALUE;
		// variable que almacena el número insertado por el usuario
		int num;
		// escaner
		Scanner sc = new Scanner(System.in);
		// creamos el array de 10 
		int table[] = new int[10];
		// variable para la suma de todos los números
		int suma = 0;
		
		// creamos un bucle para inertar los números
		for (int i = 0; i < table.length; i++) {
			// pedimos al usuari un número eneter
			System.out.println("Inserta un número entero ");
			num = sc.nextInt();
			
			//guardamos el número insertado en el inidce del array en el que nos encontramos
			table[i] = num;	
			
			// comprobamos si el número es el maximo o el mínimo
			if (num > max) {
				max = num;
			}
			if (num<min) {
				min = num;
			}
		}
		
		// bucle for each para sumar los valores del array
		for(int numero : table) {
			suma += numero;
		}
		
		// mostramos el resultado
		System.out.println(Arrays.toString(table));
		System.out.println(suma);
		System.out.println("Max " + max);
		System.out.println("Min " + min);
		sc.close();
	}

}
