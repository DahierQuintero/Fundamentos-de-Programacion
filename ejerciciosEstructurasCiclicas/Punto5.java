package fundamentosDeProgramacion.ejerciciosEstructurasCiclicas;

import java.util.Scanner;

public class Punto5 {

    public static void main(String[] args) {

        int jugadores, edad, edadProm = 0, edadMin = 100, edadMax = 0;
        Scanner a = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de jugadores");
        jugadores = a.nextInt();

        for (int i = 0; i < jugadores; i++) {
            System.out.println("Ingrese la edad");
            edad = a.nextInt();

            edadProm = edadProm + edad;

            if (edad < edadMin) {
                edadMin = edad;
            }
            if (edad > edadMax) {
                edadMax = edad;
            }
        }
        edadProm = edadProm / jugadores;
        System.out.println("");
        System.out.println("La edad promedio de los jugadores del equipo es: " + edadProm);
        System.out.println("La edad minima en el equipo es: " + edadMin);
        System.out.println("La edad maxima en el equipo es: " + edadMax);
    }
}
