package fundamentosDeProgramacion.arreglosBidimensionales;

public class Punto1 {

    public static void LeerMatrizBidimensional (int [][] m) {

        for (int i = 0; i < m.length; i++) {

            for (int j = 0; j < m[i].length; j++) {
                System.out.print(" " + m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int [][] ar = new int[2][3];

        ar[0][0] = 1;
        ar[0][1] = 2;
        ar[0][2] = 3;

        ar[1][0] = 4;
        ar[1][1] = 5;
        ar[1][2] = 6;

        LeerMatrizBidimensional(ar);
    }
}
