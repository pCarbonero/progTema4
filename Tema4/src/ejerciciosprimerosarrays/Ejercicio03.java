package ejerciciosprimerosarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// creamos una variable para almacenar el numero insertado por el usuario
		int num;
		// creamos el escaner
		Scanner sc = new Scanner(System.in);
		// creamos el array que almacenará lso 10 números
		int table[] = new int[10];
		
		System.out.println(table.length);
		// creamos un bucle que ksdfmmkfgandio
		for (int i = (table.length-1); i >= 0 ; i--) {
			// preguntamos al usuario por el número 
			System.out.println("Inserta un número entero ");
			// guardamos el núemro insertado en la variable num
			num = sc.nextInt();
			// guaradamos el número en el indice en el que nos encontramos del array
			table[i] = num;		
		}
		
		// mostramos el resultado por pantalla
		System.out.println(Arrays.toString(table));
		// cerramos el escaner
		sc.close();

	}

}
