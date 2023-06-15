package fundamentosDeProgramacion.ejerciciosIntegradores;

import java.util.Scanner;

public class Punto6 {

    public static String DiaDelMes (int dia) {
        if (dia < 1 || dia > 31)
            return "El dia no existe";

        else if (dia == 1 || dia == 8 || dia == 15 || dia == 22 || dia == 29)
            return "El dia es Lunes";

        else if (dia == 2 || dia == 9 || dia == 16 || dia == 23 || dia == 30)
            return "El dia es Martes";

        else if (dia == 3 || dia == 10 || dia == 17 || dia == 24 || dia == 31)
            return "El dia es Miercoles";

        else if (dia == 4 || dia == 11 || dia == 18 || dia == 25)
            return "El dia es Jueves";

        else if (dia == 5 || dia == 12 || dia == 19 || dia == 26)
            return "El dia es Viernes";

        else if (dia == 6 || dia == 13 || dia == 20 || dia == 27)
            return "El dia es Sabado";

        else
            return "El dia es Domingo";
    }

    public static void main(String[] args) {

        int dia;
        Scanner a = new Scanner(System.in);

        System.out.println("Ingrese el numero de un dia del mes");
        dia = a.nextInt();

        System.out.println(DiaDelMes(dia));
    }
}
