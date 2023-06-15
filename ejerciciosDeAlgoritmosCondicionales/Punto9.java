package fundamentosDeProgramacion.ejerciciosDeAlgoritmosCondicionales;

import java.util.Scanner;

public class Punto9 {

    public static void main(String[] args) {

        char letra;
        Scanner a = new Scanner(System.in);

        System.out.println("Ingrese una letra del abecedario");
        letra = a.next().charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.println("La letra " + letra + " es una vocal");
        }
        else {
            System.out.println("La letra " + letra + " es una consonante");
        }
    }
}
