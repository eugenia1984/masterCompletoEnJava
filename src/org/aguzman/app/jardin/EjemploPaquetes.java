package org.aguzman.app.jardin;
/*
En vez de importar de a una:
import org.aguzman.app.hogar.Persona;
import org.aguzman.app.hogar.Gato;
Uso el *
*/
import org.aguzman.app.hogar.*; // como están en otro paquete debo importarlas
import static org.aguzman.app.hogar.Persona.saludar; /* IMPORT ESTATICO */
import static org.aguzman.app.hogar.Persona.MAYOR_DE_EDAD;
import static org.aguzman.app.hogar.Persona.MENOR_DE_EDAD;
import static org.aguzman.app.hogar.ColorPelo.*;
/*
* Con:
* import static org.aguzman.app.hogar.Persona.*
* importo todos
* */
public class EjemploPaquetes {
    public static void main(String[] args) {
        /*
        PUBLIC -> Todos tienen acceso
        DEFAULT -> Solo acceden los del mismo paquete
        PROTECTED -> Acceden las clases del mismo paquete y las clases hijas
        PRIVATE -> Solo se accede en la misma clase (no influye el paquete o la herencia)
        */
        Persona people = new Persona("Ana", "Gomez");
        System.out.println("people = " + people.getNombre() + " " + people.getApellido());
        people.setColorPelo(CAFE);
        System.out.println("People color de pelo = " + people.getColorPelo());
        // No puedo acceder a Gato porque el acceso es DEFAULT no PUBLIC

        /* No importo las clases dentro del mismo paquete */
        Perro dog = new Perro();
        /* Accedo a las propiedades por mas que estén en DEFAULT ó PROTECTED
         y no en PUBLIC, porque están en el mismo paquete */
        dog.nombre = "Pipi";
        dog.raza = "Puro Perro";

        String jugando = dog.jugar(people); /* De este modo interactuan los objetos*/
        System.out.println("jugado = " + jugando);

        String saludo = saludar();
        System.out.println("saludo = " + saludo);
        String edad = MAYOR_DE_EDAD;
        System.out.println("Edad = " + edad);
    }
}