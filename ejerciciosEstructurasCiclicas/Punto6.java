package fundamentosDeProgramacion.ejerciciosEstructurasCiclicas;

import java.util.Scanner;

public class Punto6 {

    public static void main(String[] args) {

        double nota, notaMen = 5.1, notaMay = -0.1, numNotaMay = 1, prom = 0;
        int estud = 0;
        boolean grupo = false;
        Scanner a = new Scanner(System.in);

        while (!grupo) {
            System.out.println("Ingrese el numero de estudiantes que conforman el grupo");
            estud = a.nextInt();

            if (estud <= 0) {
                System.out.println("El grupo debe tener por lo menos 1 integrante");
            }
            else {
                grupo = true;
            }
        }

        for (int i = 0; i < estud; i++) {
            System.out.println("Ingrese la nota");
            nota = a.nextDouble();

            prom = prom + nota;

            if (nota < notaMen) {
                notaMen = nota;
            }
            if (nota >= notaMay) {
                if (nota == notaMay) {
                    numNotaMay++;
                }
                else {
                    notaMay = nota;
                    numNotaMay = 1;
                }
            }
        }
        prom = prom / estud;
        System.out.println("La nota mayor es: " + notaMay);
        System.out.println("La nota menor es: " + notaMen);
        System.out.println("Los estudiantes con nota mayor es: " + numNotaMay);
        System.out.println("La nota promedio es: " + prom);
    }
}
