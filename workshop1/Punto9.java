package fundamentosDeProgramacion.workshop1;

import java.util.Scanner;

public class Punto9 {

    public static void main(String[] args) {

        int n, fac;
        Scanner a = new Scanner(System.in);

        System.out.println("Ingrese un numero para ver su factorial");
        n = a.nextInt();

        fac = n;

         for (int i = n; i != 1; i--)
             fac = fac  * (i-1);
        System.out.println("El factorial de " + n + " es " + fac);
    }
}
