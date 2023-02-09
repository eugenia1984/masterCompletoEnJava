package SeccionString;

public class EjemploStringMetodosArreglos {
    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas);

        // toCharArray() convierte el String
        System.out.println("trabalenguas.toCharArray(): " + trabalenguas.toCharArray()); // [C@1b6d3586

        char[] arreglo = trabalenguas.toCharArray();
        // length en un array es un atributo, va sin ()
        int largo = arreglo.length;
        for(int i = 0; i < largo; i++) {
            System.out.print(arreglo[i]);
        }
        // OUTPUT: trabalenguas

        System.out.println("\ntrabalenguas.split(\"a\") : " + trabalenguas.split("a"));

        String[] arreglo2 = trabalenguas.split("a");
        int i = arreglo2.length;
        for(int j = 0; j < i; j++) {
            System.out.print(arreglo2[j]);
        }
        // OUTPUT: trblengus
        System.out.println();

        String file ="alguna.imagen.pdf";
        // Si uso el . se como como REgExp
        String[] fileArr = file.split("\\.");
        i = fileArr.length;
        for(int j = 0; j < i; j++) {
            System.out.println(fileArr[j]);
        }
        // OUTPUT:
        // alguna
        // imagen
        // pdf
        System.out.println("Extension: " + fileArr[i-1]);
    }
}