package fundamentosDeProgramacion.ejercicios1;

import java.util.Scanner;

public class ConvertidorGrKg {

    public static void main(String[] args) {

        double gra, kil;
        Scanner a = new Scanner(System.in);

        System.out.println("Ingrese los gramos que desea convertir:");
        gra = a.nextDouble();
        kil = gra / 1000;

        System.out.println( gra + " gr Equivalen a " + kil + " kg");
    }
}
