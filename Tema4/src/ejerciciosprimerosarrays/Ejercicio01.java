package ejerciciosprimerosarrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio01 {

	public static void main(String[] args) {
		//creamos un array de tipo int de 10 de longitud
		int tabla[] = new int[10];
		// creamos la variable para el random
		Random rn = new Random();
		
		//creamos bucle for que dará un valor aleatorio entre 1 y 100 a los indices del array
		for(int i = 0; i < tabla.length; i++) {
			tabla[i] = rn.nextInt(1,101);
		}
		
		//imprimimos el array
		System.out.println(Arrays.toString(tabla));
		

	}

}
