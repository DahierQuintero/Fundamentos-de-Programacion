package fundamentosDeProgramacion.ejerciciosEstructurasCiclicas;

import java.util.Scanner;

public class Punto3 {

    public static void main(String[] args) {

        int n; // El número de términos a imprimir
        int primero = 0, segundo = 1;
        System.out.println("Ingrese el numero de terminos a imprimir");
        Scanner a = new Scanner(System.in);
            n = a.nextInt();

        System.out.print("Serie de Fibonacci de " + n + " términos: ");

        for (int i = 1; i <= n; ++i) {
            System.out.print(primero + " ");

            // Calcular el siguiente término de la secuencia
            int siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
        }
    }
}
