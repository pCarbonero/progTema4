package ejerciciosfuncionesarrays;

import java.util.Arrays;

public class Ejercicio05 {

	public static void main(String[] args) {
		// tabla inicio
		int tabla[] = { 1, 55, 6, 3, 7, 8, 6, 3, 55, 1, 6 };
		// valora
		int valor = 789;
		// resultado
		int res[];

		res = buscarTodos(tabla, valor);
		System.out.println(Arrays.toString(res));

	}

	// funcion que busca el numero en toda la tabla
	public static int[] buscarTodos(int t[], int valor) {
		// tabla para registrar los indices en los que se encuentra el numero
		int indices[];
		// variable para la longitud de la tabla
		int longitud = 0;

		// bucle que va a comprobar cuantas veces se encuentra el número buscado y
		// determina la longitud de la nueva tabla
		for (int i = 0; i < t.length; i++) {
			if (t[i] == valor) {
				longitud++;
			}
		}

		// le damos a la nueva tabla la longitud necesaria
		indices = new int[longitud];
		
		// registramos en la tabla el indice en el qeu se encuetra el valor
		for (int i = 0; i < indices.length; i++) {
			if (t[i] == valor) {
				indices[i] = i;
			}
		}

		// devolvemos la tabla
		return indices;
	}

}
