package fundamentosDeProgramacion.arreglosUnidimensionales;

import java.util.Scanner;

public class Punto7 {

    public static int InsertarValor (int[] arreglo, int x, int k) {

        return arreglo[k-1] = x;
    }

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int n, x, k;
        System.out.println("Ingrese la cantidad de elementos a almacenar");
        n = a.nextInt();
        int[] ar = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el valor " + (i+1));
            ar[i] = a.nextInt();
        }
        System.out.println("Ingrese el valor a insertar");
        x = a.nextInt();

        System.out.println("Ingrese el lugar donde desea insertar el " + x);
        k = a.nextInt();

        InsertarValor(ar,x,k);

        for (int j = 0; j < n; j++)
            System.out.println(ar[j]);
    }
}
