package fundamentosDeProgramacion.workshop1;

import java.util.Scanner;

public class Punto7 {

    public static void main(String[] args) {

        int num;
        Scanner a = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        num = a.nextInt();

        if (num % 2 == 0)
            System.out.println(num + " es par");
        else
            System.out.println(num + " no es par");
    }
}
