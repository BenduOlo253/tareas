//Alumno: Jose Manuel Roberto Badillo.
//Descripcion: Crear que un programa que imprima un cuadro de r x c del caracter especificado, usando una función.

import java.util.Scanner;
public class _p74_CuadroCaracter {
    //Definimos las funciones a utilizar.
    public static void Cuadro(int ren, int col, char car) {
        for(int i=1;i<=ren;i++) {
            for(int j=1;j<=col;j++){
                System.out.printf("%c ",car);

                System.out.println();            
            }
        }
    }
    public static void main(String[] args) {
        //Declaramos las variables.
        int ren, col;
        char car;

        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        //Limpiamos la pantalla de la consola.
        System.out.print("\033[H\033[2J");System.out.flush();

        //Obtencion de datos.
        System.out.print("Renglones ? "); ren = DatoIng.nextInt();
        System.out.print("Columnas ? "); col = DatoIng.nextInt();
        System.out.print("Caracter ? "); car = Character.toUpperCase(DatoIng.next().charAt(0));
        Cuadro(ren,col,car);
        System.out.println("\n\nGracias por usar nuestro programa!!!");
        DatoIng.close();
    }
}