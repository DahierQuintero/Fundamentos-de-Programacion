package fundamentosDeProgramacion.talerSubalgoritmosFunciones;

public class Punto1 {

    public static double AreaTriangulo (double base, double altura) {
        return base * altura;
    }

    public static void main(String[] args) {
        double b = 9, a = 4;
        System.out.println("La base del triangulo es: " + AreaTriangulo(b,a));

    }
}

