package SeccionPOOHerenciaClaseAbstracta.elementos.validador;

public class EmailValidador extends Validador {
    protected String mensaje= "el formato del email es inválido";
    private final static String EMAIL_REGEX = "^(.+)@(.+)$";
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
        return valor.matches(EMAIL_REGEX);
    }
}