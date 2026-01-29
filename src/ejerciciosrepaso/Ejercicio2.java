package ejerciciosrepaso;

public class Ejercicio2 {

    public static void main(String[] args) {
    	
        // Creamos un array con notas de ejemplo (valores entre 0 y 10)
        double[] notasClase = { 4.5, 8.0, 9.8, 3.2, 5.0, 6.7, 9.9 };

        // Mostramos las notas originales
        System.out.println("--- NOTAS ORIGINALES ---");
        imprimirNotas(notasClase);

      
        // Calculamos la media, la nota máxima y el número de aprobados
        double media = calcularMedia(notasClase);
        double maxima = notaMaxima(notasClase);
        int aprobados = contarAprobados(notasClase);

        // Mostramos las estadísticas
        System.out.println("\n--- ESTADÍSTICAS ---");
        System.out.println("Nota media: " + media);
        System.out.println("Nota máxima: " + maxima);
        System.out.println("Total aprobados: " + aprobados);

        
        // Aplicamos una subida de 0.5 puntos a todas las notas
        System.out.println("\n... Aplicando subida de 0.5 puntos ...");
        subirNotas(notasClase, 0.5);

        // Mostramos las notas después de la subida
        System.out.println("\n--- NOTAS MODIFICADAS ---");
        imprimirNotas(notasClase);
    }


    // Función que calcula la media aritmética de un array de notas
    static double calcularMedia(double[] notas) {
        double suma = 0;
        // Sumamos todas las notas
        for (int i = 0; i < notas.length; i++) {
            suma = suma + notas[i];
        }
        // Devolvemos la media
        return suma / notas.length;
    }

    // Función que busca la nota más alta en el array
    static double notaMaxima(double[] notas) {
        // Inicializamos la máxima con la primera nota
        double max = notas[0];

        // Recorremos el resto del array para encontrar la nota mayor
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > max) {
                max = notas[i];
            }
        }
        return max;
    }

    // Función que cuenta cuántas notas son mayores o iguales a 5.0
    static int contarAprobados(double[] notas) {
        int contador = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5.0) {
                contador++;
            }
        }
        return contador;
    }

    // Función que suma un incremento a todas las notas
    // Si alguna nota supera 10, se ajusta a 10
    static void subirNotas(double[] notas, double incremento) {
        for (int i = 0; i < notas.length; i++) {
            notas[i] = notas[i] + incremento;

            // Controlamos que la nota no supere 10
            if (notas[i] > 10) {
                notas[i] = 10;
            }
        }
    }

    // Función para imprimir todas las notas del array en una línea
    static void imprimirNotas(double[] notas) {
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " | ");
        }
        // Salto de línea al final
        System.out.println(); 
    }
}

