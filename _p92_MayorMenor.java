//Alumno: Jose Manuel Roberto Badillo.
//Descripcion: Crear un programa que perimta ingresar n numeros, imprimirlos y calcular cual fue el numero mayor y el numero menor.

import java.util.Scanner;

public class _p92_MayorMenor {
    //Declaramos las funciones a utilizar.
    public static void MayorMenor(int[] lista){
        int mayor, menor;
        mayor = menor = lista[0];
        for(int i = 0; i<=(lista.length-1); i++){
            if(lista[i]>mayor) mayor = lista[i];
            if(lista[i]<menor) menor = lista[i];
        }
        System.out.printf("El numero mayor del arreglo es: %d.\nEl numero menor del arreglo es: %d.", mayor, menor);
    }
     
    public static void main(String[] args) {
        //Declaramos las variables a utilizar.
        int cont = 1;
        
        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);
        
        //Limpiamos la pantalla de la consola.
        System.out.print("\033[H\033[2J");System.out.flush();

        //Obencion de datos.
        System.out.println("Este programa calcula el mayor y menor numero de una cantidad n de numeros enteros.\n\n");
        System.out.println("Digite la cantidad de numeros que desea agregar: "); int CantNum = DatoIng.nextInt();

        //Inicializamos la lista.
        int[] listaNum = new int[CantNum];

        //Creamos el arreglo del tamaño indicado por el usuario.
        for(int i = 0; i<=(listaNum.length-1); i++){
            System.out.printf("Digite el valor %d: ", cont); listaNum[i] = DatoIng.nextInt();
            cont++;
        }

        //Mostramos el arreglo creado.
        for(int i = 0; i<=(listaNum.length-2); i++){
            System.out.print(listaNum[i] + ", ");
        }
        System.out.print(listaNum[listaNum.length-1] + ".\n\n");

        //Se dan a conocer el numero menor y mayor.
        MayorMenor(listaNum);

        System.out.println("\n\nGRACIAS POR USAR NUESTRO PROGRAMA!!!"); DatoIng.close();
    }
}