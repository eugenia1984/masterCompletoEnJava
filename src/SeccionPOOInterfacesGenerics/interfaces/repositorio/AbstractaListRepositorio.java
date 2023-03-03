package SeccionPOOInterfacesGenerics.interfaces.repositorio;

import SeccionPOOInterfacesGenerics.interfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AbstractaListRepositorio<T> implements OrdenablePaginableCrudRepositorio<T> {
    protected List<T> dataSource;

    public AbstractaListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<T> listar() {
        return dataSource;
    }



    @Override
    public T porId(Integer id) {
        /*T resultado = null;
        for(Cliente cli: dataSource) {
            if(cli.getId() != null && cli.getId().equals(id)) {
                resultado = cli;
                break;
            }
        }
        return resultado*/
        return null;
    }

    @Override
    public void crear(T t) {
        this.dataSource.add(t);
    }

    @Override
    public void editar(T t) {
        T c = this.porId(((Cliente)t).getId());
        ((Cliente)c).setNombre(((Cliente)t).getNombre());
        ((Cliente)c).setApellido(((Cliente)t).getApellido());
    }

    @Override
    public void eliminar(Integer id) {
        this.dataSource.remove(this.porId(id));
    }

    @Override
    public List<T> listar(String campo, Direccion dir) {
        List<T> listaOrdenada = new ArrayList<>(this.dataSource);

        listaOrdenada.sort((Comparator<? super T>) new Comparator<Cliente>() {
            @Override
            public int compare(Cliente a, Cliente b) {
                int resultado = 0;

                if(dir == Direccion.ASC) {

                    switch(campo) {
                        case "id":
                            resultado = a.getId().compareTo(b.getId());
                            break;
                        case "nombre":
                            resultado = a.getNombre().compareTo(b.getNombre());
                            break;
                        case "apellido":
                            resultado = a.getApellido().compareTo(b.getApellido());
                            break;
                    }
                } else if(dir == Direccion.DES) {
                    switch(campo) {
                        case "id":
                            resultado = b.getId().compareTo(a.getId());
                            break;
                        case "nombre":
                            resultado = b.getNombre().compareTo(a.getNombre());
                            break;
                        case "apellido":
                            resultado = b.getApellido().compareTo(a.getApellido());
                            break;
                    }
                }

                return resultado;
            }

        });
        return listaOrdenada;
    }

    @Override
    public List<T> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }

    @Override
    public int total() {
        return this.dataSource.size();
    }
}