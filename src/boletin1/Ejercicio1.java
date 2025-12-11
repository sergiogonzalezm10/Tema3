package boletin1;

import java.io.Closeable;
import java.util.Random;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Declaración del array
		int numeros [ ] = new int [10];
		
		//Inicio generación números aleatorios
		Random rand = new Random(); 
		
		// Bucle para generar y almacenar números aleatorios
		System.out.println("Números del 1 al 100:"); 
		for (int i = 0; i < numeros.length; i++) {
			numeros [i] = rand.nextInt(100) + 1;
		}
		
		// Bucle para mostrar los números generados
		System.out.println("Números generados:");
		for (int n : numeros) {
			System.out.print(n + " ");
		}
	}
}
