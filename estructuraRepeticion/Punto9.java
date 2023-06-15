package fundamentosDeProgramacion.estructuraRepeticion;

import java.util.Scanner;

public class Punto9 {

    public static void main(String[] args) {

        int n, nMenos, contador = 0;
        Scanner a = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        n = a.nextInt();
        nMenos = n;

        for (int i = 0; i < n; i++) {
            System.out.println("");

            for (int j = contador; j < nMenos; j++) {
                System.out.print(" * ");
            }
            nMenos --;
        }
    }
}
