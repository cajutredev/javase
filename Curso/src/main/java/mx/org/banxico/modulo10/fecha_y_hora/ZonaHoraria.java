package mx.org.banxico.modulo10.fecha_y_hora;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonaHoraria {
    
    public static void main(String[] args) {
        
        // 1. Obtener la zona horaria del sistema
        ZoneId zonaSistema = ZoneId.systemDefault();
        System.out.println("Zona del sistema: " + zonaSistema);

        // 2. Crear zonas en especifico
        ZoneId zonaMexico = ZoneId.of("America/Mexico_City");
        ZoneId zonaMadrid = ZoneId.of("Europe/Madrid");
        ZoneId zonaTokyo = ZoneId.of("Asia/Tokyo");

        System.err.println("\n ======= Zonas horarias =============");
        System.out.println("Mexico: " + zonaMexico);
        System.out.println("MAdrid: " + zonaMadrid);
        System.out.println("Tokyo: " + zonaTokyo);

        // 3. Obtener horas de la zona horaria
        ZonedDateTime fechaMexico = ZonedDateTime.now(zonaMexico);
        ZonedDateTime fechaMAdrid = ZonedDateTime.now(zonaMadrid);
        ZonedDateTime fechaTokyo = ZonedDateTime.now(zonaTokyo);

        System.err.println("\n ======= Fecha y hora por zona =============");
        System.out.println("Mexico: " + fechaMexico);
        System.out.println("MAdrid: " + fechaMAdrid);
        System.out.println("Tokyo: " + fechaTokyo);
        System.out.println("Tokyo offset: " + fechaTokyo.getOffset());
        System.out.println("Tokyo offset: " + fechaTokyo.getZone());

        // 4. Convertir una fecha a otra zona horaria conservando el mismo tiempo/instante
        System.err.println("\n ======= Conversion de zonas =============");

        ZonedDateTime reunionTiempoCdmx = ZonedDateTime.of(
            2026, 11, 24, 18, 0, 0, 0, zonaMexico);

        ZonedDateTime reunionTiempoMadrid = reunionTiempoCdmx.withZoneSameInstant(zonaMadrid);
        ZonedDateTime reunionTiempoTokyo = reunionTiempoCdmx.withZoneSameInstant(zonaTokyo);

        System.out.println("Mexico CDMX: " + reunionTiempoCdmx);
        System.out.println("Mexico Madrid: " + reunionTiempoMadrid);
        System.out.println("Mexico Tokyo: " + reunionTiempoTokyo);

        // 5. Cambiar de zona conservando hora local
        ZonedDateTime mismaHoraMadrid = reunionTiempoCdmx.withZoneSameInstant(zonaMadrid);
        System.err.println("\n ======= Convervar hora local =============");
        System.out.println("Mexico: " + reunionTiempoCdmx);
        System.out.println("Madrid: " + mismaHoraMadrid);


        // 6. Crear un ZoneOfsset de manera manual
        ZoneOffset offsetUtc = ZoneOffset.UTC;
        ZoneOffset offsetFijo = ZoneOffset.of("-06:00");
        System.err.println("\n ======= ZoneOffset =============");
        System.out.println("UTC: " + offsetUtc);
        System.out.println("offset fijo: " + offsetFijo);
        OffsetDateTime fechaConOffsetId = OffsetDateTime.of(
            2026, 11, 20, 14, 30, 0, 0, offsetFijo);

        System.out.println(fechaConOffsetId);
        
        // 7. Obtener el instante utc
        Instant instante = reunionTiempoCdmx.toInstant();
        System.out.println("Instante utc: " + instante);

        // 8. Sumar y restar tiempo
        System.out.println("------ Operaciones --------");
        System.out.println("Original: " + reunionTiempoCdmx);
        System.out.println("sumar 2 horas: " + reunionTiempoCdmx.plusHours(2));
        System.out.println("restar 30 minutos: " + reunionTiempoCdmx.minusMinutes(30));

        // 9. Extraer LocalDate, LocalTime
        System.out.println("Fecha: " + reunionTiempoCdmx.toLocalDate());
        System.out.println("Hora: " + reunionTiempoCdmx.toLocalTime());

        // 10. Consultar zonas horarias
        Set<String> zonasDisponibles = ZoneId.getAvailableZoneIds();
        System.out.println("--------- Zonas disponibles --------");
        System.out.println("Total de zonas: " + zonasDisponibles.size());
        System.out.println("Existe zona de cdmx? " + zonasDisponibles.contains("America/Mexico_City"));

    }
}
