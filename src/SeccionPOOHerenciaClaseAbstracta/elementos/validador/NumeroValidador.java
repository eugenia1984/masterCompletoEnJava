package SeccionPOOHerenciaClaseAbstracta.elementos.validador;

public class NumeroValidador extends Validador {
    protected String mensaje = "el campo debe ser un número";
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
        try {
            Integer.parseInt(valor);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }
}