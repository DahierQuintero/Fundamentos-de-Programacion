package fundamentosDeProgramacion.workshop1;

import java.util.Scanner;

public class Punto6 {

    public static void main(String[] args) {

        //Declaramos las variables necesarias
        char res;
        //Por defecto iniciamos las variables en true
        boolean p = true, q = true;
        Scanner a = new Scanner(System.in);

        //Iniciamos un ciclo para llenar las 4 filas
        for (int i = 0; i < 4; i++) {
            //Este salto de linea es para que se vea mas ordenado cuando volvamos a imprimir la siguiente fila
            System.out.println("");

            //Solicitamos el valor de p por consola
            System.out.print("Ingrese V (Verdadero) o F (Falso) para p = ");
            res = a.next().charAt(0);

            //Dependiendo de la respuesta del usuario p va a ser Verdadero o Falso para eso usamos el if
            if (res == 'V' || res == 'v')
                p = true;
            else if (res == 'F' || res == 'f')
                p = false;

            //Solicitamos el valor de p por consola
            System.out.print("Ingrese V (Verdadero) o F (Falso) para q = ");
            res = a.next().charAt(0);

            //Dependiendo de la respuesta del usuario p va a ser Verdadero o Falso para eso usamos el if
            if (res == 'V' || res == 'v')
                q = true;
            else if (res == 'F' || res == 'f')
                q = false;

            //Imprimimos la primer casilla a evaluar sin saltar de linea para poner la respuesta al frente
            System.out.print("no q = ");
            //Evaluamos la condicion, si es correcta imprime verdadero sino imprime falso
            if (!q)
                System.out.println(true);
            else
                System.out.println(false);

            //Imprimimos la segunda casilla a evaluar sin saltar de linea para poner la respuesta al frente
            System.out.print("p o no q = ");
            //Evaluamos la condicion, si es correcta imprime verdadero sino imprime falso
            if (p || !q)
                System.out.println(true);
            else
                System.out.println(false);

            //Imprimimos la segunda casilla a evaluar sin saltar de linea para poner la respuesta al frente
            System.out.print("no q y (p o no q) = ");
            //Evaluamos la condicion, si es correcta imprime verdadero sino imprime falso
            if (!q & (p || !q))
                System.out.println(true);
            else
                System.out.println(false);
        }

    }
}
