package SeccionPOOHerencia.ejemplo;

import SeccionPOOHerencia.clases.Alumno;
import SeccionPOOHerencia.clases.AlumnoInternacional;
import SeccionPOOHerencia.clases.Profesor;

public class EjemploHerencia {
    public static void main(String[] args) {

        System.out.println("\n========= Creando la instancia de la clase Alumno ==========");
        Alumno alumno = new Alumno();
        alumno.setNombre("Maria Eugenia");
        alumno.setApellido("Costa");
        alumno.setInstitucion("Colegio Nacional");
        alumno.setNotaMatematica(7.0);
        alumno.setNotaCastellano(6.0);
        alumno.setNotaHistoria(8.0);
        System.out.println("Alumno = " + alumno.toString() );
        /*
         Si alumno fuera de clase Persona
         tendría que hacer cast con la clase Alumno
         ((Alumno)alumno).setInstitucion("Instituto Nacional");
        * */

        System.out.println("\n========== Creando la instancia de la clase AlumnoInternacional ==========");
        AlumnoInternacional alumnoInternacional = new AlumnoInternacional();
        alumnoInternacional.setNombre("John");
        alumnoInternacional.setApellido("Carter");
        alumnoInternacional.setInstitucion("Nacional");
        alumnoInternacional.setPais("Reino Unido");
        alumnoInternacional.setNotaCastellano(7.0);
        alumnoInternacional.setNotaHistoria(5.0);
        alumnoInternacional.setNotaMatematica(8.0);
        alumnoInternacional.setNotaIdiomas(8.0);

        System.out.println("\n=========== Creando la instancia de la clase Profesor ==========");
        Profesor profesor = new Profesor();
        profesor.setNombre("Juan");
        profesor.setApellido("Lopez");
        profesor.setAsignatura("Historia");
        System.out.println("Profesor = " + profesor.getNombre() + " , " + profesor.getApellido() +
                " , " + profesor.getAsignatura());

        Class clase = alumnoInternacional.getClass();
        while(clase.getSuperclass() != null) {
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }
    }
}