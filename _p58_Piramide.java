//Alumno: Jose Manuel Roberto badillo.
//Descripcion: Crear un programa que imprima una pirámide de algún caracer elegido por el usuario.

import java.util.Scanner;
public class _p58_Piramide {
    public static void main(String[] args) {
        //Declaramos variables.
        int i,j;
        char res;

        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        do {
            //Limpiamos la pantalla de la consola.
            System.out.print("\033[H\033[2J");System.out.flush();

            //Obtencion de datos.
            System.out.println("Este programa imprime una priamide de n renglones con un caracter a us eleccion.\n");
            System.out.print("Digite el tamaño de la piramide: "); int TamIng = DatoIng.nextInt();
            System.out.print("¿Que caracter va a componer la piramide? "); char car = DatoIng.next().charAt(0);

            //Establecesmo el proceso a seguir.
            for(i=1; i<=TamIng; i++) {
                for(j=1; j<=i; j++) {
                    System.out.print(car);
                }
                System.out.println();
            }

            //Damos al usuario la opcion de reiniciar el programa.
            System.out.print("\nDeseas continuar (S/N) ?"); res=Character.toUpperCase(DatoIng.next().charAt(0));
        } while( res!= 'N');
        System.out.println("\nProceso terminado ...");
        DatoIng.close();
    }
}