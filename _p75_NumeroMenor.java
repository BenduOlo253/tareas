//Alumno: Jose Manuel Roberto Badillo.
//Descripcion: Crear un programa que pida cuatro numeros e imprima el menor de ellos.

import java.util.Scanner;
public class _p75_NumeroMenor {
    //Declaramos las funciones a usar.
    public static String menor(int n1, int n2, int n3, int n4) {
        String menor;
        if(n1<n2 && n1<n3 && n1< n4) menor = Integer.toString(n1);
        else if(n2<n1 && n2<n3 && n2<n4) menor = Integer.toString(n2);
        else if(n3<n1 && n3<n2 && n3<n4) menor = Integer.toString(n3);
        else if(n4<n1 && n4<n2 && n4<n3) menor = Integer.toString(n4);
        else menor = ("Dos o mas numeros estan repetidos.");
        return menor;
    }
    public static void main(String[] args) {
        //Declaramos variables a usar.
        char res;

        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        do{
            //Limpiamos la pantalla de la consola.
            System.out.print("\033[H\033[2J");System.out.flush();

            //Obtencion de datos.
            System.out.println("Este programa le pide 4 numeros enteros e imprimirá el menor de ellos.");
            System.out.println("Ingrese el primer numero: "); int n1 = DatoIng.nextInt();
            System.out.println("Ingrese el segundo numero: "); int n2 = DatoIng.nextInt();
            System.out.println("Ingrese el tercer numero: "); int n3 = DatoIng.nextInt();
            System.out.println("Ingrese el cuarto numero: "); int n4 = DatoIng.nextInt();

            //Damos a conocer los resultados.
            System.out.println("El numero menor es: " + menor(n1, n2, n3, n4));
            
            //Damos al usuario la opcion de reiniciar el programa.
            System.out.println("¿Desea reiniciar el programa? (S/N)"); res = Character.toUpperCase(DatoIng.next().charAt(0));
        }while(res != 'N');
        System.out.println("\n\nGracias por usar nuestro programa!!!");
        DatoIng.close();
    }
    
}
