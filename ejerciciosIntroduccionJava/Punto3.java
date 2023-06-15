package fundamentosDeProgramacion.ejerciciosIntroduccionJava;

import java.util.Scanner;

public class Punto3 {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int n;

        System.out.println("Ingrese un numero");
        n = a.nextInt();

        if (n % 2 == 0)
            System.out.println("El numero " + n + " es par");
        else
            System.out.println("El numero " + n + " es impar");
    }
}
