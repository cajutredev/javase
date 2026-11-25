package mx.org.banxico.modulo12;

public class ExcepcionPersonalizada extends Exception {

    public ExcepcionPersonalizada() {
        super("Excepcion de tipo personalizada");
    }
    
    public ExcepcionPersonalizada(String mensaje) {
        super(mensaje);
    }
}
