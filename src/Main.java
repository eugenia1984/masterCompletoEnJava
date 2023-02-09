public class Main {
    public static void main(String[] args) {
        // variable de tipo Sting
        String sayHi = "Hello world!";
        System.out.println(sayHi);
        // como el String es un objeto tiene metodos como toUpperCase
        System.out.println("sayHi = " + sayHi.toUpperCase());
        // variable de tipo int(entero)
        int numberOne= 1;
        System.out.println("numberOne= " + numberOne);
        // variable de tipo boolean
        boolean isLogin = true;

        // si definia aca a numberTwo tenia un contexto global
        if(isLogin) {
            System.out.println("Bienvenido/a");
            // al ser definido dentro del if solo existe dentro
            // de este contexto
            int numberTwo = 2;
            System.out.println(numberTwo);
        }
    }
}