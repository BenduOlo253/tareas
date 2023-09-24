//Alumno: Jose Manuel Roberto Badillo.
//Descripcion: Crear un programa que calcule e imrima el factorial de un número.

import java.util.Scanner;
public class _p73_Factorial {
    public static double Factorial(int n) {
        double f=1;
        for(int i=1; i <= n; i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        //Limpiamos la pantalla de la consola.
        System.out.print("\033[H\033[2J");System.out.flush();

        //Obtencion de datos.
        System.out.print("Dame un numero ? ");
        int n = new Scanner(System.in).nextInt();
        System.out.printf("\nEl factorial de %d es %.0f", n, Factorial(n) );
        System.out.println("\n\nGracias por usar nuestro programa!!!");
    }
}