package ejerciciosrepaso;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitamos al usuario que introduzca una frase completa
        System.out.print("Por favor, introduce una frase completa: ");
        String fraseUsuario = sc.nextLine();

        // Llamamos a la función para convertir la frase en un array de palabras
        String[] misPalabras = obtenerPalabras(fraseUsuario);

        // Mostramos el array de palabras usando un bucle for normal
        System.out.println("\n--- LISTADO DE PALABRAS ---");
        for (int i = 0; i < misPalabras.length; i++) {
            System.out.println("Indice " + i + ": " + misPalabras[i]);
        }

        // Mostrar el total de palabras encontradas
        System.out.println("\nTotal de palabras encontradas: " + misPalabras.length);

        // Contamos cuántas palabras tienen 5 o más letras
        int cantidadLargas = contarPalabrasLargas(misPalabras, 5);
        System.out.println("Palabras con 5 o más letras: " + cantidadLargas);

        // Obtenemos la palabra más larga del array
        String laMasLarga = palabraMasLarga(misPalabras);
        System.out.println("La palabra más larga es: \"" + laMasLarga + "\"");

        // Cerramos el Scanner
        sc.close();
    }

    // Función que convierte una frase en array de palabras
    // Elimina espacios iniciales y finales, pasa a minúsculas y divide por espacios
    static String[] obtenerPalabras(String frase) {
        // Eliminar espacios iniciales y finales
        frase = frase.trim();
        
        // Convertir todo a minúsculas
        frase = frase.toLowerCase();
        
        // Dividir la frase por espacios en un array
        String[] resultado = frase.split(" ");
        
        return resultado;
    }

    // Función que cuenta cuántas palabras tienen al menos cierta longitud
    static int contarPalabrasLargas(String[] palabras, int longitudMinima) {
        int contador = 0;
        
        // Recorremos todas las palabras del array
        for (int i = 0; i < palabras.length; i++) {
            // Si la palabra tiene longitud mayor o igual a la mínima, la contamos
            if (palabras[i].length() >= longitudMinima) {
                contador++;
            }
        }
        return contador;
    }

    // Función que devuelve la palabra más larga del array
    // Si hay empate, se queda con la primera que encontró
    static String palabraMasLarga(String[] palabras) {
        String mayor = "";
        
        // Recorremos todas las palabras
        for (int i = 0; i < palabras.length; i++) {
            // Si la palabra actual es más larga que la guardada, la reemplazamos
            if (palabras[i].length() > mayor.length()) {
                mayor = palabras[i];
            }
        }
        
        return mayor;
    }
}
