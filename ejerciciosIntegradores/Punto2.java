package fundamentosDeProgramacion.ejerciciosIntegradores;

import java.util.Scanner;

public class Punto2 {

    public static String LenguajeProgramacion (char lenguaje) {

        if (lenguaje == 'V' || lenguaje == 'v')
            return "El lenguaje seleccionado es Visual Basic";

        else if (lenguaje == 'P' || lenguaje == 'p')
            return "El lenguaje seleccionado es Pascal";

        else if (lenguaje == 'C' || lenguaje == 'c')
            return "El lenguaje seleccionado es C#";

        else if (lenguaje == 'J' || lenguaje == 'j')
            return "El lenguaje seleccionado es Java";

        else if (lenguaje == 'F' || lenguaje == 'f')
            return "El lenguaje seleccionado es Fortran";

        else
            return "Lenguaje no reconocido";
    }

    public static void main(String[] args) {

        char l;
        Scanner a = new Scanner(System.in);

        System.out.println("Ingrese la inicial del lenguaje que desea escoger:\n" +
                "» Visual Basic\n" +
                "» Pascal\n" +
                "» C#\n" +
                "» Java\n" +
                "» Fortran");
        l = a.next().charAt(0);

        System.out.println(LenguajeProgramacion(l));
    }
}
