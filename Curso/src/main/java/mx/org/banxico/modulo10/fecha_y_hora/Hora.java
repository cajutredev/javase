package mx.org.banxico.modulo10.fecha_y_hora;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Hora {
    
    public static void main(String[] args) {
        
        // 1. Obtnener la hora actual
        LocalTime horaActual = LocalTime.now();
        System.out.println("Hora actual: " + horaActual);

        // 2. Crear una hora especifica
        LocalTime horaEspecifica = LocalTime.of(23, 11, 10);
        System.out.println("Hora especifica: " + horaEspecifica);

        // 3. Obtener los componentes de la hora
        System.err.println("\n ======= Componentes de la hora =============");
        System.out.println("Hora: " + horaActual.getHour());
        System.out.println("Minustos: " + horaActual.getMinute());
        System.out.println("Segundos: " + horaActual.getSecond());
        System.out.println("Nanosegundos: " + horaActual.getNano());

        // 4. Modificar una hora
        LocalTime nuevaHora = horaActual
            .withHour(15)
            .withMinute(45);

        System.out.println("hora original: " + horaActual);
        System.out.println("nueva hora: " + nuevaHora);

        // 5. Sumar y restar tiempo
        LocalTime horaInicio = LocalTime.of(20, 10, 10);
        System.err.println("\n ======= Operaicones con hora =============");
        System.out.println("Hora inicial: " + horaInicio);
        System.out.println("sumar 2 horas: " + horaInicio.plusHours(2));
        System.out.println("sumar 30 minutos: " + horaInicio.plusMinutes(30));
        System.out.println("sumar 45 segundos: " + horaInicio.plusSeconds(45));
        System.out.println("restar 10 horas: " + horaInicio.minusHours(10));
        System.out.println("restar 20 minutos: " + horaInicio.minusMinutes(20));

        // 6. Comparar horas
        LocalTime hora1 = LocalTime.of(9, 31);
        LocalTime hora2 = LocalTime.of(9, 59);

        System.err.println("\n ======= Comparar horas =============");
        System.out.println("hora1 es anterior a hora2? " + hora1.isBefore(hora2));
        System.out.println("hora1 es posterior a hora2? " + hora1.isAfter(hora2));
        System.out.println("hora1 es igual a hora2? " + hora1.equals(hora2));
        System.out.println("hora1 es igual a hora2 usando compareTo? " + hora1.compareTo(hora2));

        // 7. Obtener inicio y final del dia
        System.err.println("\n ======= Limites del dia =============");
        System.out.println("inicio del dia: " + LocalTime.MIN);
        System.out.println("Final del dia " + LocalTime.MAX);
        System.out.println("Mediodia " + LocalTime.NOON);
        System.out.println("Medianoche " + LocalTime.MIDNIGHT);

        // 8. Comprobar si una hora esta entre dos horas
        System.err.println("\n ======= Horario laboral =============");
        LocalTime horaAEvaluar = LocalTime.of(9, 59);
        LocalTime apertura = LocalTime.of(9, 0);
        LocalTime cierre = LocalTime.of(18, 0);

        boolean dentroHorario = 
            horaAEvaluar.isAfter(apertura)
            && horaAEvaluar.isBefore(cierre);

        System.out.println("La hora evaluar esta dentro del horario laboral: " + dentroHorario);

        // . formatear hora
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime horaCompleta = LocalTime.of(9, 59, 59, 343423);
        System.out.println("Hora formateada: " + horaCompleta.format(formatoHora));
    }
}
