package fundamentosDeProgramacion.arreglosUnidimensionales;

import java.util.Scanner;

public class Punto5 {

    public static void CalcularElementos () {

        Scanner a = new Scanner(System.in);
        int cant, neg = 0, pos = 0, cero = 0;
        System.out.println("Ingrese la cantidad de elementos a almacenar");
        cant = a.nextInt();
        double[] elements = new double[cant];

        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese el valor " + (i+1));
            elements[i] = a.nextDouble();
            if (elements[i] < 0)
                neg++;
            else if (elements[i] > 0)
                pos++;
            else
                cero++;
        }
        System.out.println("En los elementos ingresados hay " + neg + " numeros negativos");
        System.out.println("En los elementos ingresados hay " + cero + " numeros cero");
        System.out.println("En los elementos ingresados hay " + pos + " numeros positivos");
    }

    public static void main(String[] args) {

        CalcularElementos();
    }
}
