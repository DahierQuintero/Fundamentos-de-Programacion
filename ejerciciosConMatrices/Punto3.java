package fundamentosDeProgramacion.ejerciciosConMatrices;

import java.util.Scanner;

public class Punto3 {

    public static void RellenaArray (int [][] c) {

        for (int i = 0; i < c.length; i++) {

            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = (int) (Math.random() * (9 + 1));
            }
        }
    }

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int filas, columnas, posVec = 0;

        System.out.println("Ingrese la cantidad de filas que desea");
        filas = a.nextInt();

        System.out.println("Ingrese la cantidad de columnas que desea");
        columnas = a.nextInt();

        int [][] ar = new int[filas][columnas];
        int [] vec = new int[filas * columnas];

        RellenaArray(ar);

        for (int i = 0; i < filas; i++) {

            for (int j = 0; j < columnas; j ++) {
                vec[posVec] = ar[i][j];
                posVec++;
            }
        }
        for (int i = 0; i < filas; i++) {
            System.out.println();
            for (int j = 0; j < columnas; j ++)
                System.out.print("{" + ar[i][j] + "}");
        }
        System.out.println();
        System.out.println("Los numeros almacenados son:");

        for (int i = 0; i < vec.length; i++)
            System.out.print(vec[i] + ", ");
    }
}
