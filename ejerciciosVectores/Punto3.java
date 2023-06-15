package fundamentosDeProgramacion.ejerciciosVectores;

import java.util.Scanner;

public class Punto3 {

    public static void main(String[] args) {

        int pos = 0, neg = 0, cero = 0;
        int[] arr = new int[10];
        Scanner a = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el valor " + (i+1));
            arr[i] = a.nextInt();

            if (arr[i] > 0)
                pos++;
            else if (arr[i] < 0)
                neg++;
            else
                cero++;
        }
        System.out.println("Hay " + pos + " numeros positivos en el arreglo");
        System.out.println("Hay " + neg + " numeros negativos en el arreglo");
        System.out.println("Hay " + cero + " numeros nulos en el arreglo");
    }
}
