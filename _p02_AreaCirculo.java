//Alumno: Jose Manuel Roberto Badillo.
//Descripcion: Crear un programa que calcule el area de un circulo, pidiendo al usuario que ingrese la medida del radio del mismo.

import java.util.Scanner;
public class _p02_AreaCirculo {
    public static void main(String[] args) {
        double radio, area;
        Scanner numIng = new Scanner(System.in);
        System.out.print("Digita el radio del círculo: ");
        radio = numIng.nextFloat();
        area= Math.PI * Math.pow(radio,2);
        System.out.println("El circulo de radio "+ radio +" tine un area de "+ area);

    }    
}
