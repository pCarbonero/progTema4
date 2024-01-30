package ejerciciosarraysbidimensionales;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// creamos la tabla para almacenar los alumnos y us calificaciones
		int[][]notas = new int[4][5];		
		// variable para almacenar la nota
		int nota;
		// variable para almacenar la nota maxima, minima y media
		int notaMax = 0, notaMin = 0, notaMedia = 0;
		// creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		
		// primer bucle para los alumnos
		for (int i= 0; i < notas.length; i++) {
			System.out.println("NOTAS ALUMNO");
			for (int j = 0; j < notas[i].length; j++) {
				// preguntamos por las notas del alumno
				System.out.println("Nota del alumno ");
				nota = sc.nextInt();
				notas[i][j] = nota;				
			}// fin for J
			
		}// fin for I
		
		// bucle for que imprime las filas
		for (int i = 0; i < notas.length; i++){
			System.out.print("Alumno " + (i+1) + "\t");
			for (int j = 0; j < notas[0].length; j++) {
				System.out.print(notas[i][j] + "\t");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		// calculo de notaMax, min y media
		for (int i = 0; i < notas.length; i++) {
			
			// inicializamos
			notaMin = Integer.MAX_VALUE;
			notaMax = Integer.MIN_VALUE;
            notaMedia = 0;
				
			for (int j = 0; j < notas[i].length; j++) {
				
				// min
				if (notas[i][j] <= notaMin) {
					notaMin = notas[i][j];
				}
				// max
				if (notas[i][j] >= notaMax) {
					notaMax = notas[i][j];
				}		
				// media
				notaMedia += notas[i][j];			
			}// fin bucle J
			notaMedia = notaMedia/notas[i].length;
			
			// imrpimimos
			System.out.println("ALUMNO " + (i+1) + ": ");
			System.out.println("Nota máxima: " + notaMax);
			System.out.println("Nota mínima: " + notaMin);
			System.out.println("Nota media: " + notaMedia);	
			System.out.println("");
		}// fin bucle i
		
	}// main
}
