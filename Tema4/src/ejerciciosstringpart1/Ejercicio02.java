package ejerciciosstringpart1;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// creamos el escanner
		Scanner sc = new Scanner(System.in);
		// variable para almacenar la contraseña
		String password;
		// variable para almacenar la respuesta del usuario
		String res;
		// booleana para saber si se ha adivinado la contraseña
		boolean isCorrect = false;
		
		// preguntamos al primer jugador para que introduzca la contraseña
		System.out.println("Introduce la contraseña que el otro jugador tiene que averiguar ");
		password = sc.nextLine();
		
		
		do {
			// preguntamos por la priemra respuesta
			System.out.println("¿Cuál es la contraseña? ");
			res = sc.nextLine();
			
			if (password.length() == res.length()) {
				for (int i = 0; i < password.length(); i++) {
					
				}
			}
			else {
				System.out.println("No tiene el número de caracteres corercto");
			}	
		} while (!isCorrect);
		

	}

}
