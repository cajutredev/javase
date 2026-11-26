package mx.org.banxico.modulo13;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        String[] palabras = {
            "java", "Python", "javascript", "Spring",
            "mysql", "docker", "angular", "React",
            "mongodb", "linux", "Oracle", "typescript"
        };

        // 2. Convertir las cadenas a mayuscula
        Arrays.stream(palabras)
            .map(String::toUpperCase)
            .forEach(System.out::println);

        // 3. Obtener cadenas mayores que “m” en orden ascendente
        System.out.println("========== Palabras mayores a M ===========");
        Arrays.stream(palabras)
            .filter(palabra -> palabra.toLowerCase().compareTo("m") > 0)
            .sorted(String.CASE_INSENSITIVE_ORDER)
            .forEach(System.out::println);

        // 4. Obtener cadenas que comienzen con la letra J
        System.out.println("========== Palabras que empiezen con J ===========");
        Arrays.stream(palabras)
            .filter(palabra -> palabra.toLowerCase().startsWith("j"))
            .sorted(String.CASE_INSENSITIVE_ORDER)
            .forEach(System.out::println);

        // 5. Obtener cadenas que que contengan mas de 5 caracteres
        System.out.println("========== Palabras que tengas mas de 5 caracteres ===========");
        Arrays.stream(palabras)
            .filter(palabra -> palabra.length() > 5)
            .sorted(String.CASE_INSENSITIVE_ORDER)
            .forEach(System.out::println);

        // 6. Obtener la longitud de cada palabra
        System.out.println("========== Longitud de cada palabra ===========");
        Arrays.stream(palabras)
            .map(palabra -> palabra + ", " + palabra.length() + " caracteres")
            .forEach(System.out::println);

        // 7. Unir todas las palabras en una sola cadena
        System.out.println("========== Unir todas las palabras ===========");
        String resultado = Arrays.stream(palabras)
            .collect(Collectors.joining("|"));

        System.out.println(resultado);

    }
}
