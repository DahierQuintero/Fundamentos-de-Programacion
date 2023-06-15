package fundamentosDeProgramacion.ejerciciosIntegradores;

import java.util.Scanner;

public class Punto3 {

    public static void CadenaCaracteres () {

        Scanner a = new Scanner(System.in);
        int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0;

        System.out.println("Ingrese 5 numeros mayores a 0");

            for (int i = 0; i < 1; i++) {
                System.out.println("Ingrese el primer numero");
                n1 = a.nextInt();

                if (n1 <= 0) {
                    System.out.println("El numero debe ser mayor a 0");
                    i--;
                }
            }
            for (int i = 0; i < 1; i++) {
                System.out.println("Ingrese el segundo numero");
                n2 = a.nextInt();

                if (n2 <= 0) {
                    System.out.println("El numero debe ser mayor a 0");
                    i--;
                }
            }
            for (int i = 0; i < 1; i++) {
                System.out.println("Ingrese el tercer numero");
                n3 = a.nextInt();

                if (n3 <= 0) {
                    System.out.println("El numero debe ser mayor a 0");
                    i--;
                }
            }
            for (int i = 0; i < 1; i++) {
                System.out.println("Ingrese el cuarto numero");
                n4 = a.nextInt();

                if (n4 <= 0) {
                    System.out.println("El numero debe ser mayor a 0");
                    i--;
                }
            }
            for (int i = 0; i < 1; i++) {
                System.out.println("Ingrese el quinto numero");
                n5 = a.nextInt();

                if (n5 <= 0) {
                    System.out.println("El numero debe ser mayor a 0");
                    i--;
                }
            }
            System.out.println("" + n1 + n2 + n3 + n4 + n5);
    }

    public static void main(String[] args) {

        CadenaCaracteres();
    }
}
