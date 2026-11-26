package mx.org.banxico.modulo13;

import java.util.Arrays;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        // Declarar el origen de datos
        int[] numeros = {12, 5, 8, 21, 14, 3, 10, 7, 18, 9};

        // 1. Mostrar los valores originales
        System.out.println("========= Mostrar los valores originales ==========");
        Arrays.stream(numeros)
            .forEach(numero -> System.out.print(numero + " "));
        
        System.out.println();

        // 2. Obtener el mínimo, máximo, suma y promedio de los valores.
        System.out.println("========= ESTADISTICAS GENERALES ==========");

        int minimo = Arrays.stream(numeros)
            .min()
            .getAsInt();

        int maximo = Arrays.stream(numeros)
            .max()
            .getAsInt();

        int suma = Arrays.stream(numeros)
            .sum();

        double promedio = Arrays.stream(numeros)
            .average()
            .getAsDouble();
        
        System.out.println("Minimo: " + minimo);
        System.out.println("Maximo: " + maximo);
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);

        // 3. Obtener la suma de los cuadrados.
        int sumaCuadrados = Arrays.stream(numeros)
            .map(numero -> numero * numero)
            .sum();

        System.out.println("========= SUMA DE LOS CUADRADOS ==========");
        System.out.println(sumaCuadrados);

        // 4. Obtener los valores pares mostrados en orden.
        Arrays.stream(numeros)
            .filter(numero -> numero % 2 == 0)
            .sorted()
            .forEach(numero -> System.out.println(numero + " "));

            // 5. Obtener los valores impares multiplicados por 10 y mostrados en orden
            System.out.println("========= VALORES IMPARES POR 10 ==========");
        Arrays.stream(numeros)
            .filter(numero -> numero % 2 != 0)
            .map(numero -> numero * 10)
            .sorted()
            .forEach(System.out::println);
    }
}
