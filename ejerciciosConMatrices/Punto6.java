package fundamentosDeProgramacion.ejerciciosConMatrices;

import java.util.Scanner;

public class Punto6 {

    public static void ventasMensuales (double[][] d) {

        for (int i = 0; i < d.length; i++) {
            double res = 0;
            for (int j = 0; j < d[i].length; j++) {

                res = res + d[i][j];
            }
            System.out.println("La venta del mes " + (i+1) + " fue: " + res);
        }


    }

    public static void montoAnual (double[][] anual) {

        double montoAnual = 0;

        for (int i = 0; i < anual.length; i++) {
            for (int j = 0; j < anual[i].length; j++)
                montoAnual = montoAnual + anual[i][j];
        }
        System.out.println("El monto anual fue: " + montoAnual);
    }

    public static void ventaJunio (double[][] anio) {

        double mayor = 0;

        for (int i = 0; i < 5; i++) {
            if (anio[6][i] > mayor)
                mayor = anio[6][i];
        }
        for (int i = 0; i < 5; i++) {
            if (mayor == anio[6][i])
                System.out.println("El departamento " + (i+1) + " fue el que tuvo la mayor venta en el mes de Julio, Felicitaciones!!");
        }
    }

    public static void mayorVentaDepa ( double[][] estadistica ,int depa) {

        double ventaMay = 0;
        for (int i = 0; i < estadistica.length; i++) {
            if (estadistica[i][depa-1] > ventaMay )
                ventaMay = estadistica[i][depa-1];
        }
        for (int i = 0; i < estadistica.length; i++) {
            if (ventaMay == estadistica[i][depa-1])
                System.out.println("La mayor venta del departamento " + depa + " fue de " + ventaMay + " registrada en el mes " + (i+1));
        }
    }

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        double [][] fabri = new double[12][5];
        int op;

        for (int i = 0; i < 12; i++) {
            System.out.println("Mes " + (i+1));
            for (int j = 0; j < 5; j++) {
                System.out.println("Ingrese el monto de venta del departamento #" + (j+1));
                fabri[i][j] = a.nextDouble();
            }
        }
        boolean opc = true;
        int res;

        while (opc) {
            System.out.println("Ingrese una de las siguientes opciones:\n" +
                    "1) Para saber las ventas mensuales de la fabrica\n" +
                    "2) Para saber el monto anual\n" +
                    "3) Para saber la mayor venta en el mes de julio\n" +
                    "4) Para saber la mayor venta de un departamento");
            op = a.nextInt();

            switch (op) {

                case 1:
                    ventasMensuales(fabri);

                    System.out.println();
                    System.out.println("Desea realizar otra operacion?\n" +
                            "1) Si\n" +
                            "2) No");
                    res = a.nextInt();

                    if (res == 1)
                        opc = true;
                    else if (res == 2)
                        opc = false;
                    else {
                        System.out.println("Respuesta no valida. Fin del proceso");
                        opc = false;
                    }
                    break;

                case 2:
                    montoAnual(fabri);

                    System.out.println();
                    System.out.println("Desea realizar otra operacion?\n" +
                            "1) Si\n" +
                            "2) No");
                    res = a.nextInt();

                    if (res == 1)
                        opc = true;
                    else if (res == 2)
                        opc = false;
                    else {
                        System.out.println("Respuesta no valida. Fin del proceso");
                        opc = false;
                    }
                    break;

                case 3:
                    ventaJunio(fabri);

                    System.out.println();
                    System.out.println("Desea realizar otra operacion?\n" +
                            "1) Si\n" +
                            "2) No");
                    res = a.nextInt();

                    if (res == 1)
                        opc = true;
                    else if (res == 2)
                        opc = false;
                    else {
                        System.out.println("Respuesta no valida. Fin del proceso");
                        opc = false;
                    }
                    break;

                case 4:
                    int depa;
                    System.out.println("Ingrese el departamento a evaluar");
                    depa = a.nextInt();

                    mayorVentaDepa(fabri,depa);

                    System.out.println();
                    System.out.println("Desea realizar otra operacion?\n" +
                            "1) Si\n" +
                            "2) No");
                    res = a.nextInt();

                    if (res == 1)
                        opc = true;
                    else if (res == 2)
                        opc = false;
                    else {
                        System.out.println("Respuesta no valida. Fin del proceso");
                        opc = false;
                    }
                    break;
            }
        }
    }
}
