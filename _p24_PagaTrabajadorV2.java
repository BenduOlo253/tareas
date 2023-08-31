//Alumno: Jose Manuel Roberto Badillo.
//Descripcion: Calcular la paga de un trabajador, las horas extra se pagan al doble

import java.util.Scanner;
public class _p24_PagaTrabajadorV2 {
    public static void main(String[] args) {
        //Declaramos variables.
        int hrs, hrsex;
        float paga, total;

        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        //Limpiamos la pantalla de terminal.
        System.out.print("\033[H\033[2J"); System.out.flush();

        //Obtenemos los datos.
        System.out.println("Este programa calcula la paga de un trabajador.\n");
        System.out.print("Digita las horas trabajadas: "); hrs = DatoIng.nextInt();
        System.out.print("Digita la paga por hr: "); paga = DatoIng.nextFloat();
        
        //Se determina si se trabajaron horas extras.
        if( hrs > 40 ) {
            //En caso afirmativo se calculara su paga final, cobrando el doble del salario por hora.
            hrsex = hrs - 40;
            total = (40*paga) + (hrsex * paga * 2);
            System.out.printf("\nLa paga ha sido aumentada, debido a que el trabajador hizo horas extras\nEl pago total es: %d", hrsex);
        }
        else{
            //En el caso contrario, se pagara lo normal.
            total = hrs * paga;
            System.out.printf("\nPago total: %.2f", total);            
        }
    }
}