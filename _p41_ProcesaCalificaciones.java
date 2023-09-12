//Alumno: Jose Manuel Roberto Badillo.
//Descripción: Crear un programa que procese calificaciones, calcula la suma y el promedio.

import java.util.Scanner;
public class _p41_ProcesaCalificaciones {
    public static void main(String[] args) {
        //Se declaran variables.
        float calif,suma, prom;

        //Se crea una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        //Se determina el valor de las variables.
        calif=suma=prom=0;

        //Se limpia la pantalla de la consola.
        System.out.print("\033[H\033[2J");System.out.flush();


        System.out.println("Este programa puede procesar la cantidad de calificaciones que usted ingrese.\nPresione ENTER para continuar.\n"); DatoIng.nextLine();
        System.out.print("Ingrese la cantidad de calificaciones que desea procesar: "); int n = DatoIng.nextInt();
        int c = 1;
        
        //Calculamos la suma de las calificaciones.
        while( c <= n ) {
            System.out.printf("Ingrese la calificacion no.%d ",c++);
            calif = DatoIng.nextFloat();
            suma += calif;
        }
        prom = suma / n;
        System.out.printf("La suma es : %.2f\n", suma);
        System.out.printf("El promedio es : %.2f\n", prom);
        DatoIng.close();
    }
}