package SeccionHilos.ejemplos.runnable;

/** Runnable es una Interfaz que tiene como contrato el método run() **/
public class ViajeTarea implements Runnable {
    private String nombre;

    public ViajeTarea(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println(i + " "+ nombre);
            /** Pausa para que visualmente se vea que se alternan **/
            try {
                Thread.sleep((long)(Math.random()*1000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Finalmente me voy de viaje a: " + nombre);
    }
}