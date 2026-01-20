package boletin3;

import java.util.Random;

public class Ejercicio5 {

	public static void main(String[] args) {
		int [][] tabla = new int [4][5];
		int [] sumaFilas = new int [4];
		int [] sumaColumnas = new int [5];
		int sumaTotal = 0;
		
		Random rd = new Random();

		for ( int i = 0; i < tabla.length; i++) {
			for( int j = 0; j < tabla[i].length; j++) {
			tabla[i][j] = rd.nextInt(100, 1000);
			sumaFilas[i] += tabla[i][j];
			sumaColumnas[j] += tabla[i][j];
			sumaTotal += tabla[i][j];
		}
		}
		for ( int i = 0; i < tabla.length; i++) {
			for ( int j = 0; j < tabla[i].length; j++) {
			System.out.print(tabla[i][j]+ "\t");
		}
			System.out.println(sumaFilas[i] + "\t");
	}
		for ( int j = 0; j < sumaColumnas.length; j++) {
			System.out.print(sumaColumnas[j] + "\t");
		}
		System.out.println(sumaTotal);

}
}