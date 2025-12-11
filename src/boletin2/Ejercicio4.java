package boletin2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Integer[] array = new Integer[8];	
		
		Scanner sc = new Scanner(System.in);
		
		for ( int i = 0; i < array.length; i++) {
			do {
                System.out.print("Introduce un número entero (" + (i + 1) + "/8): ");
                array[i] = sc.nextInt();

                if (num < 1000 || num > 2800) {
                    System.out.println("La puntuación debe estar entre 1000 y 2800.");
                }
            } while (num < 1000 || num > 2800);

            array[i] = num;
		System.out.println("Las puntuaciones ordenadas de mayor a menor: ");
		System.out.println(Arrays.toString(array));
		
	}

}
