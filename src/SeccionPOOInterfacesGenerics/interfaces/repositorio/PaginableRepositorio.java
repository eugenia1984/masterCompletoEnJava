package SeccionPOOInterfacesGenerics.interfaces.repositorio;

import SeccionPOOInterfacesGenerics.interfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio<T> {
    List<T> listar(int desde, int hasta);
}