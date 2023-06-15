package fundamentosDeProgramacion.tallerEstructurasDeSelección;

import java.util.Scanner;

public class Punto10 {

    public static void main(String[] args) {

        double num1, num2, res;
        int op;
        Scanner a = new Scanner(System.in);

        System.out.println("ingrese el primer numero");
        num1 = a.nextDouble();

        System.out.println("ingrese el segundo numero");
        num2 = a.nextDouble();

        System.out.println("Ingrese alguna de las siguientes opciones: \n" +
                "1) Suma \n2) Resta \n3) Multiplicacion \n4) Division");
        op = a.nextInt();

        switch (op) {
            case 1:
                res = num1 + num2;
                System.out.println("El resultado de: " + num1 + " + " + num2 + " es: " + res);
                break;

            case 2:
                res = num1 - num2;
                System.out.println("El resultado de: " + num1 + " - " + num2 + " es: " + res);
                break;
            case 3:
                res = num1 * num2;
                System.out.println("El resultado de: " + num1 + " * " + num2 + " es: " + res);
                break;
            case 4:
                res = num1 / num2;
                System.out.println("El resultado de: " + num1 + " ÷ " + num2 + " es: " + res);
                break;
        }

    }
}
