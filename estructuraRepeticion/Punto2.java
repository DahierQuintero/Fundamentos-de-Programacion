package fundamentosDeProgramacion.estructuraRepeticion;

import java.util.Scanner;

public class Punto2 {

    public static void main(String[] args) {

        int num;
        int j = 2;
        boolean primo = true;
        Scanner a = new Scanner(System.in);

        System.out.println("Ingrese un numero para determinar si es primo o no");
        num = a.nextInt();

        while (primo & j < num) {

            if (num % j == 0) {
                primo = false;
            }
            else {
                j = j + 1;
            }
        }
        if (primo & num > 1) {
            System.out.println("El numero es primo");
        }
        else {
            System.out.println("El numero no es primo");
        }
    }
}
