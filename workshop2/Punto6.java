package fundamentosDeProgramacion.workshop2;

public class Punto6 {

    public static void main(String[] args) {

        // Creamos la matriz de 5 x 5
        int[][] matrix = new int[5][5];
        /* Creamos una variable que va a ser la encargada de ir de columna en columna e inicialmente vale 5 - 1
           que es la ultima posicion de la fila teniendo en cuenta que iniciamos en 0
         */
        int a = matrix.length - 1;

        // Con este ciclo vamos a recorrer la matriz, por defecto todos los numeros son 0
        for (int i = 0; i < matrix.length; i++) {
            /* Solo vamos a cambiar el valor de la fila en la posicion de a
               que en la primer interaccion va a ser la ultima columna
             */
            matrix[i][a] = 1;
            /* Luego de cambiar el valor, le restamos 1 a la variable 'a' para que cuando vuelva a ingresar al ciclo
               en la siguiente fila se cambia el valor de la columna anterior a la ya modificada
             */
            a--;
        }

        // Finalmente imprimimos toda la matriz y obtenemos el algoritmo
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++)
                System.out.print("[" + matrix[i][j] + "]");
        }
    }
}
