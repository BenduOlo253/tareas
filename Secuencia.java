import java.util.Scanner;

public class Secuencia {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario que ingrese el número de términos
        System.out.print("¿Cuántos términos? ");
        int n = sc.nextInt();

        // Validar que el número de términos sea positivo
        if (n <= 0) {
            System.out.println("El número de términos debe ser positivo.");
            return;
        }

        // Inicializar la variable que almacena la suma de los términos
        int suma = 0;

        // Inicializar la variable que almacena el valor del término actual
        int term = 1;

        // Recorrer los n términos de la secuencia
        for (int i = 1; i <= n; i++) {
            // Imprimir el término actual seguido de un signo +
            System.out.print(term + "+");

            // Sumar el término actual a la suma
            suma += term;

            // Multiplicar el término actual por 10 y sumarle 1 para obtener el siguiente término
            term = term * 10 + 1;
        }

        // Imprimir un salto de línea
        System.out.println();

        // Imprimir la suma de los términos
        System.out.println("suma " + suma);
    }
}
