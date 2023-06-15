package fundamentosDeProgramacion.ejercicios1;

import java.util.Scanner;

public class PromedioEstudiante {

    public static void main(String[] args) {

        double n1, n2, n3, n4, n5, n6, n7, n8, pro;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la nota 1: ");
        n1 = entrada.nextDouble();

        System.out.println("Ingrese la nota 2: ");
        n2 = entrada.nextDouble();

        System.out.println("Ingrese la nota 3: ");
        n3 = entrada.nextDouble();

        System.out.println("Ingrese la nota 4: ");
        n4 = entrada.nextDouble();

        System.out.println("Ingrese la nota 5: ");
        n5 = entrada.nextDouble();

        System.out.println("Ingrese la nota 6: ");
        n6 = entrada.nextDouble();

        System.out.println("Ingrese la nota 7: ");
        n7 = entrada.nextDouble();

        System.out.println("Ingrese la nota 8: ");
        n8 = entrada.nextDouble();

        pro = (n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8) / 8;

        System.out.println("El promedio del estudiante es: " + pro);
    }
}
