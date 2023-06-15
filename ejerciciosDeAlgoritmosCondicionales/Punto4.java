package fundamentosDeProgramacion.ejerciciosDeAlgoritmosCondicionales;

import java.util.Scanner;

public class Punto4 {

    public static void main(String[] args) {

        double valor, desc, valorFinal;
        Scanner a = new Scanner(System.in);

        System.out.println("Ingrese el valor de la compra");
        valor = a.nextDouble();

        if (valor > 0 & valor < 100000) {
            desc = valor * 0.1;
            valorFinal = valor - desc;
            System.out.println("El valor Final es de: $" + valorFinal + ". Y el descuento es : $" + desc);
        }
        else if (valor >= 100000) {
            desc = valor * 0.5;
            valorFinal = valor - desc;
            System.out.println("El valor Final es de: $" + valorFinal + ". Y el descuento es : $" + desc);
        }
    }
}
