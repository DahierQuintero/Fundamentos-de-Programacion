package fundamentosDeProgramacion.ejerciciosVectores;

import javax.swing.*;
import java.util.Scanner;

public class Punto2 {

    public static void main(String[] args) {

        int par = 0, impar = 0;
        int[] arr = new int[10];
        Scanner a = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el valor " + (i+1));
            arr[i] = a.nextInt();

            if (arr[i] % 2 == 0)
                par++;
            else
                impar++;
        }
        System.out.println("Hay " + par + " numeros pares en el arreglo");
        System.out.println("Hay " + impar + " numeros impares en el arreglo");
    }
}
