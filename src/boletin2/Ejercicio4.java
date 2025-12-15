package boletin2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int[] puntuaciones = new int[8];
		
		Scanner sc = new Scanner(System.in);

        for (int i = 0; i < puntuaciones.length; i++) {
            System.out.print("Introduce la puntuación del jugador " + (i + 1) + ": ");
            int puntuacion = sc.nextInt();

            // Comprobar rango
            if (puntuacion < 1000 || puntuacion > 2800) {
                System.out.println("ERROR: La puntuación debe estar entre 1000 y 2800.");
                return; // Finaliza el programa
            }
            puntuaciones[i] = puntuacion;
        }

        // Ordenar de menor a mayor
        Arrays.sort(puntuaciones);

        // Mostrar ranking
        System.out.println("Ranking de puntuaciones (de mayor a menor):");
        for (int i = puntuaciones.length - 1; i >= 0; i--) {
            System.out.println(puntuaciones[i]);
        }

        sc.close();
    }
}