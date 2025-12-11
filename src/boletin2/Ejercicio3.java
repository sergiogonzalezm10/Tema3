package boletin2;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio3 {

	public static void main(String[] args) {
		Random rd = new Random();
		
		int[] array = new int[30];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = rd.nextInt(0,10);
		}
		System.out.println("Array original:");
		System.out.println(Arrays.toString(array));
		
		Arrays.sort(array);
		System.out.println("Array ordenado:");
		System.out.println(Arrays.toString(array));
		
	}
}
