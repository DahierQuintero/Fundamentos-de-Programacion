package fundamentosDeProgramacion.arreglosUnidimensionales;

import java.util.Scanner;

public class Punto8 {

    public static void SumaParesImpares (int[] arreglo) {

        Scanner a = new Scanner(System.in);
        int pares = 0, impares = 0;

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] % 2 == 0)
                pares = pares + arreglo[i];
            else
                impares = impares + arreglo[i];
        }
        System.out.println("La suma de los numeros pares es: " + pares);
        System.out.println("La suma de los numeros impares es: " + impares);
    }

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int lon;
        System.out.println("Ingrese la cantidad de elementos a introducir");
        lon = a.nextInt();
        int[] elem = new int[lon];

        for (int i = 0; i < lon; i++) {
            System.out.println("Ingrese el valor " + (i+1));
            elem[i] = a.nextInt();
        }
        SumaParesImpares(elem);
    }
}
