package SeccionPOOInterfacesGenerics.interfaces.repositorio;

import SeccionPOOInterfacesGenerics.interfaces.modelo.Cliente;

import java.util.List;

public interface CrudRepositorio<T> {
    List<T> listar();
    T porId(Integer id);
    void crear(T cliente);
    void editar(T cliente);
    void eliminar(Integer id);
}