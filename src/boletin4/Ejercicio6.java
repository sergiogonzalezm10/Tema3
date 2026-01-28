package boletin4;
import java.util.Arrays;

public class Ejercicio6 {

	    public static void main(String[] args) {
	        int[] t = {10, 1, 5, 8, 9, 2};

	        int[] resultado = suma(t, 3);
	        System.out.println(Arrays.toString(resultado));
	    }

	    public static int[] suma(int[] t, int numElementos) {
	        if (t == null || t.length == 0) {
	            throw new IllegalArgumentException("El arreglo no puede ser null o vacío");
	        }

	        if (numElementos <= 0) {
	            throw new IllegalArgumentException("numElementos debe ser mayor que 0");
	        }

	        if (numElementos > t.length) {
	            throw new IllegalArgumentException("numElementos no puede ser mayor que la longitud del arreglo");
	        }

	        int[] resultado = new int[t.length - numElementos + 1];

	        for (int i = 0; i <= t.length - numElementos; i++) {
	            int suma = 0;
	            for (int j = 0; j < numElementos; j++) {
	                suma += t[i + j];
	            }
	            resultado[i] = suma;
	        }

	        return resultado;
	    }
	}
