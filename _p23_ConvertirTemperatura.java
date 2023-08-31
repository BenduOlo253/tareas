//Alumno: Jose Manuel Roberto Badillo.
//Descripcion: Dada una temperatura, convertirla a grados Farenheit o grados Centigrados, según lo que elija el usuario.

import java.util.Scanner;
public class _p23_ConvertirTemperatura {
    public static void main(String[] args) {
        //Declaramos variables.
        double tempIng, tempFin;
        int opcion;
        
        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        //Limpiamos ventana de terminal.
        System.out.print("\033[H\033[2J"); System.out.flush();

        //Obtenemos datos.
        System.out.println("Este programa puede convertir grados Centígrados a Fahrenheit y viseversa.\nPresione ENTER para continuar.");
        DatoIng.nextLine();

        //Damos al usuario elegir.
        System.out.println("Presione 1 para convertir a Fahrenheit y presione 2 para convertir a Centígrados.\n"); opcion = DatoIng.nextInt();

        //Se crean las opciones y las acciones de cada una.
        if (opcion == 1){
            System.out.println("Digite los Grados Centígrados: "); tempIng = DatoIng.nextDouble();

            //Se calcula la temperatura final.
            tempFin = (tempIng*1.8)+32;

            //Se muestran resultados.
            System.out.printf("%.1f grados Centígrados son equivalentes a %.1f grados Fahrenheit.", tempIng, tempFin);
        }
        else{
            if (opcion == 2){
            System.out.println("Digite los Grados Fahrenheit: "); tempIng = DatoIng.nextDouble();

            //Se calcula la temperatura final.
            tempFin = (tempIng/1.8)-32;

            //Se muestran resultados.
            System.out.printf("%.1f grados Fahrenheit son equivalentes a %.1f grados Centígrados.", tempIng, tempFin);
            }
            else{
                System.out.println("La opción que usted ha ingresado no es válida.");
            }
        }
    }
}
