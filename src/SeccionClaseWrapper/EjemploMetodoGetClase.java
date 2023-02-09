package SeccionClaseWrapper;
import java.lang.reflect.Method;
public class EjemploMetodoGetClase {
    public static void main(String[] args) {
        String texto = "Hoal que tal!";
        
        Class strString = texto.getClass();
        System.out.println("strString = " + strString); // class java.lang.String
        System.out.println("strString.getName() = " + strString.getName()); // java.lang.String
        System.out.println("strString.getSimpleName() = " + strString.getSimpleName()); // String
        System.out.println("strString.getPackage() = " + strString.getPackage()); // package java.lang, Java Platform API Specification, version 1.8

        // Para ver todos los métodos de la clase String
        for(Method metodo : strString.getMethods()) {
            System.out.println("metodo : " + metodo.getName());
        }
        
        Integer num = 34;
        Class intClass = num.getClass();
        Class objectClass = intClass.getSuperclass().getSuperclass();
        System.out.println("intClass = " + intClass); // class java.lang.Class
        System.out.println("intClass.getClass() = " + intClass.getClass()); // Java.lang.Integer
        System.out.println("intClass.getName() = " + intClass.getName()); // Java.lang.Integer
        System.out.println("intClass.getPackage() = " + intClass.getPackage()); // package java.lang, Java Platform API Specification, version 1.8
        System.out.println("intClass.getSuperclass().getSuperclass() = " +intClass.getSuperclass().getSuperclass()); // class java.lang.Object

        // Para ver todos los métodos de la clase Object
        for(Method metodo : objectClass.getMethods()) {
            System.out.println("metodo : " + metodo.getName());
        }
    }
}