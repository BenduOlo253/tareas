//Alumno: Jose Manuel Roberto Badillo.
//Descripción: Crear un programa que calcule el tercer angulo de un triangulo, dando los dos primeros angulos.

import java.util.Scanner;
public class _p11_CalcularAngulo {
    public static void main(String[] args) {
        //Declaramos variables.
        float Angl1, Angl2, Angl3;

        //Se crea una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        //Obtencion de datos.
        System.out.println("Este programa Calcula el tercer aungulo de un triangulo, utilizando como base los dos angulos que uested ingrese\nPresione ENTER para continuar.");
        DatoIng.nextLine();
        System.out.println("Digite el primer angulo: "); Angl1 = DatoIng.nextFloat();
        System.out.println("Digite el segundo angulo: "); Angl2 = DatoIng.nextFloat();

        //Se realizan los calculos.
        Angl3 = 180-(Angl1+Angl2);
        
        //Se muestran los resultados en pantalla.
        System.out.printf("El Tercer angulo tiene una medida de: %.2f",Angl3);
    }
}
