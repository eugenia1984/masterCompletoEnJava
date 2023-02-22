package SeccionPOOHerencia.clases;

/*** Al ser FINAL no puede tener clases hijas, no hereda ***/
/*** Si tiene un método FINAL,e ste tampoco puede sobreescribirse ***/
public final class AlumnoInternacional extends Alumno {
    private String pais;
    private double notaIdiomas;

    public AlumnoInternacional() {
        System.out.println("AlumnoInternacional: inicializando constructor...");
    }

    public AlumnoInternacional(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public AlumnoInternacional(String nombre, String apellido, String pais) {
        super(nombre, apellido);
        this.pais = pais;
    }

    public AlumnoInternacional(String pais, double notaIdiomas) {
        this.pais = pais;
        this.notaIdiomas = notaIdiomas;
    }


    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }

    @Override
    public String saludar() {
        return super.saludar() + ", soy extranjero del pais: " + getPais();
    }

    @Override
    public double calcularPromedio() {
        return ((super.calcularPromedio()*3) + notaIdiomas) / 4;
    }
}