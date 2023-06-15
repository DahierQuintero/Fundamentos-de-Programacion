package fundamentosDeProgramacion.ejerciciosIntegradores;

import java.util.Scanner;

public class Punto7 {

    public static void NumerosPrimos (int num) {

        if (num <= 1)
            System.out.println("No hay numeros primos entre 1 y " + num);

        else {
            for (int i = 1; i <= num; i++) {
                int contador = 0;
                for (int j = 1; j <= i; j++) {

                    if (i % j == 0) {
                        contador++;
                    }
                }
                if (contador == 2)
                    System.out.print(i + ", ");
            }
        }
    }

    public static void main(String[] args) {

        int num;
        Scanner a = new Scanner(System.in);

        System.out.println("Ingrese un numero limite hasta donde ver los numeros primos");
        num = a.nextInt();

        NumerosPrimos(num);
    }
}
