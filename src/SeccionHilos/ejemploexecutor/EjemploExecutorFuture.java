package SeccionHilos.ejemploexecutor;

import java.util.concurrent.*;

public class EjemploExecutorFuture {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<String> tarea = () -> { // podía ser de la clase Runnable
            System.out.println("Inicio de la tarea...");
            // simulo un delay
            try {
                System.out.println("Nombre del thread: " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
            System.out.println("Finaliza la tarea...");
            //  al ser Callable debe devolver
            return "Algún resultado importante de la tarea";
        };

        /** .submit() **/
        // representa un resultado futuro de esta ejecución asíncrona
        Future<String> resultadoFuturo = executor.submit(tarea);
        executor.shutdown(); // para que quede cerrado
        System.out.println("*** continuando con la ejecución del método main ***");

        // System.out.println(resultadoFuturo.isDone());
        while(!resultadoFuturo.isDone()) {
            System.out.println("Ejecutando tarea ...");
            TimeUnit.MILLISECONDS.sleep(100000);
        }
        /** .get **/
        // bloquea el Thread actual, queda a la espera a que devuelva el valor la tarea
        // .get() o encierro en Try-Catch o throws InterruptedException, ExecutionException
        System.out.println(resultadoFuturo.get());
        System.out.println("Continuamos...");
        System.out.println("Finaliza la tarea: " + resultadoFuturo.isDone());
;
    }
}

/* OUTPUT:
* *** continuando con la ejecución del método main ***
* Inicio de la tarea...
*Ejecutando tarea ...
* Nombre del thread: pool-1-thread-1
* Ejecutando tarea ...
* Ejecutando tarea ...
* Ejecutando tarea ...
* Ejecutando tarea ...
* Ejecutando tarea ...
* Ejecutando tarea ...
* Ejecutando tarea ...
* Algún resultado importante de la tarea
* Continuamos...
* Finaliza la tarea: true
* */