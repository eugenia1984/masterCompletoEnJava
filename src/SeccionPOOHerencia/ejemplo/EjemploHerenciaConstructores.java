package SeccionPOOHerencia.ejemplo;

import SeccionPOOHerencia.clases.*;

public class EjemploHerenciaConstructores {
    public static void main(String[] args) {

        System.out.println("\n========= Creando la instancia de la clase Alumno ==========");
        Alumno alumno = new Alumno("María Eugenia", "Costa", 12, "Colegio Nacional");
        alumno.setNotaMatematica(7.0);
        alumno.setNotaCastellano(6.0);
        alumno.setNotaHistoria(8.0);
        alumno.setEmail("macosta@email.com");
        imprimir( alumno);
        /*
         Si alumno fuera de clase Persona
         tendría que hacer cast con la clase Alumno
         ((Alumno)alumno).setInstitucion("Instituto Nacional");
        * */

        System.out.println("\n============= Creando la instancia de la clase AlumnoInternacional =============");
        AlumnoInternacional alumnoInternacional = new AlumnoInternacional("John", "Carter", "Reino Unido");
        alumnoInternacional.setInstitucion("Instituto Nacional");
        alumnoInternacional.setEmail("john.carter@email.com");
        alumnoInternacional.setNotaCastellano(7.0);
        alumnoInternacional.setNotaHistoria(5.0);
        alumnoInternacional.setNotaMatematica(8.0);
        alumnoInternacional.setNotaIdiomas(8.0);
        imprimir(alumnoInternacional);

        System.out.println("\n============== Creando la instancia de la clase Profesor =============");
        Profesor profesor = new Profesor("Juan", "Lopez", "Historia");
        profesor.setEdad(40);
        profesor.setEmail("juan.lopez@instituto.edu");
        imprimir(profesor);
    }

    public static void imprimir(Persona persona) {
        System.out.println("nombre: " + persona.getNombre() + ", apellido: " +
                persona.getApellido() + ", edad: " + persona.getEdad() +
                ", email: " + persona.getEmail());

        if(persona instanceof Alumno) {
            System.out.println("Imprimiendo los datos del tipo Alumno:");
            System.out.println("Institución : " + ((Alumno)persona).getInstitucion());
            System.out.println("Nota Matemática : " + ((Alumno)persona).getNotaMatematica());
            System.out.println("Nota Castellano : " + ((Alumno)persona).getNotaCastellano());
            System.out.println("Nota Historia : " + ((Alumno)persona).getNotaHistoria());

            if(persona instanceof  AlumnoInternacional) {
                System.out.println("Imprimiendo los datos del tipo AlumnoInternacional:");
                System.out.println("Nota idioma: " + ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("Pais: " + ((AlumnoInternacional) persona).getPais());
            }
            System.out.println("----------------------- Promedio -----------------------------");
            System.out.println(((Alumno)persona).calcularPromedio());
        }

        if(persona instanceof Profesor) {
            System.out.println("Imprimiendo los datos del tipo Profesor:");
            System.out.println("Asignatura: " + ((Profesor) persona).getAsignatura());
        }
        System.out.println("----------- Sobreescritura saludar() -----------------------");
        System.out.println(persona.saludar());
    }
}