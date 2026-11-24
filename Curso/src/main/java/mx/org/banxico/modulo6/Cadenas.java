package mx.org.banxico.modulo6;

public class Cadenas {
    
    public static final int ITERACIONES = 300_000;
    public static void main(String[] args) {
        String saludoString = "";

        long inicioString = System.nanoTime();
        for (int i = 0; i < ITERACIONES; i++) {
            saludoString += i;
        }
        long finString = System.nanoTime();
        double tiempoString = (finString - inicioString) / 1_000_000.0;

        System.out.printf("Tiempo con concatenacion +   :%.2fms%n", tiempoString);

        long inicioBuilder = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ITERACIONES; i++) {
            sb.append(i);
        }
        long finBuilder = System.nanoTime();
        double tiempoBuilder = (finBuilder - inicioBuilder) / 1_000_000.0;

        System.out.printf("Tiempo con StringBuilder   :%.2fms%n", tiempoBuilder);

    }
}
