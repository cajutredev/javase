package mx.org.banxico.modulo11.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ejercicio3 {

    private static final int CANTIDAD = 400_000;

    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        // Crear variables de tiempo de ejecucion
        long inicio;
        long fin;

        // Agregar elementos

        inicio = System.nanoTime();

        for (int i = 0; i < CANTIDAD; i++) {
            hashSet.add(i);
        }

        fin = System.nanoTime();
        long totalHashSet = fin - inicio;

        inicio = System.nanoTime();

        for (int i = 0; i < CANTIDAD; i++) {
            linkedHashSet.add(i);
        }

        fin = System.nanoTime();
        long totalLinkedHashSet = fin - inicio;

        System.out.println("HashSet: " + totalHashSet + " ns");
        System.out.println("LinkedHashSet: " + totalLinkedHashSet + " ns");

        // MEdir tiempo de lectura
        long sumaHashSet = 0;
        long sumaLinkedHashSet = 0;

        inicio = System.nanoTime();

        for (Integer numero : hashSet) {
            sumaHashSet += numero;
        }

        fin = System.nanoTime();
        totalHashSet = fin - inicio;

        inicio = System.nanoTime();

        for (Integer numero : linkedHashSet) {
            sumaLinkedHashSet += numero;
        }

        fin = System.nanoTime();
        totalLinkedHashSet = fin - inicio;

        System.out.println("Metricas de lectura");
        System.out.println("HashSet: " + totalHashSet + " ns");
        System.out.println("LinkedHashSet: " + totalLinkedHashSet + " ns");
    }
}
