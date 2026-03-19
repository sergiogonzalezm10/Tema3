package collections2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio7 {
    public static void main(String[] args) {

        // TreeMap donde la clave es la longitud y el valor un conjunto de palabras
        // TreeMap ordena las claves (longitudes) de menor a mayor automáticamente
        TreeMap<Integer, HashSet<String>> mapa = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        String palabra;

        System.out.println("Introduce palabras (escribe 'fin' para terminar):");

        // Leemos palabras hasta que el usuario escriba "fin"
        while (!(palabra = sc.nextLine()).equalsIgnoreCase("fin")) {

            // Calculamos la longitud de la palabra introducida
            int longitud = palabra.length();

            // Si no existe aún esa longitud en el mapa, creamos su conjunto vacío
            mapa.putIfAbsent(longitud, new HashSet<>());

            // Añadimos la palabra al conjunto correspondiente a su longitud
            mapa.get(longitud).add(palabra);
        }

        // Mostramos todas las palabras agrupadas por longitud
        System.out.println("\nClasificación por longitud:");
        for (var entrada : mapa.entrySet()) {
            System.out.println("Longitud " + entrada.getKey() + ": " + entrada.getValue());
        }
    }
}