package collections2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        // Lista donde guardaremos los nombres
        ArrayList<String> nombres = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            // Mostramos el menú de opciones
            System.out.println("\n1. Añadir nombre");
            System.out.println("2. Eliminar nombre");
            System.out.println("3. Ordenar alfabéticamente");
            System.out.println("4. Buscar nombre");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt(); sc.nextLine();

            switch (opcion) {
                case 1:
                    // Pedimos el nombre y lo añadimos a la lista
                    System.out.print("Nombre a añadir: ");
                    nombres.add(sc.nextLine());
                    System.out.println("Lista: " + nombres);
                    break;
                case 2:
                    // Pedimos el nombre y lo eliminamos si existe
                    System.out.print("Nombre a eliminar: ");
                    String eliminar = sc.nextLine();
                    if (nombres.remove(eliminar)) System.out.println("Eliminado.");
                    else System.out.println("No encontrado.");
                    System.out.println("Lista: " + nombres);
                    break;
                case 3:
                    // Ordenamos la lista alfabéticamente con Collections.sort
                    Collections.sort(nombres);
                    System.out.println("Lista ordenada: " + nombres);
                    break;
                case 4:
                    // Buscamos si el nombre está en la lista con contains
                    System.out.print("Nombre a buscar: ");
                    String buscar = sc.nextLine();
                    System.out.println(nombres.contains(buscar) ? "Está en la lista." : "No está en la lista.");
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5); // Repetimos hasta que el usuario elija salir
    }
}