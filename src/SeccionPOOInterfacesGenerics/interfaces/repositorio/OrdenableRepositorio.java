package SeccionPOOInterfacesGenerics.interfaces.repositorio;

import SeccionPOOInterfacesGenerics.interfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio<T> {
    List<T> listar(String campo, Direccion dir);
}