package SeccionHilos.ejemploexecutor;

import java.util.concurrent.*;

public class EjemploScheduledExecutorServicePeriodo {
    public static void main(String[] args) throws InterruptedException {
        // Se repiten cada cierta cantidad de tiempo
        // scheduleAtFixedRate -> una tasa fija, el tiempo que se demora en ejecutar cada tarea,
        // pero es flexible por si una tarea demora mas
        // scheduleWithFixedDelay -> delay fijo entre la tarea, se mide desde el final de una tarea y
        // el comienzo de la siguiente tarea, es independiente al tiempo de ejecución de cada tarea
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

        System.out.println("Alguna tarea en el main ...");

        /** para que sea en cierta cantidad de veces **/
        // creo una instancia de una cuenta regresiva, parecido a lo visto conTimer
        /** CountDownLatch -> bloquea el thread hasta finalizar la cuenta regresiva **/
        CountDownLatch latch = new CountDownLatch(5);


       Future<?> future = executor.scheduleAtFixedRate(() -> {
            System.out.println("Hola mundo tarea ...");
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
                latch.countDown(); // para que disminuya
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        // un retraso inicial de 1 segundo y despues cada 2 segundos se va ejecutando
        },1000, 2000, TimeUnit.MILLISECONDS);

        latch.await(); // bloquamos el threat hasta que llegue a 0
        // future.cancel(false); -> lo cancela pero espera que termine la tarea en ejecucion
        future.cancel(true);

        /** con Sleep para que sea durante un tiempo **/
        // TimeUnit.SECONDS.sleep(10);

        System.out.println("Alguna otra tarea en el main...");
        executor.shutdown();
    }
}