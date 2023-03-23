package SeccionHilos.ejemplossync;

import SeccionHilos.ejemplossync.runnable.Consumidor;
import SeccionHilos.ejemplossync.runnable.Panadero;

public class EjemploProductorConsumidor {
    public static void main(String[] args) {
        Panaderia p = new Panaderia();
        new Thread(new Panadero(p)).start(); // hilo del panadero
        new Thread(new Consumidor(p)).start(); // hilo del consumidor

    }
}

/* OUTPUT:
* Panadero hornea: Pan n°: 0
* Cliente consume: Pan n°: 0
* Panadero hornea: Pan n°: 1
* Cliente consume: Pan n°: 1
* Panadero hornea: Pan n°: 2
* Cliente consume: Pan n°: 2
* Panadero hornea: Pan n°: 3
* Cliente consume: Pan n°: 3
* Panadero hornea: Pan n°: 4
* Cliente consume: Pan n°: 4
* Panadero hornea: Pan n°: 5
* Cliente consume: Pan n°: 5
* Panadero hornea: Pan n°: 6
* Cliente consume: Pan n°: 6
* Panadero hornea: Pan n°: 7
* Cliente consume: Pan n°: 7
* Panadero hornea: Pan n°: 8
* Cliente consume: Pan n°: 8
* Panadero hornea: Pan n°: 9
* Cliente consume: Pan n°: 9
* */