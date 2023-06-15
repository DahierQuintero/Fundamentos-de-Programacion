package fundamentosDeProgramacion.estructuraRepeticion;

import java.util.Scanner;

public class Punto6 {

    public static void main(String[] args) {

        double nota;
        int estud, estudProm;
        estudProm = 0;
        Scanner a = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de estudiantes para leer las notas");
        estud = a.nextInt();

        for (int i = 0; i < estud; i++) {
            System.out.println("");
            System.out.println("Ingrese la nota" );
            nota = a.nextDouble();

            System.out.println("El estudiante " + (i+1) + " obtuvo: " + nota);

            if (nota >= 3.5 & nota <= 4.5) {
                estudProm++;
            }
        }
        System.out.println("");
        System.out.println("La cantidad de estudiantes con nota entre 3.5 y 4.5 fueron: " + estudProm);
    }
}
