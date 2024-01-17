package ejerciciosfuncionesarrays;

public class Ejercicio02 {

	public static void main(String[] args) {
		// creamos una tabla
		int tabla[] = {1000,25,99,400,3};
		// variable para guardar el resultado
		int res;
		// llamamos a la funcion y guardaos el valor que devuelvee en la variable res
		res = maximo(tabla);
		// imprimimos lresultado
		System.out.println(res);
		

	}
	
	// funcion que devuleve el valor maximo en la tabla
	public static int maximo(int t[]) {
		// variable que almacena el valor maximo
		int max = 0;
		
		// for each que recorre los valores de la tabla 
		for(int num : t) {
			// si el número que está comprobando es mayor que max se convierte en max
			if (max<num) {
				max = num;
			}
		}
		
		// devolvemos el valor de la variable max
		return max;
	}

}
