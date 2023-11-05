    //Alumno: Jose Manuel Roberto Badillo.
    //Descripcion: Crear un programa que le pida al usuario la cantidad de niños y a su vez una cantidad de dulces para calcular la cantidad de los mismos que haya que repartir a cada n

    //Importamos los metodos necesarios.
import java.util.InputMismatchException;
import java.util.Scanner;
public class _p129_ExcepcionDulces {
    public static void main(String[] args) {
            //Declaramos variables a usar.
        boolean bol = true;
        char res = 'S';

            //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        do{
               //Limpiamos la pantalla de la consola.
            System.out.print("\033[H\033[2J"); System.out.flush();
            System.out.println("Este programa calcula a partir de la cantidad de niños y los dulces, la cantidad de dulces que le toca a cada niño. \nPresione <ENTER> para continuar.");
            DatoIng.nextLine();

                //Usamos el metodo try-catch mezclado con un do-while.
            do{

                try {     
                    System.out.println("Ingrese la cantidad de niños: "); double cantNiños = DatoIng.nextInt();
                    bol = false; bol = true;
                    System.out.println("Ingrese la cantidad de dulces disponibles: "); double cantDulces = DatoIng.nextInt(); double div = cantDulces/cantNiños;
                    bol = false;
                    System.out.printf("La cantidad de dulces que se va a repartir a cada niño es: %.2f\n\n", div);
                }  
                    //Creamos una excepcon para el caso de la divicion entre cero.
                catch (ArithmeticException e) {
                    System.out.println("\nNo se pueden repartir ninguna cantidad de dulces entre cero niños.\nPresione <ENTER> para continuar."); 
                    DatoIng.nextLine(); DatoIng.nextLine();
                }
                    //Creamos una excepcion para el ingreso de caracteres incorrectos.
                catch (InputMismatchException e){
                    System.out.println("\nSe deben ingresar terminos numericos.\nPresione <ENTER> para continuar."); 
                    DatoIng.nextLine(); DatoIng.nextLine();
                }
            }while(bol);

                //Damos la opcion al usuario de reiniciar el programa.
            System.out.println("Desea reiniciar el programa? (S|N)"); res =  Character.toUpperCase(DatoIng.next().charAt(0));
        }while(res != 'N');
        System.out.println("Gracias por usar nuestro programa!!!"); DatoIng.close();
    }
}