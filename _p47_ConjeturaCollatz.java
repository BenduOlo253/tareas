//Alumno: Jose Manuel Roberto Badillo.
//Descripcion: Crear un programa que plantee la conjetura de collatz.

import java.util.Scanner;
public class _p47_ConjeturaCollatz {
    public static void main(String[] args) {
        //Declaramos variables.
        int numeroInicial;
        char resp;

        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        do {
            //Limpiamos la pantalla de la consola.
            System.out.print("\033[H\033[2J");System.out.flush();

            System.out.println("Imprime la conjetura de collatz para un número entero positivo\n");
            do {
                //Obtencion de datos.
                System.out.print("Digite cualquier numero entero positivo: "); numeroInicial = DatoIng.nextInt();
            } while( numeroInicial < 0);
            do {
                //Aplicamos la conjetura.
                System.out.printf("%d ",numeroInicial);
                if( numeroInicial%2 == 0) numeroInicial /= 2;
                else numeroInicial = numeroInicial*3 + 1;

            } while(numeroInicial != 1);
            System.out.printf("%d ", numeroInicial);

            //Planteamos la opcion de reiniciar el programa.
            System.out.print("\nDeseas continuar (S/N) ? ");resp = Character.toUpperCase(DatoIng.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nGracias por utilizar este programa !");
        DatoIng.close();
    }
}