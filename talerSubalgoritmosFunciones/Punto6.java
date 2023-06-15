package fundamentosDeProgramacion.talerSubalgoritmosFunciones;

public class Punto6 {

    public static boolean ParOno (int num) {
        boolean par;

        if (num % 2 == 0) {
            par = true;
        }
        else {
            par = false;
        }
        return par;
    }

    public static void main(String[] args) {
        int a = 8;
        if (ParOno(a))
            System.out.println("El numero " + a + " es par");
        else
            System.out.println("El numero " + a + " no es par");
    }
}
