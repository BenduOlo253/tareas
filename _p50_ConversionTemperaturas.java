//Alumno: Jose Manuel Roberto Badillo.
//Descripcion: Crear un programa que cree una tabla con un rango de valores establecido por el usuario, em la que se muestren las conversiones de grados centigrados a fahrenheit.

import java.util.Scanner;
public class _p50_ConversionTemperaturas {
    public static void main(String[] args) {
        //Declaramos variables.
        int valorIn, valorFin;
        double fahrenheit;
        char res;

        //Se crea una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);
        
        do{
            //Limpiamos la pantalla de la consola.
            System.out.print("\033[H\033[2J"); System.out.flush();

            //Obtenemos datos.
            System.out.println("Este programa crea una tabla de conversion de temperaturas (Centigrados a Farhenheit), con el rango que usted decida.\n");
            System.out.print("¿Desde que temperatura desea que comienze la conversion?(Solo numeros enteros).\n"); valorIn = DatoIng.nextInt();
            System.out.print("¿Hasta que temperatura desea que se imprima la tabla?(Solo numeros enteros).\n "); valorFin = DatoIng.nextInt();
            System.out.println("-------------------------------\nCentígrados       Fahrenheit\n-------------------------------");
            
            //Creamos la ta|bla de conversión.
            do{
                fahrenheit = (valorIn*1.8)+32;
                if(valorIn>=10){
                    System.out.printf("%d°C       |       %.2f°F\n", valorIn, fahrenheit);
                }
                else{
                    System.out.printf("%d°C        |       %.2f°F\n", valorIn, fahrenheit);                    
                }
                valorIn++;
            }while(valorIn<=valorFin);
            System.out.println("-------------------------------\n\n");

            

            //Planteamos la opcion de reiniciar el programa.
            System.out.println("Desea reiniciar el programa? (S|N)"); res =  Character.toUpperCase(DatoIng.next().charAt(0));
        }while(res !='N');
        System.out.println("\n\nGracias por usar nuestro programa!!");
        DatoIng.close();
    }
}