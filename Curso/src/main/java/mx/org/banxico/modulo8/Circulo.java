package mx.org.banxico.modulo8;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter 
@Getter 
@NoArgsConstructor 
@ToString 
public class Circulo extends FiguraBidimensional {
    
    private double radio;
    private double circunferencia;

    public Circulo(double radio, double circunferencia) {
        this.radio = radio;
        this.circunferencia = circunferencia;
    }

    public Circulo(double area, double perimetro, double radio, double circunferencia) {
        super(area, perimetro);
        this.radio = radio;
        this.circunferencia = circunferencia;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return Math.PI * radio * 2;
    }
}
