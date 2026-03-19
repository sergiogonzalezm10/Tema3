package collections2;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio1 {
    public static void main(String[] args) {

        // Creamos una lista de números enteros
        ArrayList<Integer> lista = new ArrayList<>();

        // Añadimos los números del 1 al 10
        for (int i = 1; i <= 10; i++) lista.add(i);

        // Mostramos la lista original
        System.out.println("Lista original: " + lista);

        // Mezclamos la lista de forma aleatoria
        Collections.shuffle(lista);

        // Mostramos la lista mezclada
        System.out.println("Lista mezclada: " + lista);
    }
}