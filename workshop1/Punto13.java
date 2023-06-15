package fundamentosDeProgramacion.workshop1;

import java.util.Scanner;

public class Punto13 {

    public static void main(String[] args) {

        //Declaramos las variables que necesitamos e inicializamos epacio en 0
        int num, espacio = 0;
        Scanner a = new Scanner(System.in);

        //Solicitamos al usuario un numero entero que almacenamos en la variable num
        System.out.println("Ingrese un numero");
        num = a.nextInt();

        //Iniciamos el ciclo para recorrer cada linea o renglon con el valor que ingresa el usuario
        for (int i = 0; i < num; i++) {
            //Realizamos un salto de linea para que despues de llenar un renglon podamos continuar con el siguiente
            System.out.println("");

            /*Iniciamos un ciclo para llenar con espacios para obtener el patron en cada linea.
              la variable contador nos ayuda a que j vuelva a valer 0 cada que sale del ciclo y la variable espacio
              nos ayuda a imprimir la espacios necesarios en cada linea
            */
            for (int j = 0; j < espacio; j++) {
                //Se imprimen consecutivamente
                System.out.print("   ");
            }

            /*Creamos una variable que nos ayuda a saber cuantos espacios nos quedan para llenar con asteriscos
              restando a la variable num la cantidad de espacios que hemos ocupado en el ciclo anterior
            */
            int rep = num - espacio;

            /*Iniciamos el ciclo para llenar con asteriscos los espacios que faltan.
              Lo sabemos por la variable rep
            */
            for (int l = 0; l < rep; l++) {
                //Se imprimen consecutivamente
                System.out.print(" * ");
            }

            /*Finalmente antes de salir del ciclo principal sumamos 1 a la variable espacio,
              para que en la siguiente linea imprima 1 espacio mas e ir obteniendo el patron de la imagen
            */
            espacio ++;
        }

    }
}
