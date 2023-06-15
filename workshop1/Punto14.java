package fundamentosDeProgramacion.workshop1;

import java.util.Scanner;

public class Punto14 {

    public static void main(String[] args) {

        //Declaramos las variables que necesitamos
        int num, espacio;
        Scanner a = new Scanner(System.in);

        //Solicitamos al usuario un numero entero que almacenamos en la variable num
        System.out.println("Ingrese un numero");
        num = a.nextInt();

        //La variable espacio va a valer inicialmente lo mimo que la variable num
        espacio = num;

        //Iniciamos el ciclo para recorrer cada linea o renglon con el valor que ingresa el usuario
        for (int i = 0; i < num; i++) {
            //Realizamos un salto de linea para que despues de llenar un renglon podamos continuar con el siguiente
            System.out.println("");

            //A la variable espacio le vamos a ir restando 1 en cada linea
            espacio--;

            //Iniciamo un ciclo imprimiendo los espacios en blanco
            for (int j = 0; j < espacio; j++) {
                //Se imprimen consecutivamente
                System.out.print("   ");
            }

            /*Creamos la varible rep que nos ayuda a saber cuanto espacios faltan por llenar, para llenarlos
            con asteriscos
            */
            int rep = num - espacio;

            //Iniciamos un ciclo para llenar los espacios que faltan con astericos
            for (int l = 0; l < rep; l++) {
                //Se imprimen consecutivamente
                System.out.print(" * ");
            }
        }

    }
}
