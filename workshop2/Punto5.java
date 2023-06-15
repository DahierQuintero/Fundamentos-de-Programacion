package fundamentosDeProgramacion.workshop2;

import java.util.Scanner;

public class Punto5 {

    // Creamos la funcion que va a recibir la cadena como parametro
    public static void devolverCadena (int[] cadena) {
        /* Creamos la variable que nos va a ayudar a imprimir de adelante hacia atras, inicialmente va a valer el total
           de espacios en la cadena, teniendo en cuenta que iniciamos desde 0, le restamos 1 al largo de la cadena
         */
        int l = cadena.length - 1;
        // Con este ciclo vamos a recorrer la cadena de adelante hacia atras con la variable l y vamos imprimiendo el valor
        for (int i = 0; i < cadena.length; i++) {
            System.out.print("[" + cadena[l] + "]");
            // para ir al siguiente valor le restamos 1 a l, asi pasara a la posicion anterior de la que estaba
            l--;
        }
    }

    public static void main(String[] args) {

        // Creamos las variables necesarias
        Scanner a = new Scanner(System.in);
        int [] cadenita = new int[10];

        // Con este ciclo vamos a llenar la cadena asignando los valores por consola
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el valor " + (i+1));
            cadenita[i] = a.nextInt();
        }
        // Con este ciclo los imprimimos en pantalla en el orden de ingreso
        for (int i = 0; i < 10; i++)
            System.out.print("[" + cadenita[i] + "]");
        // Un salto de linea para mostrar ahora la cadena de forma invertida
        System.out.println();
        // Llamamos la funcion encargada de imprimir la cadena de forma invertida recibiendo como parametro la cadena
        devolverCadena(cadenita);
    }
}
