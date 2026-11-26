package mx.org.banxico.modulo14;


public class Ejercicio4 {
    public static void main(String[] args) {
        
        CanalDatos canal = new CanalNoSincronizado();
        HiloProductor hiloProductor = new HiloProductor(canal);
        HiloConsumidor hiloConsumidor = new HiloConsumidor(canal);

        hiloProductor.start();
        hiloConsumidor.start();
    }    
}

interface CanalDatos {
    void escribirValor(int dato);
    int leerValor();
}

class CanalNoSincronizado implements CanalDatos {

    private int datoCompartido = -1;

    @Override
    public void escribirValor(int dato) {
        System.out.println(Thread.currentThread().getName() + " escribe " + dato);
        this.datoCompartido = dato;
    }

    @Override
    public int leerValor() {
        System.out.println(Thread.currentThread().getName() + " lee " + datoCompartido);
        return datoCompartido;
    }
}

class HiloProductor extends Thread {

    private final CanalDatos destino;
    
    public HiloProductor(CanalDatos destino) {
        super("HiloProductor");
        this.destino = destino;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep((int)(Math.random() * 4000));
                destino.escribirValor(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(getName() + " completo la produccion.");
    }
}

class HiloConsumidor extends Thread {

    private final CanalDatos origen;
    
    public HiloConsumidor(CanalDatos origen) {
        super("HiloConsumidor");
        this.origen = origen;
    }

    @Override
    public void run() {

        int acumulado = 0;

        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep((int)(Math.random() * 4000));
                acumulado += origen.leerValor();
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(getName() + " leyo valores dando una suma total de: " + acumulado);
    }
}
