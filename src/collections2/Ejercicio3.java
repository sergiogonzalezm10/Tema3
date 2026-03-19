package collections2;

import java.util.TreeMap;

public class Ejercicio3 {
    public static void main(String[] args) {

        // Texto sobre el que contamos las letras
        String texto = "En un agujero en el suelo, vivia un hobbit. No un agujero humedo, sucio, repugnante, con restos de gusanos y olor a fango, ni tampoco un agujero, seco, desnudo y arenoso, sin nada en que sentarse o que comer: era un agujero-hobbit, y eso significa comodidad";

        // TreeMap para guardar la frecuencia de cada letra, ordenado alfabéticamente
        TreeMap<Character, Integer> frecuencia = new TreeMap<>();

        // Recorremos cada carácter del texto en minúsculas
        for (char c : texto.toLowerCase().toCharArray()) {

            // Solo contamos letras, ignoramos espacios, comas, etc.
            if (Character.isLetter(c)) {
                // Si ya existe la letra, sumamos 1; si no, la iniciamos a 1
                frecuencia.put(c, frecuencia.getOrDefault(c, 0) + 1);
            }
        }

        // Mostramos el conteo de cada letra
        System.out.println("Frecuencia de letras:");
        for (var entrada : frecuencia.entrySet()) {
            System.out.println(entrada.getKey() + " -> " + entrada.getValue());
        }
    }
}