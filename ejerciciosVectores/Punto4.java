package fundamentosDeProgramacion.ejerciciosVectores;

import java.util.Scanner;

public class Punto4 {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int cant;
        System.out.println("Ingrese los elementos del arreglo");
        cant = a.nextInt();
        int[] numero = new int[cant];

        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese el valor " + (i+1));
            numero[i] = a.nextInt();

            for (int j = 0; j < i; j++) {

                if (numero[i] == numero[j]) {
                    System.out.println("El valor no puede ser igual a los valores ingresados anteriormente");
                    i--;
                }
            }
        }
        System.out.println(" ");
        System.out.println("Los valores del arreglo son los siguientes");
        for(int i = 0; i < cant; i++)
            System.out.println(numero[i]);
    }
}
