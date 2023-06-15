package fundamentosDeProgramacion.workshop2;

import java.util.Scanner;

public class Punto3 {

    // Creamos la funcion que se va a encargar de sumar los numeros pares e impares recibiendo el arreglo como parametro
    public static void sumaParesImpares (int[] ar) {
        // Creamos una variable para la suma de pares y otra para la suma de impares inicializadas en 0
        int par = 0, impar = 0;

        // Con este ciclo recorremos el arreglo posicion a posicion
        for (int i = 0; i < ar.length; i++) {
            // Comparamos si el numero en la posicion i modulo 2 es igual a cero quiere decir que el numero es par
            if (ar[i] % 2 == 0)
                // Entonces le sumamos el valor del arreglo posicion [i] a par, asi se iran sumando los pares
                par = par + ar[i];
            // Si la condicion anterior no se cumple quiere decir que el numero es impar
            else
                // Entonces sumamos el valor del arreglo posicion [i] a impar, asi se iran sumando los impares
                impar = impar + ar[i];
        }

        // Al finalizar esta operacion mostramos el resultado de la suma de los pares e impares por pantalla
        System.out.println("La suma de los numeros pares en el arreglo es: " + par);
        System.out.println("La suma de los numeros impares en el arreglo es: " + impar);
    }

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        // Creamos la variable tam para el tamanio del vector
        int tam;
        // Le pedimos al usuario que ingrese el tamanio del vector y lo almacenamos en la variable tam
        System.out.println("Ingrese el tamanio del vector");
        tam = a.nextInt();
        // Creamos el vector y el tamanio ya esta determinado por la variable tam
        int [] vec = new int[tam];

        // Creamos un ciclo para que el usuario ingrese los valores que va a almacenar en el vector
        for (int i = 0; i < tam; i++) {
            // Por pantalla le solicitamos que ingrese el valor que se ira almacenando en la posicion [i] del vector
            System.out.println("Ingrese el valor " + (i+1));
            vec[i] = a.nextInt();
        }
        // Finalmente llamanos la funcion y le pasamos el vector como parametro
        sumaParesImpares(vec);
    }
}
