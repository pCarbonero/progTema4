package ejerciciosclasearrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Variable para lso dos números que pedimos al usuario
		int n, m;
		// Creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos el valro de n
		System.out.println("Dime un valor para el tamaño de la tabla ");
		// Guardamos el valro en al variable n
		n = sc.nextInt();	
		
		//Pedimos el valro de m
		System.out.println("Dime un valor para rellenar al tabla ");
		// Guardamos el valro en al variable m
		m = sc.nextInt();	
		
		
		// creamos array de tamaño n
		int tabla[] = new int[n];
		
		// rellenamos la tabla con m
		Arrays.fill(tabla, m);
		
		// imprimimos la tabla
		System.out.println(Arrays.toString(tabla));
		
		// cerramso el escaner
		sc.close();
	}

}
