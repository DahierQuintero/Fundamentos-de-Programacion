package fundamentosDeProgramacion.ejerciciosDeAlgoritmosCondicionales;

import java.util.Scanner;

public class Punto7 {

    public static void main(String[] args) {

        double n1, n2, res;
        Scanner a = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        n1 = a.nextDouble();

        System.out.println("Ingrese el segundo numero");
        n2 = a.nextDouble();

        res = n1 + n2;

        if (res < 0) {
            System.out.println( n1 + " + " + n2 + " es: " + res);
        }
    }
}
