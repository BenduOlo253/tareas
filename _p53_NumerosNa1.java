//Alumno: Jose Manuel Roberto Badillo.
//Descrpipcion: Crear un programa que imprima los numeros de n a 1.

import java.util.Scanner;
public class _p53_NumerosNa1 {
    public static void main(String[] args) {
        //Declaramos variables.
        char res;

        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        do{
            //Limpiamos la terminal.
            System.out.print("\033[H\033[2J");System.out.flush();

            //Establecemos el proceso a seguir.
            System.out.println("Este programa imprime los numeros de n a 1. ");

            //Pedimos datos.
            System.out.print("Digite el numero donde va a comenzar la impresión: "); int numFin = DatoIng.nextInt();
            System.out.print("¿Con que paso va a imprimir los numeros? "); int paso = DatoIng.nextInt();

            //En caso de que el numero ingresado sea negativo se crea un proceso especializado para esa ocacion.
            if(numFin<0){
                for(int i=numFin; i<=0; i+=paso) {
                    System.out.printf("%d ",i);                
                }
            }
            else{
                for(int i=numFin; i>=0; i-=paso) {
                    System.out.printf("%d ",i);
                }
            }
            //Damos la opcion al usuario de reiniciar el programa.
            System.out.println("\n¿Desea reiniciar el programa? (S/N)."); res = Character.toUpperCase(DatoIng.next().charAt(0));
        }while(res != 'N');
        System.out.println("\n\nGracias por usar nuestro programa!!!");        
        DatoIng.close();
    }
}