package fundamentosDeProgramacion.tallerEstructurasDeSelección;

import java.util.Scanner;

public class Punto5 {

    public static void main(String[] args) {

        int num;
        Scanner a = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        num = a.nextInt();

        if (num > 0) {
            System.out.println("El numero es positivo");
        }
        else if (num < 0) {
            System.out.println("El numero es negativo");
        }
        else {
            System.out.println("El numero es cero");
        }
    }
}
