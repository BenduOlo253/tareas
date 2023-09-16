//Alumno: Jose Manuel Roberto Badillo.
//Descripcion: Crear un programa que imprima los primeros n numeros de la serie Fibonacci.

import java.util.Scanner;
public class _p51_SerieFibonacci {
    public static void main(String[] args) {
        //Creamos variables.
        int contador, Lim, Fn1, Fn2, Fn3;
        char res;

        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        do{
            //Establecemos valores a variables.
            Fn1 = 0;
            Fn2 = 1;
            contador = 3;

            //Limpiamos la pantalla de la consola.
            System.out.print("\033[H\033[2J");System.out.flush();

            //Obtenemos datos.
            System.out.println("Este programa imprime los numeros de Fibonacci hasta donde usted indique.\n\n");
            System.out.println("Ingrese el valor máximo: "); Lim = DatoIng.nextInt();
            System.out.print("La sucesión es: \n0  1 ");

            //Establacemos el proceso a seguir.
            do{
                Fn3 = Fn1 + Fn2;
                System.out.printf(" %d ", Fn3);
                Fn1 = Fn2;
                Fn2 = Fn3;
                contador++;
            }while(contador<=Lim);
            
            //Damos la opcion al usuario de reiniciar el programa.
        System.out.println("\n¿Desea reiniciar el programa? (S/N)."); res = Character.toUpperCase(DatoIng.next().charAt(0));
        }while(res != 'N');
        System.out.print("\n\nGracias por usar nuestro programa!!");
        DatoIng.close();
    }
}
