package mx.org.banxico.modulo4;

import javax.swing.JOptionPane;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter 
@AllArgsConstructor 
@NoArgsConstructor 
@ToString 
public class Fecha {
    
    private int dia;
    private int mes;
    private int anio;

    public String mostrarFecha() {
        return String.format("%s/%s/%s", getDia(), getMes(), getAnio());
    }

    public static void main(String[] args) {
        // Fecha fecha = new Fecha(12,05,2026);
        Fecha fecha = new Fecha();
        JOptionPane.showMessageDialog(null, fecha.mostrarFecha());
    }
}
