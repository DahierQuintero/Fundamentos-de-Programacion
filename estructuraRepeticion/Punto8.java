package fundamentosDeProgramacion.estructuraRepeticion;

import java.util.Scanner;

public class Punto8 {

    public static void main(String[] args) {

    int num, contador = 0;
    Scanner a = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        num = a.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("");

            for (int j = contador; j < num; j++) {
                System.out.print(" * ");
            }
        }

    }
}
