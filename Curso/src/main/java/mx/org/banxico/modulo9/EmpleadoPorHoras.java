package mx.org.banxico.modulo9;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor 
@Setter 
@Getter 
@ToString 
public class EmpleadoPorHoras extends Empleado {
    
    private double sueldo;
    private int horas;

    public EmpleadoPorHoras(String nombre, String primerApellido, String nss, double sueldo, int horas) {
        super(nombre, primerApellido, nss);
        this.sueldo = sueldo;
        this.horas = horas;
    }

    @Override
    public double calcularSalario() {
        
        double salarioHoras = 0.0;

        if (horas < 40) {
            salarioHoras = sueldo * horas;
        } else {
            salarioHoras = 40 * sueldo + (horas - 40) * sueldo * 1.5;
        }
        return salarioHoras;
    }

    
}
