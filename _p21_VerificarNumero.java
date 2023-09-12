//Alumno: Jose Manuel Roberto Bafillo.
//Descripcion: Crear un programa que verifique si un numero es positivo o es negativo.

import java.util.Scanner;
public class _p21_VerificarNumero{
    public static void main(String[] args) {
        //Se limpia la pantalla de terminal.
        System.out.print("\033[H\033[2J"); System.out.flush();
        
        //Creamos variables.
        int num;

        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner (System.in);
        System.out.println("Este programa verifica si un numero es positivo o negativo.\nPresione ENTER para continuar.");
        DatoIng.nextLine();
        System.out.println("Ingrese el numero a verificar: "); num = DatoIng.nextInt();
        
        //Verificamos el numero.
        if (num==0) {
            System.out.println("El numero es igual a cero, no es positivo ni negativo.");
        }
        else{
            if (num<0){
            System.out.printf("El numero %d es menor que cero, por lo tanto es negativo.", num);
        }
        else{
            System.out.printf("El numero %d es mayor que cero, por lo tanto es negativo.", num);
        }
        }
        DatoIng.close();
    }
}