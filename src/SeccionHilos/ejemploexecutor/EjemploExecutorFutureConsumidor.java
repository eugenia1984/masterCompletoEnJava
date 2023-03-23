package SeccionHilos.ejemploexecutor;

import SeccionHilos.ejemplossync.Panaderia;
import SeccionHilos.ejemplossync.runnable.Consumidor;
import SeccionHilos.ejemplossync.runnable.Panadero;

import java.util.concurrent.*;

public class EjemploExecutorFutureConsumidor {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

        System.out.println("Tamaño del pool : " + executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola : " + executor.getQueue().size());
        Panaderia p = new Panaderia();
        Runnable productor = new Panadero(p);
        Runnable consumidor = new Consumidor(p);

        Future<?> futuro1 = executor.submit(productor);
        Future<?> futuro2 = executor.submit(consumidor);

        System.out.println("Tamaño del pool : " + executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola : " + executor.getQueue().size());

        executor.shutdown(); // para que quede cerrado
        System.out.println("*** continuando con la ejecución del método main ***");
    }
}