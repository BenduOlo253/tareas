//Alumno: Jose Manuel Roberto Badillo.
//Descripción: Crear un programa que convierta una determinada cantidad de dolares estadounidenses a pesos mexicanos.

import java.util.Scanner;
public class _p15_ConvertirADolares{
    public static void main(String[] args) {
        //Limpiamos pantalla de consola.
        System.out.print("\033[H\033[2J"); System.out.flush();

        //Declaramos variables.
        float dlrs;
        double psmxn;
        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        //Obtenemos los datos.
        System.out.println("Este programa convierte una cantidad determinada de dolares estadounidenses a pesos mexicanos.\nPresione ENTER para continuar");
        DatoIng.nextLine();
        System.out.println("Digite la cantidad de dolares: "); dlrs = DatoIng.nextFloat();
        
        //Hacemos la conversion.
        psmxn = dlrs*16.81;

        //Mostramos resultados en pantalla.
        System.out.printf("La cantidad de %.2f dolares estadounidenses equivale a %.2f pesos mexicanos.",dlrs, psmxn);
        

    }
}