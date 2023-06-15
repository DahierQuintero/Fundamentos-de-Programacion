package fundamentosDeProgramacion.ejerciciosIntroduccionJava;

public class Punto5 {

    public static void main(String[] args) {

        int contador = 0;

        for (int i = 100; i <= 200; i++)
            contador = contador + i;
        System.out.println("La suma de los numeros del 100 al 200 es: " + contador);
    }
}
