package boletin3;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);

	// Pedir dimensiones
	System.out.print("Introduce el número de filas: ");
	int filas = sc.nextInt();
	System.out.print("Introduce el número de columnas: ");
	int columnas = sc.nextInt();
	
	
	// Crear la tabla bidimensional
	int[][] tabla = new int[filas][columnas];
	
	// Rellenar la tabla con 10 * i + j
	for (int i = 0; i < filas; i++) {
	 for (int j = 0; j < columnas; j++) {
	 tabla[i][j] = 10 * i + j;
	 		}
		}
	
	// Mostrar la tabla por consola
	System.out.println("Tabla generada:");
	for (int i = 0; i < filas; i++) {
	for (int j = 0; j < columnas; j++) {
	System.out.print(tabla[i][j] + "\t");
		}
	System.out.println();
		}
		
	
		//Cierre escáner
		 sc.close();
		 
	 }
	
	}
