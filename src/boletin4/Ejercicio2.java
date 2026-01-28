package boletin4;

public class Ejercicio2 {

	public static void main(String[] args) {
		int[] numeros = {5, 10, 3, 8, 2};
				try {
				System.out.println("El valor máximo de la tabla es: " + maximo(numeros));
		} catch (IllegalArgumentException e) {
			System.out.println(	e.getMessage());
		}
	}
	public static int maximo(int t[]) {
		if ( t == null || t.length == 0) {
			throw new IllegalArgumentException("La tabla no puede ser nula o vacía");
		}
		int max = t[0];
		for ( int i = 1; i < t.length; i++) {
			if ( t[i] > max ) {
				max = t[i];
			}
		}
		return max;
	}
}