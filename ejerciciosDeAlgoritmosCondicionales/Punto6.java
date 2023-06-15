package fundamentosDeProgramacion.ejerciciosDeAlgoritmosCondicionales;

import java.util.Scanner;

public class Punto6 {

    public static void main(String[] args) {

        int dni, tipServ;
        double montoPagar;
        Scanner a = new Scanner(System.in);

        System.out.println("Ingrese su DNI");
        dni = a.nextInt();

        System.out.println("Ingrese un numero para su tipo de servicio:\n" +
                "1. Internet 30 megas (cuyo valor es de $750 - 10% de descuento)\n" +
                "2. Internet 50 megas (Cuyo valor es de $930 - 5% de descuento)\n" +
                "3. Internet 100 megas (Cuyo valor fijo es de $1200)");
        tipServ = a.nextInt();

        switch (tipServ) {

            case 1:
                montoPagar = 750 - (750 * 0.1);
                System.out.println("El monto a pagar de la persona con DNI: " + dni + " de: $" + montoPagar);
                break;
            case 2:
                montoPagar = 930 - (930 * 0.05);
                System.out.println("El monto a pagar de la persona con DNI: " + dni + " de: $" + montoPagar);
                break;
            case 3:
                montoPagar = 1200;
                System.out.println("El monto a pagar de la persona con DNI: " + dni + " de: $" + montoPagar);
                break;
        }

    }
}
