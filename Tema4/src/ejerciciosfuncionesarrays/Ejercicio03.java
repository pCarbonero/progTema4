package ejerciciosfuncionesarrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// creamos una tabla para el resultado
		int res[];
		// creamos variables para la longitud y el numero maximo que va  a ganerarse
		int longitud = 0, fin = 0;
		// creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		// preguntamos por la longitu
		System.out.println("Inserta la longitud de la tabla ");
		longitud = sc.nextInt();
				
		// preguntamos por el numero
		System.out.println("Inserta el numero maximo que se pueda insertar en la tabla ");
		fin = sc.nextInt();
		
		
		// llamamos a la funcion y guardamos la tabla que devuelve en res[]
		res = rellenaPares(longitud, fin);
		System.out.println(Arrays.toString(res));

		// cerramos el escaner
		sc.close();
	}// fin main
	
	public static int[] rellenaPares(int longitud, int fin) {
		// creamos la tabla de longitud igual al parámetro longitud
		int tabla[] = new int[longitud];
		// creamos un objeto de la clase Random
		Random rn = new Random();
		// variable para el número aleatorio
		int randNum;
		// variable para el contador del while
		int i = 0;
		
		// creamo un bucle que genera el número aleatorio y lo añade al arraya si cumple las condiciones
		while (i<tabla.length) {
			// creamos y guardamos el núemro aleatorio
			randNum = rn.nextInt(2, fin+1);
			// si el número generado es divisible entre dos (es par) y lo añadimos al array
			if (randNum%2 == 0) {
				tabla[i] = randNum;
				i++;
			}
		}
		
		// ordenamos la tabla final
		Arrays.sort(tabla);
		
		return tabla;	
	}

}
