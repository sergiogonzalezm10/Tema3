package boletin2;

import java.util.Arrays;

public class Ejercicio7 {

	public static void main(String[] args) {
		int[] numeros = new int[55];
		int posicion = 0;

        for (int i = 1; i <= 10; i++) {
            Arrays.fill(numeros, posicion, posicion + i, i);
            posicion += i;
        }

        // Mostrar el array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
