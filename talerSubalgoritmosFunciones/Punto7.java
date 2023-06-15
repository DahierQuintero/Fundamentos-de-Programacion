package fundamentosDeProgramacion.talerSubalgoritmosFunciones;

public class Punto7 {

    public static boolean PrimoOno (int num) {

        if (num <= 1)
            return false;

        else if (num == 2)
            return true;

        else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        int n = 5;

        if (PrimoOno(n))
            System.out.println("El numero " + n + " es primo");
        else
            System.out.println("El numero " + n + " no es primo");
    }
}
