package fundamentosDeProgramacion.ejerciciosTecnicos2;

import java.text.DecimalFormat;

public class Punto2 {

    public static void main(String[] args) {

        double ana, bruno, carla, cuenta, prop, total;
        DecimalFormat df = new DecimalFormat("#.00");

        ana = 48;
        bruno = 79;
        carla = 52;
        cuenta = ana + bruno + carla;
        prop = cuenta * 0.15; //= 26.85

        ana += prop;
        bruno += prop;
        carla += prop;

        total = ana + bruno + carla; // 259.55

        /* ana = 74.85
           bruno = 105.85
           carla = 78.85   ana le da 14.85 a carla y bruno le da 5.85 a carla, Carla paga 100, Bruno paga 100
           y Ana paga 60
         */
        System.out.println("el costo total de la cuenta es: " + df.format(total) + " $");
        System.out.println("A Ana le coresponden: " + ana + "$");
        System.out.println("A Bruno le coresponden: " + bruno + "$");
        System.out.println("A Carla le coresponden: " + carla + "$");
        System.out.println("");

        System.out.println("Teniendo en cuenta que solo pueden pagar con billetes de 20$:\n" +
                "Ana le da " + df.format((ana - 60)) + "$ a Carla\n" +
                "Bruno le da " + df.format((bruno - 100)) + "$ a Carla\n" +
                "Carla debe un total de " + df.format(((ana - 60) + (bruno - 100) + carla)) + "$ pero como no puede pagar" +
                " con el billete de 100$, le da el billete de 100$ a Bruno para que pague junto con lo de el");

        ana -= ana - 60;
        bruno -= bruno - 100;
        carla += 14.85 + 5.85;
        bruno += carla;

        System.out.println("Por consiguiente: \n" +
                "Ana paga " + ana + "$. Con " + 3 + " billetes de 20$\n" +
                "Y Bruno paga " + bruno + "$. Con " + 10 + " billetes de 20$");
    }
}
