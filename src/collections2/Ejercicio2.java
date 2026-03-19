package collections2;

import java.util.LinkedHashSet;
import java.util.Random;

public class Ejercicio2 {
    public static void main(String[] args) {

        // LinkedHashSet no permite duplicados y mantiene el orden de inserción
        LinkedHashSet<Integer> numeros = new LinkedHashSet<>();
        Random rand = new Random();

        // Seguimos generando números hasta tener 10 distintos
        while (numeros.size() < 10) {
            // Generamos un número aleatorio entre 1 y 20
            numeros.add(rand.nextInt(20) + 1);
        }

        // Mostramos los números únicos generados
        System.out.println("Números únicos generados: " + numeros);
    }
}