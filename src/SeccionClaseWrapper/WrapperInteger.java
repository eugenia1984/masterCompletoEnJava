package SeccionClaseWrapper;

public class WrapperInteger {
    public static void main(String[] args) {
        int intPrimitivo = 32768;
        // Con new quedo deprecado
        // Integer intObjeto = new Integer(32768);
        // De forma explicita -> BOXING
        Integer intObjeto2 = Integer.valueOf(intPrimitivo);
        // De forma implícita ->  AUTO BOXING
        Integer intObjeto = Integer.valueOf(32768);
        Integer objeto3 = 32768;
        System.out.println("intObjeto : " + intObjeto);

        int num = intObjeto;
        System.out.println("num : " + num);
        int num2 = intObjeto.intValue();
        System.out.println("num2 : " + num2);

        // String
        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor : " + valor);

        // Short
        Short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);
        
        // Byte
        Byte byteObjeto = intObjeto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto); // me lo permite, pero tengo perdida de definición
        
        // Long
        Long longObjeto = intObjeto.longValue();
        System.out.println("longObjeto = " + longObjeto);
    }
}