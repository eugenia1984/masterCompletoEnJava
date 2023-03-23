package SeccionHilos.ejemplossync;

import java.util.concurrent.ThreadLocalRandom;

public class EjemploProductorConsumidorJava8 {
    public static void main(String[] args) {
        Panaderia p = new Panaderia();
        // la panadería ahora es atributo del método main

        /** Usando expresiones lambda **/

        new Thread( () -> {
            for(int i = 0; i <10; i++) {
                p.hornear("Pan n°: " + i);
                try {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(500, 2000));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start(); // hilo del panadero
        new Thread( () -> {
            for(int i = 0; i < 10; i++ ) {
                p.consumir();
            }
        }).start(); // hilo del consumidor

    }
}