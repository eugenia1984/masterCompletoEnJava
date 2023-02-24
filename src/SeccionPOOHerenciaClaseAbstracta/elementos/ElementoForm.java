package SeccionPOOHerenciaClaseAbstracta.elementos;

import SeccionPOOHerenciaClaseAbstracta.elementos.validador.Validador;

import java.util.ArrayList;
import java.util.List;

public abstract class ElementoForm { /** Clase abstracta, debe tener al menos un método abstracto **/
    protected String valor;
    protected String nombre;

    private List<Validador> validadores;
    private List<String> errores;
    public ElementoForm() {
        this.validadores = new ArrayList<>();
        this.errores = new ArrayList<>();
    }

    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    public ElementoForm addValidador(Validador validador) {
        this.validadores.add(validador);
        return this;
    }

    public List<String> getErrores() {
        return errores;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean esValido() {
        for(Validador v: validadores) {
            if(!v.esValidado(this.valor)) {
                this.errores.add(v.getMensaje());
            }
        }
        return this.errores.isEmpty();
    }

    abstract public String dibujarHtml(); /*** Método abstracto, sin {}, lo implementan las clases hijas ***/
}