//Alumno: Jose Manuel Roberto Badillo.
//Descripcion: Crear un programa que imprima los numeros pares de forma ascendente.

import java.util.Scanner;
public class _p44_ParesAscendente {
    public static void main(String[] args) {
        //Se declaran variables.
        int lim,contador,suma;
        char resp;

        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        do {
            //Limpiamos la pantalla de la consola.
            System.out.print("\033[H\033[2J");System.out.flush();

            //Obtencion de datos.
            System.out.println("Este programa imprime unicamente los numeros pares de forma ascendente.\n");
            DatoIng.nextLine();
            System.out.print("Hasta que numero quieres que llegue la lista?  "); lim = DatoIng.nextInt();
            suma=0;contador=2;

        while( contador<=lim ) {
            System.out.printf("%d ",contador);
            suma += contador;
            contador += 2;
        }
        //Preguntamos al usuario si desea reiniciar el programa.
        System.out.printf("\nLa suma es %d",suma);
        System.out.print("\nDeseas continuar (S/N) ? "); resp =
        Character.toUpperCase(DatoIng.next().charAt(0));
        } while( resp != 'N' );
        System.out.println("\nGracias por utilizar este programa !");
        DatoIng.close();
    }
}