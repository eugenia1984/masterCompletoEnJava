package SeccionPOOInterface.modelo;

public class Pagina extends Hoja implements  Imprimible {
    public Pagina(String contenido) {
        super(contenido);
    }

    @Override
    public String imprimir() {
        return this.contenido;
    }
}