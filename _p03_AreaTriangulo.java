//Alumno: Jose Manuel Roberto Badillo.
//Descripción: Crear un programa que calcule el area de un triangulo, pidiendo las medidas del mismo al usuario.

import java.util.Scanner;
public class _p03_AreaTriangulo {
    public static void main(String[] args) {
        //Declaramos variables.
        int base, altura;
        double area;

        //Creamos una entrada de datos.
        Scanner datoIng = new Scanner(System.in);

        //Obtenemos los datos.
        System.out.println("Este programa calcula el area de un triangulo. Presione ENTER para continuar.");
        datoIng.nextLine();
        System.out.print("Digita la base del triangulo.");
        base = datoIng.nextInt();
        System.out.print("Digita la altura: ");
        altura = datoIng.nextInt();

        //Realizamos los calculos.
        area = base*altura/2;

        //Se muestran los datos en pantalla.
        System.out.println(String.format("El triangulo de base %d y altura %d tiene un area de %.2f", base, altura, area));
        datoIng.close();
    } 
}
