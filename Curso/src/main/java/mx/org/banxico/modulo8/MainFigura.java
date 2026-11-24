package mx.org.banxico.modulo8;

public class MainFigura {
    
    public static void main(String[] args) {
        
        Figura figura = new Figura();
        System.out.println("######### Figura #########");
        System.out.println("Area: " + figura.calcularArea());
        System.out.println("Perimetro: " + figura.calcularPerimetro());
        System.out.println(figura);

        FiguraBidimensional figuraBidimensional = new FiguraBidimensional();
        System.out.println("######### FiguraBidimensional #########");
        System.out.println("Area: " + figuraBidimensional.calcularArea());
        System.out.println("Perimetro: " + figuraBidimensional.calcularPerimetro());
        System.out.println(figuraBidimensional);

        Circulo circulo = new Circulo(25.0, 9.0);
        System.out.println("######### Circulo #########");
        System.out.println("Area: " + circulo.calcularArea());
        System.out.println("Perimetro: " + circulo.calcularPerimetro());
        System.out.println(circulo);

        Cuadrado cuadrado = new Cuadrado(45.9);
        System.out.println("######### Cuadrado #########");
        System.out.println("Area: " + cuadrado.calcularArea());
        System.out.println("Perimetro: " + cuadrado.calcularPerimetro());
        System.out.println(cuadrado);

        Triangulo triangulo = new Triangulo(21.0,23.4);
        System.out.println("######### Triangulo #########");
        System.out.println("Area: " + triangulo.calcularArea());
        System.out.println("Perimetro: " + triangulo.calcularPerimetro());
        System.out.println(triangulo);
    }
}
