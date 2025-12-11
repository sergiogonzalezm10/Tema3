package boletin1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Inicio escáner
        Scanner sc = new Scanner(System.in);
        
        // Declaración del array
        double numeros[] = new double[5];  
        
        // Primer bucle para pedir y almacenar
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un número decimal (" + (i + 1) + "/5): ");
            numeros[i] = sc.nextDouble();
        }
        
        // Segundo bucle para mostrar los valores introducidos
        System.out.println("Números introducidos:");
        for (double n : numeros) {
            System.out.println(n);

        }
        
        //Cierre escáner
        sc.close();
    }
}
