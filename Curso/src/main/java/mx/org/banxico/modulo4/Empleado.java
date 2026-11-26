package mx.org.banxico.modulo4;

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
public class Empleado {
    
    private String nombre;
    private String primerApellido;
    private double suledo;
    private String departamento;
}
