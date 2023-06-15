package fundamentosDeProgramacion.ejercicios1;

import java.util.Scanner;

public class NotasDelEstudianteArray {

    public static void main(String[] args) {

        double[] notas = new double[3];
        double notaAcum, notaMin;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la primer nota:");
        notas[0] = entrada.nextDouble();

        System.out.println("Ingrese la segunda nota:");
        notas[1] = entrada.nextDouble();

        System.out.println("Ingrese la tercer nota:");
        notas[2] = entrada.nextDouble();

        notaAcum = ((notas[0] + notas[1] + notas[2]) / 3) * 0.7;
        System.out.println("La nota acumulada que equivale al 70% es: " + notaAcum);

        notaMin = (3.0 - notaAcum) * 0.3;
        System.out.println("La nota minima que debe obtener en el examen para ganar es: " + notaMin);
    }
}
