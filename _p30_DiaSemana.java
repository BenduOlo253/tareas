//Alumno: Jose Manuel Roberto Badillo.
//Crear un numero que, dado un numero entre 1 y 7 imprima un respectivo dia de la semana.

import java.util.Scanner;
public class _p30_DiaSemana {
    public static void main(String[] args) {
        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        //Limpiamos pantalla de consola.
        System.out.print("\033[H\033[2J"); System.out.flush();

        //Obtenemos datos.
        System.out.println("Este programa muestra un día de la semana, dependiendo del número que usted ingrese.\nPresione ENTER para continuar."); DatoIng.nextLine();
        System.out.print("Dame el día con número? ");
        int dia = +DatoIng.nextInt();

        //Establecemos las opciones.
        switch (dia) {
            //Dependiendo de la elección del usuario, mostrar un día de la semana.
            case 1 : System.out.println("Lunes");break;
            case 2 : System.out.println("Martes");break;
            case 3 : System.out.println("Miércoles");break;
            case 4 : System.out.println("Jueves");break;
            case 5 : System.out.println("Viernes");break;
            case 6 : System.out.println("Sábado");break;
            case 7 : System.out.println("Domingo");break;

            //En caso de no coincidri con nunguna opcion mandará un mensaje de error.
            default : System.out.println("Día inválido, en que día vives !!!");break;
        }
        System.out.println("\n\nProceso terminado ...");
        DatoIng.close();
    }
}