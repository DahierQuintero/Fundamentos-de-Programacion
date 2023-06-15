package fundamentosDeProgramacion.ejercicios1;

import java.util.Scanner;

public class AreaTriangulo {

    public static void main(String[] args) {
        //(b*h)/2
        double b, h, a;
        Scanner e = new Scanner(System.in);

        System.out.println("Ingrese la base del triangulo en metros");
        b = e.nextDouble();

        System.out.println("Ingrese la altura del triangulo en metros");
        h = e.nextDouble();

        a = (b * h) / 2;

        System.out.println("El area del triangulo es: " + a + " metros");
    }
}
