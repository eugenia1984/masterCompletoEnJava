package SeccionPOOHerenciaClaseAbstracta.elementos.validador;

public class RequeridoValidador extends Validador {
    protected String mensaje = "el campo es requerido";

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
        return (valor != null && valor.length() > 0);
    }
}