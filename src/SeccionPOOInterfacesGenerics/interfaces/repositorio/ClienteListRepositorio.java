package SeccionPOOInterfacesGenerics.interfaces.repositorio;

import SeccionPOOInterfacesGenerics.interfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClienteListRepositorio extends AbstractaListRepositorio<Cliente> {

   @Override
    public Cliente porId(Integer id) {
        Cliente resultado = null;
        for(Cliente cli: dataSource) {
            if(cli.getId() != null && cli.getId().equals(id)) {
                resultado = cli;
                break;
            }
        }
        return resultado;
    }

    @Override
    public void editar(Cliente cliente) {
        Cliente c = this.porId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());
    }

    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);

        listaOrdenada.sort( new Comparator<Cliente>() {
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
}