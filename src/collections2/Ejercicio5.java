package collections2;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        // HashMap donde la clave es el nombre de la serie y el valor su valoración
        HashMap<String, Double> series = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            // Mostramos el menú
            System.out.println("\n1. Agregar serie");
            System.out.println("2. Buscar serie");
            System.out.println("3. Eliminar serie");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt(); sc.nextLine();

            switch (opcion) {
                case 1:
                    // Pedimos nombre y valoración y los guardamos en el mapa
                    System.out.print("Nombre de la serie: ");
                    String nombre = sc.nextLine();
                    System.out.print("Valoración: ");
                    double valoracion = sc.nextDouble(); sc.nextLine();
                    series.put(nombre, valoracion);
                    System.out.println("Serie añadida.");
                    break;
                case 2:
                    // Buscamos la serie por nombre y mostramos su valoración
                    System.out.print("Nombre a buscar: ");
                    String buscar = sc.nextLine();
                    if (series.containsKey(buscar))
                        System.out.println("Valoración: " + series.get(buscar));
                    else
                        System.out.println("Serie no encontrada.");
                    break;
                case 3:
                    // Eliminamos la serie del mapa si existe
                    System.out.print("Nombre a eliminar: ");
                    String eliminar = sc.nextLine();
                    if (series.remove(eliminar) != null) System.out.println("Eliminada.");
                    else System.out.println("No encontrada.");
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4); // Repetimos hasta que el usuario elija salir
    }
}