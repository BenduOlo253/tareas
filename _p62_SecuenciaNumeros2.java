//Alumno: Jose Manuel Roberto Badillo.
//Descripcion: Crear un programa que imprima una secuencia de numeros el numero de renglones que el usuario desee.

import java.util.Scanner;

public class _p62_SecuenciaNumeros2 {
    public static void main(String[] args) {
        //Declaramos variables.
        int i, j;
        char res;

        //Creamos una entrda de datos.
        Scanner DatoIng = new Scanner(System.in);

        do{
            //Se limpia la pantalla de la consola.
            System.out.print("\033[H\033[2J"); System.out.flush();

            //Obtencion de datos.
            System.out.println("Este programa imprime una secuencia de numeros en una cantidad de renglones n.\n");
            System.out.println("Ingrese el numero de renglones a usar: "); int canReg = DatoIng.nextInt();

            //Establecesmos el proceso a seguir.
            for(i = 1; i <= canReg; i++ ){
                for(j = 1; j <= i; j++){
                    System.out.printf("%d ", j);
                }
                System.out.println("\n");
            }

            //Damos al usuario la opcion de reiniciar el programa.
            System.out.print("\nDeseas continuar (S/N)? "); res = Character.toUpperCase(DatoIng.next().charAt(0));
        }while(res != 'N');
        System.out.println("\n\nGracias por usar nuestro programa!!!");
        DatoIng.close();
    }    
}
