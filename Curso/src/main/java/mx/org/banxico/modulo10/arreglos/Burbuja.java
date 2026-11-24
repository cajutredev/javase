package mx.org.banxico.modulo10.arreglos;

import java.util.Arrays;

public class Burbuja {

    public static void main(String[] args) {
        
        int arreglo[] = {1, 2, 3, 5, 4};
        int contadorComparaciones = 0;
        int contadorPasadas = 0;
        boolean hayPermutacion = false;

        // Cilco para controlar pasadas
        for (int i = 0; i < arreglo.length; i++) {
            //Ciclo para controlar permutaciones
            for (int j = 0; j < arreglo.length - (i + 1); j++) {

                if (arreglo[j] > arreglo[j + 1]) {
                    int aux = arreglo[j + 1];
                    arreglo[j + 1] = arreglo[j];
                    arreglo[j] = aux;
                    hayPermutacion = true;
                }
                contadorComparaciones++;
            }
            contadorPasadas++;

            if (!hayPermutacion) {
                break;
            }
            hayPermutacion = false;
        }
        System.out.println(Arrays.toString(arreglo));
        System.out.println("Total de comparaciones: " + contadorComparaciones);
        System.out.println("Total de cpasadas: " + contadorPasadas);
    }
}
