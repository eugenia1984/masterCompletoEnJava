package SeccionPOOHerenciaClaseAbstracta.elementos;

public class TextAreaForm  extends ElementoForm {
    private int filas;
    private int columna;

    public TextAreaForm(String nombre, int filas, int columna) {
        super(nombre);
        this.filas = filas;
        this.columna = columna;
    }

    public TextAreaForm(int filas, int columna) {
        this.filas = filas;
        this.columna = columna;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    @Override
    public String dibujarHtml() {
        return "<textarea name='" + this.nombre + "' cols='" + this.columna + "' rows='" + this.filas+ "'>"
                + this.valor + "</textarea>";
    }
}