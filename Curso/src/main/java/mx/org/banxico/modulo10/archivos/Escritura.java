package mx.org.banxico.modulo10.archivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Escritura {
    
    public static void main(String[] args) {
        agregarContenido();
    }

    public static void agregarContenido() {
        Path ruta = Path.of("alumnos.csv");
        //String nuevoAlumno = "119,Mariana,Torres,Tester\n";
        String parrafo = """
            hola, este es nuevo parrafo
            para el archivo de alumnos.csv
            Con una tercera linea
        """;

        try {
            Files.writeString(
                ruta, 
                parrafo,
                StandardCharsets.UTF_8,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND
            );
        } catch (IOException e) {
            System.out.println("error al procesar el archivo: " + e.getMessage());

        }
    }

    public static void crearArchivoConLista() {
        Path ruta = Path.of("alumnos.csv");

        List<String> alumnos = List.of(
            "1,Juan,Perez,Desarrollador",
            "2,Pedro,Perez,Analista",
            "106,Maira,Perez,Diseñadora"
        );

        try {
            Files.write(
                ruta, 
                alumnos,
                StandardCharsets.UTF_8
            );
        } catch (IOException e) {
            System.out.println("error al procesar el archivo: " + e.getMessage());

        }
    }

    public static void crearArchivoConEscrituraAutomatica() {

        try (BufferedWriter escritor = new BufferedWriter(
                new FileWriter("empleados.csv", StandardCharsets.UTF_8))) {

            escritor.write("104,Juan,Perez,Desarrollador");
            escritor.newLine();

            escritor.write("105,Pedro,Perez,Analista");
            escritor.newLine();

            escritor.write("106,Maira,Perez,Diseñadora");
            escritor.newLine();

        } catch (IOException e) {
            System.out.println("error al procesar el archivo: " + e.getMessage());

        }
    }

    public static void crearArchivoConBuffer() {
        try {
            
            BufferedWriter escritor = new BufferedWriter(
                new FileWriter("empleados.csv", StandardCharsets.UTF_8));

            escritor.write("101,Juan,Perez,Desarrollador");
            escritor.newLine();

            escritor.write("102,Pedro,Perez,Analista");
            escritor.newLine();

            escritor.write("103,Maira,Perez,Diseñadora");
            escritor.newLine();

            escritor.flush();
            escritor.close();
        } catch (IOException e) {
            System.out.println("error al procesar el archivo: " + e.getMessage());

        }
    }

    public static void crearArchivo() {

        try {
            FileWriter escritor = new FileWriter("mensaje.txt");

            escritor.write("Contenido que se sobreescribio\n");

            escritor.close();
        } catch (IOException e) {
            System.out.println("error al procesar el archivo: " + e.getMessage());
        }
    }
}
