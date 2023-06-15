package fundamentosDeProgramacion.tallerEstructurasDeSelección;

import java.util.Scanner;

public class Punto7 {

    public static void main(String[] args) {

        double precioCoste, ganancia, precio;
        Scanner a = new Scanner(System.in);

        System.out.println("Ingrese el precio del articulo");
        precioCoste = a.nextDouble();

        if (precioCoste < 3000) {
            ganancia =  precioCoste * 0.15;
        }
        else if (precioCoste <= 6000) {
            ganancia =  precioCoste * 0.195;
        }
        else {
            ganancia =  precioCoste * 0.25;
        }

        precio = precioCoste + ganancia;
        System.out.println("El precio del articulo es: $" + precio);
    }
}
