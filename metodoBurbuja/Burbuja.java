package fundamentosDeProgramacion.metodoBurbuja;

import java.util.Scanner;

public class Burbuja {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int tam, aux, op;

        System.out.println("Ingrese cuantos numeros desea ordenar");
        tam = a.nextInt();

        int[] numeros = new int[tam];

        for (int i = 0; i < tam; i++) {
            System.out.println("Ingrese el valor " + (i+1));
            numeros[i] = a.nextInt();
        }

        System.out.println("Ingrese como desea ordenar los numeros\n" +
                "1) Menor a mayor\n" +
                "2) Mayor a menos");
        op = a.nextInt();

        for (int i = 0; i < tam; i++) {

            for (int j = 0; j < tam - 1; j++) {

                if (op == 1) {
                    if (numeros[j] > numeros[j+1]) {

                        aux = numeros[j+1];
                        numeros[j+1] = numeros[j];
                        numeros[j] = aux;
                    }
                }
                else if (op == 2) {
                    if (numeros[j] < numeros[j+1]) {

                        aux = numeros[j+1];
                        numeros[j+1] = numeros[j];
                        numeros[j] = aux;
                    }
                }
            }
        }

        for (int i = 0; i < tam; i++)
            System.out.print("[" + numeros[i] + "]");
    }
}