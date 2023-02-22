package SeccionPOOHerencia.clases;


import SeccionPOOHerencia.clases.Persona;

/** Extiende de OBJECT la clase padre de todas las clases de Java **/

public class Profesor extends Persona {
    private String asignatura;

    public Profesor() {
        System.out.println("Inicializando profesor...");
    }

    public Profesor(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Profesor(String nombre, String apellido, String asignatura) {
        super(nombre, apellido);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String saludar() {
        return "Buenas, soy el profesor: " + getNombre() + " de " + getAsignatura();
    }
}