package SeccionPOOClasesObjetos;

public class Estanque {
    private int capacidad;

    public Estanque() {
        this.capacidad= 40; // asigno capacidad por default
    }
    public Estanque(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }
}