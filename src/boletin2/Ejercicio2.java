package boletin2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int num;
        
        System.out.println("Introduce 20 números enteros: ");
        for (int i = 0; i < 20; i++) {
        num = sc.nextInt();
			if (i < 10) {
				array1[i] = num;
			} else {
				array2[i - 10] = num;
			}
		}
        // Comparar los dos arrays
        boolean iguales = Arrays.equals(array1, array2);

        if (iguales) {
            System.out.println("Los dos arrays son IGUALES.");
        } else {
            System.out.println("Los dos arrays son DIFERENTES.");
        }

        sc.close();
    }
}