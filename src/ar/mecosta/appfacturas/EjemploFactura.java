package ar.mecosta.appfacturas;

import ar.mecosta.appfacturas.domain.*;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {
        // Creo un CLIENTE
        Cliente cliente = new Cliente();
        cliente.setNif("555-5");
        cliente.setNombre("Andres");
        // Creo la factura e ingreso los datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la descripción de la factura: ");
        Factura factura = new Factura(sc.nextLine(), cliente);

        Producto producto;
        System.out.println();

        for(int i = 0; i < 2; i++) {
            producto = new Producto();
            System.out.print("Ingrese producto n° " + producto.getCodigo() + " :  ");
            producto.setNombre(sc.nextLine());

            System.out.print("Ingrese el precio: ");
            producto.setPrecio(sc.nextFloat());

            System.out.print("Ingrese la cantidad: ");

            factura.addItemFactura( new ItemFactura(sc.nextInt(), producto));
            System.out.println();
            sc.nextLine();
        }
        System.out.println(factura);
    }
}