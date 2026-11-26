package mx.org.banxico.modulo14;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        DescargaArchivo descargaArchivo = new DescargaArchivo();
        ProcesarDatos procesarDatos = new ProcesarDatos();
        GenerarReporte generarReporte = new GenerarReporte();

        Thread hiloDescarga = new Thread(descargaArchivo, "HiloDescarga");
        hiloDescarga.setPriority(Thread.MIN_PRIORITY);
        Thread hiloProcesamiento = new Thread(procesarDatos, "HiloProcesamiento");
        hiloProcesamiento.setPriority(Thread.NORM_PRIORITY);
        Thread hiloReporte = new Thread(generarReporte, "HiloReporte");
        hiloReporte.setPriority(Thread.MAX_PRIORITY);

        System.out.println("=========== Inicio de tareas ===========");
        hiloDescarga.start();
        hiloProcesamiento.start();
        hiloReporte.start();
        System.out.println("=========== FIN de tareas ===========");
    }
}

    class DescargaArchivo implements  Runnable {

        @Override
        public void run() {
            Thread hiloActual = Thread.currentThread();
            System.out.println(hiloActual.getName() + " Iniciando las descarga del archivo..");

            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                    System.out.println(hiloActual.getName() + " Descargando archivo: " + (i * 20) + "%");
                } catch (InterruptedException e) {
                    System.out.println(hiloActual.getName() +  " fue interrumpida");
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println(hiloActual.getName() +  " Archivo descargado correctamente.");
        }
    }

    class ProcesarDatos implements  Runnable {

        @Override
        public void run() {
            Thread hiloActual = Thread.currentThread();
            System.out.println(hiloActual.getName() + " Iniciando la insercion de datos en la Base");

            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep((1000));
                    System.out.println(hiloActual.getName() + " Insertando registro: " + (i + 1));
                } catch (InterruptedException e) {
                    System.out.println(hiloActual.getName() +  " fue interrumpida");
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println(hiloActual.getName() +  " Registros insertados correctamente");
        }
    }

    class GenerarReporte implements  Runnable {

        @Override
        public void run() {
            Thread hiloActual = Thread.currentThread();
            System.out.println(hiloActual.getName() + " Iniciando la generacion del reporte");

            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                    System.out.println(hiloActual.getName() + " Generando la seccion del reporte: " + (i + 1));
                } catch (InterruptedException e) {
                    System.out.println(hiloActual.getName() +  " fue interrumpida");
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println(hiloActual.getName() +  " La generacion del reporte ha sido terminada");
        }
    }

