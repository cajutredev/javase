package mx.org.banxico.modulo8;

import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString 
@NoArgsConstructor 
public abstract class FiguraBidimensional extends Figura {
    
    public FiguraBidimensional(double area, double perimetro) {
        super(area, perimetro);
    }
}