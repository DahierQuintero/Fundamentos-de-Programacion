package fundamentosDeProgramacion.workshop1;

import java.util.Scanner;

public class Punto11 {

    public static void main(String[] args) {

        //Declaramos la variable que necesitamos
        int num;
        Scanner a = new Scanner(System.in);

        //Solicitamos por consola un numero entero que se almacena en la variable num
        System.out.println("Ingrese un numero");
        num = a.nextInt();

        //Iniciamos el ciclo por renglones hasta el valor de la variable num
        for (int i = 0; i < num; i++) {
            //Imprimimos un salto de linea para ir pasando al siguiente renglon
            System.out.println("");

            //Iniciamos el ciclo para llenar con asteriscos el numero de veces que hay en la variable num
            for (int j = 0; j < num; j++) {
                System.out.print(" * ");
            }
        }

    }
}
