package mx.org.banxico.modulo14;

public class Ejercicio6 {

    public static void main(String[] args) {

        Runnable tarea1 = new Tarea("Hilo1", 5000);
        Runnable tarea2 = new Tarea("Hilo2", 8000);

        Thread hilo1 = new Thread(tarea1, "Hilo1");
        Thread hilo2 = new Thread(tarea2, "Hilo2");

        System.out.println("MAIN: Iniciando hilos");

        hilo1.start();
        hilo2.start();

        System.out.println("MAIN: Voy a esperar a que termine hilo1 y hilo2");

        try {
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }

        System.out.println("MAIN: hilo1 termino");
        System.out.println("MAIN: hilo2 termino");
        System.out.println("MAIN: fin del programa");


        
    }
}

class Tarea implements Runnable {

    private final String nombre;
    private final int tiempoEspera;

    public Tarea(String nombre, int tiempoEspera) {
        this.nombre = nombre;
        this.tiempoEspera = tiempoEspera;
    }

    @Override
    public void run() {

        System.out.println(nombre + ": comienza ejecucion");

        try {
            Thread.sleep(tiempoEspera);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }

        System.out.println(nombre + ": Ha terminado su trabajo");

    }
    
}
