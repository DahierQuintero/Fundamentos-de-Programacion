package fundamentosDeProgramacion.estructuraRepeticion;

import java.util.Scanner;

public class Punto3 {

    public static void main(String[] args) {

        int num, fac;
        fac = 1;
        Scanner a = new Scanner(System.in);

        System.out.println("Ingrese un numero para mostrar el factorial");
        num = a.nextInt();

        if (num >= 0) {
            for (int i = 1; i <= num; i++) {
                fac = i * fac;
            }

            System.out.println("El factorial de " + num + " es: " + fac);
        }
        else {
            System.out.println("Factorial no definido para negativos");
        }
    }
}
