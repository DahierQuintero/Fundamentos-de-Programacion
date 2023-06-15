package fundamentosDeProgramacion.ejercicios1;

import java.util.Scanner;

public class Sumar {

    public static void main(String[] args) {

        int a, b, suma;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Suma de 2 numeros enteros");

        System.out.println("Ingrese el primer numero: ");
        a = entrada.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        b = entrada.nextInt();

        suma = a + b;

        System.out.println("el resultado de la suma es: " + suma);

    }
}
