package boletin4;
import java.util.Arrays;
import java.util.Random;

public class Ejercicio7 {

	    public static void main(String[] args) {
	        int filas = 6;
	        int columnas = 10;

	        int[][] tabla = new int[filas][columnas];
	        Random rand = new Random();

	        // Rellenar la tabla con valores entre 0 y 1000
	        for (int i = 0; i < filas; i++) {
	            for (int j = 0; j < columnas; j++) {
	                tabla[i][j] = rand.nextInt(0,1001);
	            }
	        }

	        // Llamar a la función
	        int[] resultado = minMax(tabla);

	        // Mostrar resultados
	        System.out.println(Arrays.toString(resultado));
	        System.out.println("Mínimo: " + resultado[0]);
	        System.out.println("Máximo: " + resultado[1]);
	    }

	    // FUNCIÓN QUE DEVUELVE [MIN, MAX]
	    public static int[] minMax(int[][] tabla) {
	        if (tabla == null || tabla.length == 0 || tabla[0].length == 0) {
	            throw new IllegalArgumentException("La tabla no puede estar vacía");
	        }

	        int min = tabla[0][0];
	        int max = tabla[0][0];

	        for (int i = 0; i < tabla.length; i++) {
	            for (int j = 0; j < tabla[i].length; j++) {
	                if (tabla[i][j] < min) {
	                    min = tabla[i][j];
	                }
	                if (tabla[i][j] > max) {
	                    max = tabla[i][j];
	                }
	            }
	        }

	        return new int[]{min, max};
	    }
	}

