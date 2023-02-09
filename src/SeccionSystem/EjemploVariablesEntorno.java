package SeccionSystem;

import java.util.Map;

public class EjemploVariablesEntorno {
    public static void main(String[] args) {
        // Map : key - value
        Map<String, String> varEnv = System.getenv();
        // System.out.println("variable de ambiente del sistema = " + varEnv);

        System.out.println("------- Listando variables de entorno del sistema -----");
        for (String key: varEnv.keySet()) {
            System.out.println(key + " -> " + varEnv.get(key));
        }
        // para obtener una en particular
        String userName = System.getenv("USERNAME");
        System.out.println("userName = " + userName);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String path = System.getenv("Path");
        System.out.println("path = " + path);
        // Buscándola en el Map
        String path2 = varEnv.get("Path");
        System.out.println("path2 = " + path2);
    }
}