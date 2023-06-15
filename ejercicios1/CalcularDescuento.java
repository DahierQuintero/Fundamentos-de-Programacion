package fundamentosDeProgramacion.ejercicios1;

import java.util.Scanner;

public class CalcularDescuento {

    public static void main(String[] args) {

        double val, valDes, preFin;
        Scanner e = new Scanner(System.in);

        System.out.println("Ingrese el valor:");
        val = e.nextDouble();

        System.out.println("Ingrese el porcentaje a descontar :");
        valDes = e.nextDouble() / 100;

        preFin = val * valDes;

        System.out.println("El precio final con descuento es: " + preFin);

        System.out.println("El precio sin descuento es: " + val);
    }
}
