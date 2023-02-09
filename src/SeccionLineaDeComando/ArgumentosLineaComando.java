package SeccionLineaDeComando;

public class ArgumentosLineaComando {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Debe ingresar argumentos");
            System.exit(-1);
        }
        for(int i = 0; i < args.length; i++) {
            System.out.println("Argumentos : " + i + " : " + args[i]);
            /*
            Voy por línea de comando y me sitúo en src
            Y para compilar:
            > java.ArgumentosLineaComando.java
            Y ahora tengo el ArgumentosLineaComando.class
            Le paso parámetro y ejecuto por línea de comando;
            > java ArgumentosLineaComando Andreas Pepe "Juan Francisco"

            Para ejecutar un archivo en producción
            me sitúo en "out"
            > java ArgumentosLineaComando Andreas Pepe "Juan Francisco"

            > javac ArgumentosLineaComando.java -encoding urf8
            */
        }
    }
}