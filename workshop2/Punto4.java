package fundamentosDeProgramacion.workshop2;

public class Punto4 {

    // Creamos la funcion encargada de imprimir los asteriscos y recibe como parametro el vector
    public static void imprimeAsteriscos (int [] ferxxo) {

        // Con este ciclo recorremos cada posicion del vector
        for (int i = 0; i < ferxxo.length; i++) {
            // Con este salto de linea pasaremos a la siguiente fila
            System.out.println();
            // Con este ciclo vamos a imprimir un asterisco por las veces que haya en la posicion [i] del vector
            for (int j = 0; j < ferxxo[i]; j++)
                // Imprimimos sin saltar para completar la fila
                System.out.print(" * ");
        }
    }

    public static void main(String[] args) {

        // Creamos el arreglo que ya sabemos que es de 10 elementos
        int [] element = new int[10];

        // Con este ciclo vamos a llenar los 10 espacios del vector de forma aleatoria
        for (int i = 0; i < 10; i++)
            // Creamos numeros aleatorios entre 1 y 50
            element[i] = (int) (Math.random() * 50) + 1;

        // LLamamos la funcion encargada de imprimir los asteriscos y le pasamos como parametro el vector
        imprimeAsteriscos(element);
    }
}
