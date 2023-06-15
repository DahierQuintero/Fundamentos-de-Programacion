package fundamentosDeProgramacion.tallerEstructurasDeSelección;

import java.util.Scanner;

public class Punto9 {

    public static void main(String[] args) {

        int anho;
        Scanner a = new Scanner(System.in);

        System.out.println("Ingrese el anho que desea consultar");
        anho = a.nextInt();

        if (anho % 100 != 0) {
            if (anho % 4 == 0) {
                System.out.println(anho + " es bisiesto");
            }
            else {
                System.out.println(anho + " no es bisiesto");
            }
        }
        else if (anho % 400 == 0) {
            System.out.println(anho + " es bisiesto");
        }
        else {
            System.out.println(anho + " no es bisiesto");
        }
    }
}
