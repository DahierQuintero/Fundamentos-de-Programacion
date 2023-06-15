package fundamentosDeProgramacion.talerSubalgoritmosFunciones;

public class Punto5 {

    public static int Cociente (int a, int b) {
        boolean div = false;
        int contador = 0, ayudante = a;

        while (!div) {

            if (ayudante >= b) {
                ayudante = ayudante - b;
                contador++;
            }
            else {
                div = true;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        int a = 70, b = 7;
        System.out.println("Las veces que esta " + b + " en " + a + " son: " + Cociente(a,b));
    }
}
