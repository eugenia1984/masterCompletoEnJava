package SeccionArreglos;

public class EjemploArreglosOrdenamientoBurbujaOptimizado {

    public static void main(String[] args) {

       String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy", "Disco Duro SSD Samsung Externo",
                "Asus Notebook", "MacBook Air", "Chromecast 4ta generación", "MacBook Pro"};

       Integer[] numeros = {1,8,2,5,3};

       int total = productos.length;
       int total2 = numeros.length;

       // Ordenamos con método burbuja en array de productos
        int contador = 0;
        int contador2 = 0;

       for(int i = 0; i < total-1; i++) { // recorre cada elemento

            for(int j = 0;  j < total-1-i; j++) { // comparo el elemento actual con el siguiente
                if(productos[j+1].compareTo(productos[j]) < 0) {
                    // intercambiamos las posiciones
                    String auxiliar = productos[j];
                    productos[j] = productos[j+1];
                    productos[j] = auxiliar;
                }
                contador++;
            }
       }

       System.out.println("contador = " + contador);
       System.out.println("********* Ordenamos con método burbuja **********");
       for(int i = 0; i < total; i++) {
           System.out.println("Para indice : " + i + " : " + productos[i]);
       }

       // Método burbuja para el array de números
        for(int i = 0; i < total2 - 1; i++) { // recorre cada elemento

            for(int j = 0;  j < total2 - 1 -i; j++) { // comparo el elemento actual con el siguiente
                if( ((Integer)numeros[j+1]).compareTo(numeros[j]) < 0) {
                    // intercambiamos las posiciones
                    int auxiliar = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j] = auxiliar;
                }
                contador2++;
            }
        }
        // los muestro
        System.out.println("******** Números ordenado **********");
        for(int i = 0; i < total2; i++) {
            System.out.println("Para indice : " + i + " : " + numeros[i]);
        }

    }
}