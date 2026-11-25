package mx.org.banxico.modulo10.archivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CrearYComprobar {
    
    public static final String CARPETA = "src\\main\\java\\mx\\org\\banxico\\modulo10\\archivos\\directorio_prueba";
    public static final String ARCHIVO = "prueba.txt";

    public static void main(String[] args) {
        
        Path carpeta = Path.of(CARPETA);
        Path archivo = carpeta.resolve(ARCHIVO);

        try {
            // 1. Crear el directorio
            Files.createDirectories(carpeta);
            System.out.println("Directorio creado");

            // 2. Crear el archivo si no exsite
            if (Files.exists(archivo)) {
                System.out.println("El archivo ya existe");
            } else {
                Files.createFile(archivo);
                System.out.println("El archivo se creo correctamente");
            }

            System.out.println("Existe el nuevo archivo " + Files.exists(archivo));

            // 3. Comprobar el tipo de elemento
            System.out.println("Es archivo? " + Files.isRegularFile(archivo));

            // 4. Comprobar si es un directorio
            System.out.println("Es un directorio? " + Files.isDirectory(carpeta));

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
