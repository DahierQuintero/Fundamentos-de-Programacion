package fundamentosDeProgramacion.ejercicios1;

import java.util.Scanner;

public class PromedioEstudianteArray {

    public static void main(String[] args) {

        double[] nota = new double[8];
        double pro = 0;
        int contador = 1;
        Scanner n = new Scanner(System.in);

        for (int i = 0; i < nota.length; i++) {

            System.out.println("Ingrese la nota " + contador);
            contador ++;
            nota[i] = n.nextDouble();

            pro += nota[i];
        }
        pro = pro/8;

        System.out.println("El promedio del estudiante es: " + pro);
    }
}
