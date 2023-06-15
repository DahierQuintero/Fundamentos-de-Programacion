package fundamentosDeProgramacion.workshop1;

import java.util.Scanner;

public class Punto1 {

    public static void main(String[] args) {

        //Declaramos las variables necesarias
        int a, b, c;
        Scanner e = new Scanner(System.in);

        //Solicitamos los 3 numeros y los almacenamos en las variables
        System.out.println("Ingrese un numero");
        a = e.nextInt();

        System.out.println("Ingrese un numero");
        b = e.nextInt();

        System.out.println("Ingrese un numero");
        c = e.nextInt();

        //Con esta condicion descartamos que hayan numeros iguales, y si es asi imprimir que no hay numero en medio
        if (a == b || a == c || b == c)
            System.out.println("No hay numero intermedio porque hay numeros iguales");
        //Con esta condicion evaluamos si el numero del medio es el que se encuentra almacenado en la variable b
        else if (a > b & b > c || c > b & b > a)
            System.out.println("El numero del medio es: " + b);

        //Con esta condicion evaluamos si el numero del medio es el que se encuentra almacenado en la variable a
        else if (b > a & a > c || c > a & a > b)
            System.out.println("El numero del medio es: " + a);

        //Por descarte si no ingresa en ninguno de las condiciones anteriores el numero del medio es c
        else
            System.out.println("El numero del medio es: " + c);
    }
}
