package SeccionHilos.ejemplos.thread;

public class NombreThread extends Thread { // extiendo de Thread
    public NombreThread(String name) { // Con el constructor puedo modificarle el nombre
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Se inicia el método run del hilo " + getName());
        for(int i=0; i<=10; i++) { // simulo una tarea con un for
            /** Pausa para que visualmente se vea que se alternan **/
            try {
                Thread.sleep(10);
                System.out.println(this.getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Finaliza el hilo " + getName());
    }
}