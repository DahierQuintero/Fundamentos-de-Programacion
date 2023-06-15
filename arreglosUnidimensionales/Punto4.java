package fundamentosDeProgramacion.arreglosUnidimensionales;

import java.util.Scanner;

public class Punto4 {

    public static double PromedioElementos () {

        Scanner a = new Scanner(System.in);
        double prom = 0;
        int cant;
        System.out.println("Ingrese el numero de elementos a guardar");
        cant = a.nextInt();
        double[] elemen = new double[cant];

        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese el elemento " + (i+1));
            elemen[i] = a.nextDouble();
            prom = prom + elemen[i];
        }
        return prom / cant;
    }

    public static void main(String[] args) {

        System.out.println("El promedio de los elementos ingresados es " +  PromedioElementos());
    }
}
