package EjerciciosParte1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		int numeros[] = new int[100];
		
		Random rand = new Random();
		
		Scanner sc = new Scanner(System.in);
		
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rand.nextInt(0,11);
		}
		System.out.println("Introduce un número N del 1 al 10: ");
		int num = sc.nextInt();
		
		boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == num) {
                System.out.print(i + " ");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No aparece en el array.");
        }

        sc.close();
    }
	}
