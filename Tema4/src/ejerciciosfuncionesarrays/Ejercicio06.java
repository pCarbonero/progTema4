package ejerciciosfuncionesarrays;

import java.util.Arrays;

public class Ejercicio06 {

	public static void main(String[] args) {
		// tabla
		int tabla[] = {10, 1, 5, 8, 9, 2 };
		// rs
		int resultado[];
		//
		int num = 3; 
				
		
		resultado = suma(tabla, num);

		System.out.println(Arrays.toString(resultado));
	}

	public static int[] suma(int t[], int numElementos) {
		// creamos la tabla que va a almacenar las sumas
		int suma[] = new int[t.length - (numElementos-1)];
		
		// bucle para almacenar el resultado en cada indice de i
		for (int i = 0; i < suma.length; i++) {
			// bucle que realiza la suam de los numeros deseado y los guarda
			for (int j = i; j < i+numElementos; j++) {
				suma[i] += t[j];
			}
		}
		
		// devolvemos la tabla finals
		return suma;		
	}
}
