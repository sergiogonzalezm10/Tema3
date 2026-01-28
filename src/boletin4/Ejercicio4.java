package boletin4;

public class Ejercicio4 {

	public static void main(String[] args) {
		int tabla[] = { 4, 2, 3, 9, 1 };
		int pos = buscar(tabla, 9);	
		
		if ( pos != -1) {
			System.out.println("Encontrado en la posición: " + pos);
		} else {
			System.out.println("No encontrado");
		}
	}
	
	public static int buscar(int t[], int clave) {
		if ( t == null || t.length == 0) {
			return -1;
		}
		for ( int i = 0	; i < t.length; i++) {
			if ( t[i] == clave) {
				return i;
			}
		}
		return -1;
	}
}
