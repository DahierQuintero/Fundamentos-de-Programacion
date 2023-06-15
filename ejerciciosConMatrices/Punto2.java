package fundamentosDeProgramacion.ejerciciosConMatrices;

import java.util.Scanner;

public class Punto2 {

    public static void main(String[] args) {


        Scanner a = new Scanner(System.in);
        System.out.println("Ingrese las filas");
        int filas = a.nextInt();

        int [][] ar = new int[filas][3];

        for (int i = 0; i < ar.length; i++) {

            for (int j = 0; j < 2; j++) {

                System.out.println("Ingrese el valor de la fila " + (i+1) + " culumna " + (j+1));
                ar[i][j] = a.nextInt();
            }
            ar[i][2] = ar[i][0] + ar[i][1];
        }

        for (int i = 0; i < ar.length; i++)
            System.out.println(ar[i][0] + " + " + ar[i][1] + " = " + ar[i][2]);
    }
}
