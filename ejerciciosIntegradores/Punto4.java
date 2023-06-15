package fundamentosDeProgramacion.ejerciciosIntegradores;

import java.util.Scanner;

public class Punto4 {

    public static int SaberEdad (int diaNac, int mesNac, int anhoNac, int diaAct, int mesAct, int anhoAct) {

        if (diaNac < 1 || diaNac > 31 || diaAct < 1 || diaAct > 31 || mesNac < 1 || mesNac > 12 || mesAct < 1 || mesAct > 12 ) {
            System.out.println("Hay un error en la fecha");
            return 0;
        }
        else {
            if (mesAct > mesNac || (mesAct == mesNac & diaAct >= diaNac))
                return anhoAct - anhoNac;
            else
                return anhoAct - anhoNac - 1;
        }
    }

    public static void main(String[] args) {

        int diaNac, mesNac, anhoNac, diaAct, mesAct, anhoAct;
        Scanner a = new Scanner(System.in);

        System.out.println("Ingrese la fecha de nacimiento");
        System.out.print("Dia: ");
        diaNac = a.nextInt();
        System.out.print("Mes: ");
        mesNac = a.nextInt();
        System.out.print("Anho: ");
        anhoNac = a.nextInt();

        System.out.println("Ingrese la fecha actual");
        System.out.print("Dia: ");
        diaAct = a.nextInt();
        System.out.print("Mes: ");
        mesAct = a.nextInt();
        System.out.print("Anho: ");
        anhoAct = a.nextInt();

        System.out.println("Usted tiene " + SaberEdad(diaNac,mesNac,anhoNac,diaAct,mesAct,anhoAct) + " anhos");
    }
}
