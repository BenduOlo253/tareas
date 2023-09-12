//Alumno: Jose Manuel Roberto Badillo.
// Efectua operaciones matemáticas báscias con dos números

import java.util.Scanner;
public class _p29_Calculadora {
    public static void main(String[] args) {
        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        //Limpiamos la pantalla de consola.
        System.out.print("\033[H\033[2J"); System.out.flush();

        //Obtenemos la opcion a ejecutar.
        System.out.println("Este programa efectúa las operaciones matematicas basicas para dos numeros.\nPresione ENTER para continuar."); DatoIng.nextLine();
        System.out.print("Digita el primer numero: "); double n1 = DatoIng.nextDouble();
        System.out.print("Digita el segundo numero: "); double n2 = DatoIng.nextDouble();
        System.out.print("Operación ( + - * / ^ )?\n"); char op = DatoIng.next().charAt(0);

        switch (op) {
            //Proceso para la suma.
            case '+':
            System.out.printf("n1 + n2 = %.2f", n1 + n2);
            break;

            //Proceso para la resta.
            case '-':
            System.out.printf("n1 - n2 = %.2f", n1 - n2);
            break;

            //Proceso para la multiplicacion.
            case '*':
            System.out.printf("n1 * n2 = %.2f", n1 * n2);
            break;

            //Proceso paea la divicion.
            case '/':
            System.out.printf("n1 / n2 = %.2f", n1 / n2);
            break;

            //Proceso para la potenciacion.
            case '^':
            System.out.printf("n1 elevado a n2 = %.2f", Math.pow(n1, n2));
            break;

            //Mostramos mensaje si la opcion es erronea.
            default:
            System.out.printf("\nOperación Inválida ...");
            break;
        }
        System.out.println("\n\nProceso terminado ...");
        DatoIng.close();
    }
}