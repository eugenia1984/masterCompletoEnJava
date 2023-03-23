package SeccionHilos.ejemplos;

public class EjemploInterfaceRunnableJava8 {
    public static void main(String[] args) throws InterruptedException {
        /** instancia del tipo Runnable con clase anónima **/
        /*
        Runnable viaje = new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10; i++) {
                    // currentThread() -> retorna la instancia del hilo que se esta ejecutando
                    System.out.println(i + " "+ Thread.currentThread().getName());
                    // Pausa para que visualmente se vea que se alternan
                    try {
                        Thread.sleep((long)(Math.random()*1000));
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("Finalmente me voy de viaje a: " + Thread.currentThread().getName());
            }
        };
        */

        Thread main = Thread.currentThread();
        /** instancia del tipo Runnable con expresión lambda **/
        Runnable viaje = () -> {
            for(int i = 0; i < 10; i++) {
                /* currentThread() -> retorna la instancia del hilo que se esta ejecutando*/
                System.out.println(i + " "+ Thread.currentThread().getName());
                /** Pausa para que visualmente se vea que se alternan **/
                try {
                    Thread.sleep((long)(Math.random()*1000));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Estado de Thread main: " + main.getState());
            System.out.println("Finalmente me voy de viaje a: " + Thread.currentThread().getName());
        };


        /*** Paso instancia de Runnable y el nombre del Thread ***/
        /** Totalmente ASÍNCRONO, se van ejecutando los HILOS de forma PARALELA**/

        /** .sleep() es una pausa en el main, no en los threat **/
        // Se ejecuta sobre el hilo en cuestión, el actual. Es un método estático.
        // con .sleep():
        // new Thread(viaje,"Isla de Pascua").start();
        // new Thread(viaje,"Robinson Crusoe").start();
        // new Thread(viaje,"Juan Fernandez").start();
        // new Thread(viaje,"Isla de Chiloe").start();
        // Thread.sleep(10000);

        /** .join() **/
        // Se ejecuta en la instancia del Thread, no es estático
        Thread v1 = new Thread(viaje,"Isla de Pascua");
        Thread v2 = new Thread(viaje,"Robinson Crusoe");
        Thread v3 = new Thread(viaje,"Juan Fernandez");
        Thread v4 = new Thread(viaje,"Isla de Chiloe");

        v1.start();
        v2.start();
        v3.start();
        v4.start();
        v1.join();
        v2.join();
        v3.join();
        v4.join();

        System.out.println("\n*** Continuando con la ejecución del método main: " + main.getName() + " ***");
    }
}