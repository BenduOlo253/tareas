//Almuno: Jose Manuel Roberto Badillo.
//Descripcion: Crear un programa que administre el pago por estacionamiento de acuerdo a la zona.

import java.util.Scanner;
public class _p32_PagoEstacionamiento {
    public static void main(String[] args) {
        //Se declaran variables.
        float tasa=0, pago=0, impuesto=0, total=0;
        String salida="";

        //Se crea una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        //Se limpia la pantalla de la consola.
        System.out.print("\033[H\033[2J"); System.out.flush();

        //Se obtienen los datos.
        System.out.println("Este programa administra el pago por estacionamiento de acuerdo a la Zona.\nPresione ENTER para continuar."); 
        DatoIng.nextLine();

        //Damos a conocer las opciones a elegir.
        System.out.println("Eliga una opcion, el porcentaje que aparece corresponde al porcentaje de impuestos.\n");
        System.out.println("1 - Estacionamiento Tacuba 3%");
        System.out.println("2 - Estacionamiento Portales 5%");
        System.out.println("3 - Estacionamiento Conquistadores 10%");
        System.out.println("4 - Estacionamiento Pajaros Caidos 15%");

        //Se pide la opcion elegida y el pago.
        System.out.print("Elige opción ? "); int op = DatoIng.nextInt();
        System.out.print("Pago efectuado ? "); pago = DatoIng.nextFloat();

        //Dependiendo de la opcion elegida, la tasa de impuesto va a variar.
        switch (op) {
            case 1 : tasa = 0.03f;break;
            case 2 : tasa = 0.05f;break;
            case 3 : tasa = 0.10f;break;
            case 4 : tasa = 0.15f;break;
            
            //En caso de que la opcion ingresada no exista, mostrará un mensaje de error.
            default : System.out.println("Opción Inválida !!!");break;
        }
        
        //Establevemos el impuesto final y a su vez calculamos el total.
        impuesto = pago * tasa;
        total = pago + impuesto;
        
        //Mostramos resultados.
        salida = String.format("\nElegiste el estacionamiento %d \n" + "Pagaste %.2f por el tiempo de uso \n" + "Corresponde un impuesto de %,.2f \n" +"El pago total es de %,.2f", op, pago, impuesto, total);
        System.out.println(salida);
        System.out.println("\n\nProceso terminado ...");
        DatoIng.close();
    }
}