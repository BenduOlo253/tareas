//Alumno: Jose Manuel Roberto Badillo.
//Descripcion: Crear un programa que calcule la suma de los digitos de un numero entero.

import java.util.Scanner;
public class _p71_SumaDigitos {
    //Declaramos las funciones a utilizar.
    public static int SumaDigitos(int n) {
        int suma=0, digito;
        while( n!= 0) {
            digito = n % 10;
            n = n / 10 ;
            suma+=digito;
        }
        return suma;
    }
        public static void main(String[] args) {
            //Declaramos las variables.
        int numero;

        //Se crea una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        //Se limpia la pantalla de la consola.
        System.out.print("\033[H\033[2J");System.out.flush();

        //Obtencion de datos.
        System.out.print("Dame un número ? "); numero = DatoIng.nextInt();
        System.out.printf("\nLa suma de digitos es : %d",SumaDigitos(numero));
        System.out.println("\n\nGracias por usar nuestro programa!!!");
        DatoIng.close();
    }
}