package fundamentosDeProgramacion.arreglosUnidimensionales;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Punto6 {

    public static void DividirElementos (int k) {

        DecimalFormat df = new DecimalFormat("#0.00");
        double[] t = new double[50];
        double[] y = new double[50];

        for (int i = 0; i < 50; i++) {
            t[i] = Math.random() * (100 + 1);
        }

        for (int j = 0; j < 50; j++) {
            y[j] = t[j] / t[k];
            System.out.println(df.format(y[j]));
        }
    }

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int num;

        System.out.println("Ingrese un numero");
        num = a.nextInt();

        DividirElementos(num);
    }
}
