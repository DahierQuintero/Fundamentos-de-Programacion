package fundamentosDeProgramacion.talerSubalgoritmosFunciones;

public class Punto4 {

    public static String ResiduoDivision(int a, int b) {

        boolean div = false;
        if (a > 0 & b > 0) {

            while (!div) {

                if (a >= b) {
                a = a - b;
                }
                else {
                    div = true;
                }
            }
            return "" + a;
        }
        return "No es posible realizar division con numeros iguales o menores a 0";
    }

    public static void main(String[] args) {
        int a = 70, b = 30;
        System.out.println(ResiduoDivision(a,b));
    }
}
