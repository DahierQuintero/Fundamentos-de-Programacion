package fundamentosDeProgramacion.ejerciciosIntroduccionJava;

import java.util.Scanner;

public class Punto2 {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int n1, n2;

        System.out.println("Ingrese el primer numero");
        n1 = a.nextInt();

        System.out.println("Ingrese el segundo numero");
        n2 = a.nextInt();

        if (n1 < n2)
            System.out.println("El numero menor es " + n1);
        else if (n2 < n1)
            System.out.println("El numero menor es " + n2);
        else
            System.out.println("Ambos son iguales");
    }
}
