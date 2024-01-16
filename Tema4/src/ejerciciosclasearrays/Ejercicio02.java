package ejerciciosclasearrays;

import java.util.Arrays;

public class Ejercicio02 {

	public static void main(String[] args) {
		// 
		int tabla[] = new int[55];
		//
		int inicio = 0, fin = 1;
		for (int i = 1; i <= 10; i++) {	
			//System.out.println(inicio+=i);
			Arrays.fill(tabla, inicio, tabla.length, i);	
			inicio+=i;
		}
		//System.out.println("");
		System.out.println(Arrays.toString(tabla));
	}

}
