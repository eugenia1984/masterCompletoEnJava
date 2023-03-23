package SeccionHilos.ejemplos;

import SeccionHilos.ejemplos.thread.NombreThread;

public class EjemploExtenderThread {
    public static void main(String[] args) throws InterruptedException { //throws InterruptedException por .sleep()
        // Creo un primer hilo
        Thread hilo = new NombreThread("Pipi");
        System.out.println(hilo.getState()); // NEW , se creo, todavía no se asigno recursos ni se ejecuto
        hilo.start();
        // Creo un segundo hilo
        Thread hilo2 = new NombreThread("Maria");
        hilo2.start(); // NEW , se creo, todavía no se asigno recursos ni se ejecuto
        // Creo un tercer hilo
        Thread hilo3 = new NombreThread("Luis");
        hilo3.start(); // NEW , se creo, todavía no se asigno recursos ni se ejecuto
        /** Cada uno corre en su hilo en forma paralela **/
        System.out.println(hilo.getState()); // RUNNABLE mientras se comienza a ejecutar
        Thread.sleep(1); // Es una pausa del método main
        System.out.println(hilo.getState()); // TERMINATES
    }
}