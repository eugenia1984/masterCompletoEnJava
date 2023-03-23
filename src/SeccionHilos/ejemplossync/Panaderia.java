package SeccionHilos.ejemplossync;

public class Panaderia {
    private String pan;
    private boolean disponible;

    public synchronized void hornear(String masa) {
        while(disponible) {
            try {
                /** rwait elacionado con synchronized **/
                wait(); // ponemos en espera al panadero
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.pan = masa;
        System.out.println("Panadero hornea: " + this.pan);
        this.disponible = true;
        notify(); /** notify relacionado con synchronized **/
    }

    public synchronized String consumir() {
        while(!disponible) {
            try {
                /** wait relacionado con synchronized **/
                wait(); // ponemos en espera al panadero
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Cliente consume: " + this.pan);
        this.disponible = false;
        notify(); /** relacionado con synchronized **/
        return pan;
    }

}