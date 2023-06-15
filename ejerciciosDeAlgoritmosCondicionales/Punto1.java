package fundamentosDeProgramacion.ejerciciosDeAlgoritmosCondicionales;

import java.util.Scanner;

public class Punto1 {

    public static void main(String[] args) {

        double a, b, res;
        int op;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese alguna de las siguientes opciones: \n" +
                "1) Suma \n2) Resta \n3) Multiplicacion \n4) Division");

        op = entrada.nextInt();

        switch (op) {

            case 1:
                System.out.println("Ingrese el primer valor");
                a = entrada.nextInt();

                System.out.println("Ingrese el segundo valor");
                b = entrada.nextInt();

                res = a + b;

                System.out.println("El resultado de la suma es: " + res);
                break;

            case 2:
                System.out.println("Ingrese el primer valor");
                a = entrada.nextInt();

                System.out.println("Ingrese el segundo valor");
                b = entrada.nextInt();

                res = a - b;

                System.out.println("El resultado de la resta es: " + res);
                break;

            case 3:
                System.out.println("Ingrese el primer valor");
                a = entrada.nextInt();

                System.out.println("Ingrese el segundo valor");
                b = entrada.nextInt();

                res = a * b;

                System.out.println("El resultado de la multiplicacion es: " + res);
                break;

            case 4:
                System.out.println("Ingrese el primer valor");
                a = entrada.nextInt();

                System.out.println("Ingrese el segundo valor");
                b = entrada.nextInt();

                res = a / b;

                System.out.println("El resultado de la division es: " + res);
                break;

            default:

                System.out.println("La opcion seleccionada no existe");
        }
    }
}
