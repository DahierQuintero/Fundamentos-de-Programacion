package fundamentosDeProgramacion.ejerciciosFunciones;

import java.util.Scanner;

public class Punto7 {

    //Programa que imprima el nombre de manera horizontal y vertical
    public static void NombreHorizVerti (String nombre) {

        for (int i = 0; i < 1; i++) {
            System.out.println(nombre);
            for (int j = 0; j < nombre.length(); j++) {
                char a = nombre.charAt(j);
                System.out.println(a);
            }
        }
    }

    public static void main(String[] args) {

        String nom;
        Scanner a = new Scanner(System.in);

        System.out.println("Ingrese su nombre para imprimirlo de manera horizontal y vertical");
        nom = a.nextLine();

        NombreHorizVerti(nom);
    }
}
