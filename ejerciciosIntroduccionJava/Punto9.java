package fundamentosDeProgramacion.ejerciciosIntroduccionJava;

import java.util.Scanner;

public class Punto9 {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int silla;
        double valorTotal;

        System.out.println("Cuantas sillas desea llevar?");
        silla = a.nextInt();

        if (silla <= 5)
            valorTotal = silla * 40000;
        else if (silla <= 12)
            valorTotal = (silla * 40000) * 0.9;
        else if (silla <= 40)
            valorTotal = (silla * 40000) * 0.8;
        else
            valorTotal = (silla * 40000) * 0.7;

        System.out.println("El total a pagar es: " + valorTotal);
    }
}
