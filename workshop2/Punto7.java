package fundamentosDeProgramacion.workshop2;

public class Punto7 {

    public static void main(String[] args) {

        // Creamos la matriz de 5 x 5
        int [][] matrix = new int[5][5];
        /* Creamos una variable que nos va a ayudar a llenar las posiciones de la matriz, la iniciamos en 0
           para que sea la primera posicion de la primer fila
         */
        int help = 0;

        // Con este ciclo vamos a llenar la matriz
        for (int i = 0; i < 5; i++) {
            // Vamos a llenar con '1' hasta la variable help
            for (int j = 0; j <= help; j++)
                matrix[i][j] = 1;
            /* Incrementamos en 1 el valor de la variable help, para que en la siguiente fila se imprima un 1 mas
               y asi completar el patron
             */
            help++;
        }

        // Finalemnte con este ciclo vamos a imprimir toda la matriz
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++)
                System.out.print("[" + matrix[i][j] + "]");
        }
    }
}
