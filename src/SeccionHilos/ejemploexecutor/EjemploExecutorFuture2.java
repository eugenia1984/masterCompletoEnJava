package SeccionHilos.ejemploexecutor;

import java.util.concurrent.*;

public class EjemploExecutorFuture2 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // ExecutorService executor = Executors.newSingleThreadExecutor();
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Callable<String> tarea = () -> {
            System.out.println("Inicio de la tarea...");

            try {
                System.out.println("Nombre del thread: " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
            System.out.println("Finaliza la tarea...");
            return "Algún resultado importante de la tarea";
        };

        Callable<Integer> tarea2 = () -> {
            System.out.println("Iniciando tarea 2...");
          TimeUnit.SECONDS.sleep(3);
          return 10;
        };

        Future<String> resultadoFuturo = executor.submit(tarea);
        Future<String> resultadoFuturo2 = executor.submit(tarea);
        Future<Integer> resultadoFuturo3 = executor.submit(tarea2);

        executor.shutdown(); // para que quede cerrado
        System.out.println("*** continuando con la ejecución del método main ***");

        while(!(resultadoFuturo.isDone() && resultadoFuturo2.isDone() && resultadoFuturo3.isDone())) {
            System.out.println(String.format("resultado1: %s - resultado2: %s - resultado3: %s",
                    resultadoFuturo.isDone()?"finalizo":"en progreso",
                    resultadoFuturo2.isDone()?"finalizo":"en progreso",
                    resultadoFuturo3.isDone()?"finalizo":"en progreso"));
            TimeUnit.MILLISECONDS.sleep(1000);
        }
        System.out.println("obtenemos el resultado de la tarea 1: "+resultadoFuturo.get());
        System.out.println("Finaliza la tarea 1: " + resultadoFuturo.isDone());

        System.out.println("obtenemos el resultado de la tarea 2: "+resultadoFuturo2.get());
        System.out.println("Finaliza la tarea 2: " + resultadoFuturo2.isDone());

        System.out.println("obtenemos el resultado de la tarea 3: "+resultadoFuturo3.get());
        System.out.println("Finaliza la tarea 3: " + resultadoFuturo3.isDone());
;
    }
}
/**
 * Por: newSingleThreadExecutor():
 * se ejecuta el 1er hilo, cuando termina pasa el 2do
 * y cuando termina pasa al 3ro
 * **/

/**
 *  Por newFixedThreadPool(3): ejecutamos los 3 hilos al mismo tiempo.
 * Si tenía newFixedThreadPool(2), 1ro se ejecutan 2 y al terminar pasa a la 3ra
 * **/