package collections2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        // HashMap donde la clave es la categoría y el valor la lista de tareas
        HashMap<String, ArrayList<String>> tareas = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            // Mostramos el menú de opciones
            System.out.println("\n1. Añadir tarea");
            System.out.println("2. Eliminar tarea");
            System.out.println("3. Listar tareas por categoría");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt(); sc.nextLine();

            switch (opcion) {
                case 1:
                    // Pedimos categoría y tarea, y la añadimos a su lista
                    System.out.print("Categoría: ");
                    String cat = sc.nextLine();
                    System.out.print("Tarea: ");
                    String tarea = sc.nextLine();
                    // Si la categoría no existe, la creamos con lista vacía
                    tareas.putIfAbsent(cat, new ArrayList<>());
                    tareas.get(cat).add(tarea);
                    System.out.println("Tarea añadida.");
                    break;
                case 2:
                    // Buscamos la categoría y eliminamos la tarea indicada
                    System.out.print("Categoría: ");
                    String cat2 = sc.nextLine();
                    if (tareas.containsKey(cat2)) {
                        System.out.print("Tarea a eliminar: ");
                        String t = sc.nextLine();
                        if (tareas.get(cat2).remove(t)) System.out.println("Eliminada.");
                        else System.out.println("Tarea no encontrada.");
                    } else {
                        System.out.println("Categoría no encontrada.");
                    }
                    break;
                case 3:
                    // Mostramos todas las tareas de la categoría indicada
                    System.out.print("Categoría: ");
                    String cat3 = sc.nextLine();
                    if (tareas.containsKey(cat3))
                        System.out.println("Tareas: " + tareas.get(cat3));
                    else
                        System.out.println("No hay tareas en esa categoría.");
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
            }
        } while (opcion != 4); // Repetimos hasta que el usuario elija salir
    }
}