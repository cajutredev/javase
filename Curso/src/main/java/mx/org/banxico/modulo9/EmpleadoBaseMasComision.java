package mx.org.banxico.modulo9;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor 
@Setter 
@Getter 
@ToString 
public class EmpleadoBaseMasComision extends EmpleadoPorComision {
    
    private double salarioBase;

    public EmpleadoBaseMasComision(String nombre, String primerApellido, String nss, double ventasBrutas,
            double tarifaComision, double salarioBase) {
        super(nombre, primerApellido, nss, ventasBrutas, tarifaComision);
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + salarioBase;
    }
}
