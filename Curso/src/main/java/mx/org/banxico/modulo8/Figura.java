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
public class Figura {
    
    private double area;
    private double perimetro;

    public double calcularArea() {
        return -1.0;
    }

    public double calcularPerimetro() {
        return -1.0;
    }
}
