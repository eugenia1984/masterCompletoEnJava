package SeccionHilos.ejemplos;

import SeccionHilos.ejemplos.runnable.ImprimirFrases;

public class EjemploSincronizacionThread {
    public static void main(String[] args) throws InterruptedException {
        // creo los hilos
        new Thread(new ImprimirFrases("Hola ", "¿que tal?")).start();
        new Thread(new ImprimirFrases("¿Quién ", "eres tú?")).start();

        Thread.sleep(100);
        Thread h3 = new Thread(new ImprimirFrases("Muchas ", "gracias"));
        h3.start();
        Thread.sleep(100);

        System.out.println(h3.getState());
    }

    /** Método compartido por varios hilos, para sincronizar con synchronized **/
    public synchronized static void imprimirFrases(String frase1, String frase2) {
        System.out.print(frase1);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(frase2);
    }
}