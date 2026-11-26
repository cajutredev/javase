package mx.org.banxico.modulo14;

public class Ejercicio7 {

    public static void main(String[] args) {
        
        DepositarDinero deposito = new DepositarDinero();
        RetirarDinero retiro = new RetirarDinero();
        ConsultarSaldo consulta = new ConsultarSaldo();

        System.out.println("Iniciando operaciones bancarias..");

        deposito.start();
        retiro.start();
        consulta.start();

        try {
            deposito.join();
            retiro.join();
            consulta.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
        
        System.out.println("Finalizando operaciones bancarias..");

    }
}

class DepositarDinero extends Thread {

    @Override
    public void run() {

        Thread hiloActual = Thread.currentThread();
        System.out.println("[" + hiloActual.getName() + "] Iniciando deposito bancario...");

        try {
            Thread.sleep(3000);
            System.out.println("Depposito registrado...");
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}

class RetirarDinero extends Thread {

    @Override
    public void run() {

        Thread hiloActual = Thread.currentThread();
        System.out.println("[" + hiloActual.getName() + "] Iniciando retiro bancario...");

        try {
            Thread.sleep(6000);
            System.out.println("Retiro procesado...");
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}

class ConsultarSaldo extends Thread {

    @Override
    public void run() {

        Thread hiloActual = Thread.currentThread();
        System.out.println("[" + hiloActual.getName() + "] Consultando saldo bancario...");

        try {
            Thread.sleep(7000);
            System.out.println("Consulta de saldo finalizada...");
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
