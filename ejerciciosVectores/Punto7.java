package fundamentosDeProgramacion.ejerciciosVectores;

import java.util.Scanner;

public class Punto7 {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int cant, con = 0;
        System.out.println("Ingrese la longitud del vector");
        cant = a.nextInt();
        int[] n = new int[cant];

        for (int i = 0; i < cant; i++) {
            n[i] = (int) Math.round(Math.random() * 100);

            int ayud = 0;
            if (n[i] > 1) {
                for (int j = 1; j <= n[i]; j++ ) {
                    if (n[i] % j == 0)
                        ayud++;
                }
            }
            if (ayud == 2)
                con++;
        }
        System.out.println("Hay " + con + " numeros primos en el vector");
    }
}
