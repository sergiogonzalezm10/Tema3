package boletin4;
import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio5 {

	    public static void main(String[] args) {
	        int[] tabla = {3, 7, 2, 7, 5, 7};

	        int[] posiciones = buscarTodos(tabla, 7);

	        if (posiciones.length > 0) {
	            System.out.println("El valor se encuentra en las posiciones: " + Arrays.toString(posiciones));
	        } else {
	            System.out.println("Valor no encontrado");
	        }
	    }

	    public static int[] buscarTodos(int[] t, int valor) {
	        if (t == null) {
	            throw new IllegalArgumentException("El arreglo no puede ser null");
	        }

	        ArrayList<Integer> indices = new ArrayList<>();

	        for (int i = 0; i < t.length; i++) {
	            if (t[i] == valor) {
	                indices.add(i);
	            }
	        }

	        int[] resultado = new int[indices.size()];
	        for (int i = 0; i < indices.size(); i++) {
	            resultado[i] = indices.get(i);
	        }

	        return resultado;
	    }
	}