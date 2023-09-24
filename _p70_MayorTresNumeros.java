//Alumno: Jose Manuel Roberto Badillo.
//Descripcion: Crear un programa que calcule e imprime el mayor de tres numeros.

import java.util.Scanner;
public class _p70_MayorTresNumeros {
    //Declaramos las funciones a utilizar.
    public static float Mayor(float n1,float n2,float n3) {
        float may=0;
        if( n1>n2 && n1>n3 ) may=n1;
        else if( n2>n1 && n2>n3 ) may=n2;
        else if( n3>n1 && n3>n2 ) may=n3;
        return may;
    }
    public static void main(String[] args) {
        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        //Limpiamos la pantalla de la consola.
        System.out.print("\033[H\033[2J");System.out.flush();

        //Obtencion de datos.
        System.out.print("Dame tres numeros separados por espacio ? ");
        float n1 = DatoIng.nextFloat(); float n2 = DatoIng.nextFloat(); float n3 = DatoIng.nextFloat();

        //Damos a conocer los resultados.
        System.out.printf("\nEl mayor de los tres números es : %.2f",Mayor(n1,n2,n3));
        System.out.println("\n\nGracias por usar nuestro programa!!!");
        DatoIng.close();
    }
}