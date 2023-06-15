package fundamentosDeProgramacion.ejerciciosIntegradores;

import java.util.Scanner;

public class punto1 {

    public static int CostoTeclados (int teclados) {

        if (teclados < 1)
            return 0;

        else if (teclados < 4)
            return teclados * 15;

        else if (teclados <= 8)
            return teclados * 11;

        else
            return teclados * 10;
    }

    public static void main(String[] args) {

        int teclados, totalPago;
        Scanner a = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de teclados que va a comprar");
        teclados = a.nextInt();

        totalPago = CostoTeclados(teclados);

        if (teclados < 1)
            System.out.println("La compra debe ser de minimo 1 teclado");
        else
            System.out.println("El numero de teclados a comprar son: " + teclados + ". Y el total a pagar es: " + CostoTeclados(teclados));
    }
}
