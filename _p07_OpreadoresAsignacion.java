//Alumno: Jose Manuel Roberto Badillo.
//Descripción: Crear un programa donde se apliquen los operadores de asignacion.

import java.util.Scanner;
public class _p07_OpreadoresAsignacion {
    public static void main(String[] args) {
        //Declaramos variables.
        float num;

        //Creamos una entrada de datos.
        Scanner datoIng = new Scanner(System.in);

        //Se limpia la consola.
        System.out.print("\033[H\033[2J"); System.out.flush();

        //Obtenemos datos.
        System.out.print("Dame un numero ? ");
        num = datoIng.nextFloat();

        //Mostramos resultados.
        System.out.printf("El numero original es : %.2f \n", num);
        System.out.printf("Incremantar 1 : %.2f \n", ++num);
        System.out.printf("Sumar 80 : %.2f \n", num+=80);
        System.out.printf("Restar 35 : %.2f \n", num-=35);
        System.out.printf("Multiplicar por 15 : %.2f \n", num*=15);
        System.out.printf("Dividir entre 4 : %.2f \n", num/=4);
        System.out.printf("Decrementar 1 : %.2f \n", --num);
    }
}
