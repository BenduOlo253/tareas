//Alumno: Jose Manuel Roberto Badillo.
//Descripcion: Crear un programa que muestre la estación del año que corresponde al número introducido

import java.util.Scanner;
public class _p25_EstacionesAño {
    public static void main(String[] args) {
        //Limpiamos la pantalla de consola.
        System.out.print("\033[H\033[2J"); System.out.flush();

        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);
        //Obtenemos datos.
        System.out.println("Este programa indica una estacion del año dependiendo del numero que usted ingrese.\nPesione ENTER para continuar.");
        DatoIng.nextLine();
        System.out.print("Digite un numero (1...4): "); int op = DatoIng.nextInt();
        
        //Se muestra en pantalla el mensaje, dependiendo de la desicion del usuario.
        if(op==1) System.out.printf("La opción %d corresponde a la estacion de Primavera.", op);
        else{
            if(op==2) System.out.printf("La opcion %d corresponde a la estacion de Verano.", op);
            else{
                if(op==3) System.out.printf("La opcion %d corresponde a la estacion de Otoño.", op);
                else{
                    if(op==4) System.out.printf("La opcion %d corresponde a la estacion de Invierno.", op);
                    else{
                        System.out.println("La opcion que usted ha ingresado no existe.");
                    }
                }
            } 
        }
        System.out.println("\nProceso terminado ....");
    }
}