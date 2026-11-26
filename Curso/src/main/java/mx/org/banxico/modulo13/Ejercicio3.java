package mx.org.banxico.modulo13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import mx.org.banxico.modulo4.Empleado;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        List<Empleado> empleados = new ArrayList<>();

        empleados.add(new Empleado(
            "Carlos", "Trejo", 75500.00, "Ventas"));
        empleados.add(new Empleado(
            "Norma", "Trejo", 57000.00, "Ventas"));
        empleados.add(new Empleado(
            "Maira", "Trejo", 23000.00, "Marketing"));
        empleados.add(new Empleado(
            "Laura", "Perez", 25000.00, "TI"));
        empleados.add(new Empleado(
            "Brenda", "Hernandez", 290000.00, "TI"));
        empleados.add(new Empleado(
            "Luis", "Rosales", 189900.00, "Marketing"));


        // 1. Obtener todos los empleados
        //empleados.stream().forEach(System.out::println);

        // 2. Obtener los empleados cuyo salario esté entre 4000 y 6000 en orden ascendente por salario.
        System.out.println("========= Empleados entre 4000 y 6000 ===========");
        empleados.stream()
            .filter(empleado -> empleado.getSuledo() >= 4000 && empleado.getSuledo() <= 6000)
            .sorted(Comparator.comparingDouble(Empleado::getSuledo))
            .forEach(System.out::println);

        // 3. Obtener sólo el primer empleado cuyo salario esté entre 4000 y 6000
        System.out.println("========= Primer empleado entre 4000 y 6000 ===========");
        Optional<Empleado> primerEmpleado = empleados.stream()
            .filter(empleado -> empleado.getSuledo() >= 4000 && empleado.getSuledo() <= 6000)
            .findFirst();

        primerEmpleado.ifPresentOrElse(
            System.out::println, 
            () -> System.out.println("No se encontro ningun empleado"));

        // 4. Ordenar los empleados por apellido paterno y luego por primer nombre.
        System.out.println("========= Ordernar por ap y nombre ===========");
        empleados.stream()
            .sorted(
                Comparator.comparing(Empleado::getPrimerApellido)
                    .thenComparing(Empleado::getNombre))
            .forEach(System.out::println);

        // 5. Mostrar los apellidos de empleados únicos.
        System.out.println("========= Mostrar los apellidos de empleados unicos ===========");
        empleados.stream()
            .map(Empleado::getPrimerApellido)
            .distinct()
            .forEach(System.out::println);

        // 6. Agrupar los empleados por departamento
        System.out.println("========= Empleados por departamento ===========");
        Map<String, List<Empleado>> lista = empleados.stream()
            .collect(Collectors.groupingBy(
                Empleado::getDepartamento, Collectors.toList()));
        
        System.out.println(lista);

        // 7. Sumar los salarios
        System.out.println("========= Suma de los salarios ===========");
        double sumaTotal = empleados.stream()
            .mapToDouble(Empleado::getSuledo)
            .sum();

        System.out.println("suma total de salarios: " + sumaTotal);

    }
}
