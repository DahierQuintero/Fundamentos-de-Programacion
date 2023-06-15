package fundamentosDeProgramacion.workshop2;

import java.util.Scanner;

public class Punto12 {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int n;

        System.out.println("Ingrese cuantos numeros desea ingresar");
        n = a.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el valor " + (i+1));
            arr[i] = a.nextInt();
        }

        for (int i = 0; i < n; i ++) {
            arr[i] = arr[i] * arr[i];
            System.out.print("[" + arr[i] + "]");
        }
    }
}
