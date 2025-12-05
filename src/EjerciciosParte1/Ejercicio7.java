package EjerciciosParte1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

double[] temperaturas = new double[12];

Scanner sc = new Scanner(System.in);

for (int i = 0; i < meses.length; i++) {
	System.out.println("La temperatura en " + meses[i] + " es: ");
	temperaturas[i] = sc.nextDouble();
}
System.out.println("Temperaturas registradas:");
for (int i = 0; i < meses.length; i++) {
    System.out.println(meses[i] + ": ");
    
    int barras = (int) temperaturas[i];
    
   for (int j = 0; j < barras; j++) {
	System.out.print("|");
	   }
   System.out.println(temperaturas[i] + " ºC");
   }
}
	}


 