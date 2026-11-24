package mx.org.banxico.modulo8;

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
public abstract class Figura {
    
    private double area;
    private double perimetro;

    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}
