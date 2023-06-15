package fundamentosDeProgramacion.ejerciciosConMatrices;

import java.text.DecimalFormat;

public class Punto5 {

    public static void rellenaArray (double [][] c) {
        int day = 1;
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                if (day <= 31) {
                    c[i][j] = Math.random() * 31 + 7;
                    day++;
                }
            }
        }
    }
    public static void temperatura (double [][] temp) {

        String [] semana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        double [] sAlta = new double[5];
        double [] sBaja = {40,40,40,40,40};
        DecimalFormat df = new DecimalFormat("#.0");

        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {

                    if (sAlta[i] < temp[i][j])
                        sAlta[i] = temp[i][j];
                    if (sBaja[i] > temp[i][j])
                        sBaja[i] = temp[i][j];
            }
        }
        int vecesA = 0, vecesB = 0;

        for (int i = 0; i < temp.length; i++) {
            System.out.println("Informe de la semana " + (i + 1));
            System.out.println("La temperatura registrada mas alta fue: " + df.format(sAlta[i]) + "°");
            System.out.println("La temperatura registrada mas baja fue: " + df.format(sBaja[i]) + "°");

            if (i == 4) {
                for (int j = 0; j < 3; j++) {

                    if (sAlta[i] == temp[i][j]) {
                        vecesA++;
                        System.out.println("La mas alta fue el dia: " + semana[j]);
                    }
                }
                for (int l = 0; l < 3; l++) {

                    if (sBaja[i] == temp[i][l]) {
                        vecesB++;
                        System.out.println("La mas baja fue el dia: " + semana[l]);
                    }
                }
                if (vecesA > 1)
                    System.out.println("Se registro la temperatura mas alta " + vecesA + " veces");

                if (vecesB > 1)
                    System.out.println("Se registro la temperatura mas baja " + vecesB + " veces");
                vecesA = 0;
                vecesB = 0;
            } else {
                for (int j = 0; j < temp[i].length; j++) {

                    if (sAlta[i] == temp[i][j]) {
                        vecesA++;
                        System.out.println("La mas alta fue el dia: " + semana[j]);
                    }
                }
                for (int l = 0; l < temp[i].length; l++) {

                    if (sBaja[i] == temp[i][l]) {
                        vecesB++;
                        System.out.println("La mas baja fue el dia: " + semana[l]);
                    }
                }
                if (vecesA > 1)
                    System.out.println("Se registro la temperatura mas alta " + vecesA + " veces");

                if (vecesB > 1)
                    System.out.println("Se registro la temperatura mas baja " + vecesB + " veces");
                vecesA = 0;
                vecesB = 0;
            }
            System.out.println();
        }
    }

    public static void promedioTemp (double[][] tempe) {

        DecimalFormat df = new DecimalFormat("#.0");
        for (int i = 0; i < tempe.length; i++) {
            double prom = 0;
            System.out.print("El promedio de temperatura de la semana " + (i+1) + " es: ");
            for (int j = 0; j < tempe[i].length; j++) {
                prom = prom + tempe[i][j];
            }
            System.out.println(df.format(prom / 7) + "°");
        }
        System.out.println();
    }

    public static void temperaturaAltaMes (double[][] t) {

        DecimalFormat df = new DecimalFormat("#.0");
        String [] semana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        double tAlta = 0;
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {

                if (tAlta < t[i][j])
                    tAlta = t[i][j];
            }
        }
        System.out.println("La temperatura registrada mas alta del mes fue: " + df.format(tAlta) + "°");

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {

                if (tAlta == t[i][j])
                    System.out.println("Y su dia fue: " + semana[j]);
            }
        }
    }

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.0");
        double [][] mes = new double[5][7];

        rellenaArray(mes);
        temperatura(mes);
        promedioTemp(mes);
        temperaturaAltaMes(mes);


    }
}
