package fundamentosDeProgramacion.ejerciciosTecnicos2;

import java.text.DecimalFormat;

public class Punto3 {

    public static void main(String[] args) {

        double totalCuenta, alex, bianca, carlos, diana, porcentaje;
        DecimalFormat df = new DecimalFormat("#.00");
        //23 suministros
        alex = 6;
        bianca = 7;
        carlos = 7;
        diana = 3;
        totalCuenta = alex + bianca + carlos + diana;

        porcentaje = (alex / 23) * 71;
        System.out.println("Alex le toca " + df.format(porcentaje) + "$");

        porcentaje = (bianca / 23) * 71;
        System.out.println("Bianca le toca el " + df.format(porcentaje) + "$");

        porcentaje = (carlos / 23) * 71;
        System.out.println("Carlos le toca el " + df.format(porcentaje) + "$");

        porcentaje = (diana / 23) * 71;
        System.out.println("Diana le toca el " + df.format(porcentaje) + "$");
    }
}
