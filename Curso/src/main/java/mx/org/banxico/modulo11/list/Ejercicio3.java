package mx.org.banxico.modulo11.list;

import java.util.LinkedList;
import java.util.List;

public class Ejercicio3 {

    public static void main(String[] args) {

        // 1. Crear una lista de nombres usando ArrayList
        List<String> productos = new LinkedList<>();

        // 2. Agregar elementos a lista
        productos.add("Laptop");
        productos.add("Mouse");
        productos.add("Teclado");
        productos.add("Monitor");

        // 3. Iterar sobre todos los elementos de la lista
        System.out.println("------- Nombres -------");
        
        for (int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i));
        }
        productos.add(1, "Impresora");
        productos.remove(productos.size()-1);

        System.out.println(productos.toString());
        productos.clear();
        System.out.println(productos.toString());
        System.out.println(productos.isEmpty());

    }
}
