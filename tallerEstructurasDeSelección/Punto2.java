package fundamentosDeProgramacion.tallerEstructurasDeSelección;

import java.util.Scanner;

public class Punto2 {

    public static void main(String[] args) {

        int n1, n2, n3;
        Scanner a = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        n1 = a.nextInt();

        System.out.println("Ingrese el segundo numero");
        n2 = a.nextInt();

        System.out.println("Ingrese el tercer numero");
        n3 = a.nextInt();

        if (n1 > n2 & n1 < n3) {
            System.out.println("El numero del medio es: " + n1);
        }
        else if (n1 > n3 & n1 < n2) {
            System.out.println("El numero del medio es: " + n1);
        }
        else if (n2 > n1 & n2 < n3) {
            System.out.println("El numero del medio es: " + n2);
        }
        else if (n2 > n3 & n2 < n1) {
            System.out.println("El numero del medio es: " + n2);
        }
        else if (n3 > n2 & n3 < n1) {
            System.out.println("El numero del medio es: " + n3);
        }
        else if (n3 > n1 & n3 < n2) {
            System.out.println("El numero del medio es: " + n3);
        }
        else {
            System.out.println("No hay un numero intermedio porque hay 2 iguales");
        }
    }
}
