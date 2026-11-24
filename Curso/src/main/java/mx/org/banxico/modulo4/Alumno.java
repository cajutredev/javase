package mx.org.banxico.modulo4;

import javax.swing.JOptionPane;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor 
@Getter 
@Setter 
@ToString 
public class Alumno {

    @NonNull 
    private String nombre;
    @NonNull 
    private String primerApellido;
    private Integer edad;
    private int calificacion;

    public int calcularCalificacion(int numeroExamenes, int sumaTotalCalificacion) {
        setCalificacion(sumaTotalCalificacion / numeroExamenes);
        return getCalificacion();
    }

    public static void main(String[] args) {
        
        String nombre = JOptionPane.showInputDialog("Introduce el nombre: ");
        String primerApellido = JOptionPane.showInputDialog("Introduce el nombre: ");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce el nombre: "));

        Alumno alumno = new Alumno(nombre, primerApellido);
        alumno.setEdad(edad);
        alumno.calcularCalificacion(3, 27);

        JOptionPane.showMessageDialog(null, alumno.toString());
    }
}
