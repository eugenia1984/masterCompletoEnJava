package SeccionPOOHerenciaClaseAbstracta.elementos.validador;

public class NoNuloValidador extends Validador {
    protected String mensaje = "el campo no puede ser nulo";

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public boolean esValidado(String valor) {
        return (valor != null);
    }
}