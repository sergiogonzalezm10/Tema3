package boletin2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int[] aleatorios = new int[1000];
		int contador = 0;
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < aleatorios.length; i++) {
			aleatorios[i] = rand.nextInt(0,100);
		}
		System.out.print("Introduce un número entre 0 y 99: ");
		int numero = sc.nextInt();
		
	for (int i = 0; i < aleatorios.length; i++) {
		if (aleatorios[i] == numero) {
			contador++;
		}
	}
	if (contador > 0) {
		System.out.println("El número introducido si existe en el array.");
		System.out.println("El número " + numero + " se ha encontrado " + contador + " veces en el array.");
	} else {
		System.out.println("El número " + numero + " no se ha encontrado en el array.");
	}
	
	sc.close();
	
	}
}
