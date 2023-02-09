package SeccionString;

public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        String file = "alguna_image.jpg";
        int i = file.lastIndexOf(".");
        // si el archivo tiene más de un . y uso indexOf(), ahi falla
        // es mejor utilizar lastIndexOG
        System.out.println("file.length(): " + file.length()); // 16
        System.out.println("file.substring(file.length()-4)) " + file.substring(file.length()-4)); // .jpg
        System.out.println("file.substring(i+1): " + file.substring(i+1)); // jpg
    }
}