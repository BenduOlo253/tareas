//Alumno: Jose Manuel Roberto Badillo.
//Descripción: Crear un programa que le pida al usuario 3 numeros enteros y apartir de esos datos, verificar si son consecutivos.

import java.util.Scanner;
public class _p33_NumerosConsecutivos {
    public static void main(String[] args) {
        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        //Limpiamos la pantalla de consola.
        System.out.print("\033[H\033[2J"); System.out.flush();

        //Se obtien los datos.
        System.out.println("Este programa verifica si 3 numeros son consecutivos.\nPresione ENTER para continuar."); DatoIng.nextLine();
        System.out.println("Ingrese el primer numero: "); int num1 = DatoIng.nextInt();
        System.out.println("Ingrese el segundo numero: "); int num2 = DatoIng.nextInt();
        System.out.println("Ingrese el tercer numero: "); int num3 = DatoIng.nextInt();

        //Verificamos si los numeros son consecituvos.
        if(((num1 + 1) == num2) && ((num2 + 1) == num3)){
            System.out.println("Los numeros que usted ingresó SI son consecutivos");
        }
        else{
            System.out.println("Los numeros que usted ingreso NO son consecutivos.");
        }
        System.out.println("\n\nProceso terminado...");
        DatoIng.close();
    }
}
