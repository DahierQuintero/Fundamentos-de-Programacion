package fundamentosDeProgramacion.ejerciciosFunciones;

import java.util.Scanner;

public class Punto1 {
    
    public static double Suma3Numeros (double n1, double n2, double n3) {
        return n1 + n2 + n3;
    }

    public static void main(String[] args) {

        double a,b,c;
        Scanner e = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        a = e.nextDouble();

        System.out.println("Ingrese el segundo numero");
        b = e.nextDouble();

        System.out.println("Ingrese el tercer numero");
        c = e.nextDouble();

        System.out.println("El resultado de sumar los 3 numeros es: " + Suma3Numeros(a,b,c));

    }
}
