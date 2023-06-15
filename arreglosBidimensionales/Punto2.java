package fundamentosDeProgramacion.arreglosBidimensionales;

import java.util.Scanner;

public class Punto2 {

    public static void EscribirContenidoMatriz (int filas, int columnas) {

        Scanner a = new Scanner(System.in);
        int [][] matrix = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {

            for (int j = 0; j < columnas; j++) {

                System.out.println("Ingrese el valor de la fila " + (i+1) + " columna " + (j+1));
                matrix[i][j] = a.nextInt();
            }
        }
    }

    public static void main(String[] args) {

        int filas = 2, columnas = 3;

        EscribirContenidoMatriz(filas,columnas);
    }
}
