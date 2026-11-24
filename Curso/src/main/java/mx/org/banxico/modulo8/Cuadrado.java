package mx.org.banxico.modulo8;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString 
@NoArgsConstructor
@Getter 
@Setter  
public class Cuadrado extends FiguraBidimensional {
    
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public Cuadrado(double area, double perimetro, double lado) {
        super(area, perimetro);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return getLado() * getLado();
    }

    @Override
    public double calcularPerimetro() {
        return getLado() * 4;
    }

    
}
