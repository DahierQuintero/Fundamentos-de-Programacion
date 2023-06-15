package fundamentosDeProgramacion.talerSubalgoritmosFunciones;

public class Punto2 {

    public static double PerimetroRectangulo (double base, double altura) {
        return (base + altura) * 2;
    }

    public static void main(String[] args) {
        double base = 5, altura = 3;
        System.out.println("El perimetro del rectangulo es: " + PerimetroRectangulo(base,altura));
    }
}
