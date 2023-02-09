package SeccionIntroduccion;

public class ConversionDeTipos {
    public static void main(String[] args) {
        // De String a int
        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);
        // De String a double, también con notación científica
        String realStr = "98765.433e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);
        // De String a boolean
        String logicoStr = "true";
        Boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        /* Conversiones de tipo primitivos a cadenas */
        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);
        // De int a String con Integer.toString()
        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        // de int a String con String.valueOf()
        String otroNumeroStr2 = String.valueOf(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr2);
        // de double a String con Double.toString()
        double otroRealDouble = 1.23456;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);
        // de float a String
        otroRealStr = String.valueOf(1.23456e2f);
        System.out.println("otroRealStr = " + otroRealStr);

        /* Conversiones entre tipos primitivos */
        int i = 1000;
        short s = (short)i; // hay perdida de información si no hago casting
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        // no se puede castear in int a un boolean
        char b = (char)i; // se puede castear de int a char
        System.out.println("b = " + b);
        float f = (float)i; // se puede castear de int a float
        System.out.println("f = " + f);
        // en primitivo solo podemos hacer cast a tipo numerico
    }
}