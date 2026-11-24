package mx.org.banxico.modulo5;

import javax.swing.JOptionPane;

import mx.org.banxico.modulo4.Estudiante;

public class PromedioEstudiante {

    public static void main(String[] args) {
        int centinela = 0;
        int estudiatesAprobaron = 0;
        int estudiatesReprobaron = 0;
        String salida = "Resumen\n\n";

        Estudiante estudiante;

        while (centinela >= 0) {
            String nombre = JOptionPane.showInputDialog("Introduce el nombre: ");
            String primerApellido = JOptionPane.showInputDialog("Introduce el primerApellido: ");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce el edad: "));

            estudiante = new Estudiante();

            estudiante.setNombre(nombre);
            estudiante.setPrimerApellido(primerApellido);
            estudiante.setEdad(edad);

            int sumatoriaParciales = ((int)(Math.random() * 30)) + 1;
            int calificacion = estudiante.calcularCalificacion(3, sumatoriaParciales);
            
            if (calificacion >= 6) {
                estudiatesAprobaron++;
            } else {
                estudiatesReprobaron++;
            }

            salida += String.format(
                "Nombre: %s, Apellido: %s, Edad: %s, Calificacion: %s\n\n",
                estudiante.getNombre(),
                estudiante.getPrimerApellido(),
                estudiante.getEdad(),
                estudiante.getCalificacion()
            );

            centinela = Integer.parseInt(
                JOptionPane.showInputDialog("1 para continuar 0 -1 para salir"));
        }

        salida += String.format("Se evaluaron %s estudiantes: ", 
            (estudiatesAprobaron + estudiatesReprobaron)
        );

        salida += String.format("%s estudiantes aprobaron\n", estudiatesAprobaron);
        salida += String.format("%s estudiantes reprobaron", estudiatesReprobaron);

        JOptionPane.showMessageDialog(null, salida);
    }
}
