//Alumno: Jose Manuel Roberto Badillo.
//Crear un programa que imprima una tabla de conversion de pesos a dolares.

import java.util.Scanner;
public class _p46_TablaConversión {
    public static void main(String[] args) {
        //Declaramos variables.
        int numInicial, numFinal, contador;
        float tc = 19.99f;
        char resp;

        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        do {
            //Limpiamos la pantalla de la consola.
            System.out.print("\033[H\033[2J");System.out.flush();

            System.out.println("Este programa imprime una tabla de conversion de pesos a dolares.\nPresione ENTER para continuar.");
            DatoIng.nextLine();
            do {
                //Obtencion de datos.
                System.out.print("Inicio : "); numInicial = DatoIng.nextInt();
                System.out.print("numFinal : "); numFinal = DatoIng.nextInt();
            } while( numFinal < numInicial );

            //Imprimimos los resultados.
            contador = numInicial;
            System.out.println("Peso\tDolar");
            while( contador<=numFinal ) {
                System.out.printf("%d\t%.2f\n", contador, contador/tc);
                contador++;
            }
            //Damos la opcion de reiniciar el programa.
            System.out.print("\nDeseas continuar (S/N) ? "); resp = Character.toUpperCase(DatoIng.next().charAt(0));
        } while( resp != 'N');
        System.out.println("\nGracias por utilizar este programa !");
        DatoIng.close();
    }
}