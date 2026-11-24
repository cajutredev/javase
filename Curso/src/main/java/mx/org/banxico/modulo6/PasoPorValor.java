package mx.org.banxico.modulo6;

import mx.org.banxico.modulo4.Estudiante;

public class PasoPorValor {

    
    public static void saludar(Estudiante estudiante) {

        estudiante.setNombre("Pablo");
        System.out.println("Nombre del estudiante: " + estudiante.getNombre());
    }

    public static void main(String[] args) {
        // Estudiante estudiante = new Estudiante();
        // estudiante.setNombre("Original");
        // saludar(estudiante);
        // System.out.println(estudiante.getNombre());

        // Comprobacion de strings

        String saludo1 = "Hola";
        String saludo2 = "Hola";
        String saludo3 = new String("Hola");

        System.out.println(saludo1 == saludo2);
        System.out.println(saludo1 == saludo3);
        System.out.println(saludo1.equals(saludo3));
    }
}
