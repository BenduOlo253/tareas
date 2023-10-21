//Alumno: Jose Manuel Roberto Badillo.
//Descripcion: Crear un programa que permita al usuario capturar n calificaciones en un arreglo de números flotantes, calcular su suma promedio e imprimir los que son mayores al muismo.

import java.util.Scanner;
public class _p91_MayoresPromedio {
    //Declaramos las funciones a utilizar.
    public static void mayProm(float [] lista, float prom){
        int len, j;
        len = j = 0;

        //Calculamos la cantidad de digitos que va a contener la lista de numeros que son mayores al promedio.
        for(int i= 0; i<=(lista.length-1); i++){
            if(lista[i]>prom){
                len ++;
            }
        }
        
        //En caso de no haber ningun numero mayor al promedio enviar un mensaje, de lo contrario seguirá el proceso de manera habitual.
        if(len == 0){
            System.out.println("Ningun numero es mayor al promedio.");
        }
        else{
            float [] lista2 = new float[len];
            for(int i= 0; i<=(lista.length-1); i++){
                if(lista[i]>prom){
                    lista2[j] = lista[i];
                    System.out.print(lista[j] + ", ");
                    j++;
                }
            }            
        }
    }

    public static void main(String[] args) {
        //Declaramos las variables a utilizar.
        float suma, promedio;

        //Asiganmos valores a las variables.
        suma = 0;
        int cont = 1;
        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        //Limpiamos la pantalla de la consola.
        System.out.print("\033[H\033[2J");System.out.flush();

        //Obtencion de datos.
        System.out.println("Este programa puede agrupar un numero n de calificaciones.\nPresione <ENTER> para continuar."); DatoIng.nextLine();

        System.out.println("Ingrese el numero de calificaciones a ingresar: "); int cantNum = DatoIng.nextInt();

        float [] listaCal= new float[cantNum];
 
        //Ingresamos las calificaciones a un arreglo.
        for(int i = 0; i<=(cantNum-1); i++ ){
            System.out.printf("Ingrese la calificacion %d : ", cont); listaCal[i] = DatoIng.nextFloat();
            suma += listaCal[i];
            cont ++;
        }
        promedio = suma/listaCal.length;
        //Mostramos el arreglo y el promedio.
        for(int i = 0; i<=(cantNum-2); i++){
            System.out.print(listaCal[i] + ", ");
        }
        System.out.print(listaCal[cantNum-1] + ".");
        
        System.out.printf("\n\nLa suma de las calificaciones ingresadas es: %.2f\nEl promedio de las calificaciones ingresadas es: %.2f\n\n", suma, promedio);
        System.out.println("Las siguientes calificaciones son mayores al promedio:");
        mayProm(listaCal, promedio);
        System.out.println("\n\n\nGRACIAS POR USAR NUESTRO PROGRAMA!!!");
        DatoIng.close();
    }
}
