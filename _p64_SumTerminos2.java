//Alumno: Jose Manuel Roberto Badillo.
//Descripcion: Crear un programa que imprima una serie de numeros, la cantidad de terminos que el usuario decida y calcular la suma total de los mismos.

import java.util.Scanner;
public class _p64_SumTerminos2 {
    public static void main(String[] args) {
        //Declaramos las variables.
        char res;
        int i, suma, termino;

        //Creamos una entrada de datos
        Scanner DatoIng = new Scanner(System.in);

        do{
            //Limpiamos la pantalla de la consola.
            System.out.print("\033[H\033[2J");System.out.flush();

            //Damos valor a las variables.
            suma = 0;
            termino = 1;
            //Obtencion de datos.
            System.out.println("Este progrma imprime una serie de numeros, la cantidad que usted desee y a su vez va a calcular la suma de dichos terminos.\n");
            System.out.println("Ingrese la cantidad de terminos que desea imprimir: "); int CantNum = DatoIng.nextInt();
            
            //Establecemos el proceso a seguir.
            for(i=1; i<=(CantNum-1); i++){
                System.out.printf("%d + ", termino);
                suma += termino;
                termino = (termino*10) +1;
            }
            //Calculamos la suma final.
            suma += termino;
            
            //Mostramos resultados.
            System.out.printf("%d\nLa suma de los terminos es: %d\n",termino, suma);
            
            //Damos la opcion al usuario de reiniciar el prigrama.
            System.out.println("¿Desea reiniciar el programa? (S/N) "); res = Character.toUpperCase(DatoIng.next().charAt(0));
        }while(res != 'N');
        System.out.println("\n\nGracias por usar nuestro programa!!!");
        DatoIng.close();
    }
}
