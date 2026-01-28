package boletin4;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		try {
            int[] resultado = rellenaPares(10, 20);
            System.out.println(Arrays.toString(resultado));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
	}
	
	
	public static int[] rellenaPares(int longitud, int fin) {
	if ( longitud <= 0 ) {
		throw new IllegalArgumentException("La longitud debe ser mayor que cero.");	
	}
	if ( fin < 2) {
		throw new IllegalArgumentException("El valor final debe ser al menos 2.");
	}
	int tabla[] = new int[longitud];
	Random rand = new Random();
	for ( int i = 0; i < longitud; i++) {
		 int num;
	        do {
	            num = rand.nextInt(fin - 1) + 2; 
	        } while (num % 2 != 0);

	        tabla[i] = num;
	    }

	    Arrays.sort(tabla);

	    return tabla;
	}
	}

