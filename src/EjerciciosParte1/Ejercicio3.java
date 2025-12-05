package EjerciciosParte1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

	// Declaración del array
	int numeros[] = new int[10];
	
	//Inicio escáner
	Scanner sc = new Scanner(System.in);
	
	// Bucle para pedir y almacenar los números
	for (int i = 0; i < numeros.length; i++) {
	    System.out.print("Introduce un número entero (" + (i + 1) + "/10): ");
	    numeros[i] = sc.nextInt();
	}
		
		// Bucle para mostrar los números en orden inverso
	    System.out.println("\nNúmeros en orden inverso:");
        for (int i = numeros.length; i > 0; i--) {
            System.out.println(numeros[i]);
        }
        
        //Cierre escáner
        sc.close();
	}
}
