package SeccionHilos.ejemploexecutor;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class EjemploScheduledExecutorServicePeriodoAtomicInteger {
    public static void main(String[] args) throws InterruptedException {
        // Se repiten cada cierta cantidad de tiempo
        // scheduleAtFixedRate -> una tasa fija, el tiempo que se demora en ejecutar cada tarea,
        // pero es flexible por si una tarea demora mas
        // scheduleWithFixedDelay -> delay fijo entre la tarea, se mide desde el final de una tarea y
        // el comienzo de la siguiente tarea, es independiente al tiempo de ejecución de cada tarea
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

        System.out.println("Alguna tarea en el main ...");
        AtomicInteger contador = new AtomicInteger(5);

       Future<?> future = executor.scheduleAtFixedRate(() -> {
            System.out.println("Hola mundo tarea ...");
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
                contador.getAndDecrement();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
       // un retraso inicial de 1 segundo y despues cada 2 segundos se va ejecutando
       },1000, 2000, TimeUnit.MILLISECONDS);

       while(contador.get() >= 0) {
           if(contador.get() == 0) {
               future.cancel(true);
               contador.getAndDecrement();
           }
       }
       System.out.println("Alguna otra tarea en el main...");
       executor.shutdown();
    }
}