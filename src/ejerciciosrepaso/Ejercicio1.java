package ejerciciosrepaso;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        //Pedir al usuario una frase completa
		        System.out.print("Por favor, introduce una frase completa: ");
		        String fraseUsuario = sc.nextLine();

		        //Llama a la función para procesar la frase
		        String[] misPalabras = obtenerPalabras(fraseUsuario);

		        // 3. Mostrar el array de palabras (usando un for normal como pide el repaso)
		        System.out.println("\n--- LISTADO DE PALABRAS ---");
		        for (int i = 0; i < misPalabras.length; i++) {
		            System.out.println("Indice " + i + ": " + misPalabras[i]);
		        }

		        //Mostrar número total de palabras
		        System.out.println("\nTotal de palabras encontradas: " + misPalabras.length);

		        //Mostrar cuántas tienen 5 o más letras
		        int cantidadLargas = contarPalabrasLargas(misPalabras, 5);
		        System.out.println("Palabras con 5 o más letras: " + cantidadLargas);

		        //Mostrar la palabra más larga
		        String laMasLarga = palabraMasLarga(misPalabras);
		        System.out.println("La palabra más larga es: \"" + laMasLarga + "\"");

		        sc.close();
		    }

		    // --- FUNCIONES ---

		    /**
		     * Elimina espacios extremos, pasa a minúsculas y divide en array.
		     */
		    static String[] obtenerPalabras(String frase) {
		        // Eliminar espacios iniciales y finales
		        frase = frase.trim();
		        
		        // Convertir a minúsculas
		        frase = frase.toLowerCase();
		        
		        // Dividir por espacios
		        String[] resultado = frase.split(" ");
		        
		        return resultado;
		    }

		    /**
		     * Cuenta cuántas palabras superan o igualan la longitud mínima.
		     */
		    static int contarPalabrasLargas(String[] palabras, int longitudMinima) {
		        int contador = 0;
		        
		        //Recorremos el array
		        for (int i = 0; i < palabras.length; i++) {
		            // Si la longitud de la palabra actual es mayor o igual a la mínima
		            if (palabras[i].length() >= longitudMinima) {
		                contador++;
		            }
		        }
		        return contador;
		    }

		    /**
		     * Devuelve la palabra más larga. Si hay empate, se queda con la primera que encontró.
		     */
		    static String palabraMasLarga(String[] palabras) {
		        String mayor = "";
		        
		        for (int i = 0; i < palabras.length; i++) {
		            if (palabras[i].length() > mayor.length()) {
		                mayor = palabras[i];
		            }
		        }
		        
		        return mayor;
		    }
		}