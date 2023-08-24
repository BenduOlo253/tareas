//Alumno: Jose Manuel Roberto Badillo.
//Descripción: Crear un programa que calcule las operaciones matematicas basicas
//entre dos numeros que sean elegidos por el usuario.

import java.util.Scanner;
public class _p05_OperacionesMatematicas{
    public static void main(String[] args) {
        //Declaramos variables.
        double pot;
        float Var1, Var2, suma, resta, multi, div, res;

        //Creamos una entrada de datos.
        Scanner datoIng = new Scanner(System.in);

        //Se obtienen los datos.
        System.out.println("Este programa, calcula todas las operaciones basicas.");
        System.out.println("Ingrese el primer numero: "); Var1 = datoIng.nextFloat();
        System.out.println("Ingrese el segundo numero: "); Var2 = datoIng.nextFloat();

        //Se realizan los calculos.
        suma = Var1 + Var2;
        resta = Var1 - Var2;
        multi = Var1*Var2;
        div = Var1/Var2;
        res = Var1 % Var2;
        pot = Math.pow(Var1,Var2);

        //Se muestran los datos en pantalla.
        System.out.println(String.format("El resultado de la suma entre %.2f, y %.2f es: %.2f.", Var1, Var2, suma));
        System.out.println(String.format("El resultado de la resta entre %.2f, y %.2f es: %.2f.", Var1, Var2, resta));
        System.out.println(String.format("El resultado de la multiplicación entre %.2f, y %.2f es: %.2f.", Var1, Var2, multi));
        System.out.println(String.format("El resultado de la división entre %.2f, y %.2f es: %.2f.\n Y el residuo es %.2f ", Var1, Var2, div, res));
        System.out.println(String.format("El resultado de %.2f elevado a %.2f es: %.2f", Var1, Var2, pot));
    }
}
