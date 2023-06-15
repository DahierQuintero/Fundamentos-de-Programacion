package fundamentosDeProgramacion.arreglosBidimensionales;

public class Punto6 {

    public static int CuantosNumerosPares (int[][] m) {
        int con = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] % 2 == 0)
                    con++;
            }
        }
        return con;
    }

    public static void main(String[] args) {

        int [][] candace = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                candace[i][j] = (int) (Math.random() * (100 + 1));
            }
        }
        System.out.println("Hay " + CuantosNumerosPares(candace) + " numeros pares en el arreglo");
    }
}
