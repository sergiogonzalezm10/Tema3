package EjerciciosParte1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		//Declaración del array
		int numeros[] = new int[8];
		
		//Inicio escáner
		Scanner sc = new Scanner(System.in);
		
		//Bucle para pedir y almacenar los números
		for ( int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce un número entero: " + ( i + 1) + "/8: ");
			numeros[i] = sc.nextInt();
		}

		//Bucle para determinar si son pares o impares
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.println(numeros[i] + " es par");
			} else {
				System.out.println(numeros[i] + " es impar");
			}
		}
		
		//Cierre escáner
		sc.close();
		
	}

}
