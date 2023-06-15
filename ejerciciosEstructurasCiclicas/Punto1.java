package fundamentosDeProgramacion.ejerciciosEstructurasCiclicas;

import java.util.Scanner;

public class Punto1 {

    public static void main(String[] args) {

        double num, prom;
        prom = 0;
        Scanner a = new Scanner(System.in);

        for (int i = 0; i < 15; i++) {
            System.out.println("Ingrese un numero");
            num = a.nextDouble();
            prom = prom + num;
            System.out.println("");
        }
        prom = prom / 15;
        System.out.println("El promedio de los 15 numeros es: " + prom);
    }
}
