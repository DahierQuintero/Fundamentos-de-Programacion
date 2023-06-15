package fundamentosDeProgramacion.workshop2;

import java.util.Scanner;

public class Punto2 {

    // Creamos la funcion que recibe los 2 numeros positivos enteros
    public static int residuo (int n1, int n2) {

        /* Realizamos esta operacion, para saber cual es el residuo
           con n1 / n2 nos damos cuenta cuantas veces esta n2 en n1, ese resultado se multiplica por n2
           finalmente se lo restamos a n1 y nos damos cuenta cual es el residuo
        */
        return n1 - (n1/n2) * n2;
    }

    public static void main(String[] args) {

        // Creamos las variables que necesitaremos
        Scanner e = new Scanner(System.in);
        int a, b;

        // Solicitamos que ingrese el primer numero
        System.out.println("Ingrese el valor de a");
        a = e.nextInt();

        // Solicitamos que ingrese el segundo numero
        System.out.println("Ingrese el valor de b");
        b = e.nextInt();

        // Imprimimos el residuo de a / b y llamamos la funcion con los parametros a y b
        System.out.println("El residuo de " + a + " % " + b + " es: " + residuo(a,b));
    }
}
