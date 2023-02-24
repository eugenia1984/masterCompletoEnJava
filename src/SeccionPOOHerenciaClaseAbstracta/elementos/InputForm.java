package SeccionPOOHerenciaClaseAbstracta.elementos;

import SeccionPOOHerenciaClaseAbstracta.elementos.ElementoForm;

/** Como extiende de una CLASE ABSTRACTA deberá implementar los métodos abstractos (@Override)
 * de la clase padre o ser clase abstracta y sus clases hijas implementarán el método abstracto**/
public class InputForm extends ElementoForm {
    private String tipo = "text";

    public InputForm(String nombre) {
        super(nombre);
    }

    public InputForm(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String dibujarHtml() {
        return "<input type=\"" + this.tipo
                + "\" name=\"" + this.nombre
                + "\" value=\"" + this.valor + "\" >";
    }
}