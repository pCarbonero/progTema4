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
		// string que se irá modificando según las letras que acierte
		String oculto = "";
		
		// preguntamos al primer jugador para que introduzca la contraseña
		System.out.println("Introduce la contraseña que el otro jugador tiene que averiguar ");
		password = sc.nextLine();
		
		// creamos un bucle 
		for (int i = 0; i < password.length(); i++) {
			oculto += '*';
		}
		
		
		do {
			// preguntamos por la priemra respuesta
			System.out.println("¿Cuál es la contraseña? ");
			res = sc.nextLine();
			
			if (password.length() == res.length()) {
				for (int i = 0; i < password.length(); i++) {
					// si hay una coincidencia hace lo siguiente
					if (password.charAt(i) == res.charAt(i)) {
						// el primer substring captura los caacteres antes de una coincidencia
						// el password.carAt(i) añade la coicidencia a la cadena
						// el segundo substring captura el resto de caracteres de esa cadena y los añade
						oculto = oculto.substring(0, i) + password.charAt(i) + oculto.substring(i + 1);
					}
				}
				
				// comprobamos is la contraseña es correcta
				if (password.equals(res)) {
					System.out.println("Has acertado la contraseña ");
					isCorrect = true;
				}
				else
				// imprimimos la cadena con la parte oculta y descubierta
				System.out.println(oculto);
			}
			else {
				System.out.println("No tiene el número de caracteres corercto");
			}	
		} while (!isCorrect);
		

	}

}
