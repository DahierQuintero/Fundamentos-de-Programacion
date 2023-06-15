package fundamentosDeProgramacion.tallerEstructurasDeSelección;

import java.util.Scanner;

public class Punto4 {

    public static void main(String[] args) {

        int turno, dia;
        double horas, pago;
        Scanner a = new Scanner(System.in);

        System.out.println("Ingrese el turno:\n1)Diurno \n2)Nocturno  ");
        turno = a.nextInt();

        System.out.println("Ingrese el dia que laboro:\n" +
                "1)Lunes\n" +
                "2)Martes\n" +
                "3)Miercoles\n" +
                "4)Jueves\n" +
                "5)Viernes\n" +
                "6)Sabado\n" +
                "7)Domingo");
        dia = a.nextInt();

        System.out.println("Ingrese las horas laboradas");
        horas = a.nextInt();

        if (turno == 1) {
            if (dia == 7) {
                pago = (25000 + 25000 * 0.02) * horas;
                System.out.println("Su pago es: $" + pago);
            }
            else {
                pago = 25000 * horas;
                System.out.println("Su pago es: $" + pago);
            }
        }
        else {
            if (dia == 7) {
                pago = (32000 + 32000 * 0.1) * horas;
                System.out.println("Su pago es: $" + pago);
            } else {
                pago = 32000 * horas;
                System.out.println("Su pago es: $" + pago);
            }
        }
    }
}
