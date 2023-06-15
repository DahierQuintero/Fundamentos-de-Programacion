package fundamentosDeProgramacion.ejerciciosFunciones;

import java.util.Scanner;

public class Punto4 {

    public static double PesosMexicanosDolaresEstadounidenses (double pesos) {
        return pesos * 0.056;
    }

    public static void main(String[] args) {

        double pesos;
        Scanner a = new Scanner(System.in);

        System.out.println("Ingrese los pesos mexicanos a convertir en dolares estadounidenses");
        pesos = a.nextDouble();

        System.out.println("$" + pesos + " pesos mexicanos equivalen a: $" + PesosMexicanosDolaresEstadounidenses(pesos));
    }
}
