//Alumno: Jose Manuel Roberto Badillo.
//Descripcion: Crear un programa que dados tres numeros, verificar si la suma de los dos primeros numeros es igual al tercer numero.

import java.util.Scanner;
public class _p22_VerificarSuma {
    public static void main(String[] args) {
    //Declaramos variables.
    int suma, Var1,Var2,Var3;

    //Creamos una entrada de datos.
    Scanner DatoIng = new Scanner (System.in);

    //Limpiamos pantalla de la consola.
    System.out.print("\033[H\033[2J"); System.out.flush();

    //Obtenemos datos.
    System.out.println("Este programa, dados 3 numeros, verifica si la suma de los dos primeros numeros es igual al tercer numero.\nPresione ENTER para continuar.");
    DatoIng.nextLine();
    System.out.println("Digita el primer numero: "); Var1 = DatoIng.nextInt();
    System.out.println("Digita el segundo numero: "); Var2 = DatoIng.nextInt();
    System.out.println("Digita el tercer numero: "); Var3 = DatoIng.nextInt();

    //Calculamos la suma.
    suma = Var1 + Var2;
    
    //Verificamos.
    if (suma == Var3){
        System.out.printf("La suma de %d y %d es igual a %d", Var1, Var2, Var3);
    }
    else{
        System.out.printf("La suma de %d y %d no es igual a %d", Var1, Var2, Var3);
    }
    }
}