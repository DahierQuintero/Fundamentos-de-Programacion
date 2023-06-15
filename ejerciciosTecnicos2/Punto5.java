package fundamentosDeProgramacion.ejerciciosTecnicos2;

import java.util.Scanner;

public class Punto5 {

    public static void main(String[] args) {

        int resCor, resIncor, resBla, cor, incor, bla, punFinal;
        cor = 4;
        incor = -1;

        Scanner a = new Scanner(System.in);

        System.out.println("Ingrese las respuestas correctas");
        resCor = a.nextInt();

        System.out.println("Ingrese las respuestas incorrectas");
        resIncor = a.nextInt();

        System.out.println("Ingrese las respuestas en blanco");
        resBla = a.nextInt();

        punFinal = (resCor * cor) + (resIncor * incor);

        System.out.println("El puntaje final es: " + punFinal);
    }
}
