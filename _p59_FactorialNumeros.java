//Alumno: Jose Manuel Roberto Badillo.
//Descripcion: Crear un programa que calcule el factorial de n números.

import java.util.Scanner;
    public class _p59_FactorialNumeros {
    public static void main(String[] args) {
        //Declaramos las variables.
        int i,j,f;
        char resp;

        //Creamos una entrda de datos.
        Scanner DatoIng = new Scanner(System.in);

        do {
            //Limpiamos la ventana de la consola.
            System.out.print("\033[H\033[2J");System.out.flush();

            //Obtencion dea datos.
            System.out.println("Este programa calcula el factorial de los numeros que usted ingrese.\n");
            System.out.print("Ingrese la cantidad de numeros a calcular su factorial: "); int canNum = DatoIng.nextInt();

            //Establecemos el proceso a seguir.
            for(i=1; i<=canNum; i++) {
                System.out.printf("%d!=",i);
                f=1;
                for(j=1; j<=i; j++) {
                    f *= j;
                }
                System.out.println(f);
            }

            //Damos la opcion al usuario de reiniciar el programa.
            System.out.print("\nDeseas continuar (S/N) ?");
            resp=Character.toUpperCase(DatoIng.next().charAt(0));
        } while( resp!= 'N');
        System.out.println("\nProceso terminado ..");
        DatoIng.close();
    }
}