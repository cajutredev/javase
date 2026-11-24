package mx.org.banxico.modulo6;

import javax.swing.JOptionPane;

public class AdivinaNumero {

    public static void jugar() {
        int centinela = 0;

        while (centinela == JOptionPane.YES_OPTION) {
            
            int numero = (int)(Math.random() * 1000);
            int contadorIntentos = 0;
            int intento = 0;

            while (numero != intento) {
                intento = Integer.parseInt(
                    JOptionPane.showInputDialog("Ingresa tu intento: "));

                if (intento > numero) {
                    System.out.println("Demasiado alto");
                } else {
                    System.out.println("Demasiado bajo");
                }
                contadorIntentos++;
            }

            String salida = String.format(
                "Felicidades, adivinistate el numero %s en %s intentos",
                numero, contadorIntentos);

            JOptionPane.showMessageDialog(null, salida);

            centinela = JOptionPane.showConfirmDialog(
                null, "¿Deseas seguir jugando?");
        }
    }

    public static void main(String[] args) {
        jugar();
    }
}
