package fundamentosDeProgramacion.ejerciciosDeAlgoritmosCondicionales;

import java.util.Scanner;

public class Punto2 {

    public static void main(String[] args) {

        double sueldo, anhosAnti, sueldoTotal;
        Scanner a = new Scanner(System.in);

        System.out.println("Ingrese su sueldo");
        sueldo = a.nextDouble();

        System.out.println("Ingrese los anhos de antiguedad");
        anhosAnti = a.nextDouble();

        if (sueldo < 500 & anhosAnti >= 10) {
            sueldoTotal = sueldo + (sueldo * 0.20);
            System.out.println("El sueldo total es: $" + sueldoTotal);
        }
        else if (sueldo < 500 & anhosAnti < 10) {
            sueldoTotal = sueldo + (sueldo * 0.05);
            System.out.println("El sueldo total es: $" + sueldoTotal);
        }
        else {
            System.out.println("El sueldo total es: $" + sueldo);
        }
    }
}
