package fundamentosDeProgramacion.ejerciciosTecnicos2;

import java.text.DecimalFormat;

public class Punto1 {

    public static void main(String[] args) {

        // cuenta 179
        double ana, bruno, carla, porcentaje;
        DecimalFormat df = new DecimalFormat("#.00");

        ana = 48;
        bruno = 79;
        carla = 52;

        porcentaje = (ana / 179) * 100;
        System.out.println("Ana le toca pagar el " + df.format(porcentaje) + " % que son 48$");

        porcentaje = (bruno / 179) * 100;
        System.out.println("Bruno le toca pagar el " + df.format(porcentaje) + " % que son 79$");

        porcentaje = (carla / 179) * 100;
        System.out.println("Carla le toca pagar el " + df.format(porcentaje) + " % que son 52$");

    }

}
