package fundamentosDeProgramacion.ejerciciosVectores;

import java.util.Scanner;

public class
Punto5 {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int[] vec = new int[10];
        int num;

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el valor de: " + (i+1));
            vec[i] = a.nextInt();
        }
        System.out.println("\nIngrese un numero");
        num = a.nextInt();

        System.out.println("Los  numeros mayores a " + num + " son:");
        for (int j =0; j < 10; j++) {

            if (vec[j] > num)
                System.out.print("⇒" + vec[j] + "⇐ ");
        }
    }
}
