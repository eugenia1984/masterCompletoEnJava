package SeccionOperadores;

public class OperadorInstanceOfGenericos {
    public static void main(String[] args) {
        Object texto = "Creando un objeto";
        Number num = 7; // creándolo con autoboxing con new esta deprecado
        // Otra opción:
        //Number num = Integer.valueOf(7);

        Number decimal = 45.56f;
        // Number decimal = Float.valueOf(45.56f);

        boolean bool = texto instanceof String;
        System.out.println("texto es del tipo String ? " + bool);
        bool = texto instanceof Object;
        System.out.println("Texto es del tipo Object ? " + bool);
        bool = texto instanceof Integer; // false
        System.out.println("Texto es del tipo Integer ? " + bool);

        bool = num instanceof Integer;
        System.out.println("num es del tipo Integer ? " + bool);
        bool = num instanceof Number;
        System.out.println("num es del tipo Number ? " + bool);
        bool = num instanceof Object;
        System.out.println("num es del tipo Object ? " + bool);
        bool = num instanceof Long; // false
        System.out.println("num es del tipo Long ? " + bool);
        bool = num instanceof Double; // false
        System.out.println("num es del tipo Double ? " + bool);
        bool = num instanceof Float; // false
        System.out.println("num es del tipo Float ? " + bool);
        bool = num instanceof Short; // false
        System.out.println("num es del tipo Short ? " + bool);

        bool = decimal instanceof Object;
        System.out.println("decimal es del tipo Object ? " + bool);
        bool = decimal instanceof Number;
        System.out.println("decimal es del tipo Number ? " + bool);
        bool = decimal instanceof Integer; // false
        System.out.println("decimal es del tipo Integer ? " + bool);
        bool = decimal instanceof Double; // false
        System.out.println("decimal es del tipo Double ? " + bool);
        bool = decimal instanceof Float;
        System.out.println("decimal es del tipo Float ? " + bool);
    }
}