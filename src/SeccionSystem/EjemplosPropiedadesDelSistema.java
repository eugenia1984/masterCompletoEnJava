package SeccionSystem;

import java.util.Properties;

public class EjemplosPropiedadesDelSistema {
    public static void main(String[] args) {
        // https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html
        // Para ver el usuario
        String userName = System.getProperty("user.name");
        System.out.println("userName = " + userName);

        String home = System.getProperty("user.home");
        System.out.println("home = " + home);
        
        // El espacio de trabajo -directorio dle proyecto-
        String workSpace = System.getProperty("user.dir");
        System.out.println("workSpace = " + workSpace);
        
        // Versión de Java
        String javaVersion = System.getProperty("java.version");
        System.out.println("javaVersion = " + javaVersion);

        String lineSeparator = System.getProperty("line.separator");
        System.out.println("lineSeparator: \"una linea nueva... \" => " + lineSeparator + " una linea nueva");

        // Para listar las propiedades
        Properties p = System.getProperties();
        p.list(System.out);
    }
}