//Alumno: Jose Manuel Roberto Badillo.
//Crear un numero que imprima los numeros de 1 a numIng.

import java.util.Scanner;
public class _p52_Numeros1aN {
    public static void main(String[] args) {
        //Declaramos variables.
        char res;
        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        do{
            //Limpiamos la pantalla de consola.
            System.out.print("\033[H\033[2J");System.out.flush();

            //Obtenemos datos.
            System.out.println("Este programa imprime los numeros de 1 a n con un paso paso.");
            System.out.print("¿Hata que numero se va a imprimir? "); int numIng = DatoIng.nextInt();
            System.out.print("¿Con que paso? "); int paso = DatoIng.nextInt();

            //En caso de que el numeros ingresado sea negativo, establecemos un proceso especializado.
            if(numIng<0){
                for(int i=0; i>=numIng; i-=paso) {
                    System.out.printf("%d ",i);
                }                
            }
            else{
                for(int i=0; i<=numIng; i+=paso) {
                    System.out.printf("%d ",i);
                }
            }
            //Damos la opcion al usuario de reiniciar el programa.
            System.out.println("\n¿Deesea reiniciar el programa?(S/N)"); res =  Character.toUpperCase(DatoIng.next().charAt(0));
        }while(res != 'N');
        System.out.println("\n\nGracias por usar nuestro programa!!!");        
        DatoIng.close();
    }
}