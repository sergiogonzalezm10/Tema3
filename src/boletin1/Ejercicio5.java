package boletin1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

	//Declaración del array
	int numeros[] = new int[10];
	
	//Inicio escáner
	Scanner sc = new Scanner(System.in);
	
	//Bucle para pedir y almacenar los números
	for ( int i = 0; i < numeros.length; i++) {
		 System.out.println("Introduce un número entero " + ( i + 1) + "/10: ");
		 numeros[i] = sc.nextInt();
	}
	
	//Varaibles para suma, máximo y mínimo
	double suma = 0;
    double max = numeros[0];
    double min = numeros[0];
	
    //Bucle para calcular suma, máximo y mínimo
	for (double n : numeros) {
        suma += n;

        if (n > max) {
            max = n;
        }

        if (n < min) {
            min = n;
        }
    }

	//Imprime los resultados
	System.out.println("La suma de los números es: " + suma);
	System.out.println("El valor máximo es: " + max);
	System.out.println("El valor mínimo es: " + min);
	
	//Cierre escáner
	sc.close();
	
	}
}
