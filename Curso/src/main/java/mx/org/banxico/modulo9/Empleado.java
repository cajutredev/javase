package mx.org.banxico.modulo9;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor 
@AllArgsConstructor 
@Setter 
@Getter 
@ToString 
public abstract class Empleado implements PorPagar {
    
    private String nombre;
    private String primerApellido;
    private String nss;

    public abstract double calcularSalario();

    @Override
    public double obtenerMontoPago() {
        return calcularSalario();
    }
}
