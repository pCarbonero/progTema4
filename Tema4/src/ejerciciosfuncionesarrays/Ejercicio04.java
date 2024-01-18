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
	
	public static int buscar(int t[], int clave) {
		int pos = 0;		
		
		for (int i = 0; i < t.length; i++) {
			if (t[i] == clave) {
				pos = t[i];
			}			
		}
		if (pos == 0)
			pos = -1;

		return pos;	
	}

}
