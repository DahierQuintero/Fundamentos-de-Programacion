package fundamentosDeProgramacion.arreglosUnidimensionales;

public class Punto1 {

    public static void DeterminarValores () {

        int i, j;
        int[] v = new int[10];

        for (i = 0; i < 10; i++)
            v[i] = i + 1;

        i = 1;
        j = 2;
        v[i] = j;
        v[j + i] = i + j;
        i = v[i] + v[j];
        v[3] = 5;
        j = v[i] - v[j];

        for (int k = 0; k < 10; k++)
            System.out.println(v[k]);
    }

    public static void main(String[] args) {

        DeterminarValores();
    }
}
