package ejerciciosclasearrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio07 {

	public static void main(String[] args) {
		// creamos uan tabla para el numero de la apuesta
		int bet[] = new int[6];
		// creamos uan tabla para el numero ganador
		int win[] = new int[6];
		// creamos el objeto de la clase random para generar los números
		Random rd = new Random();
		// 
		int aciertos = 0;
		
		// bucle para la primera tabla
		for (int i = 0; i < win.length; i++) {	
			bet[i] = rd.nextInt(1,50);
		}

		// bucle para la segunda tabla
		for (int i = 0; i < win.length; i++) {	
			win[i] = rd.nextInt(1,50);
		}
		
        for (int numero : bet) {
            if (Arrays.binarySearch(win, numero) >= 0) {
                aciertos++;
            }
        }
        
        System.out.println(Arrays.toString(bet));
        System.out.println(Arrays.toString(win));
        System.out.println("Aciertos " + aciertos);
	}

}
