package mx.org.banxico.modulo14;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        TareaContador tarea1 = new TareaContador("Tarea1", 5);
        TareaContador tarea2 = new TareaContador("Tarea2", 7);
        TareaContador tarea3 = new TareaContador("Tarea3", 2);

        Thread hilo1 = new Thread(tarea1, "Hilo1");
        Thread hilo2 = new Thread(tarea2, "Hilo2");
        Thread hilo3 = new Thread(tarea3, "Hilo3");

        System.out.println("Iniciando tareas concurrentes");
        hilo1.start();
        hilo2.start();
        hilo3.start();
        
        System.out.println("El hilo principal ha terminado");
    }
}

class TareaContador implements Runnable {

    private final String nombre;
    private final int limite;

    
    public TareaContador(String nombre, int limite) {
        this.nombre = nombre;
        this.limite = limite;
    }

    @Override
    public void run() {

        //Obtener una referencia al hilo actual
        Thread hiloActual = Thread.currentThread();

        System.out.println(nombre + " ha comenzado. Ejecutandose en: " + hiloActual.getName());

        for (int i = 0; i < limite; i++) {
            try {
                System.out.println(nombre + " - Contador: " + i);
                int tiempoEspera = (int)(Math.random() * 4000);
                Thread.sleep(tiempoEspera);
            } catch (InterruptedException e) {
                System.out.println(nombre +  " fue interrumpia");
                Thread.currentThread().interrupt();
            }

        }
        System.out.println(nombre + " ha finalizado");
    }

}