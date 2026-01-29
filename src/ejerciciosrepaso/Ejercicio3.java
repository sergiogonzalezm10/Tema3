package ejerciciosrepaso;

import java.util.ArrayList;

public class Ejercicio3 {
	
	    public static void main(String[] args) {
	        // Texto largo de ejemplo
	        String texto = "Java es un lenguaje de programación muy popular. "
	                     + "Aprender Java permite desarrollar aplicaciones móviles, "
	                     + "web y de escritorio. La programación es divertida.";

	        // Array de palabras clave
	        String[] palabrasClave = {"java", "python", "programación", "c++", "aplicaciones"};

	        // Obtenemos las palabras encontradas en el texto
	        String[] encontradas = palabrasEncontradas(texto, palabrasClave);

	        // Mostramos el resultado
	        mostrarResultado(encontradas);
	    }

	    // Función que comprueba si el texto contiene una palabra (ignora mayúsculas/minúsculas)
	    static boolean contienePalabra(String texto, String palabra) {
	        return texto.toLowerCase().contains(palabra.toLowerCase());
	    }

	    // Función que devuelve un array con las palabras clave encontradas en el texto
	    static String[] palabrasEncontradas(String texto, String[] claves) {
	        // Usamos un ArrayList para almacenar las palabras encontradas
	        ArrayList<String> listaEncontradas = new ArrayList<>();

	        for (String clave : claves) {
	            if (contienePalabra(texto, clave)) {
	                listaEncontradas.add(clave);
	            }
	        }

	        // Convertimos la lista a array
	        return listaEncontradas.toArray(new String[0]);
	    }

	    // Función que muestra el resultado
	    static void mostrarResultado(String[] encontradas) {
	        if (encontradas.length > 0) {
	            System.out.println("Palabras encontradas: " + String.join(", ", encontradas));
	        } else {
	            System.out.println("No se ha encontrado ninguna palabra clave.");
	        }
	    }
	}

