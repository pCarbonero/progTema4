package ejerciciosfuncionesarrays;

import java.util.Arrays;

public class Ejercicio04 {

	public static void main(String[] args) {
		// array
		int tabla[] = {1,2,3,4,5,6,7,8,9,10};
		// numero a buscar
		int num = 88;
		// res
		int res = 0;
		
		// ordenamos tabla
		Arrays.sort(tabla);
		// funcion
		res = buscar(tabla, num);
		System.out.println(res);

	}
	
	public static int buscar(int t[], int clave) {
		int pos = -1;		
		pos = Arrays.binarySearch(t, clave);	
		if (pos<0) {
			pos = -1;
		}
		return pos;	
	}

}
