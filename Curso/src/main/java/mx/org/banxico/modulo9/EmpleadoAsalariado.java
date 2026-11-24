package mx.org.banxico.modulo9;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor 
@Setter 
@Getter 
@ToString 
public class EmpleadoAsalariado extends  Empleado {
    
    private double salarioSemanal;

    public EmpleadoAsalariado(String nombre, String primerApellido, String nss, double salarioSemanal) {
        super(nombre, primerApellido, nss);
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public double calcularSalario() {
        return salarioSemanal;
    }
    
}
