package mx.org.banxico.modulo11.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        String texto = """
            Java es un lenguaje de programacion que
            permite desarrallorar aplicaciones
            Java es multiplataforma y aun es muy popular es
            Aprender Java permite desarrollar software en entorno de multiplataforma
            """;

        texto = texto.toLowerCase();
        String[] palabras = texto.trim().split("\\s");
        System.out.println(Arrays.toString(palabras));

        Map<String, Integer> frecuencias = new HashMap<>();

        // 1. Contabilizar palabras
        for (String palabra : palabras) {
            // Si la palabra todavia no existe, existe un valor de 0
            int frecuenciaActual = frecuencias.getOrDefault(palabra, 0);
            int nuevaFrecuencia = frecuenciaActual + 1;
            frecuencias.put(palabra, nuevaFrecuencia);
        }

        for(Map.Entry<String, Integer> palabra: frecuencias.entrySet()) {
            System.out.println(String.format("%s:%s", palabra.getKey(), palabra.getValue()));
        }

        // 2. Identificar la palabra mas recurrente
        String palabraMasFrecuente = "";
        int frecuenciaMaxima = 0;
        for(Map.Entry<String, Integer> palabra: frecuencias.entrySet()) {
            
            if (palabra.getValue() >  frecuenciaMaxima) {
                frecuenciaMaxima = palabra.getValue();
                palabraMasFrecuente = palabra.getKey();
            }
        }

        System.out.println("========== PALABRA MAS RECURRENTE =========");
        System.out.println("Palabra: " + palabraMasFrecuente);
        System.out.println("Frecuencia: " + frecuenciaMaxima);
    }
}
