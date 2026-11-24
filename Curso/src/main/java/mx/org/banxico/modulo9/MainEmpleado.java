package mx.org.banxico.modulo9;

public class MainEmpleado {
    
    public static void main(String[] args) {
        
        PorPagar empleadoAsalariado = new EmpleadoAsalariado(
            "Juan", "trejo", "ABCDE", 2234.0);

        PorPagar empleadoPorHoras = new EmpleadoPorHoras(
            "Pedro", "Martinez", "DEFGH", 3445.56, 40);

        System.out.println("########### EmpleadoAsalariado #############");
        System.out.println("Salario: " + empleadoAsalariado.obtenerMontoPago());
        System.out.println(empleadoAsalariado);
        System.out.println();

        System.out.println("########### EmpleadoPorHoras #############");
        System.out.println("Salario: " + empleadoPorHoras.obtenerMontoPago());
        System.out.println(empleadoPorHoras);
        System.out.println();
    }
}
