package SeccionPOOInterfacesGenerics.generics;
import SeccionPOOInterfacesGenerics.interfaces.modelo.Cliente;
import SeccionPOOInterfacesGenerics.interfaces.modelo.ClientePremium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenerics {
    public static void main(String[] args) {
        List clients = new ArrayList();
        clients.add(new Cliente("Ana", "Sousa"));
        Cliente ana = (Cliente)clients.get(0);
        /* Otro modo: Cliente ana = (Cliente)clients.iterator.next(); */

        List<Cliente> clientes = new ArrayList<>(); // Al tener <Cliente>
        clientes.add(new Cliente("Analia", "Sousa"));
        Cliente analia = clientes.iterator().next(); // no necesito el cast

        // Creo arrays para convertir a lista con  fromArrayToList
        Cliente[] clientesArreglo = {new Cliente("Ana", "Sousa"), new Cliente("Maria", "Res")};
        Integer[] enterosArreglo = {1, 2, 3};
        // Los convierto de array a List
        List<Cliente> clientesLista = fromArrayToList(clientesArreglo);
        List<Integer> enterosLista = fromArrayToList(enterosArreglo);
        // Los muestro
        System.out.println("* * * *  Array clientes a List  * *  * * ");
        clientesLista.forEach(System.out::println);
        System.out.println("* * * *  Array enteros a List  * * * *");
        enterosLista.forEach(System.out::println);

        List<String> nombres = fromArrayToList(new String[]{"Ana", "Marcos", "Paco", "Bea", "Luz"}, enterosArreglo);
        System.out.println("* * * * *  nombres  * * * * ");
        nombres.forEach(System.out::println);

        System.out.println("* * * * *  clientesPremiumList  * * * * *");
        List<ClientePremium> clientesPremiumList= fromArrayToList(
                new ClientePremium[]{new ClientePremium("Marcos", "Ramirez")});
        // Si no tuviera el generic el generic
        // List<Cliente> clientesPremiumList = fromArrayToList(new ClientePremium[]{new ClientePremium("Marcos", "Ramirez")});
        clientesPremiumList.forEach(System.out::println);

        System.out.println(" = = = = = = = = = = = = = = = = = = =");
        imprimirClientes(clientes);
        System.out.println(" = = = = = = = = = = = = = = = = = = =");
        imprimirClientes(clientesLista);
        System.out.println(" = = = = = = = = = = = = = = = = = = =");
        imprimirClientes(clientesPremiumList); // Gracias a wildcard imprimir List de clase HIJA de Cliente

        System.out.println("Máximo de 1, 9 y 4 es: " + maximo(1, 9, 4));
        System.out.println("Máximo de 3.9, 11.6 y 7.78 es: " + maximo(3.9, 11.6, 7.78));
        System.out.println("Máximo de zanahoria, arándanos y manzana es: " + maximo("zanahoria", "arándanos", "manzana"));
    }


    // convertir de array a List
    public static <T> List<T> fromArrayToList(T [] c) {
        return Arrays.asList(c);
    }

    // convertir de array a List de Number - Bounded Generics
    public static <T extends Number> List<T> fromArrayToList(T [] c) {
        return Arrays.asList(c);
    }

    // convertir de array a List de Number - Bounded Generics
    // Pero uso el generic
    /*
    public static List<Cliente> fromArrayToList(Cliente [] c) {
        return Arrays.asList(c);
    */

    // convertir de array a List de Cliente o su descendiente(ClientePremium) y la interfaz Comparable - Bounded Generics
    public static <T extends Cliente & Comparable<T>> List<T> fromArrayToList(T [] c) {
        return Arrays.asList(c);
    }

    // convertir de array a List, T para convertir y G para iterar
    public static <T, G> List<T> fromArrayToList(T [] c, G[] g) {
        for(G elemento: g) {
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }
    /*** WildCard - Comodin ***/
    public static void imprimirClientes(List<?  extends Cliente> clientes) {
        clientes.forEach(System.out::println);
    }

    /** Un método genérico para comparar 3 objetos y retornar el mayor **/
    public static <T extends Comparable<T>> T maximo(T a, T b, T c) {
        T max = a;
        if(b.compareTo(max) > 0) {
            max = b;
        }
        if(c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }
}