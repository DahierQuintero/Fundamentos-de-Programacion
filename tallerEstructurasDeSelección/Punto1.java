package fundamentosDeProgramacion.tallerEstructurasDeSelección;

import java.util.Scanner;

public class Punto1 {

    public static void main(String[] args) {

        int n1, n2;
        Scanner w = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        n1 = w.nextInt();

        System.out.println("Ingrese otro numero");
        n2 = w.nextInt();

        if (n1 > n2) {
            System.out.println("El numero mayor es: " + n1);
        }
        else if (n1 < n2) {
            System.out.println("El numero mayor es: " + n2);
        }
        else {
            System.out.println("Los 2 numeros son iguales");
        }
    }
}
