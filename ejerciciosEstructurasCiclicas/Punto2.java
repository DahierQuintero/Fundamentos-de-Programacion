package fundamentosDeProgramacion.ejerciciosEstructurasCiclicas;

import java.util.Scanner;

public class Punto2 {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int n3, n5, n7, n9, res;
        n3 = 3;
        n5 = 5;
        n7 = 7;
        n9 = 9;

        System.out.println("Tabla del " + n3);
        for (int i = 1; i <= 15; i++) {
            res = n3 * i;
            System.out.println(n3 + " x " + i + " = " + res);
        }
        System.out.println("");

        System.out.println("Tabla del " + n5);
        for (int i = 1; i <= 15; i++) {
            res = n5 * i;
            System.out.println(n5 + " x " + i + " = " + res);
        }
        System.out.println("");

        System.out.println("Tabla del " + n7);
        for (int i = 1; i <= 15; i++) {
            res = n7 * i;
            System.out.println(n7 + " x " + i + " = " + res);
        }
        System.out.println("");

        System.out.println("Tabla del " + n9);
        for (int i = 1; i <= 15; i++) {
            res = n9 * i;
            System.out.println(n9 + " x " + i + " = " + res);
        }

    }
}
