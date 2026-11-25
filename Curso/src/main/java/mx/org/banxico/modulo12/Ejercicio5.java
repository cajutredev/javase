package mx.org.banxico.modulo12;

public class Ejercicio5 {
 
    public static void main(String[] args) {
        try {
            lanzarExcepcionPersonalizada();
        } catch (ExcepcionPersonalizada e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    static void lanzarExcepcionPersonalizada() throws ExcepcionPersonalizada {
        throw new ExcepcionPersonalizada();
    }
}
