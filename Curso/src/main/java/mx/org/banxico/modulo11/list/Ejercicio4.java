package mx.org.banxico.modulo11.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ejercicio4 {
    
    private static final int CANTIDAD = 300_000;
    public static void main(String[] args) {
        
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Crear variables de tiempo de ejecucion
        long inicio;
        long fin;

        // Agregar elementos
        System.out.println("======== Agregar elementos a ArrayList ========");

        inicio = System.nanoTime();

        for (int i = 0; i < CANTIDAD; i++) {
            arrayList.add(i);
        }

        fin = System.nanoTime();
        long totalArrayList = fin - inicio;

        System.out.println("======== Agregar elementos a LinkedList ========");

        inicio = System.nanoTime();

        for (int i = 0; i < CANTIDAD; i++) {
            linkedList.add(i);
        }

        fin = System.nanoTime();
        long totalLinkedList = fin - inicio;

        System.out.println("ArrayList: " + totalArrayList + " ns");
        System.out.println("LinkedList: " + totalLinkedList + " ns");


    }
}
