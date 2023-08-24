//Alumno: Jose Manuel Roberto Badillo.
//Descripción: Crear un programa que convierta la temperatura de grados Fahrenheit a Celsius.
import java.util.Scanner;

public class _p12_ConvertirTemperatura {
    public static void main(String[] args) {
        Double TempCel, TempFa;
        Scanner DatoIng = new Scanner(System.in);
        System.out.println("Este programa convierte de grados Fahrenheit a grados Celsius.\nPresione ENTER para continuar.");
        DatoIng.nextLine();
        System.out.println("Ingrese los grados a convertir a Celsius: "); TempFa = DatoIng.nextDouble();
        TempCel = (TempFa - 32)/1.8;
        System.out.printf("La temperatura de %.2f grados Fahrenheit es equivalente a %.2f grados Celsius.", TempFa, TempCel);
        }
}
