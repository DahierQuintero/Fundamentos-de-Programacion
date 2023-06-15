package fundamentosDeProgramacion.ejerciciosIntroduccionJava;

import java.util.Scanner;

public class Punto8 {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        String calificacion;
        char cal;

        System.out.println("Ingrese su calificacion");
        calificacion = a.next().toUpperCase();
        cal = calificacion.charAt(0);

        switch (cal) {

            case 'A':
                System.out.println("La evaluacion de " + cal + " es 0");
                break;
            case 'B':
                System.out.println("La evaluacion de " + cal + " es 1");
                break;
            case 'C':
                System.out.println("La evaluacion de " + cal + " es 2");
                break;
            case 'D':
                System.out.println("La evaluacion de " + cal + " es 3");
                break;
            case 'E':
                System.out.println("La evaluacion de " + cal + " es 4");
                break;
            case 'F':
                System.out.println("La evaluacion de " + cal + " es 5");
                break;
            default:
                System.out.println("No sea mentiroso, eso no existe hijo");
        }
    }
}
