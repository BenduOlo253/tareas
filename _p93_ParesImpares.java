//Alumno: Jose Manuel Roberto Badillo.
//Descripcion: Crear un programa que cree un arreglo con 100 numeros aleatorios entre 0 y 20 y mostrar sus numeros impares e impares

import java.util.Random;
public class _p93_ParesImpares {
    //Definimos las funciones a usar.
    public static void paresImpares(int[] lista){
        int contadorpares = 0, contadorimpares =0, j= 0, d =0;
        for(int i = 0; i<lista.length; i++){
            if(lista[i]%2 == 0 && lista[i]!=0) contadorpares++;
            if(lista[i]%2!=0 && lista[i]!=0) contadorimpares++;
        }

        int[] pares = new int[contadorpares];
        int[] impares = new int[contadorimpares];

        for(int i = 0; i<lista.length; i++){
            if(lista[i]%2 == 0 && lista[i]!=0){
               pares[j] = lista[i]; 
               j++; 
            } 
            if(lista[i]%2!=0 && lista[i]!=0){
               impares[d] = lista[i]; 
               d++; 
            }
        }

        System.out.println("\nLos pares de la lista son:\n");
        for(int i : pares){
            System.out.print(i + ", ");
        }

        System.out.println("\nLos impares de la lista son:\n");
        for(int i = 0; i<impares.length; i++){
            System.out.print(impares[i] + ", ");
        }
    }

    public static int[] Aleatorios(int [] lista){
        Random rnd = new Random();
        for(int i =0; i<lista.length; i++){
            lista[i] = rnd.nextInt(20);
        }
        return lista;
    }

    public static void main(String[] args) {
        //Definimos las variables a usar.
        int MAX= 100;
        //Limpiamos la pantalla de la consola.
        System.out.print("\033[H\033[2J");System.out.flush();

        //Inicio del proceso.
        int [] listaNum = new int[MAX];
        System.out.println("Este programa imprime un arreglo de numeros aleatorios.\n");
        for(int i : Aleatorios(listaNum)){
            System.out.printf("%d, ", i);
        }
        paresImpares(Aleatorios(listaNum));

        System.out.println("\n\n\nGRACIAS POR USAR NUESTRO PROGRAMA!!!");
    }
}