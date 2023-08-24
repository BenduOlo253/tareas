//Alumno: Jose Manuel Riberto Badillo.
//Desscropcion: Calcular la hipotenusa de un triangulo con medidas determinadas por el usuario.

import java.util.Scanner;
public class _p10_HipotenusaTriangulo {
    public static void main(String[] args) {
        //Declaramos variables, dependiendo el uso que se le va a dar.
        Double Cat1, Cat2, Hip;

        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        //Se limpia la pantalla de consola.
        System.out.print("\033[H\033[2J"); System.out.flush();
        
        //Obtenemos los datos.
        System.out.println("Este programa calcula la hipotenusa de un triangulo.\nPresiona ENTER para continuar.");
        DatoIng.nextLine();
        System.out.println("Digite el cateto A: ");
        Cat1 = DatoIng.nextDouble();
        System.out.println("Digite el cateto B: ");
        Cat2 = DatoIng.nextDouble();

        //Se realizan los calculos.
        Hip = Math.sqrt((Cat1*Cat1) + (Cat2*Cat2));
        
        //Se muestran los resultados en pantalla.
        System.out.println(String.format("La hipotenusa del triangulo es de: %.2f.", Hip));
    }
}
