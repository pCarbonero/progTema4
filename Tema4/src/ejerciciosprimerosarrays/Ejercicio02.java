package ejerciciosprimerosarrays;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// creamos la variable que almacena el numero solicitado al usuario
		double num;		
		// creamos la tabla que almacena todos los numeros decimales 
		double tabla[] = new double[5];
		// creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		// creamos un bucle que pide al usuario los números y lso almacena
		for (int i = 0; i < tabla.length; i++) {
			// preguntamos por el número
			System.out.println("Dime un número decimal ");
			num = sc.nextDouble();
			
			// almacenamos el número decimal en el indice que nos encontremos del array
			tabla[i] = num;
		}
		
		// creamos un bucle for each que imprimirá el resultado
		for(double numero : tabla) {
			System.out.println(numero);
		}
		
		sc.close();
	}

}
