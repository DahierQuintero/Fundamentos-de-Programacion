package fundamentosDeProgramacion.estructuraRepeticion;

import java.util.Scanner;

public class Punto7 {

    public static void main(String[] args) {

        boolean cumple = false;
        int num;
        Scanner a = new Scanner(System.in);

        while (!cumple) {
            System.out.println("Ingrese un numero");
            num = a.nextInt();

            if (num % 2 == 0 & num % 5 != 0 & num > 100 & num < 10000) {
                cumple = true;
            }
        }
    }
}
