//Alumno: Jose Manuel Roberto Badillo.
//Descripcion: Crear un programa que imprima una serie de numeros armonicos hasta que el usuario lo decida.

import java.util.Scanner;
public class _p63_SumTerminos1 {
    public static void main(String[] args) {
        //Desclaramos variables.
        int i;
        double suma;
        char res;

        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        do{
            //Limpiamos la pantalla de la consola.
            System.out.print("\033[H\033[2J");System.out.flush();

            //Asignamos valores a las variebles.
            suma = 0;

            //Obtencion de datos.
            System.out.println("Este programa imprime una serie de numeros armonicos, la cantidad de terminos que usted decida.\n");
            System.out.println("Ingrese la cantidad de terminos que usted quiere imprimir"); int CantNum = DatoIng.nextInt();

            //Establecemos el proceso a seguir.
            for(i=1; i<=(CantNum-1); i++){
                System.out.printf("1/%d + ", i);
                suma += 1.0 / i;
            }
            suma += 1.0 /i;

            //Mostramos los resultados.
            System.out.printf("1/%d\nLa suma de los términos es: %.6f", CantNum, suma);

            //Damos la opcion al usuario de reiniciar el programa.
            System.out.println("\n¿Desea reiniciar el programa? (S/N) "); res = Character.toUpperCase(DatoIng.next().charAt(0));
        }while(res != 'N');
        System.out.println("\n\nGracias por usar nuestro programa!!!");
        DatoIng.close();
    }
}