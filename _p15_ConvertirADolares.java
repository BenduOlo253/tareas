//Alumno: Jose Manuel Roberto Badillo.
//Descripción: Crear un programa que convierta una determinada cantidad de pesos mexicanod a dolares estadounidenses.

import java.util.Scanner;
public class _p15_ConvertirADolares{
    public static void main(String[] args) {
        //Limpiamos pantalla de consola.
        System.out.print("\033[H\033[2J"); System.out.flush();

        //Declaramos variables.
        double psmxn, dlrs;
        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        //Obtenemos los datos.
        System.out.println("Este programa convierte una cantidad determinada de pesos mexicanos a dolares estadounidenses.\nPresione ENTER para continuar");
        DatoIng.nextLine();
        System.out.println("Digite la cantidad de pesos: "); psmxn = DatoIng.nextFloat();
        
        //Hacemos la conversion.
        dlrs = psmxn/16.18;

        //Mostramos resultados en pantalla.
        System.out.printf("La cantidad de %.2f pesos mexicanos equivale a %.2f dolares estadounidenses.", psmxn, dlrs);
    }
}