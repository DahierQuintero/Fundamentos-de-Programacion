package fundamentosDeProgramacion.estructuraRepeticion;

import java.util.Scanner;

public class Punto1 {

    public static void main(String[] args) {

        //Escriba un algoritmo que lea un entero n y muestre las tablas de multiplicar desde el uno hasta n.
        int num, res;
        Scanner a = new Scanner(System.in);

        System.out.println("Ingrese un numero entero para conocer sus multiplos");
        num = a.nextInt();

        for (int i = num; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                res = num * j;
                System.out.println(num + " x " + j + " = " + res);
            }
        }

    }
}
