//Alumno: Jose Manuel Roberto Badilllo.
//Descripcion: Crear un prgrama que calcule la paga del trabajador de acuerdo a las horas ingresadas por el usuario y
//teniendo en cuenta los impuestos.

import java.util.Scanner;

public class _p04_PagaTrabajador {
    public static void main(String[] args) {
        //Declaracion de variables a utilizar.
        int horas;
        String nombre;
        float paga, pagabruta, tasa, impuesto, paganeta;
        Scanner datoIng = new Scanner(System.in);
        //Entrada de valores.
        System.out.print("Nombre:           "); nombre = datoIng.nextLine();
        System.out.print("Horas trabajadas: "); horas = datoIng.nextInt();
        System.out.print("Paga por hora:    "); paga = datoIng.nextFloat();
        tasa = 0.3f;
        //Calculo de la paga neta.
        pagabruta = horas * paga;
        impuesto = pagabruta * tasa;
        paganeta= pagabruta - impuesto;
        //Salida.
        System.out.println("Reesumen de pagos\n");
        System.out.println(String.format("El trabajador %s, trabajó %d horas, con una paga de %.2f pesos la hora, se asume una taza de impuesto de %.2f", nombre, horas, paga, tasa));
        System.out.println(String.format("Paga bruta: %.2f",pagabruta));
        System.out.println(String.format("Impuesto: %.2f", impuesto));
        System.out.println(String.format("Paga neta: %.2f", paganeta));
    }
}
