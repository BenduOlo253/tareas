//Alumno: Jose Manuel Roberto Badillo.
//Descripción: Crear un programa que pida al usuario tres numeros y con ellos verifique cual numero es el mayor.

import java.util.Scanner;
public class _p34_NumeroMayor {
    public static void main(String[] args) {
        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        //Limpiamos la pantalla de consola.
        System.out.print("\033[H\033[2J"); System.out.flush();
        
        //Obtenemos datos.
        System.out.println("Este programa muestra el mayor numero entero de entre tres numeros.\nresione ENTER para continuar."); DatoIng.nextLine();
        System.out.println("Ingrese el primer numero: "); int num1 = DatoIng.nextInt();
        System.out.println("Ingrese el segundo numero: "); int num2 = DatoIng.nextInt();
        System.out.println("Ingrese el tercer numero: "); int num3 = DatoIng.nextInt();

        //Verificamos cual es mayor y lo mostramos en pantalla.
        if((num1 > num2) && (num1 > num3)) System.out.printf("El numero mayor es %d", num1);
        if((num2 > num1) && (num2 > num3)) System.out.printf("El numero mayor es %d", num2);
        if((num3 > num1) && (num3 > num2)) System.out.printf("El numero mayor es %d", num3);

        //En caso de que los tres numeros sean iguales, se mostrará el siguiente mensaje.
        if(((num1 == num2) && (num1 == num3) && (num2 == num3))) System.out.println("Los numeros ingresados estan repetidos.");
        System.out.println("\n\nProceso terminado...");
        DatoIng.close();
    }
}
