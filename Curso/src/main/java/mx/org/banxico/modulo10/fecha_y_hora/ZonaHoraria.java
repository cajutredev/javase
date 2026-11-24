package mx.org.banxico.modulo10.fecha_y_hora;

import java.time.ZoneId;
import java.time.ZonedDateTime;

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
    }
}
