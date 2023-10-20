//Alumno: Jose Manuel Roberto Badillo.
//Descripcion: Crear un programa que muestre un arreglo determinado y lo modifique, después lo vuelva a imprimir.

import java.util.Scanner;
public class _p90_Temperaturas{
    //Declaramos las funciones a utilizar.
    public static void ceros(double[] listamod){
        //Esta parte verifica cuales numeros del arreglo son mayores a diez y les modifica el valor.
        for(int i = 0; i<=(listamod.length-1); i++){
            if(listamod[i]>10){
                listamod[i] = 0;
            }
        }

        //Esta parte imprime la lista modificada.
        for(int i = 0; i<=(listamod.length-2); i++){
            System.out.print(listamod[i] + ", ");
        }
        System.out.print(listamod[listamod.length-1] + ".");
    }


    public static void main(String[] args) {
        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);
        //Limpiamos la pantalla de la consola
        System.out.print("\033[H\033[2J");System.out.flush();

        //Asignamos valores al arreglo.
        double [] lista = {2.34, 44.56, 7.89, 0.5, 2.5, 4.67, 40.3, 22.35, 56.22};

        //Mostramos los resultados.
        System.out.println("El primer elemento del arreglo es " + lista[0]+ "\n\nEl tercer elemento del arreglo es "+ lista[2]);

        //Se imprime el arreglo.
        for(int i = 0; i <=(lista.length-2); i++){
            System.out.print(lista[i]+ ", ");
        }
        System.out.print(lista[lista.length-1]+ ".\n\n");

        //Mostramos el arreglo modificado.
        System.out.println("A continuacion se mostrará el mismo arreglo, pero todos los valores mayores a diez serán reemplazados por ceros.\nPresione ENTER para continuar."); DatoIng.nextLine();
        ceros(lista);

        System.out.println("\n\nGRACIAS POR USAR NUESTRO PROGRAMA!!!");
        DatoIng.close();
    }
}