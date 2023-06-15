package fundamentosDeProgramacion.workshop2;

import java.text.DecimalFormat;

public class Punto13 {

    // Creamos la funcion encargada de llenar la matriz con numeros aleatorios entre 7 y 38
    public static void rellenaArray (double [][] c) {
        int day = 1;
        // Recorremos toda la matriz
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                // Rellenamos hasta que la posicion sea igual a 31
                if (day <= 31) {
                    c[i][j] = Math.random() * 31 + 7;
                    day++;
                }
            }
        }
    }
    // Con esta funcion evaluamos la temperatura mas alta y baja de la semana y su dia
    public static void temperatura (double [][] temp) {

        // Creamos este arreglo para saber que dia de la semana se presentan los datos
        String [] semana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        // Como son 5 semanas en el mes, creamos un arreglo de 5 posiciones
        double [] sAlta = new double[5];
        double [] sBaja = {40,40,40,40,40};
        DecimalFormat df = new DecimalFormat("#.0");

        // Con este ciclo nos daremos cuenta cual es la temperatura mayor y menos de cada semana
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {

                if (sAlta[i] < temp[i][j])
                    sAlta[i] = temp[i][j];
                if (sBaja[i] > temp[i][j])
                    sBaja[i] = temp[i][j];
            }
        }
        int vecesA = 0, vecesB = 0;

        // Con este ciclo vamos a dar el informe de cada semana
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

    // Con esta funcion nos daremos cuenta cual es la temperatura promedio
    public static void promedioTemp (double[][] tempe) {

        DecimalFormat df = new DecimalFormat("#.0");
        // Vamos a evaluar la temperatura de cada semana
        for (int i = 0; i < tempe.length; i++) {
            // Inicializamos la variable en 0
            double prom = 0;
            System.out.print("El promedio de temperatura de la semana " + (i+1) + " es: ");
            // Sumamos y dividimos por la cantidad de dias a la semana
            for (int j = 0; j < tempe[i].length; j++) {
                prom = prom + tempe[i][j];
            }
            /* Evaluamos si la semana es la ultima si es asi, se divide sobre 3 que son los ultimos dias del mes
               sino se divide sobre los 7 dias de la semana
             */
            if (i == 4)
                System.out.println(df.format(prom / 3) + "°");
            else
                System.out.println(df.format(prom / 7) + "°");
        }
        System.out.println();
    }

    // Con esta funcion vamos a saber la temperatura mas alta del mes
    public static void temperaturaAltaMes (double[][] t) {

        DecimalFormat df = new DecimalFormat("#.0");
        String [] semana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        double tAlta = 0;
        // Con este ciclo recorremos toda la matriz para saber cual es la temperatura mas alta
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {

                if (tAlta < t[i][j])
                    tAlta = t[i][j];
            }
        }
        // Imprimimos la temperatura con un mensaje
        System.out.println("La temperatura registrada mas alta del mes fue: " + df.format(tAlta) + "°");

        // Con este ciclo nos daremos cuenta que dia fue la temperatura mas alta
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {

                if (tAlta == t[i][j])
                    System.out.println("Y su dia fue: " + semana[j]);
            }
        }
    }

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.0");
        // Creamos la matriz con 5 filas y 7 columnas
        double [][] mes = new double[5][7];

        // Llamamos las funciones para realizar las evaluaciones pendientes
        rellenaArray(mes);
        temperatura(mes);
        promedioTemp(mes);
        temperaturaAltaMes(mes);
    }
}
