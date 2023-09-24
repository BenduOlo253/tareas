//Alumno: Jose Manuel Roberto Badillo.
//Descripcion: Crear un programa que califique una calificacion mediante una jerarquia de letras.

import java.util.Scanner;
public class _p69_CalificacionLetra {
    //Declaramos las funciones a utilizar.
    public static char CalifLetra(float cal) {
        char letra=' ';
        if(cal>=90&&cal<=100)
        letra='A';
        else if(cal>=80&&cal<90)
        letra='B';
        else if(cal>=70&&cal<80)
        letra='C';
        else if(cal>=60&&cal<70)
        letra='D';
        else if(cal>=0&&cal<60)
        letra='F';

        return letra;
    }
    public static void main(String[] args) {
        //Declaramos las variables.
        float cal;
        char letra, res;

        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        do{
            //Limpiamos la ventana de la consola.
            System.out.print("\033[H\033[2J");System.out.flush();

            //Obtencion de datos.
            do {
                System.out.println("Este programa determina que letra de calificacio obtendrias");
                System.out.print("Dame tu calificacion (0-100) ? ");
                cal = DatoIng.nextFloat();
            } while(cal<0 || cal>100);
            letra = CalifLetra(cal);
            System.out.printf("\nTu calificación de %.2f en letra es %c", cal,letra);  

            //Damos la opcion al usuario de reiniciar el programa.
            System.out.println("¿Desea reiniciar el programa? (S/N)"); res = Character.toUpperCase(DatoIng.next().charAt(0));
        }while(res != 'N');
        System.out.println("\n\nGracias por usar nuestro programa!!!");
        DatoIng.close();

    }
}
