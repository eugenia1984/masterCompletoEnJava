package SeccionString;

public class EjemploStringMetodos {
    public static void main(String[] args) {
        String name = "María Eugenia";
        System.out.println("name = " + name);

        // .length() para saber cuantos caracteres tiene
        System.out.println("name.length() : " + name.length());

        // .toUpperCase() pasa a mayúscula
        System.out.println("name.toUpperCase(): " + name.toUpperCase());

        // .toLowerCase() pasa a minúscula
        System.out.println("name.toLowerCase(): " + name.toLowerCase());

        // equals para comparar
        System.out.println("name.equals(\"Maria eugenia\"): " + name.equals("Maria eugenia"));
        // false por el acento y la minúscula

        // equalsIgnoreCase() ignora mayúscula y minúscula
        System.out.println("name.equalsIgnoreCase(\"maría eugenia\") : " + name.equalsIgnoreCase("maría eugenia"));

        // compareTo() compara en orden alfabetico, por orden de tabla unicode
        // Si son iguales da 0
        System.out.println("name.compareTo(\"María Eugenia\") : " + name.compareTo("María Eugenia"));

        // charAt() para convertir un String a caracter, empieza en 0
        System.out.println("name.chartAt(0): " + name.charAt(0));
        System.out.println("La última letra: " + name.charAt(name.length()-1));

        // subString() para obtener parte de una string
        // empieza desde 0
        // 1er arg: desde, lo incluye
        // 2do arg: hasta, no lo incluye
        System.out.println("name.subString(1) : " + name.substring(1)); // aría Eugenia
        System.out.println("name.subString(0,3) : " + name.substring(0, 3)); // Mar

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas);

        // replace() reemplazo un caracter por otro, no modifica el original
        // 1er arg: target, que reemplazo
        // 2do arg: por que voy a reemplazar
        System.out.println("trabalenguas.replace(\"a\", \".\") : " + trabalenguas.replace("a", ".") ); // tr.b.lengu.s

        // indexOf(), la primera que coincidencia, corta al encontrar y no sigue
        System.out.println("trabalenguas.indexOf(\"a\") : " + trabalenguas.indexOf("a")); // 2

        // lastIndexOf(), busca la última coincidencia
        // Si no encuentra retorna -1
        System.out.println("trabalenguas.lastIndexOf(\"a\") : " + trabalenguas.lastIndexOf("a")); // 10

        // contains(), para saber si lo contiene, retorna true o false
        // puedo chequear un String no solo caracter
        System.out.println("trabalenguas.contains(\"a\") : " + trabalenguas.contains("a")); // true

        // startsWith(), para  chequear si comienza o no con lo que recibe por param
        System.out.println("trabalenguas.startsWith(\"lenguas\"): " + trabalenguas.startsWith("lenguas")); // false

        // endsWith(), para chequear si finaliza o no con lo que recibe por param
        System.out.println("trabalenguas.endsWith(\"as\"): " + trabalenguas.endsWith("as")); // true

        // trim(), saca los espacios en blanco al comienzo y al final
        System.out.println("   trabalenguas  ");
        System.out.println("   trabalenguas  ".trim());
    }
}