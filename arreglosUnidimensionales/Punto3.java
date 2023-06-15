package fundamentosDeProgramacion.arreglosUnidimensionales;

import java.util.Scanner;

public class Punto3 {

    public static int CantidadDeVocales (String cadena) {

        char letra;
        int veces = 0, canLetras = cadena.length();

        for (int i = 0; i < canLetras; i++) {
            letra = cadena.charAt(i);
            if (letra == 'A' || letra == 'a' || letra == 'E' || letra == 'e' || letra == 'I' || letra == 'i' || letra == 'O' || letra == 'o' || letra == 'U' || letra == 'u') {
                veces++;
            }
        }
        return veces;
    }

    public static void main(String[] args) {

        String cadena;
        Scanner a = new Scanner(System.in);

        System.out.println("Ingrese una frase");
        cadena = a.nextLine();

        System.out.println("La frase tiene " + CantidadDeVocales(cadena) + " vocales");
    }
}
