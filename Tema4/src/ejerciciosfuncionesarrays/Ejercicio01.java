package ejerciciosfuncionesarrays;


public class Ejercicio01 {

	public static void main(String[] args) {
		// creamos la tabla
		int tabla[] = {1,2,3,4,5};
		// variable pra guardar el resultado
		int res;
		
		// igualamos res al valor que devuelve la función
		res = sumaTabla(tabla);
		
		// imprimimos el resultado
		System.out.println("El resultado es " + res);

	}
	
	// creamos una funcion que recibe como parámetros una tabla
	public static int sumaTabla(int[] t) {
		// creamos una variable que almacenará los valores de la tabla
		int suma = 0;
		// bucle que va a sumar todo el contenido del array
		for (int i = 0; i < t.length; i++) {
			suma += t[i];		
		}
		
		// devolvemos el resultado de la suma
		return suma;	
	}
	
}
