package fundamentosDeProgramacion.tallerEstructurasDeSelección;

import java.util.Scanner;

public class Punto6 {

    public static void main(String[] args) {

        int num;
        Scanner a = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        num = a.nextInt();

        if (num % 2 == 0) {
            System.out.println("El numero es par");
        }
        else {
            System.out.println("El numero es impar");
        }
    }
}
