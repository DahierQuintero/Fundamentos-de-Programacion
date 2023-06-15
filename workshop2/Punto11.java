package fundamentosDeProgramacion.workshop2;

import java.util.Scanner;

public class Punto11 {

    /* Creamos la funcion que se encarga de devolver las veces que un numero esta en la matriz
       recibe como argumento la matriz y el numero a evaluar
     */
    public static int numeroVeces (int [][] matrix, int n) {
        // Creamos una variable para contar las veces que esta el numero en la matriz
        int veces = 0;

        // Con este ciclo recorremos toda la matriz
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                // Comparamos cada posicion con el numero a evaluar
                if (matrix[i][j] == n)
                    // si el numero es igual sumamos 1 a veces
                    veces++;
            }
        }
        // Retornamos las veces que estaba el numero en la matriz
        return veces;
    }

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int filas, columnas, num;

        // Solicitamos las filas que desea el usuario
        System.out.println("Ingrese las filas que desea");
        filas = a.nextInt();

        // Solicitamos las columnas que desea el usuario
        System.out.println("Ingrese las columnas que desea");
        columnas = a.nextInt();

        // Solicitamos el numero que desea evaluar
        System.out.println("Ingrese el numero que desea evaluar");
        num = a.nextInt();

        // Creamos la matriz
        int [][] ma = new int[filas][columnas];

        // Llenamos la matriz con numeros aleatorios entre 1 y 100
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++)
                ma[i][j] = (int) (Math.random() * 100) + 1;
        }

        // Imprimimos las veces que el numero esta en la matriz
        System.out.println("El numero " + num + " esta " + numeroVeces(ma,num) + " veces en la matriz");
    }
}
