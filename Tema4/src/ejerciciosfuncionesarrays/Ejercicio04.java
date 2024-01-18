package ejerciciosfuncionesarrays;

import java.util.Arrays;

public class Ejercicio04 {

	public static void main(String[] args) {
		// array
		int tabla[] = {1,2,3,4,5,6,7,8,9,10};
		// numero a buscar
		int num = 44;
		// res
		int res = 0;
		
		// funcion
		res = buscar(tabla, num);
		System.out.println(res);

	}
	
	// funcion que devuleve la posicion del indice
	public static int buscar(int t[], int clave) {
		int pos = -1;		
		
		// bucle que comprueba si el valor de la tabla t es el valor buscado
		for (int i = 0; i < t.length; i++) {
			// si 
			if (t[i] == clave) {
				pos = t[i];
			}			
		}
		// devuelve el valor de pos
		return pos;	
	}

}
