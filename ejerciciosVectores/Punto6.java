package fundamentosDeProgramacion.ejerciciosVectores;

import java.util.Scanner;

public class Punto6 {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int[] arr = new int[20];

        for (int i = 0; i < 20; i++)
            arr[i] = (int) Math.round(Math.random() * (100));

        System.out.println("Los numeros menores o iguales a 10 son: ");
        for (int j = 0; j < 20; j++) {
            if (arr[j] <= 10)
                System.out.print("⇒" + arr[j] + "⇐ ");
        }
    }
}
