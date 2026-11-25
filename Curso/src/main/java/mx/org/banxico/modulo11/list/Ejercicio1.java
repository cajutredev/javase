package mx.org.banxico.modulo11.list;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        // 1. Crear una lista de nombres usando ArrayList
        List<String> nombres = new ArrayList<>();

        // 2. Agregar elementos a lista
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Maira");
        nombres.add("Lot");

        // 3. Iterar sobre todos los elementos de la lista
        System.out.println("------- Nombres -------");
        
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }

        // 4. Consultar un elemento de la lista
        System.out.println("------- Nombres -------");
        System.out.println("Elemento que esta en la posicion 2: " + nombres.get(2));

        // 5. Comprobar si existe un nombre en la lista
        System.out.println("Existe Juan? " + nombres.contains("Juan"));

        // 6. Consultar tamaño de la lista
        System.out.println("El tamanio de la lista es: " + nombres.size());
    }
}
