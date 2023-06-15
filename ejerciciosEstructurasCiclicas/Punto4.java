package fundamentosDeProgramacion.ejerciciosEstructurasCiclicas;

import java.util.Scanner;

public class Punto4 {

    public static void main(String[] args) {

        int numIngr;
        double num, numMay;
        numMay = 0;
        Scanner a = new Scanner(System.in);

        System.out.println("Ingrese el limite de numeros");
        numIngr = a.nextInt();

        if (numIngr > 0) {
            for (int i = 0; i < numIngr; i++) {
                System.out.println("Ingrese un numero");
                num = a.nextDouble();

                if (num > numMay) {
                    numMay = num;
                }
            }
            System.out.println("el numero mayor es " + numMay);
        }
    }
}
