//Alumno: Jose Manuel Roberto Badillo.
//Descripción: Crear un programa que convierta la temperatura de grados Fahrenheit a Celsius.
import java.util.Scanner;

public class _p12_ConvertirTemperatura {
    public static void main(String[] args) {
        //Declaramos variables.
        Double TempCel, TempFa;

        //Se crea una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        //Obtencion de datos.
        System.out.println("Este programa convierte de grados Fahrenheit a grados Celsius.\nPresione ENTER para continuar.");
        DatoIng.nextLine();
        System.out.println("Ingrese los grados a convertir a Celsius: "); TempFa = DatoIng.nextDouble();

        //Se realizan los calculos.
        TempCel = (TempFa - 32)/1.8;
        
        //Se muestran los resultados.
        System.out.printf("La temperatura de %.2f grados Fahrenheit es equivalente a %.2f grados Celsius.", TempFa, TempCel);
        }
}
