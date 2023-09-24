//Alumno: Jose Manuel Roberto Badillo.
//Descripcion: Crear un programa que imprima el tipo de angulo que ingrese el usuario.

import java.util.Scanner;
public class _p79_Angulo {
    //Declaramos las funciones a utilizar.
    public static String tipoAngulo(int angulo) {
        String tipo = "";
        if (angulo < 90) {
            tipo = "agudo";
        } else if (angulo == 90) {
            tipo = "recto";
        } else if (angulo > 90 && angulo < 180) {
            tipo = "obtuso";
        } else if (angulo == 180) {
            tipo = "llano";
        } else if (angulo > 180 && angulo < 360) {
            tipo = "concavo";
        }
        return tipo;
    }

    public static void main(String[] args) {
        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        //Obtencion de datos.
        System.out.println("Bienvenido al programa que determina el tipo de ángulo");
        System.out.println("Ingrese el valor del ángulo entre 0 y 360 grados:");
        int angulo = DatoIng.nextInt();
        if (angulo >= 0 && angulo <= 360) {
            String resultado = tipoAngulo(angulo);
            System.out.println("El tipo de ángulo es: " + resultado);
        } else {
            System.out.println("El valor del ángulo debe estar entre 0 y 360 grados");
        }
    System.out.print("\n\nGracias por usar nuestro programa!!!");
    DatoIng.close();
    }
}
