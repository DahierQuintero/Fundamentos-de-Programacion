package fundamentosDeProgramacion.workshop1;

import java.util.Scanner;

public class Punto10 {

    public static void main(String[] args) {

        boolean e = false;
        int num;
        Scanner a = new Scanner(System.in);

        while (!e) {
            System.out.println("Ingrese un numero");
            num = a.nextInt();

            if (num % 2 == 0 & num % 5 != 0 & num > 100 & num < 10000)
                e = true;

        }

    }
}
