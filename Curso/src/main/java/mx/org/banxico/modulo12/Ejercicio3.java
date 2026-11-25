package mx.org.banxico.modulo12;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        try {
            Lanzar.lanzarExcepcion();
        } catch (Exception e) {
            System.out.println("Se atrapa nuevamente la excepcion en metodo main");
            e.printStackTrace();
        }
    }
}

class Lanzar {

    static void lanzarExcepcion() {
        try {
            int division = 1 / 0;
        } catch (Exception e) {
            System.out.println("Se atrapa la excepcion en la clase Lanzar");
            throw e;
        }
    }
}
