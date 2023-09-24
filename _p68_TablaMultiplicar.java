//Alumno: Jose Manuel Roberto Badillo.
//Descripcion: Crear un programa que imprima una tabla de multiplicar.

import java.util.Scanner;
public class _p68_TablaMultiplicar {
    //Declaramos las funciones a utilizar.
    public static void Tabla(int tabla, int Rango) {
        System.out.printf("\nTabla del %d\n",tabla);
        for(int i=1; i <= Rango; i++)

        System.out.printf("%d x %d = %d\n",tabla,i,tabla*i);

    }
    public static void main(String[] args) {
        //Declaramos variavbles
        char res;

        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        do{
            //Limpiamos la pantalla de la consola.
            System.out.print("\033[H\033[2J");System.out.flush();

            //Obtencion de datos.
            System.out.println("Este programa imprime la tabla de multiplicar a su deseo asi como el rango que la misma va a tener.\n");
            System.out.print("Ingrese el numero del cual quiere imprimir la tabla de multiplicar: "); int tabla = DatoIng.nextInt();
            System.out.print("Ingrese el rango que va a tener la tabla: "); int rango = DatoIng.nextInt();
            Tabla(tabla, rango);

            //Damos al usuario la opcion de reiniciar el programa.
            System.out.println("¿Desea reiniciar el programa? (S/N)"); res = Character.toUpperCase(DatoIng.next().charAt(0));            
        }while(res != 'N');
        System.out.println("\n\nGracias por usar nuestro programa!!!");
        DatoIng.close();
        

    }
}