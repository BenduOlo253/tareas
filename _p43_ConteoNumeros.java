//Alumno: Jose Manuel Roberto Badillo.
//Descripción:Crea un programa que cuente los números: postivos, negativos, ceros, hasta introducir 999.

import java.util.Scanner;
    public class _p43_ConteoNumeros {
    public static void main(String[] args) {
        //Declaramos variables.
        int numIng,cNum,suma,CanNPos,CanNeg,ceros;

        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        //Asignamos valores a las variables.
        cNum=suma=CanNPos=CanNeg=ceros=0;

        //Limpiamos la pantalla de la consola.
        System.out.print("\033[H\033[2J");System.out.flush();

        //Obtenemos los datos.
        System.out.println("Este programa clasifica la clase de numeros que usted ingrese ya sean postivos, negativos, ceros, hasta introducir 999.\nPreióne ENTER para continuar."); DatoIng.nextLine();

        do {
            System.out.print("Ingrese un numero: "); numIng = DatoIng.nextInt();
            if( numIng != 999) {
            cNum++;
            suma += numIng;
            if(numIng>0) CanNPos++;
            else if(numIng<0) CanNeg++;
            else ceros++;
            }
        } while(numIng!=999);

        //Mostramos los resultados en pantalla.
        System.out.println("\nCaptura terminada");
        System.out.println("\nResumen:");
        System.out.printf("Introdujiste %d numeros \n",cNum);
        System.out.printf("La suma de los numeros es : %d \n",suma);
        System.out.printf("Los positivos fueron : %d \n", CanNPos);
        System.out.printf("Los negativos fueron : %d \n", CanNeg);
        System.out.printf("Los ceros fueron : %d \n", ceros);
        System.out.println("\nProceso terminado ...");
        DatoIng.close();
    }
}