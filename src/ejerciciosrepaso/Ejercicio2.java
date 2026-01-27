package ejerciciosrepaso;

public class Ejercicio2 {

	public static void main(String[] args) {
	        
	        // Crear un array con notas iniciales (entre 0 y 10)
	        double[] notasClase = { 4.5, 8.0, 9.8, 3.2, 5.0, 6.7, 9.9 };

	        System.out.println("--- NOTAS ORIGINALES ---");
	        imprimirNotas(notasClase);

	        // Calcular y mostrar estadísticas
	        double media = calcularMedia(notasClase);
	        double maxima = notaMaxima(notasClase);
	        int aprobados = contarAprobados(notasClase);

	        System.out.println("\n--- ESTADÍSTICAS ---");
	        System.out.println("Nota media: " + media);
	        System.out.println("Nota máxima: " + maxima);
	        System.out.println("Total aprobados: " + aprobados);

	        // Aplicar subida de notas
	        // Subimos 0.5 puntos
	        System.out.println("\n... Aplicando subida de 0.5 puntos ...");
	        subirNotas(notasClase, 0.5);

	        // 4. Mostrar notas modificadas
	        System.out.println("\n--- NOTAS MODIFICADAS ---");
	        imprimirNotas(notasClase);
	    }

	    // --- FUNCIONES ---

	    /**
	     * Calcula la media aritmética.
	     */
	    static double calcularMedia(double[] notas) {
	        double suma = 0;
	        for (int i = 0; i < notas.length; i++) {
	            suma = suma + notas[i];
	        }
	        return suma / notas.length;
	    }

	    /**
	     * Busca el valor más alto en el array.
	     */
	    static double notaMaxima(double[] notas) {
	        // Inicializamos la máxima con la primera nota del array (o con 0)
	        double max = notas[0];
	        
	        for (int i = 1; i < notas.length; i++) {
	            if (notas[i] > max) {
	                max = notas[i];
	            }
	        }
	        return max;
	    }

	    /**
	     * Cuenta notas >= 5.0
	     */
	    static int contarAprobados(double[] notas) {
	        int contador = 0;
	        for (int i = 0; i < notas.length; i++) {
	            if (notas[i] >= 5.0) {
	                contador++;
	            }
	        }
	        return contador;
	    }

	    /**
	     * Modifica el array original sumando el incremento.
	     * Si la nota supera 10, se recorta a 10.
	     */
	    static void subirNotas(double[] notas, double incremento) {
	        for (int i = 0; i < notas.length; i++) {
	            notas[i] = notas[i] + incremento;

	            // Controlamos que no pase de 10
	            if (notas[i] > 10) {
	                notas[i] = 10;
	            }
	        }
	    }

	    /**
	     * Función para imprimir el array en el main
	     */
	    static void imprimirNotas(double[] notas) {
	        for (int i = 0; i < notas.length; i++) {
	            System.out.print(notas[i] + " | ");
	        }
	        System.out.println(); 
	    }
	}
