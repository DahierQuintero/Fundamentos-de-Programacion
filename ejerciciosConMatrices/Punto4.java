package fundamentosDeProgramacion.ejerciciosConMatrices;

public class Punto4 {

    public static void main(String[] args) {

        int [][] tablas = new int[10][10];

        for (int i = 0; i < 10; i++) {
            tablas[0][i] = i;
        }
        for (int j = 0; j < 10; j++) {
            tablas[j][0] = j;
        }

        for (int i = 1; i < 10; i++) {

            for (int j = 1; j < 10; j++)
                tablas[i][j] = i * j;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println();

            for (int j = 0; j < 10; j++)
                System.out.print("[" + tablas[i][j] + "]");
        }
    }
}
