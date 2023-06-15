package fundamentosDeProgramacion.ejerciciosIntegradores;

import java.util.Scanner;

public class Punto8 {

    public static int TarifaGym (char periodo, int horas) {

        if (periodo == 'M' || periodo == 'm') {

            if (horas == 1)
                return 20;

            else if (horas == 2)
                return 30;

            else if (horas == 3)
                return 40;

            else
                System.out.println("Error en la hora, vuelve a intentarlo");
        }
        else if (periodo == 'T' || periodo == 't') {

            if (horas == 1)
                return 30;

            else if (horas == 2)
                return 40;

            else if (horas == 3)
                return 50;

            else
                System.out.println("Error en la hora, vuelve a intentarlo");
        }
        else
            System.out.println("Error en el periodo, vuelve a intentarlo");
            return 0;
    }

    public static void main(String[] args) {

        char p;
        int h;
        Scanner a = new Scanner(System.in);

        System.out.println("Ingrese el periodo de preferencia\n" +
                "M = Manhana\n" +
                "T = Tarde");
        p = a.next().charAt(0);

        System.out.println("Ingrese las horas diarias de prefenrencia. Que no sea mayor a 3");
        h = a.nextInt();

        System.out.println("La tarifa de su plan es: " + TarifaGym(p,h) + "€");
    }
}
