package SeccionOperadores;

public class OperadoresAsignacion {
    public static void main(String[] args) {
        int i = 5;
        int j = i + 4;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // operadores combinados o compuestos
        i += 2; // i = i + 2
        System.out.println("i+=2 : " + i); // 7

        i+=5;
        System.out.println("i+=5 : " + i); // 12

        j-=4; // j = j - 4
        System.out.println("j-=4 :  " + j); // 5

        j*=3; // j = j *3
        System.out.println("j*=3 : " + j); // 15

        // concatenar String con +=
        String sqlString = "select * from clientes as c";
        sqlString += " where c.nombre =´Andres´ ";
        sqlString += "and c.activo = 1";
        System.out.println("sqlString = " + sqlString);
    }
}