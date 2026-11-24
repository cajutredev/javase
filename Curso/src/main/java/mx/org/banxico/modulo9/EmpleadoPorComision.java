package mx.org.banxico.modulo9;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor 
@Setter 
@Getter 
@ToString 
public class EmpleadoPorComision extends Empleado {
    
    private double ventasBrutas;
    private double tarifaComision;
    
    public EmpleadoPorComision(String nombre, String primerApellido, String nss, double ventasBrutas,
            double tarifaComision) {
        super(nombre, primerApellido, nss);
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }

    @Override
    public double calcularSalario() {
        return tarifaComision * ventasBrutas;
    }
}
