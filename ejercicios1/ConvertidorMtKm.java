package fundamentosDeProgramacion.ejercicios1;

import java.util.Scanner;

public class ConvertidorMtKm {

    public static void main(String[] args) {

        double mt, km;
        Scanner a = new Scanner(System.in);

        System.out.println("Ingrese los metros que desea convertir:");
        mt = a.nextDouble();
        km = mt / 1000;

        System.out.println( mt + " mt Equivalen a " + km + " km");
    }
}
