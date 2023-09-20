//Alumno: Jose Manuel Roberto Badillo.
//Descriçion: Crear un programaq que calcule la suma de canNum términos de factorial.

import java.util.Scanner;
public class _p60_SumaTerminos {
    public static void main(String[] args) {
        //Declaramos variables.
        int i,j;
        float f, r;
        char res;

        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        do {
            //Limpiamos la ventana de la consola.
            System.out.print("\033[H\033[2J");System.out.flush();

            //Asignamos valores.
            r=0;

            //Obtencion de datos.
            System.out.print("Cuantos números ? "); int canNum = DatoIng.nextInt();

            //Establecemos el proceso de calculo.
            for(i=1; i<=canNum; i++) {
                f=1;
                for(j=1; j<=i; j++) {
                    f *= j;
                }
                System.out.printf(" 1 / %,.2f +",f);
                r += (1 / f);
            }

            //Mostramos resultados.
            System.out.printf("= %,.2f\n",r);

            //Damos al usuario la opcio de reiniciar el programa.
            System.out.print("\nDeseas continuar (S/N)? "); res=Character.toUpperCase(DatoIng.next().charAt(0));
        } while( res != 'N');
        System.out.println("\nProceso terminado ...");
        DatoIng.close();
    }
}