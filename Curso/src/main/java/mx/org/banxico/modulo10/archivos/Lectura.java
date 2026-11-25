package mx.org.banxico.modulo10.archivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Lectura {

    public static  final String ARCHIVO = "src\\main\\java\\mx\\org\\banxico\\modulo10\\archivos\\README.txt";
    public static void main(String[] args) {
        leerTodoElContenido();
    }

    public static void leerTodoElContenido() {

        Path ruta = Path.of(ARCHIVO);

        try {
            String contenido = Files.readString(ruta, StandardCharsets.UTF_8);
            System.out.println("Contenido: ");
            System.out.println(contenido);

        } catch (IOException e) {
            System.out.println("error al procesar el archivo: " + e.getMessage());
        }

    }

    public static void leerTodasLasLineas() {

        Path ruta = Path.of(ARCHIVO);

        try {

            List<String> lineas = Files.readAllLines(ruta);

            for (String linea : lineas) {
                System.out.println(linea);
            }

        } catch (FileNotFoundException e) {
            System.out.println("error al leer el archivo: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("error al leer el caracter: " + e.getMessage());

        }
    }

    /**
     * Metodo para leer linea por linea
     */
    public static void leerLineaPorLinea() {

        try (BufferedReader lector = new BufferedReader(
                new FileReader(ARCHIVO))) {

            String linea;

            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (FileNotFoundException e) {
            System.out.println("error al leer el archivo: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("error al leer el caracter: " + e.getMessage());

        }
    }

    /**
     * Metodo para leer caracter por caracter
     */
    public static void leerCaracterPorCaracter() {

        try {
            FileReader lector = new FileReader(ARCHIVO);
            int caracter;

            while ((caracter = lector.read()) != -1) {
                System.out.print((char)caracter);
            }

            lector.close();
        } catch (FileNotFoundException e) {
            System.out.println("error al leer el archivo: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("error al leer el caracter: " + e.getMessage());

        }
    }
}
