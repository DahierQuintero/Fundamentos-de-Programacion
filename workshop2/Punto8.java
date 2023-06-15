package fundamentosDeProgramacion.workshop2;

import java.util.Scanner;

public class Punto8 {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int m, n;
        // Solicitamos las filas al usuario
        System.out.println("Ingrese las filas que desea");
        m = a.nextInt();

        // Solicitamos las columnas al usuario
        System.out.println("Ingrese las columnas que desea");
        n = a.nextInt();

        // Creamos la matriz con las filas y columnas ya ingresadas por el usuario
        int[][] matrix = new int[m][n];
        // Creamos el vector con el mismo tamanio que las columnas
        int[] vec = new int[n];

        // Solicitamos e ingresamos los valores de la matriz
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Ingrese el valor de la fila " + (i+1) + " columna " + (j+1));
                matrix[i][j] = a.nextInt();
            }
        }

        // Solicitamos e ingresamos los valores del vector
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el valor del vector en la posicion " + (i+1));
            vec[i] = a.nextInt();
        }

        // Con este ciclo vamos a multiplicar el valor de la matriz con el valor del vector, valor a valor en cada fila
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                matrix[i][j] = matrix[i][j] * vec[j];
        }

        // Finalmente imprimimos la matriz con los resultados
        for (int i = 0; i < m; i++) {
            System.out.println();
            for (int j = 0; j < n; j++)
                System.out.print("[" + matrix[i][j] + "]");
        }
    }
}
