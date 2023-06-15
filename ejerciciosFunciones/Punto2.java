package fundamentosDeProgramacion.ejerciciosFunciones;

import java.util.Scanner;

public class Punto2 {

    public static String SignoZodiacal (int mes, int dia) {

        if (mes < 1 || mes > 12 || dia < 1 || dia > 31)
            return "No existe esa fecha";

        else if (mes == 3 & dia >= 21 || mes == 4 & dia <= 19)
            return "Su signo es Aries";

        else if (mes == 4 & dia >= 20 || mes == 5 & dia <= 20)
            return "Su signo es Tauro";

        else if (mes == 5 & dia >= 21 || mes == 6 & dia <= 20)
            return "Su signo es Geminis";

        else if (mes == 6 & dia >= 21 || mes == 7 & dia <= 22)
            return "Su signo es Cancer";

        else if (mes == 7 & dia >= 23 || mes == 8 & dia <= 22)
            return "Su signo es Leo";

        else if (mes == 8 & dia >= 23 || mes == 9 & dia <= 22)
            return "Su signo es Virgo";

        else if (mes == 9 & dia >= 23 || mes == 10 & dia <= 22)
            return "Su signo es Libra";

        else if (mes == 10 & dia >= 23 || mes == 11 & dia <= 21)
            return "Su signo es Escorpio";

        else if (mes == 11 & dia >= 22 || mes == 12 & dia <= 21)
            return "Su signo es Sagitario";

        else if (mes == 12 & dia >= 22 || mes == 1 & dia <= 20)
            return "Su signo es Capricornio";

        else if (mes == 1 & dia >= 21 || mes == 2 & dia <= 19)
            return "Su signo es Acuario";

        else return "Su signo es Piscis";
    }

    public static void main(String[] args) {

        int mes, dia;
        Scanner a = new Scanner(System.in);

        System.out.println("Ingrese el mes de nacimiento");
        mes = a.nextInt();

        System.out.println("Ingrese el dia de nacimiento");
        dia = a.nextInt();

        System.out.println(SignoZodiacal(mes,dia));
    }
}
