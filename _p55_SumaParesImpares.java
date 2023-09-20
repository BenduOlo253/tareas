//Alumno: Jose Manuel Roberto Badillo.
//Descripcion: Crear un programa que contenga dos programas, uno donde imprima los impares ascendente y otro donde se imprima los pares de forma ascendente, usando el ciclo for.

import java.util.Scanner;
public class _p55_SumaParesImpares {
    public static void main(String[] args) {
        //Declaramos variables.
        int numIng, suma, op;

        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        do {
            //Limpiamos la pantalla de la consola.
            System.out.print("\033[H\033[2J");System.out.flush();

            //Obtenemos datos.
            System.out.println("Impares ascendente .... [ 1 ]");
            System.out.println("Pares descentente...... [ 2 ]");
            System.out.println("Salir ................. [ 3 ]");
            System.out.print("Ingrese su eleccion: "); op = DatoIng.nextInt();

            //Establecemos las opciones y sus procesos.
            switch(op) {
                case 1:
                    suma = 0;
                    System.out.println("\nImprime los numeros impares de forma ascendente y su suma:");
                    System.out.print("Ingrese el limite de la impresión: "); numIng = DatoIng.nextInt();
                    for(int i=1; i<=numIng; i+=2) {
                        System.out.printf("%d ",i);
                        suma += i;
                    }
                    System.out.printf("\nLa suma de impares es: %d", suma);
                    break;

                case 2:
                    suma = 0;
                    System.out.println("\nImprime los numeros pares de forma descendente y su suma:");
                    System.out.print("Ingrese el limite de la impresión: "); numIng = DatoIng.nextInt();
                    numIng = ( numIng%2==0 ? numIng : --numIng);
                    for(int i=numIng; i>=1; i-=2) {
                        System.out.printf("%d ",i);
                        suma += i;
                    }
                    System.out.printf("\nLa suma de impares es: %d", suma);
                    break;

                case 3:
                    System.out.println("\n!Gracias por usar nuestro programa¡");
                    break;

                default:
                    System.out.println("\nOpcion Invalida");
                    break;
            }
            System.out.println("\nPresiona <Enter> para continuar"); DatoIng.nextLine();DatoIng.nextLine();
        } while( op != 3);
        System.out.println("\nProceso Terminado ....");
        DatoIng.close();
    }
}