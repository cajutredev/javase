package mx.org.banxico.modulo11.map;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        // 1. Crear el mapa
        Map<String, String> directorio = new HashMap<>();

        // 2. Agregar valores
        directorio.put("Carlos", "555555555");
        directorio.put("Pedro", "12345676");
        directorio.put("Mariana", "7654321");
        directorio.put("Lorena", "888888888");
        directorio.put("Laura", "999999999");

        // 3. Consultar elementos del mapa
        String nombreABuscar = "Mariana";
        if (directorio.containsKey(nombreABuscar)) {
            String telefono = directorio.get(nombreABuscar);
            System.out.println("Consulta de contacto");
            System.out.println("Nombre: " +nombreABuscar);
            System.out.println("telefono: " + telefono);
        }

        directorio.put("Laura", "1111111111");
        System.out.println(directorio);
        System.out.println("Existe Lorena en el directorio? " + directorio.containsKey("Lorena"));
        directorio.remove(nombreABuscar);
        System.out.println(directorio);
        System.out.println(directorio.size());

        // Iterar sobre el mapa
        for(Map.Entry<String, String> contacto: directorio.entrySet()) {
            System.out.println(String.format("Nombre: %s, Telefono: %s", 
                contacto.getKey(), contacto.getValue()
            ));
        }
    }
}
