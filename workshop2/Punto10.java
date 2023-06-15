package fundamentosDeProgramacion.workshop2;

import java.util.Scanner;

public class Punto10 {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int n;

        // Solicitamos el tamanio de la matriz
        System.out.println("Ingrese el tamanio que desea para la matriz");
        n = a.nextInt();

        // Creamos la matriz con el tamanio que nos dio el usuario
        int [][] mat = new int[n][n];

        // Rellenamos la matriz con numeros aleatorios entre 1 y 100
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                mat [i][j] = (int) (Math.random() * 100) + 1;
        }

        // Imprimimos la diagonal de la matriz
        for (int i = 0; i < n; i++)
            System.out.print("[" + mat[i][i] + "]");
    }
}
