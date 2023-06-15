package fundamentosDeProgramacion.arreglosBidimensionales;

import java.util.Scanner;

public class Punto3 {

    public static void SumaDosMatrices (int[][] m1, int[][] m2) {

        int sumaM1 = 0, sumaM2 = 0, res;

        for (int i = 0; i < m1.length; i++) {

            for (int j = 0; j < m1[i].length; j++) {
                sumaM1 = sumaM1 + m1[i][j];
            }
        }

        for (int i = 0; i < m2.length; i++) {

            for (int j = 0; j < m2[i].length; j++) {
                sumaM2 = sumaM2 + m2[i][j];
            }
        }
        res = sumaM1 + sumaM2;
        System.out.println("La suma de las 2 matrices es: " + res);
    }

    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);
        int [][] m1 = new int[4][4];
        int [][] m2 = new int[4][4];

        System.out.println("Ingrese los valores de la primera matriz");

        for (int i = 0; i < 4; i++) {
            System.out.println("Fila " + (i + 1));
            for (int j = 0; j < 4; j++) {
                System.out.println("Columna " + (j + 1));
                m1[i][j] = e.nextInt();
            }
        }

        System.out.println("Ingrese los valores de la segunda matriz");

        for (int i = 0; i < 4; i++) {
            System.out.println("Fila " + (i + 1));
            for (int j = 0; j < 4; j++) {
                System.out.println("Columna " + (j + 1));
                m2[i][j] = e.nextInt();
            }
        }

        SumaDosMatrices(m1,m2);
    }
}
