package mx.org.banxico.modulo14;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        HiloTrabajador hilo1 = new HiloTrabajador("hilo1");
        hilo1.setPriority(Thread.MIN_PRIORITY);
        HiloTrabajador hilo2 = new HiloTrabajador("hilo2");
        hilo1.setPriority(Thread.NORM_PRIORITY);
        HiloTrabajador hilo3 = new HiloTrabajador("hilo3");
        hilo1.setPriority(Thread.MAX_PRIORITY);

        System.out.println("iniciando hilos");

        hilo1.start();
        hilo2.start();
        hilo3.start();

        System.out.println("Hilos finalizados");
    }
}

class HiloTrabajador extends Thread {

    private final int tiempoDeEsperaMs;

    public HiloTrabajador(String nombre) {
        super(nombre);
        this.tiempoDeEsperaMs = (int)(Math.random() * 5000);
    }

    @Override
    public void run() {
        try {
            System.out.println(this.getName() + " descansara durante " + tiempoDeEsperaMs);
            Thread.sleep(tiempoDeEsperaMs);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }

        System.out.println(this.getName() + " termino su descanso");
    }
}
