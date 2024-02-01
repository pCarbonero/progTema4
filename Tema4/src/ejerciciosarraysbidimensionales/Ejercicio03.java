package ejerciciosarraysbidimensionales;

/**
 * @author pcarbonero
 */
public class Ejercicio03 {

	public static void main(String[] args) {
		// creamos la tabla bidimiensional
		int[][] tabla = new int[5][5];

		// llamamos a la funcion para rellenar el array tabla
		rellenaTabla(tabla);
		// llamamos a la funcion para imprimir en la consola el array tablas
		imprimeTabla(tabla);
	}

	/**
	 * funcion que se encarga de rellenar la tabla de la forma deseada
	 * @param tabla
	 */
	public static void rellenaTabla(int[][] tabla) {

		for (int n = 0; n < tabla.length; n++) {
			for (int m = 0; m < tabla[n].length; m++) {
				tabla[n][m] = 10 * n + m;

			} // fin bucle m

		} // fin bucle n
	}// fin void
	
	/**
	 * Funcion que imprime la tabla
	 * @param tabla
	 */
	public static void imprimeTabla(int[][] tabla) {
		for (int[] fila : tabla) {
		    for (int elemento : fila) {
		        System.out.print(elemento + "\t");
		    }
		    System.out.println(" ");
		}
	}// fin imprime
	
	
	

}
