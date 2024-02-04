package ejerciciosarraysbidimensionales;

public class Ejercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] tabla = {
			    {1, 2, 3},
			    {2, 4, 5},
			    {3, 5, 6}
			};
				
		if(buscaSimetria(tabla)) {
			System.out.println("Es simétrica ");
		}
		else {
			System.out.println("No es simétrica ");
		}

	}// fin main
	
	public static boolean buscaSimetria(int[][] tabla) {
		boolean esSimetrico = true;
		
		//
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				if (tabla[i][j] != tabla[j][i]) {
					esSimetrico = false;
					break;
				}				
			}
		}
		return esSimetrico;
	}
}// fin class
