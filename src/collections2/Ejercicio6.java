package collections2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        // HashMap donde la clave es el nombre de la persona y el valor su lista de teléfonos
        HashMap<String, ArrayList<String>> libreta = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            // Mostramos el menú
            System.out.println("\n1. Añadir persona");
            System.out.println("2. Añadir teléfono a persona");
            System.out.println("3. Mostrar teléfonos de persona");
            System.out.println("4. Eliminar teléfono de persona");
            System.out.println("5. Eliminar persona");
            System.out.println("6. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt(); sc.nextLine();

            switch (opcion) {
                case 1:
                    // Añadimos una nueva persona con su lista de teléfonos vacía
                    System.out.print("Nombre: ");
                    String persona = sc.nextLine();
                    if (!libreta.containsKey(persona)) {
                        libreta.put(persona, new ArrayList<>());
                        System.out.println("Persona añadida.");
                    } else {
                        System.out.println("Ya existe.");
                    }
                    break;
                case 2:
                    // Buscamos a la persona y añadimos un teléfono a su lista
                    System.out.print("Nombre: ");
                    String p = sc.nextLine();
                    if (libreta.containsKey(p)) {
                        System.out.print("Teléfono: ");
                        libreta.get(p).add(sc.nextLine());
                        System.out.println("Teléfono añadido.");
                    } else {
                        System.out.println("Persona no encontrada.");
                    }
                    break;
                case 3:
                    // Mostramos todos los teléfonos de la persona indicada
                    System.out.print("Nombre: ");
                    String p2 = sc.nextLine();
                    if (libreta.containsKey(p2))
                        System.out.println("Teléfonos: " + libreta.get(p2));
                    else
                        System.out.println("Persona no encontrada.");
                    break;
                case 4:
                    // Eliminamos un teléfono concreto de la lista de la persona
                    System.out.print("Nombre: ");
                    String p3 = sc.nextLine();
                    if (libreta.containsKey(p3)) {
                        System.out.print("Teléfono a eliminar: ");
                        String tel = sc.nextLine();
                        if (libreta.get(p3).remove(tel)) System.out.println("Teléfono eliminado.");
                        else System.out.println("Teléfono no encontrado.");
                    } else {
                        System.out.println("Persona no encontrada.");
                    }
                    break;
                case 5:
                    // Eliminamos a la persona y todos sus teléfonos del mapa
                    System.out.print("Nombre a eliminar: ");
                    String p4 = sc.nextLine();
                    if (libreta.remove(p4) != null) System.out.println("Persona eliminada.");
                    else System.out.println("No encontrada.");
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
            }
        } while (opcion != 6); // Repetimos hasta que el usuario elija salir
    }
}