package ar.mecosta.appfacturas.domain;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Factura {
    private  int folio;
    private  String descripcion;
    private Date fecha;
    private Cliente cliente;
    private  ItemFactura[] items;
    private int indiceItems;
    public static final int MAX_ITEMS = 12;
    private static int ultimoFolio;

    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS];
        this.folio = ++ultimoFolio;
        this.fecha = new Date(); // Al crear la factura se toma la fecha actual
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getItems() {
        return items;
    }

    public void addItemFactura(ItemFactura item) {
        if(indiceItems < MAX_ITEMS) {
            this.items[indiceItems++] = item;
        }
    }

    public float calcularTotal() {
        float total = 0;
        for(int i = 0; i < indiceItems; i++) {
            total +=  this.items[i].calcularImporte();
        }
        return total;
    }

    public  String generarDetalle() {
        StringBuilder sb = new StringBuilder("Factura N: ");
        sb.append(folio)
                .append("\nCliente: ")
                .append(this.cliente.getNombre())
                .append("\t NIF: ")
                .append(cliente.getNif())
                .append("\nDescripcion: ")
                .append(this.descripcion)
                .append("\n")
                .append("\n");

        // Agregamos la fecha en la factura
        // Hay que formatearla antes
        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy");

        sb.append("Fecha Emisión: ")
                .append(df.format(this.fecha))
                .append("\n");
        sb.append("\n#\tNombre\t$Precio Unitario\tCant.\tTotal\n");

        for(int i = 0; i < indiceItems; i++) {
            sb.append(this.items[i].toString())
                    .append("\n");
        }
        sb.append("\nGran Total : ")
                .append(calcularTotal());

        return sb.toString();
    }

    @Override
    public String toString() {
        return generarDetalle();
    }
}