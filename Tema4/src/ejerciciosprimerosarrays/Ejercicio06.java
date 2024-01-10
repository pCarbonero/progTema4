package ejerciciosprimerosarrays;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// variable que almacena el número insertado por el usuario
		int num;
		// escaner
		Scanner sc = new Scanner(System.in);
		// creamos el array de 10 
		int table[] = new int[8];

		
		// creamos un bucle para inertar los números
		for (int i = 0; i < table.length; i++) {
			// pedimos al usuari un número eneter
			System.out.println("Inserta un número entero ");
			num = sc.nextInt();		
			//guardamos el número insertado en el inidce del array en el que nos encontramos
			table[i] = num;	
		}
		
		// bucle for each para sumar los valores del array
		for(int numero : table) {
			if (numero%2 == 0 ) {
				System.out.println(numero + " par");
			}
			else {
				System.out.println(numero + " impar");
			}
		}

		//cerramos el escaner
		sc.close();
	}

}
