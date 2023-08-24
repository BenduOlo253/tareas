//Alumno: Jose Manuel Roberto Badillo.
//Descripcion: Crear un programa que calcule el volumen de un cilindro.

import java.util.Scanner;
public class _p13_VolumenCilindrico {
    public static void main(String[] args) {
        //Declaramos variables.
        float radio, h;
        double V;

        //Creamos la entrada de datos.
        Scanner DatoIng = new Scanner(System.in);
        //Obtención de datos.
        System.out.println("Este programa calclula el volumen de un cilindro con el radio y la altura que usted determine.\nPresione ENTER para continuar");
        DatoIng.nextLine();
        System.out.println("Digite el radio del cilindro: "); radio = DatoIng.nextFloat();
        System.out.println("Digite la altura del cilindro: "); h = DatoIng.nextFloat();

        //Calculamos el volumen.
        V = ((Math.PI) * (radio*radio)) * h;

        //Se muestran los resultados en pantalla.
        System.out.printf("El volumen del cilindro es: %.2f",V);
    }

}
