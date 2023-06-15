package fundamentosDeProgramacion.workshop1;

import java.util.Scanner;

public class Punto2 {

    public static void main(String[] args) {

        //Declaramos la variables necesarias
        double n1, n2, res;
        Scanner a = new Scanner(System.in);

        //Solicitamos los 2 numeros
        System.out.println("Ingrese un numero");
        n1 = a.nextDouble();

        System.out.println("Ingrese otro numero");
        n2 = a.nextDouble();

        //Realizamos la suma y la imprimimos en pantalla
        res = n1 + n2;
        System.out.println( n1 + " + " + n2 + " = " + res);

        //Realizamos la resta y la imprimimos en pantalla
        res = n1 - n2;
        System.out.println( n1 + " - " + n2 + " = " + res);

        //Realizamos la multiplicacion y la imprimimos en pantalla
        res = n1 * n2;
        System.out.println( n1 + " x " + n2 + " = " + res);

        //Si el numero 2 es mayor a 0 se puede realizar la division, sino se muestra un mensaje de que no se puede
        if (n2 > 0) {
            //Realizamos la division y la imprimimos en pantalla
            res = n1 / n2;
            System.out.println(n1 + " ÷ " + n2 + " = " + res);
        }
        else
            System.out.println("No se puede dividir sobre 0");
    }
}
