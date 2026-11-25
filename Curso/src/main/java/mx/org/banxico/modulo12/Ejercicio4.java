package mx.org.banxico.modulo12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        try {
            abrirArchivo();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void abrirArchivo() 
        throws FileNotFoundException, IOException {

        FileReader archivo = new FileReader("hola.txt");
        archivo.close();
    }
}
