package fundamentosDeProgramacion.workshop1;

import java.util.Scanner;

public class Punto3 {

    public static void main(String[] args) {

        //Declaramos las variables e inicializamos la variable prom en 0 para acumular el sueldo de los 5 empleados
        double sueldo, prom = 0;
        Scanner a = new Scanner(System.in);

        //Solicitamos los intgresos de los 5 empleados con un ciclo
        for (int i = 1; i <= 5; i++) {
            System.out.println("Ingrese el sueldo del empleado #" + i);
            //Lo almacenamos en la variable sueldo
            sueldo = a.nextDouble();
            //Acumulamos el sueldo de lo 5 en la variable prom
            prom = prom + sueldo;
        }
        //Dividimos el sueldo acumulado sobre 5 empleados para obtener el promedio
        prom = prom / 5;
        //Imprimimos el promedio
        System.out.println("El sueldo promedio de los 5 empleados es de: $" + prom);
    }
}
