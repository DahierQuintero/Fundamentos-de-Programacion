package fundamentosDeProgramacion.arreglosUnidimensionales;

import java.util.Scanner;

public class Punto2 {

    public static int CuantasVeces (int espacios, int k) {

        Scanner a = new Scanner(System.in);
        int[] arreglo = new int[espacios];
        int veces = 0;

        for (int i = 0; i < espacios; i++) {
            System.out.println("Ingrese el valor " + (i+1));
            arreglo[i] = a.nextInt();
        }
        for (int j = 0; j < espacios; j++) {
            if (arreglo[j] == k)
                veces++;
        }
        return veces;
    }

    public static void main(String[] args) {

        int espa, num;
        Scanner a = new Scanner(System.in);

        System.out.println("Ingrese cuantos numeros desea almacenar");
        espa = a.nextInt();

        System.out.println("Ingrese el numero que desea saber cuantas veces se encuentra en el almacenamiento");
        num = a.nextInt();

        System.out.println("El numero: " + num + " esta " + CuantasVeces(espa, num) + " veces en el almacenamiento");
    }
}
