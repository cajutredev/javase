package mx.org.banxico.modulo11.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Crear un programa que realize operaciones entre conjuntos
 * a partir de dos conjuntos de participantes
 * 
 * Ejercicio2
 */
public class Ejercicio2 {
 
    public static void main(String[] args) {
        
        // 1. Crear los conjuntos de participantes
        List<String> participantesJava = new ArrayList<>();
        participantesJava.add("Carlos");
        participantesJava.add("Mariana");
        participantesJava.add("Pedro");
        participantesJava.add("Ana");
        participantesJava.add("Lorena");
        participantesJava.add("Esmeralda");
        participantesJava.add("Victor");

        List<String> participantesJavascript = new ArrayList<>();
        participantesJavascript.add("Carlos");
        participantesJavascript.add("Luis");
        participantesJavascript.add("Patricia");
        participantesJavascript.add("Ana");
        participantesJavascript.add("Juan");
        participantesJavascript.add("Esmeralda");
        participantesJavascript.add("Fernando");

        // 2. Operacion de Union
        Set<String> union = new HashSet<>(participantesJava);
        union.addAll(participantesJavascript);
        System.out.println("========== UNION =========");
        System.out.println(union);
        System.out.println("Total de participantes: " + union.size());

        // 3. Operacion de interseccion
        Set<String> interseccion = new HashSet<>(participantesJava);
        interseccion.retainAll(participantesJavascript);
        System.out.println("========== INTERSECCION =========");
        System.out.println(interseccion);
        System.out.println("Total de participantes: " + interseccion.size());

        // 4. Direrencia A - B (Java - Javascript)
        Set<String> diferenciaAB = new HashSet<>(participantesJava);
        diferenciaAB.removeAll(participantesJavascript);
        System.out.println("========== DIFERENCIA A - B =========");
        System.out.println(diferenciaAB);
        System.out.println("Total de participantes: " + diferenciaAB.size());

        // 5. Direrencia B - A (Javascript - Java)
        Set<String> diferenciaBA = new HashSet<>(participantesJavascript);
        diferenciaBA.removeAll(participantesJava);
        System.out.println("========== DIFERENCIA A - B =========");
        System.out.println(diferenciaBA);
        System.out.println("Total de participantes: " + diferenciaBA.size());

        // 6. Inclusion. Comprobar si un conjunto contiene
        // todos los elementos de otro conjunto
        String mensaje = participantesJavascript.containsAll(participantesJava)
            ? "Todos los participantes de java tambien estan en javascript"
            : "No todos los participantes de java estan en javascript";

        System.out.println("========== INCLUSION =========");
        System.out.println(mensaje);
    }
}
