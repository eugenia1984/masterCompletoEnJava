package SeccionHilos.ejemplotimer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class EjemploAgendarTareaTimer {
    public static void main(String[] args) {
        Timer timer = new Timer();
        /** TimerTask es una clase ABSTRACT que implementa la Interfaz Runnable **/
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Tarea realizada en: " + new Date() +
                        ", nombre del Thread : " + Thread.currentThread().getName());
                System.out.println("Finaliza el tiempo");
                // para cerrarlo el timer
                timer.cancel();
            }
        }, 5000);
        // 5000 es el delay con el que empieza a correr la tarea

        System.out.println("Agendamos una tarea para 5 segundos más...");
    }
}