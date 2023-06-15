package fundamentosDeProgramacion.ejerciciosFunciones;

import java.util.Scanner;

public class Punto6 {

    public static double CelsiusaFahrenheit (double grados) {
        return grados * 9/5 + 32;
    }
    public static double FahrenheitaCelsius (double grados) {
        return (grados - 32) * 5/9;
    }
    private static double AreaTriangulo (double base, double altura) {
        return base * altura / 2;
    }
    public static double AreaCirculo (double radio) {
        return Math.PI * Math.pow(radio,2);
    }
    public static double PerimetroRectangulo (double base, double altura) {
        return (base + altura) * 2;
    }

    public static void main(String[] args) {

        int op;
        Scanner a = new Scanner(System.in);

        System.out.println("Ingrese una opcion");
        System.out.println("1) Convertir grados Celsius a Fahrenheit\n" +
                           "2) Convertir grados Fahrenheit a Celsius\n" +
                           "3) Calcular el area de un triangulo\n" +
                           "4) Calcular el area de un circulo\n" +
                           "5) Calcular el perimetro de un rectangulo");
        op = a.nextInt();

        switch (op) {

            case 1:
                double gradosC;
                System.out.println("Ingrese los grados Celsius");
                gradosC = a.nextDouble();
                System.out.println(gradosC + "° Celsius equivalen a " + CelsiusaFahrenheit(gradosC) + "° Fahrenheit");
                break;

            case 2:
                double gradosF;
                System.out.println("Ingrese los grados Fahrenheit");
                gradosF = a.nextDouble();
                System.out.println(gradosF + "° Fahrenheit equivalen a " + FahrenheitaCelsius(gradosF) + "° Celsius");
                break;

            case 3:
                double b, h;
                System.out.println("Ingrese la base del triangulo");
                b = a.nextDouble();
                System.out.println("Ingrese la altura del triangulo");
                h = a.nextDouble();
                System.out.println("El area del triangulo es " + AreaTriangulo(b,h));
                break;

            case 4:
                double radio;
                System.out.println("Ingrese el radio del circulo");
                radio = a.nextDouble();
                System.out.println("El area del circulo es " + AreaCirculo(radio));
                break;

            case 5:
                double base, altura;
                System.out.println("Ingrese la base del rectangulo");
                base = a.nextDouble();
                System.out.println("Ingrese la altura del rectangulo");
                altura = a.nextDouble();
                System.out.println("El preimetro del rectangulo es " + PerimetroRectangulo(base,altura));
        }


    }
}
