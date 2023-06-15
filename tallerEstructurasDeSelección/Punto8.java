package fundamentosDeProgramacion.tallerEstructurasDeSelección;

import java.util.Scanner;

public class Punto8 {

    public static void main(String[] args) {

        int num;
        Scanner e = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        num = e.nextInt();

        if (num < 0) {
            System.out.println("El numero es negativo");
        }
        else if (num <= 10) {
            System.out.println("El numero esta entre 0 y 10");
        }
        else if (num <= 20) {
            System.out.println("El numero esta entre 11 y 20");
        }
        else if (num <= 30) {
            System.out.println("El numero esta entre 21 y 30");
        }
        else if (num <= 50) {
            System.out.println("El numero esta entre 31 y 50");
        }
        else {
            System.out.println("El numero es mayor a 50");
        }
    }
}
