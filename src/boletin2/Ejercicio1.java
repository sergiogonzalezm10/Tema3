package boletin2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
			//Variable para almacenar tamaño y valor
			int tamaño;
			int valor;
			
			//Inicio escáner
		   Scanner sc = new Scanner(System.in);
	        
	        //Imprimimos que introduzamos el tamaño
	        System.out.print("Introduce el tamaño del array: ");
	        tamaño = sc.nextInt();
	        
	        //Imprimimos que introduzcamos el valor
	        System.out.print("Introduce el valor a almacenar: ");
	        valor = sc.nextInt();
	        
	        //Crear el array y llenarlo
	        int[] array = new int[tamaño];
	        for (int i = 0; i < tamaño; i++) {
	            array[i] = valor;
	        }
	        
	        //Mostrar el array
	        System.out.println("El array generado es:");
	        for (int i = 0; i < tamaño; i++) {
	            System.out.print(array[i] + " ");
	        }
	       
	        //Cierre escáner
	        sc.close();
	    }
	}
