package fundamentosDeProgramacion.tallerEstructurasDeSelección;

import java.util.Scanner;

public class Punto3 {

    public static void main(String[] args) {

        int n1, n2, n3;
        Scanner a = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        n1 = a.nextInt();

        System.out.println("Ingrese el segundo numero");
        n2 = a.nextInt();

        System.out.println("Ingrese el tercer numero");
        n3 = a.nextInt();

        if (n1 > n2 & n1 > n3) {
            System.out.println("el numero mayor es: " + n1);
        }
        else if (n2 > n1 & n2 > n3) {
            System.out.println("el numero mayor es: " + n2);
        }
        else if (n3 > n1 & n3 > n2) {
            System.out.println("el numero mayor es: " + n3);
        }
        else {
            System.out.println("No hay un numero mayor porque hay 2 iguales");
        }
    }
}
