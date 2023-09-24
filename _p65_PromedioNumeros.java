//Alumno: Jose Manuel Roberto Badillo.
//Descripcion: Crear un programa que calcule el promedio de tres números usando una función.

import java.util.Scanner;
public class _p65_PromedioNumeros {
    //Declaramos la funcion a utilizar.
    public static float promedio(float n1, float n2, float n3) {
        float suma = n1 + n2 + n3;
        return suma/4;
    }
    public static void main(String[] args) {
        //Declaramos variables.
        char res;

        //Creamos una entrada de datos
        Scanner DatoIng = new Scanner(System.in);

        do{
            //Limpiamos la ventana de la consola.
            System.out.print("\033[H\033[2J");System.out.flush();

            //Obtencion de datos.
            System.out.println("Este programa calcula el promedio de tres numeros ingresados.\n");
            System.out.print("Ingresa el primer numero : "); float n1 = DatoIng.nextFloat();
            System.out.print("Ingresa el segundo numero : "); float n2 = DatoIng.nextFloat();
            System.out.print("Ingresa el tercer numero : "); float n3 = DatoIng.nextFloat();

            //Se calcula el promedio.
            float prom = promedio(n1, n2, n3);

            //Mostramos resultados.
            System.out.printf("\nEl promedio de %.2f, %.2f y %.2f es: %.2f",n1, n2, n3, prom);    

            //Damos la opcion al usuario de reiniciar el programa.
            System.out.println("¿Desea reiniciar el programa? (S/N)"); res = Character.toUpperCase(DatoIng.next().charAt(0));
        }while(res != 'N');
        System.out.println("\n\nGracias por usar nuestro programa!!!");
        DatoIng.close();
    }
}