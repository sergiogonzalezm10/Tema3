package boletin2;

import java.util.Random;

public class Ejercicio6 {

	public static void main(String[] args) {
		int[] primitiva = new int[6];
        int[] sorteado = {2, 12, 29, 34, 39, 46};
        int aciertos = 0;
        int num;
        boolean repetido;
        
        Random rand = new Random();

        // Generar apuesta
        for (int i = 0; i < primitiva.length; i++) {
            do {
                num = rand.nextInt(0,50);
                repetido = false;

                for (int j = 0; j < i; j++) {
                    if (primitiva[j] == num) {
                        repetido = true;
                    }
                }
            } while (repetido);

            primitiva[i] = num;
        }
        
        // Contar aciertos
        for (int i = 0; i < sorteado.length; i++) {
            for (int j = 0; j < primitiva.length; j++) {
                if (sorteado[i] == primitiva[j]) {
                    aciertos++;
                }
            }
        }

        System.out.println("Has acertado " + aciertos + " números.");
    }
}