package fundamentosDeProgramacion.ejerciciosDeAlgoritmosCondicionales;

import java.util.Scanner;

public class Punto5 {

    public static void main(String[] args) {

        double num;
        Scanner a = new Scanner(System.in);

        System.out.println("Ingrese un numero para saber si es multiplo de 2 o no");
        num = a.nextDouble();

        if (num % 2 == 0) {
            System.out.println("El numero es multiplo de 2");
        }
        else {
            System.out.println("El numero no es multiplo de 2");
        }
    }
}
