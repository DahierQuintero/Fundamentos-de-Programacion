package fundamentosDeProgramacion.ejerciciosIntroduccionJava;

import java.util.Scanner;

public class Punto1 {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int num;
        System.out.println("Ingrese el numero del cliente");
        num = a.nextInt();

        if (num == 1000)
            System.out.println("Ganaste un premio");
        else
            System.out.println("Sigue participando");
    }
}
