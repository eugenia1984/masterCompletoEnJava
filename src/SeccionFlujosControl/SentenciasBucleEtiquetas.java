package SeccionFlujosControl;

public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {

        bucle1:
        for(int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    continue bucle1;
                }
                System.out.println(" i = " + i +", j = " + j );
            }
        }
        // 0 1 3 4 de las i, se salta el 2
    }
}