//Alimno: Jose Manuel Roberto Badillo.
//Descripción: Crear un programa que convierta un número entero de entre 1 y 10 a número romano.

import java.util.Scanner;
public class _p31_NumerosRomanos {

    public static void main(String[] args) {
        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        //Limpiamos pantalla de la consola.
        System.out.print("\033[H\033[2J"); System.out.flush();

        //Obtenemos datos.
        System.out.println("Este programa convierte un numero entero del 1 al 10 en numero romano.\nPresione ENTER para continuar.");
        System.out.print("Digite el numero: "); int dia = DatoIng.nextInt();

        //Establecemos las opciones.
        switch (dia) {
            //Mostramos en pantalla el respectivo simbolo, dependiendo de la opcion que haya ingresado el usuario.
            case 1 : System.out.println("I");break;
            case 2 : System.out.println("II");break;
            case 3 : System.out.println("III");break;
            case 4 : System.out.println("IV");break;
            case 5 : System.out.println("V");break;
            case 6 : System.out.println("VI");break;
            case 7 : System.out.println("VII");break;
            case 8 : System.out.println("VIII");break;
            case 9 : System.out.println("IX");break;
            case 10 : System.out.println("X");break;

            //En caso de no haber coincidencia, se muestra un mensaje de error.
            default : System.out.println("Número inválido !!!");break;
        }
        System.out.println("\n\nProceso terminado ...");
        DatoIng.close();
    }
}