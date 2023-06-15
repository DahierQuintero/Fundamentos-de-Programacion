package fundamentosDeProgramacion.workshop2;

public class Punto1 {
    // Creamos la funcion que va a recibir un entero positivo
    public static double sumatoria (int num) {
        // Evaluamos si el numero ingresado es mayor a 0 para poder hacer la sumatoria
        if (num > 0) {
            // Creamos la variable que va a almacenar la sumatoria
            double sumatoria = 0;

            // Con este ciclo que inicia en 1 vamos a ir haciendo la operacion hasta que sea igual al numero recibido
            for (int i = 1; i <= num; i++) {
                // sumatoria va almacenando el resultado de la operacion i dividido 2 potencia i
                sumatoria = sumatoria + (i / Math.pow(2,i));
            }
            // Cuando termine el ciclo, nos devuelve el resultado de la sumatoria
            return sumatoria;
        }
        // Si el numero es menor o igual a 0, inmediatamente nos devuelve un 0 en la sumatoria
        return 0;
    }

    public static void main(String[] args) {
        // Utilizamos una variable como ejemplo que vale 10
        int a = 10;
        //Imprimimos en pantalla la sumatoria que retorna la funcion con el numero 10 como parametro
        System.out.println(sumatoria(a));
    }
}
