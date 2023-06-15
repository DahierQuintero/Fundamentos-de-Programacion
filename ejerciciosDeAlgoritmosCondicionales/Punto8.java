package fundamentosDeProgramacion.ejerciciosDeAlgoritmosCondicionales;

import java.util.Scanner;

public class Punto8 {

    public static void main(String[] args) {

        String nom;
        double salHora, horas, salMen, salNeto;
        double subTran = 83140;
        double salMin = 737717;
        Scanner a = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        nom = a.next();

        System.out.println("Ingrese su salario por hora");
        salHora = a.nextDouble();

        System.out.println("Ingrese la horas trabajadas");
        horas = a.nextDouble();

        salMen = salHora * horas;
        salNeto = salMen;

        if (salMen <= salMin * 2) {
            salNeto += subTran;
            System.out.println("El salario mensual de: " + nom + " es de: " + salMen +
                    "\nEl subsidio de transporte es de: " + subTran + "\n" +
                    "Y el salario mensual neto es de: " + salNeto);
        }
        else {
            System.out.println("El salario mensual de: " + nom + " es de: " + salMen +
                    "\n" + "Y el salario mensual neto es de: " + salNeto);
        }
    }
}
