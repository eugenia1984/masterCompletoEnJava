package SeccionPOOInterface;

import SeccionPOOInterface.modelo.*;
import static SeccionPOOInterface.modelo.Genero.*;
import static SeccionPOOInterface.modelo.Imprimible.imprimir;
import static SeccionPOOInterface.modelo.Imprimible.TEXTO_DEFECTO;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculum cv = new Curriculum(new Persona("John", "Doe"), "Ingeniero de sistemas", "Resumen laboral...");
        cv.addExperiencia("Java")
        .addExperiencia("Oracle DBA")
        .addExperiencia("Spring Framework")
        .addExperiencia("Angular")
        .addExperiencia("Desarrollador FullStack");

        Informe informe = new Informe(new Persona("Martin", "Fowler"), new Persona("Patrik","James"), "Estudio sobre microservicios");

        Libro libro = new Libro(new Persona("Erich" ," Gamma"), "Patrones de diseño: Elementos Reusables POO"
                , PROGRAAMCION);
        libro.addPagina(new Pagina("Patrón Singleton"))
                .addPagina(new Pagina("Patrón Observador"))
                .addPagina(new Pagina("Patrón Factory"))
                .addPagina(new Pagina("Patrón Composite"));

        imprimir(cv);
        System.out.println("***********************************************\n");
        imprimir(informe);
        System.out.println("************************************************\n");
        imprimir(libro);
        System.out.println("************************************************\n");
        System.out.println(TEXTO_DEFECTO);
    }

    /*
    // Si no tendría en Imprimible: static void imprimir(Imprimible imprimible)
    // Usará esta
    public static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }
     // Y en el main : imprimir(cv); en vez de  Imprimible.imprimir(cv);
     // Pero al import static SeccionPOOInterface.modelo.Imprimible.imprimir;
     // Solo con imprimir();
     */
}