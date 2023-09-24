//Alumno: Jose Manuel Roberto Badillo.
//Descripcion: Crear un programa que haga la conversion de temperaturas usando funciones.

import java.util.Scanner;
public class _p66_ConversionTemperaturas {
    //Definimos las funciones a usar.
    public static float Farenheit(float t) {
        return (t*9/5)+32;
    }

    public static float Celcius(float t) {
        return (t-32)*5/9;
    }
    public static void main(String[] args) {
        //Declaramos las variables.
        float res, temp;
        int op;

        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        do{
            //Limpiamos la pantalla de la consola.
            System.out.print("\033[H\033[2J");System.out.flush();
            //Obtencion de datos.
            System.out.println("Este programa puede hacer la conversion de celcius a fahrenheit y viseversa.\n");
            System.out.print("[1] farenheit\n[2] celcius\n[3] Salir. \nDigita tu opcion:  "); op = DatoIng.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Dame la temperatura ? "); temp = DatoIng.nextFloat();
                    res = Farenheit(temp);
                    System.out.printf("\n%.2f grados celcius equivale a %.2f grandos farenheit ..", temp, res);
                    System.out.println("\nPresione <ENTER> para continuar."); DatoIng.nextLine(); DatoIng.nextLine();
                    break;
                case 2:
                    System.out.print("Dame la temperatura ? "); temp = DatoIng.nextFloat();
                    res = Celcius(temp);
                    System.out.printf("\n%.2f grados farenheit equivale a %.2f grandos celcius ..", temp, res);
                    System.out.println("\nPresione <ENTER> para continuar."); DatoIng.nextLine(); DatoIng.nextLine();
                    break;
                
                case 3:
                    System.out.println("\n\nGracias por usar nuestro programa!!!");
                    DatoIng.close();              
                    break;

                default:
                    System.out.println("Opción inválida");
                    System.out.println("\nPresione <ENTER> para continuar."); DatoIng.nextLine(); DatoIng.nextLine();
                    break;
            }
        }while(op != 3);
    }
}