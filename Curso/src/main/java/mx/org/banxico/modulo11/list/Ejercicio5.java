package mx.org.banxico.modulo11.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import mx.org.banxico.modulo4.Estudiante;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        List<Estudiante> estudiantes = new ArrayList<>();

        Estudiante estudiante1 = new Estudiante(
            "Juan","Trejo", 35, 10);
        Estudiante estudiante2 = new Estudiante(
            "Maira","Perez", 20, 10);
        Estudiante estudiante3 = new Estudiante(
            "Lorena","Martinez", 30, 10);
        Estudiante estudiante4 = new Estudiante(
            "Pedro","Ramirez", 39, 10);
        Estudiante estudiante5 = new Estudiante(
            "Laura","Lorenzana", 25, 10);

        estudiantes.add(estudiante1);
        estudiantes.add(estudiante2);
        estudiantes.add(estudiante3);
        estudiantes.add(estudiante4);
        estudiantes.add(estudiante5);

        // 1. Ordenar por nombre
        Comparator<Estudiante> porNombre = new Comparator<Estudiante>() {
            @Override
            public int compare(Estudiante o1, Estudiante o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
        };

        Collections.sort(estudiantes, porNombre);
        System.out.println(estudiantes);

    }
}
