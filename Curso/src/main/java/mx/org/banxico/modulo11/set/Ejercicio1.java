package mx.org.banxico.modulo11.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        // 1. Crear una lista de paticipantes
        List<String> participantes = new ArrayList<>();
        participantes.add("Carlos");
        participantes.add("Mariana");
        participantes.add("Pedro");
        participantes.add("Ana");
        participantes.add("Carlos");
        participantes.add("Mariana");
        participantes.add("Pedro");
        participantes.add("Ana");
        participantes.add("Carlos");
        participantes.add("Mariana");
        participantes.add("Pedro");
        participantes.add("Ana");

        System.out.println(participantes);

        // 2. Crear una HashSet a partir de la lista
        Set<String> participantesUnicos = new HashSet<>(participantes);

        for (String nombre : participantesUnicos) {
            System.out.println(nombre);
        }
        System.out.println("Tamanio lista original: " + participantes.size());
        System.out.println("Tamanio set: " + participantesUnicos.size());
        System.out.println("Existe Victor en el conjunto set: " + participantesUnicos.contains("Victor"));
    }
}
