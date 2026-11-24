package mx.org.banxico.modulo10.fecha_y_hora;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Fecha {
    
    public static void main(String[] args) {
        
        // 1. Obtener fecha actual
        LocalDate fechaActual = LocalDate.now();
        System.out.println("Fecha actual: " + fechaActual);

        // 2. Crear una fecha especifica
        LocalDate fechaNacimiento = LocalDate.of(1990, 01, 01);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);

        // 3. Crear una fecha utilizando mes
        LocalDate fechaEvento = LocalDate.of(1990, Month.DECEMBER, 01);
        System.out.println("Fecha de evento: " + fechaEvento);

        // 4. Obtener los componentes de una fecha
        System.err.println("\n ======= Componentes de una fecha =============");
        System.err.println("Anio: " + fechaEvento.getYear());
        System.err.println("Mes: " + fechaEvento.getMonth());
        System.err.println("Mes nunerico: " + fechaEvento.getMonthValue());
        System.err.println("Dia del mes: " + fechaEvento.getDayOfMonth());
        System.err.println("Dia de la semana: " + fechaEvento.getDayOfWeek());
        System.err.println("Dia del año: " + fechaEvento.getDayOfYear());

        // 5. Validar si es año bisiesto
        LocalDate fechaBisiesto = LocalDate.of(2024, 1, 1);
        System.out.println("Es bisiesto? " + fechaBisiesto.isLeapYear());

        // 6. Comparar fechas
        LocalDate fecha1 = LocalDate.of(2024, 1, 1);
        LocalDate fecha2 = LocalDate.of(2024, 5, 13);
        System.err.println("\n ======= Comparacion de fechas =============");
        System.out.println("fecha1 es anterior a fecha2? " + fecha1.isBefore(fecha2));
        System.out.println("fecha1 es posterior a fecha2? " + fecha1.isAfter(fecha2));
        System.out.println("fecha1 es igual a fecha2? " + fecha1.isEqual(fecha2));

        // 7. Validar fechas no existentes
        LocalDate fechaInexistente = LocalDate.of(2024, 2, 29);
        System.out.println("Fecha inexistente: " + fechaInexistente);

        // 8. Formatear una fecha
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Fecha formateada: " + fechaInexistente.format(formato));
        
    }
}
