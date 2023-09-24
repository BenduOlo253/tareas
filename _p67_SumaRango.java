//Alumno: Jose Manuel Roberto Badillo.
//Descripcion: Crear un programa que calcule la suma de un determinado rango de numeros.

import java.util.Scanner;
public class _p67_SumaRango {
    //Declaramos las funciones a utilizar.
    public static float SumaRango(float ini, float fin) {
        float s=0;
        for(float i=ini; i <= fin ;i++)
        s+=i;
        return s;
    }
    public static void main(String[] args) {
        //Declaramos variables.
        char resx;
        
        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        do{
            //Limpiamos la pantalla de la consola.
            System.out.print("\033[H\033[2J");System.out.flush();

            //Obtencion de datos.
            System.out.println("Este programa suma los numeros que existen en un rango determinado por usted.\n");
            System.out.print("Dame inicio : "); float numInicial = DatoIng.nextFloat();
            System.out.print("Dame fin : "); float numFinal = DatoIng.nextFloat();

            //Establecesmos el proceso a seguir.
            if(numFinal<numInicial){
                float numIAlt = numFinal;
                float numFAlt = numInicial;
                float res = SumaRango(numIAlt, numFAlt);
                System.out.printf("\nLa suma del rango es %.2f",res); 
            }
            else{
                float res = SumaRango(numInicial, numFinal);
                System.out.printf("\nLa suma del rango es %.2f",res);                 
            }

            //Damos la opcion al usuario de reiniciar el programa.
            System.out.println("¿Desea reiniciar el programa? (S/N)"); resx = Character.toUpperCase(DatoIng.next().charAt(0));
        }while(resx != 'N');
        System.out.println("\n\nGracias por usar nuestro programa!!!");
        DatoIng.close();
        

    }
}