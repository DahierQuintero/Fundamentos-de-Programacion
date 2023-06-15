package fundamentosDeProgramacion.workshop1;

import java.util.Scanner;

public class Punto12 {

    public static void main(String[] args) {

        //Declaramos las variables que necesitaremos
        int n, nMenos;
        Scanner a = new Scanner(System.in);

        //Solicitamos al usuario que ingrese un numero entero que almacenamos en la variable n
        System.out.println("Ingrese un numero");
        n = a.nextInt();

        /*La variable nMenos nos ayuda a almacenar el mismo valor de n, y poder restarle 1 cada que salga del ciclo
          sin alterar el valor de n
        */
        nMenos = n;

        //Iniciamos el ciclo para recorrer cada linea o renglon con el valor que ingresa el usuario
        for (int i = 0; i < n; i++) {
            //Realizamos un salto de linea para que despues de llenar un renglon podamos continuar con el siguiente
            System.out.println("");

            //Iniciamo el ciclo para llenar 1 renglon utilizando la variable nMenos
            for (int j = 0; j < nMenos; j++) {
                //Vamos a immprimir 1 asterisco el numero de veces que este almacenado en la variable nMenos
                System.out.print(" * ");
            }
            /*Cada vez que salga del ciclo j le restamos 1 a la variable nMenos para ir obteniendo el patron
            hasta llegar a 0
            */
            nMenos --;
        }
    }
}
