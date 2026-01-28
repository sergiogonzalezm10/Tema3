package boletin4;

import java.util.Arrays;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		int tabla[][] = new int[4][4];
		int contador = 1;
		for (int i = 0; i < 4; i++ ) {
			for ( int j = 0; j < 4; j ++ ) {
				tabla[i][j] = contador++;
			}
		
		}
	
		System.out.println("Tabla original: ");
		imprimirTabla(tabla);
		
		int[][] transpuesta = transponer(tabla);
		
		System.out.println("Tabla transpuesta: ");
		imprimirTabla(transpuesta);
	}
		
	public static int[][] transponer (int [][] tabla) {
		if ( tabla == null || tabla.length == 0) {
			throw new IllegalArgumentException("La tabla no puede estar vacía");
		}
		int filas = tabla.length;
		int columnas = tabla[0].length;
		
		int[][] resultado = new int [columnas][filas];
		
		for ( int i = 0; i < filas; i++) {
			for ( int j = 0; j < columnas; j++) { 
				resultado[j][i] = tabla[i][j];
			}
		}
		return resultado;
	}
	public static void imprimirTabla(int[][] tabla) {
		for ( int[] fila: tabla) {
			System.out.println(Arrays.toString(fila));
		}
	}
}
