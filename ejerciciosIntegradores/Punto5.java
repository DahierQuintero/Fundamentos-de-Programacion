package fundamentosDeProgramacion.ejerciciosIntegradores;

import java.util.Scanner;

public class Punto5 {

    public static String HorasMinutosSegundos (int segundos) {
        int minutos, horas, seg;
        seg = segundos % 60;
        minutos = segundos / 60;
        horas = minutos / 60;
        minutos = minutos % 60;

        return horas + " Horas " + minutos + " Minutos " + seg + " Segundos";
    }

    public static void main(String[] args) {

        int segundo;
        Scanner a = new Scanner(System.in);

        System.out.println("Ingrese los segundos");
        segundo = a.nextInt();

        System.out.println(segundo + " segundos son: " + HorasMinutosSegundos(segundo));
    }
}
