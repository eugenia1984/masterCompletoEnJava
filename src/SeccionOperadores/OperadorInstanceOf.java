package SeccionOperadores;
public class OperadorInstanceOf {
    public static void main(String[] args) {
        String texto = "Creando un objeto de la clase String...que tal!";
        Integer num = 7;
        Double decimal = 45.56;

        // Todas las clases derivan de Object
        // Es la clase padre de todos los objetos

        // Double, Integer, Short y Long heredan de Number

        boolean bool = texto instanceof String;
        System.out.println("texto es del tipo String ? " + bool);
        bool = texto instanceof Object;
        System.out.println("Texto es del tipo Object ? " + bool);

        bool = num instanceof Integer;
        System.out.println("num es del tipo Integer ? " + bool);
        bool = num instanceof Number;
        System.out.println("num es del tipo Number ? " + bool);
        bool = num instanceof Object;
        System.out.println("num es del tipo Object ? " + bool);
        //bool = num instanceof Short;
        // de error no se puede castear

        bool = decimal instanceof Object;
        System.out.println("decimal es del tipo Object ? " + bool);

        bool = decimal instanceof Number;
        System.out.println("decimal es del tipo Number ? " + bool);
    }
}