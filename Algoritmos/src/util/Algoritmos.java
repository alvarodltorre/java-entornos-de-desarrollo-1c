package util;

public abstract class Algoritmos {

	/**
	 * Devuelve el sumatorio del numero especificado
	 * 
	 * @param numero	el numero del que queremos calcular el sumatorio
	 * @return			el sumatorio del numero especificado
	 */
	public static int sumatorio(int numero) {
		if (numero < 0) {
			throw new IllegalArgumentException("El numero debe ser mayor o igual a 0.");
		}
		
		
		int suma = 0;
		
		for (int i = 0; i <= numero; i++) {
			suma += i;
		}
		return suma;
	}
	
	
	/**
	 * Devuelve el factorial del numero especificado
	 * 
	 * @param numero	el numero del que queremos calcular el factorial
	 * @return			el factorial del numero especificado
	 */
	public static int factorial(int numero) {
		int factorial = 0;
		
		for (int i = 0; i <= numero; i++) {
			factorial *= i;
		}
		return factorial;
	}
}
