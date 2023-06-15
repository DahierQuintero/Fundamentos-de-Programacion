package fundamentosDeProgramacion.ejerciciosConMatrices;

import java.util.Scanner;

public class Punto1 {

    public static void RellenaArray (int [][] c) {

        for (int i = 0; i < c.length; i++) {

            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = (int) (Math.random() * (9 + 1));
            }
        }
    }

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int filas, columnas;

        System.out.println("Ingrese la cantidad de filas que desea");
        filas = a.nextInt();

        System.out.println("Ingrese la cantidad de columnas que desea");
        columnas = a.nextInt();

        int [][] ar = new int[filas][columnas];

        RellenaArray(ar);

        for (int i = 0; i < filas; i++) {
            System.out.println();
            for (int j = 0; j < columnas; j++)
                System.out.print("[" + ar[i][j] + "]");
        }
    }
}
