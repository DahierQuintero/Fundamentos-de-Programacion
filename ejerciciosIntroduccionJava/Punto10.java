package fundamentosDeProgramacion.ejerciciosIntroduccionJava;

import java.util.Scanner;

public class Punto10 {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int edad;
        double sueldo;

        System.out.println("Ingrese su edad");
        edad = a.nextInt();

        System.out.println("Ingrese su sueldo");
        sueldo = a.nextDouble();

        if (edad > 16 && sueldo >= 5000000)
            System.out.println("Debe tributar");
        else
            System.out.println("No debe tributar");
    }
}
