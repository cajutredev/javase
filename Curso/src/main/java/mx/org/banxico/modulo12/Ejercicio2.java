package mx.org.banxico.modulo12;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        try {
            System.out.println("Antes de lanzar la excepcion");
            throw new ArithmeticException("Excepcion lanzada en main");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
