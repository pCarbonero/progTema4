package ejerciciosarraysbidimensionales;


public class Ejercicio01 {

	public static void main(String[] args) {
		// creamos un array bidimenionañ
		int[][] num = new int[3][6];
		
		// asignamos los valores de la priemra fila
		num[0][0] = 0;
		num[0][1] = 30;
		num[0][2] = 2;
		num[0][5] = 5;
		
		// asignamos los valores de la segunda fila
		num[1][0] = 75;
		num[1][4] = 0;
		
		// asignamos los valores de la tercera fila
		num[2][2] = -2;
		num[2][3] = 9;
		num[2][5] = 11;
		
		// bucle for que imprime las filas
		for (int i = 0; i < num.length; i++){
			for (int j = 0; j < num[0].length; j++) {
				System.out.print(num[i][j] + "\t");
			}
			System.out.println("");
		}
				
	}

}
