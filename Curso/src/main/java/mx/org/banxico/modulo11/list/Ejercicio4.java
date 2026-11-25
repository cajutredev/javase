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

        inicio = System.nanoTime();

        for (int i = 0; i < CANTIDAD; i++) {
            arrayList.add(i);
        }

        fin = System.nanoTime();
        long totalArrayList = fin - inicio;

        inicio = System.nanoTime();

        for (int i = 0; i < CANTIDAD; i++) {
            linkedList.add(i);
        }

        fin = System.nanoTime();
        long totalLinkedList = fin - inicio;

        System.out.println("ArrayList: " + totalArrayList + " ns");
        System.out.println("LinkedList: " + totalLinkedList + " ns");

        // Medir tiempo para recorrer listas
        long sumaArray = 0;
        long sumaLinked = 0;

        inicio = System.nanoTime();

        for (Integer numero : arrayList) {
            sumaArray += numero;
        }

        fin = System.nanoTime();
        totalArrayList = fin - inicio;

        inicio = System.nanoTime();

        for (Integer numero : linkedList) {
            sumaLinked += numero;
        }

        fin = System.nanoTime();
        totalLinkedList = fin - inicio;

        System.out.println("total para suma de array: " + totalArrayList + " ns");
        System.out.println("total de suma para linkedlist: " + totalLinkedList + " ns");
    }
}
