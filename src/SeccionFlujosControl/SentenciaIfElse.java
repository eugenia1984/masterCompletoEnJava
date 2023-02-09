package SeccionFlujosControl;

public class SentenciaIfElse {
    public static void main(String[] args) {
        float promedio = 5.8f;

        // IF ELSE
        if(promedio >= 6.5) {
            System.out.println("Felicitaciones, buen promedio");
        } else {
            System.out.println("Hay que estudiar un poco más");
        }

        // IF - ELSE IF - ELSE
        if(promedio >= 6.5) {
            System.out.println("Felicitaciones, excelente promedio");
        } else if(promedio >=6.0) {
            System.out.println("Felicitaciones, muy buen promedio");
        } else if(promedio >= 5.5) {
            System.out.println("Buen promedio");
        } else if(promedio >= 4.0 ){
            System.out.println("Insuficiente. Hay que estudiar un poco más");
        } else {
            System.out.println("reprobado");
        }

        System.out.println("To promedio es promedio = " + promedio);

    }
}