package fundamentosDeProgramacion.estructuraRepeticion;

import java.util.Scanner;

public class Punto4 {

    public static void main(String[] args) {

        double nota, notaAlt, notaBaj;
        int estud, estudGan;
        estudGan = 0;
        notaAlt = 0;
        notaBaj = 5;
        Scanner a = new Scanner(System.in);

        System.out.println("Ingrese el numero total de estudiantes");
        estud = a.nextInt();

        for (int i = 0; i < estud; i++) {
            System.out.println("Ingrese la nota");
            nota = a.nextDouble();
            System.out.println("El estudiante " + (i+1) + " obtuvo: " + nota);
            System.out.println("");
            
            if (nota >= 3.0) {
                estudGan += 1;
            }
            if (nota > notaAlt) {
                notaAlt = nota;
            }
            if (nota < notaBaj) {
                notaBaj = nota;
            }
        }
        System.out.println("La cantidad de estudiantes que ganaron fueron: " + estudGan);
        System.out.println("La nota mas alta fue: " + notaAlt);
        System.out.println("La nota mas baja fue: " + notaBaj);
    }
}
