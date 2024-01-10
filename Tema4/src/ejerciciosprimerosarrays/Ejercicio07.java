package ejerciciosprimerosarrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// variable para almacenar la temperatura media de cada mes
		double media;
		// creamos el escaner
		Scanner sc = new Scanner(System.in);
		// tabla para almacenar las temperaturas
		double temperatura[] = new double[12];
		// escaner para los meses
		String meses[] = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre",
				"octubre", "noviembre", "diciembre" };

		// bucle para registrar las temperaturas de cada mes
		for (int i = 0; i < temperatura.length; i++) {
			// pedimos la temperatura al usuario
			System.out.println("Temperatura en " + meses[i]);
			media = sc.nextDouble();

			temperatura[i] = media;
		}

		for (int i = 0; i < meses.length; i++) {
			System.out.print(meses[i] + ":");
			for (double j = 0; j < temperatura[i]; j++) {
				// System.out.print("\t");
				System.out.print("*");
			}
			System.out.println("");		
		}

	}

}
