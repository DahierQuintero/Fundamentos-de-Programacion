package fundamentosDeProgramacion.workshop1;

import java.util.Scanner;

public class Punto8 {

    public static void main(String[] args) {

        int op;
        double num1, num2, res;
        Scanner a = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        num1 = a.nextDouble();

        System.out.println("Ingrese el segundo numero");
        num2 = a.nextDouble();

        System.out.println("Que operacion desea hacer con los numeros?");
        System.out.println("1) Para suma\n" +
                           "2) Para resta\n" +
                           "3) Para multiplicacion\n" +
                           "4) Para division\n" +
                           "5) Para potenciar el primer numero por el segundo\n" +
                           "6) Para saber el numero mayor\n" +
                           "7) Para saber el numero menor\n" +
                           "8) Para saber si son iguales");
        op = a.nextInt();
        switch (op) {

            case 1:
                res = num1 + num2;
                System.out.println(res);
                break;

            case 2:
                res = num1 - num2;
                System.out.println(res);
                break;

            case 3:
                res = num1 * num2;
                System.out.println(res);
                break;

            case 4:
                res = num1 / num2;
                System.out.println(res);
                break;

            case 5:
                res = Math.pow(num1,num2);
                System.out.println(res);
                break;

            case 6:
                if (num1 == num2)
                    System.out.println("No hay numero mayor");
                else if (num1 > num2)
                    System.out.println(num1);
                else
                    System.out.println(num2);
                break;

            case 7:
                if (num1 == num2)
                    System.out.println("No hay numero menor");
                else if (num1 < num2)
                    System.out.println(num1);
                else
                    System.out.println(num2);
                break;

            case 8:
                System.out.println(num1 == num2);
        }
    }
}
