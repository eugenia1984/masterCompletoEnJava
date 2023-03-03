package SeccionPOOInterfacesGenerics.interfaces;

import SeccionPOOInterfacesGenerics.interfaces.modelo.Cliente;
import SeccionPOOInterfacesGenerics.interfaces.repositorio.*;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {
        String divider = "************************************************************\n";

        CrudRepositorio repo = new AbstractaListRepositorio();

        // Inserto registros en el DAO
        repo.crear(new Cliente("Jono", "Perez"));
        repo.crear(new Cliente("Bea", "Gonzalez"));
        repo.crear(new Cliente("Luci", "Martinez"));
        repo.crear(new Cliente("Martin", "Costes"));

        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);
        System.out.println(divider);

        System.out.println("= = = = = = = = = =  PAGINABLE  = = = = = = = = = = =");
        List<Cliente> paginable = ((PaginableRepositorio)repo).listar(1,3);
        paginable.forEach(System.out::println);
        paginable = ((PaginableRepositorio)repo).listar(0,2);
        System.out.println(divider);
        paginable.forEach(System.out::println);
        System.out.println(divider);

        System.out.println("= = = = = = = =  ORDENAR POR NOMBRE  ASC  = = = = = = = = =");
        List<Cliente> clientesOrdenAsc = ((OrdenableRepositorio)repo).listar("nombre", Direccion.ASC);
        for(Cliente c: clientesOrdenAsc) {
            System.out.println(c);
        }
        System.out.println("= = = = = = = =  ORDENAR POR APELLIDO DES  = = = = = = = = =");
        List<Cliente> clientesOrdenDes = ((OrdenableRepositorio)repo).listar("apellido", Direccion.DES);
        for(Cliente c: clientesOrdenDes) {
            System.out.println(c);
        }
        System.out.println(divider);

        System.out.println("= = = = = = = = = =  EDITAR  = = = = = = = = =");
        Cliente beaActualizar = new Cliente("Bea", "Mena");
        beaActualizar.setId(2);
        repo.editar(beaActualizar);
        System.out.println(divider);

        System.out.println("= = = = = = =  ELIMINAR ID 2  = = = = = = ");
        repo.eliminar(2);
        repo.listar().forEach(System.out::println);
        System.out.println(divider);

        System.out.println("= = = = = = =  TOTAL  = = = = = = = = = =");
        System.out.println("Total registros: " + ((AbstractaListRepositorio) repo).total());
    }
}