package SeccionClaseWrapper;
public class WrapperBoolean {
    public static void main(String[] args) {
        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        boolean primBoolean = num1 > num2; // false
        Boolean objetoBoolean = false; // autoboxing
        Boolean objetoBoolean1 = Boolean.valueOf(primBoolean);  // Forma explicita
        Boolean objetoBoolean2 = Boolean.valueOf("false");
        Boolean objetoBoolean4 = false;

        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objetoBoolean = " + objetoBoolean);
        System.out.println("objetoBoolean1 = " + objetoBoolean1);
        System.out.println("objetoBoolean2 = " + objetoBoolean2);
        System.out.println("objetoBoolean4 = " + objetoBoolean4);

        System.out.println("Comparando dos objetos boolean :" + (objetoBoolean1 == objetoBoolean2)); // true
        System.out.println("Comparando dos objetos boolean :" + (objetoBoolean1.equals(objetoBoolean2))); // true

        System.out.println("Comparando dos objetos boolean :" + (objetoBoolean1 == objetoBoolean4)); // true
        System.out.println("Comparando dos objetos boolean :" + (objetoBoolean1.equals(objetoBoolean4))); // true

        boolean primBoolean2 = objetoBoolean1.booleanValue();
        System.out.println("primBoolean2 = " + primBoolean2); // false
    }
}