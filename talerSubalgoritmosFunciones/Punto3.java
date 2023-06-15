package fundamentosDeProgramacion.talerSubalgoritmosFunciones;

public class Punto3 {

    public static double ValorAbsoluto (double num) {
        return Math.abs(num);
    }

    public static void main(String[] args) {

        double num = -90;
        System.out.println("El valor absoluto de " + num + " es: " + ValorAbsoluto(num));
    }
}
