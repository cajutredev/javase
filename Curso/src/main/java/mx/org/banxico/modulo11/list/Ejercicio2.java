package mx.org.banxico.modulo11.list;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {

    public static void main(String[] args) {

        // 1. Crear una lista de nombres usando ArrayList
        List<String> productos = new ArrayList<>();

        // 2. Agregar elementos a lista
        productos.add("Laptop");
        productos.add("Mouse");
        productos.add("Teclado");
        productos.add("Monitor");

        // 3. Imprimir la lista
        System.out.println(productos.toString());

        // 4. Reemplazar un elemento de la lista
        productos.set(1, "Impresora");
        System.out.println("Se modifico el producto en la posicion 1");
        System.out.println(productos);

        // 5. Eliminar un elemento de la lista
        productos.remove("Monitor");
        System.out.println(productos);

        // 6. Insertar nuevos elementos a la lista
        productos.add(1, "Audifonos");
        System.out.println(productos);

    }
}
