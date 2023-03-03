package SeccionPOOInterfacesGenerics.interfaces.repositorio;

import SeccionPOOInterfacesGenerics.interfaces.modelo.Cliente;

import java.util.List;

public class EjemploClienteListRepositorio {
    public static void main(String[] args) {
        String divider = "************************************************************\n";

        OrdenablePaginableCrudRepositorio<Cliente> repo = new ClienteListRepositorio();

        // Inserto registros en el DAO
        repo.crear(new Cliente("Jono", "Perez"));
        repo.crear(new Cliente("Bea", "Gonzalez"));
        repo.crear(new Cliente("Luci", "Martinez"));
        repo.crear(new Cliente("Martin", "Costes"));

        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);
        System.out.println(divider);

        System.out.println("= = = = = = = = = =  PAGINABLE  = = = = = = = = = = =");
        List<Cliente> paginable = repo.listar(1,3); // no necesito hacer cast
        paginable.forEach(System.out::println);
        paginable = repo.listar(0,2); // no necesito hacer cast
        System.out.println(divider);
        paginable.forEach(System.out::println);
        System.out.println(divider);

        System.out.println("= = = = = = = =  ORDENAR POR NOMBRE  ASC  = = = = = = = = =");
        List<Cliente> clientesOrdenAsc = repo.listar("nombre", Direccion.ASC); // no necesito hacer cast
        for(Cliente c: clientesOrdenAsc) {
            System.out.println(c);
        }
        System.out.println("= = = = = = = =  ORDENAR POR APELLIDO DES  = = = = = = = = =");
        List<Cliente> clientesOrdenDes = repo.listar("apellido", Direccion.DES); // no necesito hacer cast
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
        System.out.println("Total registros: " + repo.total()); // no necesito hacer cast
    }
}