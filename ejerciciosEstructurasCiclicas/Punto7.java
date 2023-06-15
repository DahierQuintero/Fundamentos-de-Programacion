package fundamentosDeProgramacion.ejerciciosEstructurasCiclicas;

import java.util.Scanner;

public class Punto7 {

    public static void main(String[] args) {

        double monto = 0, aporteAcum = 0, aporte = 0;
        int pers = 0, aportaron = 0, noAportaron = 0, contador = 0;
        Scanner a = new Scanner(System.in);

        System.out.println("Ingrese el monto de dinero a recolectar");
        monto = a.nextDouble();

        System.out.println("Ingrese el numero de personas a la cual se le va a solicitar un aporte");
        pers = a.nextInt();
        contador = pers;

        if (pers > 0) {

            for (int i = 0; i < pers; i++) {
                System.out.println("Ingrese su aporte");
                aporte = a.nextDouble();

                aporteAcum = aporteAcum + aporte;

                if (aporte > 0) {
                    aportaron++;
                }
                else {
                    noAportaron++;
                }
                contador --;
                if (aporteAcum >= monto) {
                    i += contador;
                }
            }

            System.out.println("El monto de dinero establecido fue de: " + monto);
            System.out.println("Los aportes totales fueron de: " + aporteAcum);
            System.out.println("Las personas que aportaron fueron: " + aportaron);
            System.out.println("Las personas que no aportaron fueron: " + noAportaron);
            System.out.println("Se les dejo de pedir a: " + contador);

            if (aporteAcum >= monto) {
                System.out.println("Se ha logrado el objetivo a recolectar");
            }
            else {
                System.out.println("No se ha logrado el objetivo a recolectar");
            }
        }
        else {
            System.out.println("No hubo personas a quien pedirle");
        }
    }
}
