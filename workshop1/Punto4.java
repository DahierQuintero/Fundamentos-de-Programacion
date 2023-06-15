package fundamentosDeProgramacion.workshop1;

import java.util.Scanner;

public class Punto4 {

    public static void main(String[] args) {

        //Declaramos la variable necesaria
        int num;
        Scanner a = new Scanner(System.in);

        //Solicitamos el numero al usuario
        System.out.println("Ingrese un numero");
        num = a.nextInt();

        //Analizamos si el numero es menor a 0
        if (num < 0)
            System.out.println( num + " es negativo");

        //Analizamos si el numero esta entre 0 y 10
        else if (num <= 10)
            System.out.println( num + " esta entre 0 y 10");

        //Analizamos si el numero esta entre 11 y 20
        else if (num <= 20)
            System.out.println( num + " esta entre 11 y 20");

        //Analizamos si el numero esta entre 21 y 30
        else if (num <= 30)
            System.out.println( num + " esta entre 21 y 30");

        //Analizamos si el numero esta entre 31 y 50
        else if (num <= 50)
            System.out.println( num + " esta entre 31 y 50");

        //Si no cumple ninguna de las condiciones anteriores por descarte es mayor a 50
        else
            System.out.println(num + " es mayor que 50");
    }
}
