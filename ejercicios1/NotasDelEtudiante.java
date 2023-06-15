package fundamentosDeProgramacion.ejercicios1;

import java.util.Scanner;

public class NotasDelEtudiante {

    public static void main(String[] args) {

        double seg1, seg2, par, notaAcu, notaMin;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la nota Seguimiento 1: ");
        seg1 = entrada.nextDouble();

        System.out.println("Ingrese la nota Seguimiento 2: ");
        seg2 = entrada.nextDouble();

        System.out.println("Ingrese la nota Parcial: ");
        par = entrada.nextDouble();

        notaAcu = (seg1 + seg2 + par) * 0.7;
        notaAcu = notaAcu / 3;
        System.out.println("La nota acumulada actual que equivale al 70% es: " + notaAcu);

        notaMin = (3.0 - notaAcu) * 0.3;
        System.out.println("Y la nota minima que debe obtener en el examen final es: " + notaMin);

    }
}
