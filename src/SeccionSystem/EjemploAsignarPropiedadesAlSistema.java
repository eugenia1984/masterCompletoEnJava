package SeccionSystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class EjemploAsignarPropiedadesAlSistema {
    public static void main(String[] args) {
        try {
            FileInputStream archivo = new FileInputStream("src/SeccionSystem/config.properties");

            Properties p = new Properties(System.getProperties());
            // Agrego el archivo al objeto properties
            p.load(archivo);
            // Agrego una nueva propiedad -configuracion-
            p.setProperty("mi.propiedad.personalizada", "Mi valor guardado en el objeto properties");
            // listo las propiedades para corroborar que todavía no tienen los cambios
            System.getProperties().list(System.out);
            System.setProperties(p); // ahora si agrego mi propiedad personalizada

            System.out.println("**********************************");
            System.out.println(System.getProperty("mi.propiedad.personalizada"));
        } catch(Exception e) {
            System.err.println("No existe el archivo: " + e);
            System.exit(1); // para terminar
        }
    }
}