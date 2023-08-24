//Alumno: Jose Manuel Roberto Badillo.
//Descripcion: Crear un programa que logre dividir un numero de 3 cifras en centenas, decimas y unidades.

import java.util.Scanner;
public class _p09_Dividir_En_Cifras{
    public static void main(String[] args) {
        //Limpiamos pantalla de la consola.
        System.out.print("\033[H\033[2J"); System.out.flush();

        //Declaramos variables.
        int units, cent, dec, num;

        //Creamos la entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        //Obtencion de datos.
        System.out.println("Dame un numero entero de 3 cifras: ");
        num = DatoIng.nextInt();
        cent = num / 100 ;
        dec = ( num - cent * 100) / 10 ;
        units = ( num - (cent * 100 + dec * 10) );

        //Se muestran los resultados en pantalla.
        System.out.println("El nuemero introducido fue : " + num);
        System.out.println("Centenas : " + cent);
        System.out.println("Decenas : " + dec);
        System.out.println("Unidades : " + units);
    }
}