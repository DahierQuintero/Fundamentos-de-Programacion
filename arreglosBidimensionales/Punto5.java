package fundamentosDeProgramacion.arreglosBidimensionales;

public class Punto5 {

    public static void main(String[] args) {

        int [][] tablas = new int[10][10];

        System.out.println("Tablas del 1 al 10");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++)
                tablas[i][j] = (i+1) * (j+1);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println();
            for (int j = 0; j < 10; j++)
                System.out.print("[" + tablas[i][j] + "]");
        }
    }
}
