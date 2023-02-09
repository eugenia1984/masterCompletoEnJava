package SeccionIntroduccion;

public class PrimitivosEnteros {
    public static void main(String[] args) {
        // bytes
        byte numeroByte = 7;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte corresponde en byte a " + Byte.BYTES); // 1
        System.out.println("Tipo byte corresponde en bites a " + Byte.SIZE); // 8
        System.out.println("Valor mínimo de un byte: " + Byte.MIN_VALUE); // -128
        System.out.println("Valor míximo de un byte: " + Byte.MAX_VALUE); // 128
        // short 2bytes, 16bits
        int numeroShort = 3000;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo short corresponde en byte a " + Short.BYTES); // 2
        System.out.println("Tipo shot corresponde en bites a " + Short.SIZE); // 16
        System.out.println("Valor mínimo de un short: " + Short.MIN_VALUE); // -32768
        System.out.println("Valor máximo de un short: " + Short.MAX_VALUE); // 32767
        // int
        int numeroInt = 32768;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo int corresponde en byte a " + Integer.BYTES); // 4
        System.out.println("Tipo int corresponde en bites a " + Integer.SIZE); // 32
        System.out.println("Valor mínimo de un int: " + Integer.MIN_VALUE); // -2147483648
        System.out.println("Valor máximo de un int: " + Integer.MAX_VALUE); // 147483647
        // long
        long numeroLong = 2147483648L; // L para que no lo tome como int
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Tipo long corresponde en byte a " + Long.BYTES); // 8
        System.out.println("Tipo long corresponde en bites a " + Long.SIZE); // 64
        System.out.println("Valor mínimo de un long: " + Long.MIN_VALUE); // -9223372036854775808
        System.out.println("Valor máximo de un long: " + Long.MAX_VALUE); // 9223372036854775807

    }
}