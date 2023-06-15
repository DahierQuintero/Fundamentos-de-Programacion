package fundamentosDeProgramacion.arreglosBidimensionales;

public class Punto4 {

    public static void LlenarDiagonal (int [][] mat) {

        for (int i = 0; i < mat.length; i++)
            mat[i][i] = 1;
    }

    public static void main(String[] args) {

        int [][] ar = new int[5][5];
        LlenarDiagonal(ar);

        for (int i = 0; i < ar.length; i++) {
            System.out.println();
            for (int j = 0; j < ar[i].length; j++)
                System.out.print("[" + ar[i][j] + "]");
        }
    }
}
