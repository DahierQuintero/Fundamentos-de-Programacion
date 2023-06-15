package fundamentosDeProgramacion.workshop2;

import java.util.Scanner;

public class Punto9 {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int f;
        // Soliocitamos la cantidad de filas que desea el usuario
        System.out.println("Ingrese cuantas filas desea incluir");
        f = a.nextInt();

        // Creamos la matriz con las filas que ya dio el usuario y con 3 columnas
        int [][] matrix = new int[f][3];

        // Llenamos de forma aleatoria las 2 primeras columnas de las filas
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < 2; j++)
                matrix[i][j] = (int) (Math.random() * 30) + 10;
        }

        /* Finalmente con este ciclo vamos a llenar la columna 3 restando el valor de la columna 1 y 2
           y mostramos el arreglo de la forma que muestra el programa
         */
        for (int i = 0; i < f; i++) {
            System.out.println();
            matrix[i][2] = matrix[i][0] - matrix[i][1];
            System.out.print(matrix[i][0] + " - " + matrix[i][1] + " = " + matrix[i][2]);
        }
    }
}
