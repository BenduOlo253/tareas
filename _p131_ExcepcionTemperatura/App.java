    //Alumno: Jose Manuel Roberto Badillo.
    //Descripcion: Crear un programa que convierta grados centigrados, sin embargo hay un limite de temperatura, si llega a ese limite o lo sobre pasa, dar un mensaje de error.

package _p131_ExcepcionTemperatura;

    //Importamos los metodos necesarios.
import java.util.InputMismatchException;
import java.util.Scanner;
public class App {
    //Creamos la fucion de conversion.
    public static double convertir(double temp) throws TemperaturaExcesiva{
        if(temp >= 100){
            throw new TemperaturaExcesiva("ERROR 123:\nTemperatura demasiado alta, nose puede convertir");
        }
        double res = temp *1.8 + 32;
        return res;
    }

    public static void main(String[] args) throws TemperaturaExcesiva {
            //Declaramos las variables a usar.
        double temperatura;
        char res = 'S';

            //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);
        do{
                //Limpiamos la pantalla de la consola.
            System.out.print("\033[H\033[2J"); System.out.flush();

            System.out.println("Este programa calcula el equivalente de temperatura en grados celcius a grados farhenheit.\n");

                //Creamos un try-catch.
            try{
                System.out.println("Ingress la temperatura en celcius: ");
                temperatura = DatoIng.nextDouble();
                System.out.printf("%.2f°C son equivalentes a %.2f°F", temperatura, convertir(temperatura));
            }
            catch(TemperaturaExcesiva e){
                System.out.println(e.getMessage());
            }
            catch(InputMismatchException e){
                System.out.println("Ingrese solo datos numericos.");
            }
                //Damos al usuario la opcion de reiniciar el programa.
            System.out.println("\n\nDesea reiniciar el programa? (S|N)"); res =  Character.toUpperCase(DatoIng.next().charAt(0));
        }while(res != 'N');
        System.out.println("\n\nGracias por usar nuestro programa!!!"); DatoIng.close();
    }
}