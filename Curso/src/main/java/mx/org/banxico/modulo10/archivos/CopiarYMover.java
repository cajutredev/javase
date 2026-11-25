package mx.org.banxico.modulo10.archivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class CopiarYMover {
    
    public static final String CARPETA = "src\\main\\java\\mx\\org\\banxico\\modulo10\\archivos\\respaldo";
    public static final String ARCHIVO1 = "alumnos.csv";
    public static final String ARCHIVO2 = "empleados.csv";
    public static final String ARCHIVO3 = "mensaje.txt";

    public static void main(String[] args) {
        
        Path carpetaRespaldo = Path.of(CARPETA);
        
        Path origen1 = Path.of(ARCHIVO1);
        Path origen1Copia = carpetaRespaldo.resolve("alumnos_copia.csv");
        
        Path origen2 = Path.of(ARCHIVO2);
        Path origen2AMover = carpetaRespaldo.resolve("empleados_nuevo.csv");

        Path origen3 = Path.of(ARCHIVO3);

        try {
            // 1. Eliminar archivo
            Files.delete(origen3);

            // 2. Crear la carpeta de respaldo
            Files.createDirectories(carpetaRespaldo);

            // 3. Copiar archivo1 a la carpeta de respaldo
            Files.copy(
                origen1,
                origen1Copia,
                StandardCopyOption.REPLACE_EXISTING
            );
            System.out.println("archivo copiado correctamente");

            // 4. Mover el archivo2
            Files.move(
                origen2, origen2AMover, StandardCopyOption.REPLACE_EXISTING);

            System.out.println("Archivo2 movido y renombrado");

        } catch (IOException e) {
            System.out.println("error al procesar el archivo: " + e.getMessage());
        }

    }
}
