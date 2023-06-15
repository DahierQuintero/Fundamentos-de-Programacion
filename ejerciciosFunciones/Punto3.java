package fundamentosDeProgramacion.ejerciciosFunciones;

import java.util.Scanner;

public class Punto3 {

    public static double Promedio (double n1, double n2, double n3, double n4, double n5) {
        return (n1 + n2 + n3 + n4 + n5)/5;
    }

    public static void main(String[] args) {

        double n1, n2, n3, n4, n5;
        Scanner a = new Scanner(System.in);

        System.out.println("Ingrese la nota del estudiante 1");
        n1 = a.nextDouble();

        System.out.println("Ingrese la nota del estudiante 2");
        n2 = a.nextDouble();

        System.out.println("Ingrese la nota del estudiante 3");
        n3 = a.nextDouble();

        System.out.println("Ingrese la nota del estudiante 4");
        n4 = a.nextDouble();

        System.out.println("Ingrese la nota del estudiante 5");
        n5 = a.nextDouble();

        System.out.println("La nota promedio es: " + Promedio(n1,n2,n3,n4,n5));
    }
}
