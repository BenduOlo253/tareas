//Alumno: Jose Manuel Roberto Badillo.
//Descripción: Crear un programa que imprima la tabla de multiplicar que el usuario pida, desde 1 hasta n.

import java.util.Scanner;
public class _p42_TablasMultiplicar{
    public static void main(String[] args) {
        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        //Limpiamos la pantalla de la consola.
        System.out.print("\033[H\033[2J");System.out.flush();

        //Se obtienen los datos.
        System.out.println("Este programa imprime la tabla del numero que usted desee y hasta donde desee.\nPresione ENTER para continuar."); DatoIng.nextLine();
        System.out.print("Ingrese el numero del que se le va a imprimir su tabla de multiplicar: "); int tab = DatoIng.nextInt();
        System.out.print("¿Hasta donde? "); int lim = DatoIng.nextInt();
        int c = 1;

        //Se imprime la tabla.
        while( c <= lim ) {
            System.out.printf("%d x %d = %d\n", tab, c, tab*c); c++;
        }
        System.out.println("\nProceso terminado ...");
        DatoIng.close();
    }
}