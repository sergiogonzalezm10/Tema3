package boletin4;
public class Ejercicio1 {
    public static int sumarTabla(int[] tabla) {
        int suma = 0;
        for (int i = 0; i < tabla.length; i++) {
            suma += tabla[i];
        }
        return suma;
    }

    public static void main(String[] args) {
        int[] numeros = {5, 10, 15, 20, 25};
        int resultado = sumarTabla(numeros);
        System.out.println("La suma de los elementos de la tabla es: " + resultado);
    }
}
