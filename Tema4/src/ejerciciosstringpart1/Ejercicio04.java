package ejerciciosstringpart1;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// creamos el string de la frase que hay que leer
		String frase;
		// creamos el escaner
		Scanner sc = new Scanner(System.in);
		// creamos un array para ordenar la cadena alfabticamente
		String[] palabras;
		
		// pedimos al usuario la frase
		System.out.println("Intoduce una frase ");
		frase = sc.nextLine();
		
		// relleanmos el array con cada palabra
		palabras = frase.split(" ");	
		
		// ordenamos el array
		Arrays.sort(palabras);
		
		// imrpimimos el array ordenado
		//System.out.println(Arrays.toString(palabras));
		
		// bucle for para imprimir cada palabra
		for (int i = 0; i < palabras.length; i++) {
			System.out.print(palabras[i] + " ");
		}
		
		// cerramos el escaner
		sc.close();
	}// main

}
