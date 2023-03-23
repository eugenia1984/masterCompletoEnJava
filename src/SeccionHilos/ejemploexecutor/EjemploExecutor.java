package SeccionHilos.ejemploexecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class EjemploExecutor {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Runnable tarea = () -> {
            System.out.println("Inicio de la tarea...");
            // simulo un delay
            try {
                System.out.println("Nombre del thread: " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
            System.out.println("Finaliza la tarea...");
        };

        /** .submit() **/
        // representa un resultado futuro de esta ejecución asíncrona
        executor.submit(tarea);
        executor.shutdown(); // para que quede cerrado
        /** awaitTermination() **/
        // espera que finalicen las tareas y el ejecutor para continuar con las tareas del método main
        // Lo manejor con TRy-Catch o throws InterruptedException
        System.out.println("*** continuando con la ejecución del método main 1 ***");
        executor.awaitTermination(2, TimeUnit.SECONDS);
        System.out.println("*** continuando con la ejecución del método main 2 ***");
    }
}

/* OUTPUT:
* Inicio de la tarea...
* *** continuando con la ejecución del método main 1 ***
* Nombre del thread: pool-1-thread-1
* *** continuando con la ejecución del método main 2 ***
* Finaliza la tarea...
*
* */