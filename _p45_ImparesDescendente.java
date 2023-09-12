//Alimno: Jose Manuel Roberto Badillo.
//Crear un programa que imprima los numeros impares de forma descendiente hasta el 1.

import java.util.Scanner;
public class _p45_ImparesDescendente {
    public static void main(String[] args) {
        //Declaramos variables.
        int numInicial,contador,suma;
        char resp;

        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        do {
            //Limpiamos la pantalla de la consola.
            System.out.print("\033[H\033[2J");System.out.flush();

            //Obtenemos datos.
            System.out.println("Este programa imprime los numeros impares de forma descendiente hasta el numero uno.");
            DatoIng.nextLine();
            System.out.print("¿Desde que numero? "); numInicial = DatoIng.nextInt();

            //Establecemos el numero inicial.
            suma = 0; contador = ( numInicial%2 == 0 ? --numInicial : numInicial);
            while( contador>=1 ) {
                //Imprimimos los numeros.
                System.out.printf("%d ",contador);
                suma += contador;
                contador -= 2;
            }

            //Mostramos los resultados.
            System.out.printf("\nLa suma es %d",suma);

            //Plantemos la opcion de reiniciar el programa.
            System.out.print("\nDeseas continuar (S/N) ? "); resp =
            Character.toUpperCase(DatoIng.next().charAt(0));
        } while( resp != 'N' );
    System.out.println("\nGracias por utilizar este programa !");
    DatoIng.close();
    }
}