package fundamentosDeProgramacion.ejercicios1;

import java.util.Scanner;

public class CalcularIMC {

    public static void main(String[] args) {

        double peso, altura, imc;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su peso");
        peso = entrada.nextDouble();

        System.out.println("Ingrese su altura");
        altura = entrada.nextDouble();

        imc = peso / (altura * altura);

        if (imc >= 18.5 & imc <= 24.9) {
            System.out.println("Clasificacion Normal");
        }
        else if (imc >= 25 & imc <= 29.9) {
            System.out.println("Clasificacion Sobrepeso");

        }
        else if (imc >= 30 & imc <= 34.9) {
            System.out.println("Clasificacion Obesidad grado 1");

        }
        else if (imc >= 35 & imc <= 39.9) {
            System.out.println("Clasificacion Obesidad grado 2");

        }
        else if (imc >= 40) {
            System.out.println("Clasificacion Normal");

        }

    }
}
