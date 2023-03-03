package SeccionPOOInterfacesGenerics.interfaces.repositorio;
/** Interface que extiende de otras interfaces **/
public interface OrdenablePaginableCrudRepositorio<T> extends OrdenableRepositorio<T>,
                    PaginableRepositorio<T>, CrudRepositorio<T>, ContableRepositorio {
}