package SeccionPOOInterfacesGenerics.genericsclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion<T> implements Iterable<T> { // Para usar Generics agrego <T>
    private List<T> objetos; // Para usar Generics agrego <T>
    private int max;

    public Camion(int max) {
        this.max = max;
        this.objetos = new ArrayList();
    }

    /*
    // Modificado a generico
    public void add(Object objeto) {
        if(this.objetos.size() <= max) {
            this.objetos.add(objeto);
        } else {
            throw new RuntimeException("No hay más espacio");
        }
    }
    */
    public void add(T objeto) { // Para usar Generics cambio a T
        if(this.objetos.size() <= max) {
            this.objetos.add(objeto);
        } else {
            throw new RuntimeException("No hay más espacio");
        }
    }

    @Override
    public Iterator<T> iterator() { // Para usar Generics agrego <T>
        return this.objetos.iterator();
    }
}