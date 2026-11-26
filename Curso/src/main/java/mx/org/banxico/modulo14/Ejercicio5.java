package mx.org.banxico.modulo14;


public class Ejercicio5 {
    public static void main(String[] args) {
        
        CanalDatos canal = new CanalSincronizado();
        HiloProductor hiloProductor = new HiloProductor(canal);
        HiloConsumidor hiloConsumidor = new HiloConsumidor(canal);

        String encabezados = String.format(
            "%-40s %-15s %s","Operacion","Buffer","Ocupado");
        System.out.println(encabezados);
        System.out.println();
        hiloProductor.start();
        hiloConsumidor.start();
    }    
}

interface CanalDatos {
    void escribirValor(int dato);
    int leerValor();
}

class CanalSincronizado implements CanalDatos {

    private int datoCompartido = -1;
    private int ocupado = 0;

    @Override
    public synchronized void escribirValor(int dato) {
        
        String hiloActual = Thread.currentThread().getName(); 

        while (ocupado == 1) {
            try {
                System.out.println(hiloActual + " intenta escribir.");
                imprimirEstado("Canal lleno " + hiloActual + " espera");
                wait();

            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
        this.datoCompartido = dato;
        ocupado = 1;
        imprimirEstado(hiloActual + " escribe " + datoCompartido);
        notify();
    }

    @Override
    public synchronized int leerValor() {
        String hiloActual = Thread.currentThread().getName(); 

        while (ocupado == 0) {
            try {
                System.out.println(hiloActual + "intenta leer.");
                imprimirEstado("Canal vacio. " + hiloActual + " espera.");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
        ocupado = 0;
        imprimirEstado(hiloActual + " lee " + datoCompartido);
        notify();

        return datoCompartido;
    }

    public void imprimirEstado(String operacion) {
        String linea = String.format("%-40s %-15s %s", operacion, datoCompartido, ocupado);
        System.out.println(linea);
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
