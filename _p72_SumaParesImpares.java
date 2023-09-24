//Alumno: Jose Manuel Roberto Badillo.
//Crea un programa que imprima en un rango determinado de numeros enteros los numeros pares o impares y a su vez calcular la suma de los mismos.

import java.util.Scanner;
public class _p72_SumaParesImpares {
    //Definimos las funciones a utilizar.
    public static int SumaParImpar(int ini, int fin, char letra) {
    int suma=0;
        for(int i=ini; i <= fin; i++) {
        if( letra=='P' && i%2==0 ) {
        System.out.printf("%d ",i);
        suma+=i;
        }
        else if( letra=='I' && i%2!=0 ) {
        System.out.printf("%d ",i);
        suma+=i;
        }
        }
        return suma;
    }
    public static void main(String[] args) {
        //Definimos las variables a usar.
        int ini,fin,suma;
        char poi;
        
        //Creamos una entrdada de datos.
        Scanner DatpIng = new Scanner(System.in);

        //Limpiamos la pantalla de la consola.
        System.out.print("\033[H\033[2J");System.out.flush();

        //Obtecion de datos.
        System.out.print("Valor incial ? "); ini = DatpIng.nextInt();
        System.out.print("Valor final ? "); fin = DatpIng.nextInt();

        //Damos a conocer los resultados.
        System.out.print("\n[P]ares \n[I]Impares ? "); poi = Character.toUpperCase(DatpIng.next().charAt(0));
        suma = poi=='P' ? SumaParImpar(ini,fin,'P') : SumaParImpar(ini,fin,'I');
        System.out.printf("\nLa suma es : %d", suma);
        System.out.println("\n\nGracias por usar nuestro programa!!!");
        DatpIng.close();
    }
}