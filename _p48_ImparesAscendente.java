//Alumno: Jose Manuel Roberto Badillo.
//Descripcion: Crear un programa que imprima todos los numeros impares que existen entre el cero y el numero que el usuario elija de forma ascendente.

import java.util.Scanner;
public class _p48_ImparesAscendente {
    public static void main(String[] args) {
        //Declaramos variables.
        int numInicial, contador, suma, contadorP;
        char res;
        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        //Comenzamos el programa.
        do{
            //Agregamos valor a variables.
            suma= contadorP = 0;
            
            //Limpiamos la pantalla de la consola.
            System.out.print("\033[H\033[2J");System.out.flush();

            //Obtencion de datos.
            System.out.print("Este programa imprime los numeros impares que existen entre el cero y un numero que usted elija.\n\n");
            System.out.println("Ingrese hasta que numero se van a imprimir los numeros impares: "); numInicial = DatoIng.nextInt();

            //En caso de que el usuario ingrese un numero negativo se crea un proceso unico para ese caso.
            if(numInicial<0){
                contador = -1;
                do{
                    System.out.printf("%d ", contador);
                    suma +=contador;
                    contador-= 2;
                    contadorP++;
                }while(contador>=numInicial);
            }

            //En caso de que el usuario ingrese un numero positivo se crea su respectivo proceso.
            else{
                contador = 1;
                do{
                    System.out.printf("%d ", contador);
                    suma += contador;
                    contador += 2;
                    contadorP++;
                }while(contador<=numInicial);
            }

            //Plasmamos resultados.
            System.out.printf("\nLa suma de los numeros es: %d\n\nEl promedio de los numeros es: %d\n", suma, suma/contadorP);
            //Planteamos la opcion de reiniciar el programa.
            System.out.println("\n¿Desea continuar(S|N)?"); res = Character.toUpperCase(DatoIng.next().charAt(0));
        }while(res !='N');

        System.out.println("Gracias por usar nuestro programa!");
        DatoIng.close();
    }    
}