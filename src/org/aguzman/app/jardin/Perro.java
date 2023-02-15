package org.aguzman.app.jardin;

import org.aguzman.app.hogar.Persona;

public class Perro {
    protected String nombre;
    protected String raza;

    public Perro() {
    }

    public Perro(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    String jugar(Persona persona) {
        return persona.lanzarPelota();
    }
}