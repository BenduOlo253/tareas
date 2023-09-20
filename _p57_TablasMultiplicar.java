//Alumno: Jose Manuel Roberto Badillo.
//Descripvion: crear un programa que imprima las tablas de multiplicar con de 1 a n hasta la del n.

import java.util.Scanner;
public class _p57_TablasMultiplicar {
    public static void main(String[] args) {
        //Declararamos variables.
        int i, j;
        char resp;

        //Creamos una etrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        do {
            //Limpiamos la pantalla de la consola.
            System.out.print("\033[H\033[2J");System.out.flush();

            //Obtenemos datos.
            System.out.print("Hasta que tabla ? "); int n = DatoIng.nextInt();
            System.out.print("Hasta donde ? "); int m = DatoIng.nextInt();

            //Imprimimos las tablas de multiplicar.
            for(i=1; i<=n; i++) {
                System.out.printf("Tabla del %d\n",i);
                for(j=1; j<=m; j++) {
                    System.out.printf("%d x %d = %d\n",i,j,i*j);
                }
            }

            //Damos la opcion al usuario de reiniciar el programa.
            System.out.print("\nDeseas continuar (S/N) ?");resp=Character.toUpperCase(DatoIng.next().charAt(0));
        } while( resp!= 'N');
        System.out.println("\nProceso terminado ..");
        DatoIng.close();
    }
}