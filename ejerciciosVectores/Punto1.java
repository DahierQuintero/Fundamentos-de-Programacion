package fundamentosDeProgramacion.ejerciciosVectores;

import java.util.Scanner;

public class Punto1 {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int cant;
        System.out.println("Ingrese la dimension del arreglo");
        cant = a.nextInt();
        double[] arreglo = new double[cant];

        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese el valor " + (i+1));
            arreglo[i] = a.nextDouble();
        }

        for (int j = 0; j < cant; j++) {
            System.out.println(arreglo[j] * arreglo[j]);
        }
    }
}
