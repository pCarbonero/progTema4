package ejerciciosarraysbidimensionales;

public class Ejercicio09 {

	public static void main(String[] args) {
        int[][] tablaInicio = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
       
        // llamamos a la funcion e igualamos tabklaRotada a la tablaque devuelve
        int[][] tablaRotada = gira90(tablaInicio);


        
        // bucle para mostrar la tabla
        for (int[] fila : tablaRotada) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }

    }

    public static int[][] gira90(int[][] tablaInicio) {
        int n = tablaInicio.length;

        // Crear la matriz resultante llena de ceros
        int[][] resultado = new int[n][n];

        // Girar la matriz 90 grados en sentido horario
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultado[i][j] = tablaInicio[n - j - 1][i];
            }
        }

        return resultado;
    }


}// class
