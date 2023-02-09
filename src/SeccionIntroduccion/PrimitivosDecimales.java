package SeccionIntroduccion;

public class PrimitivosDecimales {
    public static void main(String[] args) {
        // float, se agrega la F al final, el decimal es un .
        // Notación científica ->  1.5e-10f = 0.00000000015f
        float realFloat = 9223372036854775808F;
        System.out.println("realFloat = " + realFloat);
        System.out.println("Tipo float corresponde en byte a " + Float.BYTES); // 4
        System.out.println("Tipo float corresponde en bites a " + Float.SIZE); // 32
        System.out.println("Valor mínimo de un float: " + Float.MIN_VALUE); // 1.4E-45
        System.out.println("Valor máximo de un float: " + Float.MAX_VALUE); // 3.4028235E38
        // Double, por defecto en double por eso no es necesaria la D al final
        double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("Tipo double corresponde en byte a " + Double.BYTES); // 8
        System.out.println("Tipo double corresponde en bites a " + Double.SIZE); // 64
        System.out.println("Valor mínimo de un double: " + Double.MIN_VALUE); // 4.9E-324
        System.out.println("Valor máximo de un double: " + Double.MAX_VALUE); // 1.7976931348623157E308
    }
}