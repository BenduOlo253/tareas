//Alumno: Jose Manuel Roberto Badillo.
//Descripción: Crear un programa que le pida al usuario una opcion y dependiendo de la opcion que elija, mostrar el nombre de un continente en particular.

import java.util.Scanner;
public class _p35_ContinentesMundo {
    public static void main(String[] args) {
        //Se crea una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        //Se limpia la pantalla de la consola.
        System.out.print("\033[H\033[2J"); System.out.flush();

        //Obtencion de datos.
        System.out.println("Este programa te dará a escojer entre los 6 continentes.\nPresione ENTER para continuar\n"); DatoIng.nextLine();
        System.out.println("Para elegir a América presione 1.\nPara elegir a África presione 2.\nPra elegir a la Antarida presione 3.\nPara elegir a Asia presione 4.\nPara elegir a Europa presione 5\nPra elegir a Oceanía, presióne 6");

        int op = DatoIng.nextInt();  
        switch (op) {
            case 1:
                System.out.println("Usted ha elegido el continente Americano llamado América."); 
                break;
            case 2:
                System.out.println("Usted ha elegido el continente Africano llamado África.");
                break;
            case 3:
                System.out.println("Usted ha elegido el continente Antártico llamado Antártida.");
                break;
            case 4:
                System.out.println("Usted ha elegido el continente Asiatico llamado Asia.");
            case 5:
                System.out.println("Usted ha elegido el continente Europeo llamado Europa.");
                break;
            case 6:
                System.out.println("Usted ha elegido el continente llamado Oceanía.");
                break;
            default:
                System.out.println("La opcion que usted ha ingresado no existe.");
                break;
        }
        DatoIng.close();
    }
}
