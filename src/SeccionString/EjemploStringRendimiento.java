package SeccionString;

public class EjemploStringRendimiento {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a; // c es igual al objeto a

        long start = System.currentTimeMillis();

        // El StringBuilder es mutable, usamos .append()
        StringBuilder sb = new StringBuilder(a);
        // for
        //1ro: inicializo
        //2do: condición a evaluar
        //3ro: actualización
        for(int i = 0; i < 500; i++) {
            // c = c.concat(a).concat(b).concat("\r"); // 2 milisegundos
            // c += a + b + "\r"; // 19 milisegundos
            sb.append(a).append(b).append("\r"); // 0 milisegundos
            // append retorna el mismo objeto, la misma instancia
            // por eso puedo concatenar
        }

        System.gc(); // llamo al garbage colector, acelerando el proceso
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        System.out.println("sb : " + sb.toString());

        // StringBuilder es el más eficiente, luego concat y
        // con + es lo más lento(se usa el StringBuilder por debajo)
        // Si son muchos String es más rápido + que concat, igualmente
        // StringBuilder sigue siendo el más rápido
        System.exit(1); // para salir del sistema
    }
}