package fundamentosDeProgramacion.talerSubalgoritmosFunciones;

public class Punto8 {

    public static double Sumatoria (int num) {
        if (num > 0) {
            double sumatoria = 0;

            for (int i = 1; i <= num; i++) {
                sumatoria = sumatoria + (i / Math.pow(2,i));
            }
            return sumatoria;
        }
        return 0;
    }

    public static void main(String[] args) {
        int a = 10;
        System.out.println(Sumatoria(a));
    }
}
