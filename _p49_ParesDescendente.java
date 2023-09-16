//Alumno: Jose Manuel Roberto Badillo.
//Descripcion: Crear un programa que imprima los numeros pares que existen entre el cero y un numero elegido por el usuario de forma ascendente.

import java.util.Scanner;
public class _p49_ParesDescendente {
    public static void main(String[] args) {
        //Declaramos variables.
        int numInicial, contador, suma, contadorP;
        char res;

        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        //Comenzamos programa.
        do{
            //Asignamos valores a las variables.
            suma = contadorP = 0;

            //Limpamos pantalla de la consola.
            System.out.print("\033[H\033[2J");System.out.flush();

            //Obtencion de datos.
            System.out.println("Este programa imprime todos los numeros enteros pares, de forma descendente, que existen entre el cero y un numero que usted elija.\n\n");
            System.out.print("Ingrese el numero par final: "); numInicial = DatoIng.nextInt();

            //En caso de que el numero ingresado sea negativo creamos un proceso para dicho caso.
            if(numInicial<0){
                if(numInicial%2 == 0 ){
                    contador = numInicial;
                    do{
                        System.out.printf("%d ", contador);
                        suma += contador;
                        contadorP++;
                        contador += 2;
                    }while(contador<=0);
                }
                else{
                    contador = numInicial+1;
                    do{
                        System.out.printf("%d ", contador);
                        suma += contador;
                        contadorP++;
                        contador += 2;
                    }while(contador<=0);
                }
            }

            //En caso de que el numero ingresado sea positivo se realiza su respectivo proceso.
            else{
                if(numInicial%2 == 0){
                    contador = numInicial;
                    do{
                        System.out.printf("%d ", contador);
                        suma += contador;
                        contadorP++;
                        contador -= 2;
                    }while(contador>=0);
                }
                else{
                    contador = numInicial-1;
                    do{
                        System.out.printf("%d ", contador);
                        suma += contador;
                        contadorP++;
                        contador -= 2;
                    }while(contador>=0);
                }
            }
            //Presentamos los resultados.
            System.out.printf("\nLa suma de todos los numeros pares entre 0 y %d es: %d\n\nEl promedio de los numeros encontrados es: %d\n", numInicial, suma, suma/contadorP);

            //Planteamos la opcion de reiniciar el programa.
            System.out.println("Desea reiniciar el programa? (S|N)"); res =  Character.toUpperCase(DatoIng.next().charAt(0));
        }while(res != 'N');
        System.out.println("\nGracias por usar nuestro programa!");
        DatoIng.close();
    }
}
