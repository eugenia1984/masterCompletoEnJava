package SeccionPOOHerenciaClaseAbstracta.elementos.validador;
/*** Clase ABSTRACTA ****/
abstract public class Validador {
    protected String mensaje;
    abstract public void setMensaje(String mensaje);
    abstract public String getMensaje();
    abstract public boolean esValidado(String valor);
}