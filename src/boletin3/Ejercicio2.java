package boletin3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		final int ALUMNOS = 4;
		final int ASIGNATURAS = 5;
		
		double[][] notas =  new double[ALUMNOS][ASIGNATURAS];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < ALUMNOS; i++) {
			System.out.println("Alumno " + (i + 1) + ":");
			for (int j = 0; j < ASIGNATURAS; j++) {
				System.out.print("  Nota asignatura " + (j + 1) + ": ");
				notas[i][j] = sc.nextDouble();
			}
		}
		System.out.println("Tabla de notas:");
        System.out.print("         ");
        for (int j = 0; j < ASIGNATURAS; j++) {
            System.out.print("  A" + (j + 1) + " ");
        }
        System.out.println();

        for (int i = 0; i < ALUMNOS; i++) {
            System.out.print("Alumno " + (i + 1) + " ");
            for (int j = 0; j < ASIGNATURAS; j++) {
                System.out.print(" " + notas[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Estadísticas por alumno:");
        for (int i = 0; i < ALUMNOS; i++) {
            double min = notas[i][0];
            double max = notas[i][0];
            double suma = 0;

            for (int j = 0; j < ASIGNATURAS; j++) {
                if (notas[i][j] < min) {
                    min = notas[i][j];
                }
                if (notas[i][j] > max) {
                    max = notas[i][j];
                }
                suma += notas[i][j];
            }

            double media = suma / ASIGNATURAS;

            System.out.println("Alumno " + (i + 1) + ": Min=" + min + ", Max=" + max + ", Media=" + media);
        }

        sc.close();
    }
	}
