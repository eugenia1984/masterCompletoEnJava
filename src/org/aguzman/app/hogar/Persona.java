package org.aguzman.app.hogar;

public class Persona {
    private String nombre; // es DEFAULT no se puede acceder
    private String apellido;
    private ColorPelo colorPelo;

    // Constantes que las voy a importar
    public static final String MENOR_DE_EDAD = "Menor de edad";
    public static final String MAYOR_DE_EDAD = "Mayor de edad";
    public Persona() {
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String nombre, String apellido, ColorPelo colorPelo) {
        this(nombre, apellido);
        this.colorPelo = colorPelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ColorPelo getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(ColorPelo colorPelo) {
        this.colorPelo = colorPelo;
    }

    public String lanzarPelota() {
        return "Lanza la pelota al perro!";
    }

    // Método estático
    // Para tener un IMPORT ESTÁTICO
    public static String saludar() {
        return"Hola que tal!";
    }
}