package fundamentosDeProgramacion.ejerciciosFunciones;

public class Punto5 {

    public static void Tablas1al10 () {

        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla del " + i);

            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        Tablas1al10();
    }
}
