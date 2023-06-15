package fundamentosDeProgramacion.estructuraRepeticion;

import java.util.Scanner;

public class Punto5 {

    public static void main(String[] args) {

        double num, pro;
        int cantNum;
        pro = 0;
        Scanner a = new Scanner(System.in);

        System.out.println("Indique cuantos numeros desea ingresar");
        cantNum = a.nextInt();

        for (int i = 0; i < cantNum; i++) {
            System.out.println("Ingrese un numero");
            num = a.nextDouble();

            pro = pro + num;
        }
        pro = pro / cantNum;
        System.out.println("El promedio de los numeros leidos es: " + pro);
    }
}
