    //Alumno: Jose Manuel Roberto Badillo.
    //Descrpcion: Crear un programa que pida al usuario 5 edades y agruparlas en una lista, usando un try catch para los errores de ingresado.
    
import java.util.InputMismatchException;
import java.util.Scanner;

public class _p130_ExcepcionEdades {
    public static void main(String[] args) {
        char res = 'S';
            //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);
        do{                
                //Limpiamos la pantalla de la consola.
            System.out.print("\033[H\033[2J"); System.out.flush();            
                //Declaramos las variables a usar.
            int contador = 0; int contador1 = 1; int edad;
            int[] Edades = new int[5];

            System.out.println("Este programa va a mostrar las edades de 5 personas, las edades son ingresadas por el usuario.");

            //Usamos el metodo try-catch con do while.
            do{
                try {
                    System.out.println("Ingrese la edad de la persona " + contador1 + ": "); 
                    edad = DatoIng.nextInt();
                    Edades[contador] = edad;
                    contador1 ++;
                    contador ++;
                } catch (InputMismatchException e) {
                    System.out.println("Introduce un numero entero."); DatoIng.nextLine();
                }
            }while(contador1 != 6);
            contador1 = 1;
                //Damos a conocer la lista.
            for(int i = 0; i<Edades.length; i++){
                System.out.println("Edad de la persona " + contador1 + ": " + Edades[i]);
                contador1++;
            }
                //Damos la opcion al usuario de reiniciar el programa.
            System.out.println("\nDesea reiniciar el programa (S/N)? "); res = Character.toUpperCase(DatoIng.next().charAt(0));
        }while(res != 'N');
        System.out.println("\n\nGracias por usar nuestro programa !!!"); DatoIng.close();
    }
}
